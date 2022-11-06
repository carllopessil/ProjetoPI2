/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopi2semestre2.dao;

import com.mycompany.projetopi2semestre2.model.Cliente;
import com.mycompany.projetopi2semestre2.model.Vendedor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author marsa
 */
public class VendedorDAO {

    public static String url = "jdbc:mysql://localhost:3306/lojaCalcados";
    public static String login = "root";
    public static String senha = "root";

    public static boolean salvar(Vendedor objVendedor) {
        boolean retorno = false;
        Connection conexao = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conexao = DriverManager.getConnection(url, login, senha);
            PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO Vendedor(cod_vend, nome_vend, cpf_vend,tel_vend) "
                    + "VALUES(?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            comandoSQL.setInt(1, objVendedor.getCod_vend());
            comandoSQL.setString(2, objVendedor.getNome_vend());
            comandoSQL.setString(3, objVendedor.getCpf_vend());
            comandoSQL.setString(4, objVendedor.getTel_vend());

            int numeroLinhas = comandoSQL.executeUpdate();
            if (numeroLinhas > 0) {
                retorno = true;

                ResultSet rs = comandoSQL.getGeneratedKeys();
                if (rs != null) {
                    if (rs.next()) {
                        objVendedor.setCod_vend(rs.getInt(1));
                    }
                }

            }

        } catch (ClassNotFoundException ex) {
            System.out.println("ERRO 01");
            retorno = false;
        } catch (SQLException ex) {
            System.out.println("ERRO 02" + ex.getMessage());
            retorno = false;
        }

        return retorno;
        
        

    }

    public void limparCampos(JTextField nome, JTextField cpf, JTextField telefone) {
          
    }

    public static boolean alterar(Cliente objCliente) {

        boolean retorno = false;
        Connection conexao = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(url, login, senha);
            PreparedStatement comandoSQL = conexao.prepareStatement("UPDATE Cliente SET nome_cli =?,data_nasci =?,estadoCivil_cli =?,sexo_cli =?,email_cli =?,telefone_cli=?,CEP_cli=?,endereco_cli =?,numero_cli =?,complemento_cli=? WHERE id_cli=?");

            comandoSQL.setString(1, objCliente.getNome_cli());
            // comandoSQL.setInt(2, objCliente.getData_nasci());
            comandoSQL.setString(3, objCliente.getEstado_cli());
            comandoSQL.setString(4, objCliente.getSexo_cli());
            comandoSQL.setString(5, objCliente.getEmail_cli());
            comandoSQL.setInt(6, objCliente.getTel_cli());
            comandoSQL.setInt(7, objCliente.getCep_cli());
            comandoSQL.setString(8, objCliente.getEnd_cli());
            comandoSQL.setInt(9, objCliente.getNumero_cli());
            comandoSQL.setString(10, objCliente.getCompl_cli());
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
                    novoObjeto.setCpf_cli(rs.getString("cpf_cli"));
                    //novoObjeto.setData_nasci(rs.getInt("data_nasci"));
                    novoObjeto.setEstado_cli(rs.getString("estado_cli"));
                    novoObjeto.setEmail_cli(rs.getString("email_cli"));
                    novoObjeto.setSexo_cli(rs.getString("sexo_cli"));
                    novoObjeto.setTel_cli(rs.getInt("tel_cli"));
                    novoObjeto.setCep_cli(rs.getInt("cep_cli"));
                    novoObjeto.setEnd_cli(rs.getString("end_cli"));
                    novoObjeto.setNumero_cli(rs.getInt("numero_cli"));
                    novoObjeto.setCompl_cli(rs.getString("compl_cli"));

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
            PreparedStatement comandoSQL = conexao.prepareStatement("DELETE FROM Computador WHERE id_cli=? or cpf_cli=?");
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
