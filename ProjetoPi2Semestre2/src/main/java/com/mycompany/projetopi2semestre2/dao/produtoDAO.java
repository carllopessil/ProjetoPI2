/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopi2semestre2.dao;

import com.mycompany.projetopi2semestre2.model.Cliente;
import com.mycompany.projetopi2semestre2.model.Produto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author carlos silva lopes
 */
public class produtoDAO {
    
    public static String url = "jdbc:mysql://localhost:3308/lojaCalcados";
    public static String login = "root";
    public static String senha = "";

    public static boolean salvar(Produto objProduto) {
        boolean retorno = false;
        Connection conexao = null;

        try {


            Class.forName("com.mysql.cj.jdbc.Driver");

            conexao = DriverManager.getConnection(url, login, senha);
            PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO Produtos(idProduto, categoria, marca, modelo, tamanho, quantidade, preco, codBarras) "
                    + "VALUES(?,?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            comandoSQL.setInt(1, objProduto.getIdProduto());
            comandoSQL.setString(2, objProduto.getCategoria());
            comandoSQL.setString(3, objProduto.getMarca());
            comandoSQL.setString(4, objProduto.getModelo());
            comandoSQL.setString(5, objProduto.getTamanho());
            comandoSQL.setString(6, objProduto.getQuantidade());
            comandoSQL.setString(7, objProduto.getPreco());
            comandoSQL.setString(8, objProduto.getCodBarras());
            

            int numeroLinhas = comandoSQL.executeUpdate();
            if (numeroLinhas > 0) {
                retorno = true;

                ResultSet rs = comandoSQL.getGeneratedKeys();
                if (rs != null) {
                    if (rs.next()) {
                        objProduto.setIdProduto(rs.getInt(1));
                    }
                }

            }

        } catch (ClassNotFoundException ex) {
            System.out.println("erro 1");
            retorno = false;
        } catch (SQLException ex) {
            System.out.println("erro banco");
            retorno = false;
        }

        return retorno;

    }
    
//    public static ResultSet carregaTabela(String tipo, String arg) throws ClassNotFoundException, SQLException {
//
//        Connection conexao = null;
//
//        String argumento = tipo + " " + "like '" + arg + "%'";
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        conexao = DriverManager.getConnection(url, login, senha);
//
//        PreparedStatement comandoSQL = conexao.prepareStatement("SELECT idCliente,nomeCliente,cpfCliente,dataNascimento,estadoCliente,emailCliente,sexoCliente,telefoneCliente,cepCliente,enderecoCliente
//    ,numeroEndCliente,complementoCliente FROM Cliente where " + argumento + "");
//        ResultSet rs = comandoSQL.executeQuery();
//
//        return rs;
//
//    }
    
//    public static ResultSet buscarProdutoNoBanco (String txtCodBarras) throws ClassNotFoundException, SQLException{
//        Connection conexao = null;
//        
//        String argumento="like " + txtCodBarras;
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        conexao = DriverManager.getConnection(url, login, senha);
//        
//        PreparedStatement comandoSQL = conexao.prepareStatement("SELECT * from Produtos where" + argumento + "");
//        ResultSet rs = comandoSQL.executeQuery();
//        
//        return rs;
////    }
    public static ResultSet carregaTabelaProduto( String arg) throws ClassNotFoundException, SQLException {

        Connection conexao = null;

        String argumento = "codBarras " + "like '" + arg + "'";
        Class.forName("com.mysql.cj.jdbc.Driver");
        conexao = DriverManager.getConnection(url, login, senha);

        PreparedStatement comandoSQL = conexao.prepareStatement("SELECT * FROM Produtos where " + argumento + "");
        ResultSet rs = comandoSQL.executeQuery();

        return rs;

    }
    
//    
//
//    public void alterar(Produto objProduto) {
//
//        Connection conexao = null;
//        
//        
//
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            conexao = DriverManager.getConnection(url, login, senha);
//            PreparedStatement comandoSQL = conexao.prepareStatement("UPDATE produto SET (idProduto=?, categoria=?, marca=?, modelo=?, tamanho=?, quantidade=?, preco=?, codBarras=? WHERE idProduto=?");
//
//            comandoSQL.setInt(1, objProduto.getIdProduto());
//            comandoSQL.setString(2, objProduto.getCategoria());
//            comandoSQL.setString(3, objProduto.getMarca());
//            comandoSQL.setString(4, objProduto.getModelo());
//            comandoSQL.setInt(5, objProduto.getTamanho());
//            comandoSQL.setInt(6, objProduto.getQuantidade());
//            comandoSQL.setDouble(7, objProduto.getPreco());
//            comandoSQL.setString(8, objProduto.getCodBarras());
//
//            //4) Executar o comando SQL
//            comandoSQL.executeUpdate();
//            JOptionPane.showMessageDialog(null, "produto atualizado com sucesso");
//
//        } catch (Exception e) {
//            JOptionPane.showConfirmDialog(null, "ERRO AO ALTERAR CADASTRO DE PRODUTO" + e);
//        }
//
//    }
//
//    public static ArrayList<Produto> listar() {
//        ArrayList<Produto> listaRetorno = new ArrayList<Produto>();
//
//        Connection conexao = null;
//
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            conexao = DriverManager.getConnection(url, login, senha);
//            PreparedStatement comandoSQL = conexao.prepareStatement("SELECT * FROM Produto;");
//            ResultSet rs = comandoSQL.executeQuery();
//
//            if (rs != null) {
//
//                while (rs.next()) {
//                    
//
//                    Produto novoObjeto = new Produto();
//                    novoObjeto.setIdProduto(rs.getInt("idProduto"));
//                    novoObjeto.setCategoria(rs.getString("categoria"));
//                    novoObjeto.setMarca(rs.getString("estadoCliente"));
//                    novoObjeto.setModelo(rs.getString("modelo"));
//                    novoObjeto.setTamanho(rs.getInt("tamanho"));
//                     novoObjeto.setQuantidade(rs.getInt("quantidade"));
//                    novoObjeto.setCodBarras(rs.getString("codBarras"));
//                     novoObjeto.setPreco(rs.getInt("preco"));
//                    
//                   
//                  
//                   
//                   
//
//                    listaRetorno.add(novoObjeto);
//
//                }
//
//            }
//
//        } catch (ClassNotFoundException ex) {
//            listaRetorno = null;
//        } catch (SQLException ex) {
//            listaRetorno = null;
//        }
//
//        return listaRetorno;
//    }
//
//    public static ResultSet carregaTabela(String tipo, String arg) throws ClassNotFoundException, SQLException {
//
//        Connection conexao = null;
//
//        String argumento = tipo + " " + "like '" + arg + "%'";
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        conexao = DriverManager.getConnection(url, login, senha);
//
//        PreparedStatement comandoSQL = conexao.prepareStatement("SELECT idCliente,nomeCliente,cpfCliente,dataNascimento,estadoCliente,emailCliente,sexoCliente,telefoneCliente,cepCliente,enderecoCliente,numeroEndCliente,complementoCliente FROM Cliente where " + argumento + "");
//        ResultSet rs = comandoSQL.executeQuery();
//
//        return rs;
//
//    }
//
//    public static boolean excluir(int id_cli) {
//
//        boolean retorno = false;
//        Connection conexao = null;
//
//        try {
//
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            conexao = DriverManager.getConnection(url, login, senha);
//            PreparedStatement comandoSQL = conexao.prepareStatement("DELETE FROM Cliente WHERE idCliente=?");
//            comandoSQL.setInt(1, id_cli);
//
//            int numeroLinhas = comandoSQL.executeUpdate();
//            if (numeroLinhas > 0) {
//                retorno = true;
//            }
//
//        } catch (ClassNotFoundException ex) {
//            retorno = false;
//        } catch (SQLException ex) {
//            retorno = false;
//        }
//
//        return retorno;
//
//    }

   
    
}
