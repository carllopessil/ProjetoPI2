/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopi2semestre2.dao;

import com.mycompany.projetopi2semestre2.model.Cliente;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import java.util.Date;
import java.text.SimpleDateFormat;


public class ClienteDAO {

    public static String url = "jdbc:mysql://localhost:3306/lojaCalcados";
    public static String login = "root";
    public static String senha = "root";

    public static boolean salvar(Cliente objCliente) {
        boolean retorno = false;
        Connection conexao = null;

        try {


            Class.forName("com.mysql.cj.jdbc.Driver");

            conexao = DriverManager.getConnection(url, login, senha);
            PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO Cliente(idCliente, nomeCliente, cpfCliente,dataNascimento, estadoCliente, sexoCliente,emailCliente,telefoneCliente,cepCliente,enderecoCliente, numeroEndCliente, complementoCliente) "
                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            comandoSQL.setInt(1, objCliente.getIdCliente());
            comandoSQL.setString(2, objCliente.getNomeCliente());
            comandoSQL.setString(3, objCliente.getCpfCliente());
            comandoSQL.setDate(4, new java.sql.Date(objCliente.getDataNascimento().getTime()));
            //comandoSQL.setString(4, objCliente.getDataNascimento());
            comandoSQL.setString(5, objCliente.getEstadoCliente());
            comandoSQL.setString(6, objCliente.getSexoCliente());
            comandoSQL.setString(7, objCliente.getEmailCliente());
            comandoSQL.setString(8, objCliente.getTelefoneCliente());
            comandoSQL.setString(9, objCliente.getCepCliente());
            comandoSQL.setString(10, objCliente.getEnderecoCliente());
            comandoSQL.setInt(11, objCliente.getNumeroEndCliente());
            comandoSQL.setString(12, objCliente.getComplementoCliente());

            int numeroLinhas = comandoSQL.executeUpdate();
            if (numeroLinhas > 0) {
                retorno = true;

                ResultSet rs = comandoSQL.getGeneratedKeys();
                if (rs != null) {
                    if (rs.next()) {
                        objCliente.setIdCliente(rs.getInt(1));
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

    public void alterar(Cliente cliente) {

        Connection conexao = null;
        
        

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(url, login, senha);
            PreparedStatement comandoSQL = conexao.prepareStatement("UPDATE Cliente SET nomeCliente =?,cpfCliente=?,dataNascimento =?,estadoCliente =?,sexoCliente=?,emailCliente =?,telefoneCliente=?,cepCliente=?,enderecoCliente =?,numeroEndCliente =?,complementoCliente=? WHERE idCliente=?");

            comandoSQL.setString(1, cliente.getNomeCliente());
            comandoSQL.setString(2, cliente.getCpfCliente());
          //comandoSQL.setString(3, cliente.getDataNascimento());
            comandoSQL.setString(4, cliente.getEstadoCliente());
            comandoSQL.setString(5, cliente.getSexoCliente());
            comandoSQL.setString(6, cliente.getEmailCliente());
            comandoSQL.setString(7, cliente.getTelefoneCliente());
            comandoSQL.setString(8, cliente.getCepCliente());
            comandoSQL.setString(9, cliente.getEnderecoCliente());
            comandoSQL.setInt(10, cliente.getNumeroEndCliente());
            comandoSQL.setString(11, cliente.getComplementoCliente());
            comandoSQL.setInt(12, cliente.getIdCliente());

            //4) Executar o comando SQL
            comandoSQL.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cliente atualizado com sucesso");

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "ERRO AO ALTERAR CADASTRO" + e);
        }

    }

    public static ArrayList<Cliente> listar() {
        ArrayList<Cliente> listaRetorno = new ArrayList<Cliente>();

        Connection conexao = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(url, login, senha);
            PreparedStatement comandoSQL = conexao.prepareStatement("SELECT * FROM Cliente;");
            ResultSet rs = comandoSQL.executeQuery();

            if (rs != null) {

                while (rs.next()) {
                    

                    Cliente novoObjeto = new Cliente();
                    novoObjeto.setIdCliente(rs.getInt("idCliente"));
                    novoObjeto.setNomeCliente(rs.getString("nomeCliente"));
                    novoObjeto.setCpfCliente(rs.getString("cpfCliente"));
                 //   novoObjeto.setDataNascimento(rs.getString("dataNascimento"));
                    novoObjeto.setEstadoCliente(rs.getString("estadoCliente"));
                    novoObjeto.setEmailCliente(rs.getString("emailCliente"));
                   novoObjeto.setSexoCliente(rs.getString("sexoCliente"));
                    novoObjeto.setTelefoneCliente(rs.getString("telefoneCliente"));
                    novoObjeto.setCepCliente(rs.getString("cepCliente"));
                    novoObjeto.setEnderecoCliente(rs.getString("enderecoCliente"));
                    novoObjeto.setNumeroEndCliente(rs.getInt("numeroEndCliente"));
                    novoObjeto.setComplementoCliente(rs.getString("complementoCliente"));

                    listaRetorno.add(novoObjeto);

                }

            }

        } catch (ClassNotFoundException ex) {
            listaRetorno = null;
        } catch (SQLException ex) {
            listaRetorno = null;
        }

        return listaRetorno;
    }

    public static ResultSet carregaTabela(String tipo, String arg) throws ClassNotFoundException, SQLException {

        Connection conexao = null;

        String argumento = tipo + " " + "like '" + arg + "%'";
        Class.forName("com.mysql.cj.jdbc.Driver");
        conexao = DriverManager.getConnection(url, login, senha);

        PreparedStatement comandoSQL = conexao.prepareStatement("SELECT idCliente,nomeCliente,cpfCliente,dataNascimento,estadoCliente,emailCliente,sexoCliente,telefoneCliente,cepCliente,enderecoCliente,numeroEndCliente,complementoCliente FROM Cliente where " + argumento + "");
        ResultSet rs = comandoSQL.executeQuery();

        return rs;

    }

    public static boolean excluir(int id_cli) {

        boolean retorno = false;
        Connection conexao = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(url, login, senha);
            PreparedStatement comandoSQL = conexao.prepareStatement("DELETE FROM Cliente WHERE idCliente=?");
            comandoSQL.setInt(1, id_cli);

            int numeroLinhas = comandoSQL.executeUpdate();
            if (numeroLinhas > 0) {
                retorno = true;
            }

        } catch (ClassNotFoundException ex) {
            retorno = false;
        } catch (SQLException ex) {
            retorno = false;
        }

        return retorno;

    }

    public boolean jaExiste(String cpfCliente) throws ClassNotFoundException {
        Connection conexao = null;
        try {
            //Cliente cliente = new Cliente();
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(url, login, senha);

            PreparedStatement comandoSQL = conexao.prepareStatement("SELECT * from Cliente WHERE cpfCliente = ?");

            comandoSQL.setString(1, cpfCliente);
            ResultSet rs = comandoSQL.executeQuery();

            if (rs.next()) { // se encontrou
                JOptionPane.showMessageDialog(null, "CPF JÁ EXISTE");
            }
            else{
                
            }
        } catch (SQLException u) {
            throw new RuntimeException("erro" + u);

        }
        return true;
    }
}
 