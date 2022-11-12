/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopi2semestre2.dao;

import com.mycompany.projetopi2semestre2.model.Cliente;
import java.awt.TextField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ClienteDAO {

    public static String url = "jdbc:mysql://localhost:3308/lojaCalcados";
    public static String login = "root";
    public static String senha = "";

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
            comandoSQL.setString(4, objCliente.getDataNascimento());
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

    public static boolean alterar(Cliente objCliente) {

        boolean retorno = false;
        Connection conexao = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(url, login, senha);
            PreparedStatement comandoSQL = conexao.prepareStatement("UPDATE Cliente SET nomeCliente =?,dataNascimento =?,estadoCliente =?,sexoCliente =?,emailCliente =?,telefoneCliente=?,cepCliente=?,enderecoCliente =?,numeroEndCliente =?,complementoCliente=? WHERE idCliente=?");

            comandoSQL.setString(1, objCliente.getNomeCliente());
            comandoSQL.setString(2, objCliente.getDataNascimento());
            comandoSQL.setString(3, objCliente.getEstadoCliente());
            comandoSQL.setString(4, objCliente.getSexoCliente());
            comandoSQL.setString(5, objCliente.getEmailCliente());
            comandoSQL.setString(6, objCliente.getTelefoneCliente());
            comandoSQL.setString(7, objCliente.getCepCliente());
            comandoSQL.setString(8, objCliente.getEnderecoCliente());
            comandoSQL.setInt(9, objCliente.getNumeroEndCliente());
            comandoSQL.setString(10, objCliente.getComplementoCliente());
            comandoSQL.setInt(11, objCliente.getIdCliente());

            //4) Executar o comando SQL
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
                    novoObjeto.setDataNascimento(rs.getString("dataNascimento"));
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

        PreparedStatement comandoSQL = conexao.prepareStatement("SELECT idCliente,nomeCliente,cpfCliente FROM Cliente where " + argumento + "");
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

    public Cliente getCliente(Long id) throws SQLException, ClassNotFoundException {

        Connection conexao = null;

        Cliente cliente = new Cliente();

        Class.forName("com.mysql.cj.jdbc.Driver");
        conexao = DriverManager.getConnection(url, login, senha);

        PreparedStatement comandoSQL = conexao.prepareStatement(" Select * from Cliente Where ID=" + id);
        ResultSet rs = comandoSQL.executeQuery();

        if (rs.next()) {

            cliente.setNomeCliente(rs.getString("nomeCliente"));
            cliente.setCpfCliente(rs.getString("cpfCliente"));
            cliente.setDataNascimento(rs.getString("dataNascimento"));
            cliente.setEstadoCliente(rs.getString("estadoCliente"));
            cliente.setEmailCliente(rs.getString("emailCliente"));
            cliente.setSexoCliente(rs.getString("sexoCliente"));
            cliente.setTelefoneCliente(rs.getString("telefoneCliente"));
            cliente.setCepCliente(rs.getString("cepCliente"));
            cliente.setEnderecoCliente(rs.getString("enderecoCliente"));
            cliente.setNumeroEndCliente(rs.getInt("numeroEndCliente"));
            cliente.setComplementoCliente(rs.getString("complementoCliente"));

        }

        rs.close();

        return cliente;
    }

    public boolean jaExiste(String cpfCliente) throws ClassNotFoundException {
        Connection conexao = null;
        try {
            //Cliente cliente = new Cliente();
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(url, login, senha);

            PreparedStatement comandoSQL = conexao.prepareStatement("SELECT * Cliente WHERE cpfCliente = ?");

            comandoSQL.setString(1, cpfCliente);
            ResultSet rs = comandoSQL.executeQuery();

            return rs.next(); // se encontrou
              //  cliente.setCpfCliente(rs.getString("cpfCliente"));
                

        } catch (SQLException u) {
            throw new RuntimeException(u);

        }
    }
}
        
        
    
    


    


