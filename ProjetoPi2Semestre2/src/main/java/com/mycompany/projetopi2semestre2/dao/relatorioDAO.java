/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopi2semestre2.dao;

import com.mycompany.projetopi2semestre2.model.Relatorio;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Fellipe
 */
public class relatorioDAO {

    public static String url = "jdbc:mysql://localhost:3308/lojaCalcados";
    public static String login = "root";
    public static String senha = "";

    public static ArrayList<Relatorio> getProds(String tipo) {
        ArrayList<Relatorio> listaRetorno = new ArrayList<Relatorio>();
        Connection conexao = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(url, login, senha);
            PreparedStatement comandoSQL = conexao.prepareStatement("SELECT produtos.idProduto AS idProduto, vendedor.nomeVendedor AS vendedor, produtos.modelo AS produto, C.nomeCliente AS cliente, V.dataVenda AS dataVenda, produtos.preco AS valor FROM produtos INNER JOIN ItemVenda IV ON IV.idProduto = produtos.idProduto INNER JOIN venda V ON V.idVenda = IV.idVenda INNER JOIN vendedor ON vendedor.idVendedor = V.idVendedor INNER JOIN cliente C ON C.idCliente = V.idCliente");
            ResultSet rs = comandoSQL.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    Relatorio novoObjeto = new Relatorio();
                    novoObjeto.setId(rs.getInt("idProduto"));
                    novoObjeto.setVendedor(rs.getString("vendedor"));
                    novoObjeto.setProduto(rs.getString("produto"));
                    novoObjeto.setCliente(rs.getString("cliente"));
                    novoObjeto.setDataVenda(rs.getString("dataVenda"));
                    novoObjeto.setValor(rs.getDouble("valor"));
                    listaRetorno.add(novoObjeto);
                }
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Teste");
            return listaRetorno;
        } catch (SQLException ex) {
            System.out.println("Teste 2");
            return listaRetorno;
        }
        System.out.println("Retornou ok");
        return listaRetorno;

    }

    public static ArrayList<Relatorio> getProdByFiltro(String tipo, String cbFiltro, String filtro) {
        ArrayList<Relatorio> listaRetorno = new ArrayList<Relatorio>();
        Connection conexao = null;
        
        if(tipo == "analitico"){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conexao = DriverManager.getConnection(url, login, senha);
                PreparedStatement comandoSQL = conexao.prepareStatement("SELECT produtos.idProduto AS idProduto, vendedor.nomeVendedor AS vendedor, produtos.modelo AS produto, C.nomeCliente AS cliente, V.dataVenda AS dataVenda, produtos.preco AS valor FROM produtos INNER JOIN ItemVenda IV ON IV.idProduto = produtos.idProduto INNER JOIN venda V ON V.idVenda = IV.idVenda INNER JOIN vendedor ON vendedor.idVendedor = V.idVendedor INNER JOIN cliente C ON C.idCliente = V.idCliente WHERE " + cbFiltro + " LIKE '%" + filtro + "%'");
                ResultSet rs = comandoSQL.executeQuery();
                if (rs != null) {
                    while (rs.next()) {
                        Relatorio novoObjeto = new Relatorio();
                        novoObjeto.setId(rs.getInt("idProduto"));
                        novoObjeto.setVendedor(rs.getString("vendedor"));
                        novoObjeto.setProduto(rs.getString("produto"));
                        novoObjeto.setCliente(rs.getString("cliente"));
                        novoObjeto.setDataVenda(rs.getString("dataVenda"));
                        novoObjeto.setValor(rs.getDouble("valor"));
                        listaRetorno.add(novoObjeto);
                    }
                }
            } catch (ClassNotFoundException ex) {
                System.out.println("Teste");
                return listaRetorno;
            } catch (SQLException ex) {
                System.out.println("Teste 2");
                return listaRetorno;
            }  
        } else {
            
        }
        System.out.println("Retornou ok");
        return listaRetorno;
    }
}
