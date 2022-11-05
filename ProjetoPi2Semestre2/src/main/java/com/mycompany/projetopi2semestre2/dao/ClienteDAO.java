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
            PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO Cliente(id_cli, nome_cli, CPF_cli,Data_Nasci, estadoCivil_cli,email_cli,sexo_cli,telefone_cli,CEP_cli,endereco_cli,numero_cli,complemento_cli) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            comandoSQL.setInt(1, objCliente.getId_cli());
            comandoSQL.setString(2, objCliente.getNome_cli());
            comandoSQL.setInt(3, objCliente.getCPF_cli());
            comandoSQL.setInt(4, objCliente.getData_Nasci());
            comandoSQL.setString(5, objCliente.getEstadoCivil_cli());
            comandoSQL.setString(6, objCliente.getEmail_cli());
            comandoSQL.setString(7, objCliente.getSexo_cli());
            comandoSQL.setInt(8, objCliente.getTelefone_cli());
            comandoSQL.setInt(9, objCliente.getCEP_cli());
            comandoSQL.setString(10, objCliente.getEndereco_cli());
            comandoSQL.setInt(11, objCliente.getNumero_cli());
            comandoSQL.setString(12, objCliente.getComplemento_cli());

            int numeroLinhas = comandoSQL.executeUpdate();
            if (numeroLinhas > 0) {
                retorno = true;

                ResultSet rs = comandoSQL.getGeneratedKeys();
                if (rs != null) {
                    if (rs.next()) {
                        objCliente.setId_cli(rs.getInt(1));
                    }
                }

            }

        } catch (ClassNotFoundException ex) {
            retorno = false;
        } catch (SQLException ex) {
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
            PreparedStatement comandoSQL = conexao.prepareStatement("UPDATE Cliente SET nome_cli =?,Data_Nasci =?,estadoCivil_cli =?,email_cli =?,sexo_cli =?,telefone_cli=?,CEP_cli=?,endereco_cli =?,numero_cli =?,complemento_cli=? WHERE id_cli=?");

            comandoSQL.setString(1, objCliente.getNome_cli());
            comandoSQL.setInt(2, objCliente.getData_Nasci());
            comandoSQL.setString(3, objCliente.getEstadoCivil_cli());
            comandoSQL.setString(4, objCliente.getEmail_cli());
            comandoSQL.setString(5, objCliente.getSexo_cli());
            comandoSQL.setInt(6, objCliente.getTelefone_cli());
            comandoSQL.setInt(7, objCliente.getCEP_cli());
            comandoSQL.setString(8, objCliente.getEndereco_cli());
            comandoSQL.setInt(9, objCliente.getNumero_cli());
            comandoSQL.setString(10, objCliente.getComplemento_cli());
            comandoSQL.setInt(11, objCliente.getId_cli());

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
                    novoObjeto.setId_cli(rs.getInt("id_cli"));
                    novoObjeto.setNome_cli(rs.getString("nome_cli"));
                    novoObjeto.setCPF_cli(rs.getInt("CPF_cli"));
                    novoObjeto.setData_Nasci(rs.getInt("Data_Nasci"));
                    novoObjeto.setEstadoCivil_cli(rs.getString("estadoCivil_cli"));
                    novoObjeto.setEmail_cli(rs.getString("email_cli"));
                    novoObjeto.setSexo_cli(rs.getString("sexo_cli"));
                    novoObjeto.setTelefone_cli(rs.getInt("telefone_cli"));
                    novoObjeto.setCEP_cli(rs.getInt("CEP_cli"));
                    novoObjeto.setEndereco_cli(rs.getString("endereco_cli"));
                    novoObjeto.setNumero_cli(rs.getInt("numero_cli"));
                    novoObjeto.setComplemento_cli(rs.getString("complemento_cli"));

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

    public static boolean excluir(int id_cli) {

        boolean retorno = false;
        Connection conexao = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(url, login, senha);
            PreparedStatement comandoSQL = conexao.prepareStatement("DELETE FROM Computador WHERE id_cli=? or CPF_cli=?");
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

}


