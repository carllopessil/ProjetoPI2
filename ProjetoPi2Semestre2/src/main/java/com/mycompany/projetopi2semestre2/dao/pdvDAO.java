package com.mycompany.projetopi2semestre2.dao;

import static com.mycompany.projetopi2semestre2.dao.ClienteDAO.login;
import static com.mycompany.projetopi2semestre2.dao.ClienteDAO.senha;
import static com.mycompany.projetopi2semestre2.dao.ClienteDAO.url;
import static com.mycompany.projetopi2semestre2.dao.VendedorDAO.login;
import static com.mycompany.projetopi2semestre2.dao.VendedorDAO.senha;
import static com.mycompany.projetopi2semestre2.dao.VendedorDAO.url;
import com.mycompany.projetopi2semestre2.model.Cliente;
import com.mycompany.projetopi2semestre2.model.Vendedor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class pdvDAO {

    public static String url = "jdbc:mysql://localhost:3306/lojaCalcados";
    public static String login = "root";
    public static String senha = "root";

    public static ArrayList<Cliente> listarCliente() {
        ArrayList<Cliente> listaRetorno = new ArrayList<Cliente>();

        Connection conexao = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(url, login, senha);
            PreparedStatement comandoSQL = conexao.prepareStatement("SELECT cliente.nomeCliente, cliente.cpfCliente");
            ResultSet rs = comandoSQL.executeQuery();

            if (rs != null) {

                while (rs.next()) {
                    
                    Cliente novoObjeto = new Cliente();
                    
                    novoObjeto.setIdCliente(rs.getInt("nomeCliente"));
                    novoObjeto.setNomeCliente(rs.getString("cpfCliente"));
                    novoObjeto.setCpfCliente(rs.getString("cpf_cli"));
                    novoObjeto.setCpfCliente(rs.getString("cpf_cli"));
                    
                   

                    //listaRetorno.add(segundoObj);

                }

            }

        } catch (ClassNotFoundException ex) {
            listaRetorno = null;
        } catch (SQLException ex) {
            listaRetorno = null;
        }

        return listaRetorno;
    }

}
