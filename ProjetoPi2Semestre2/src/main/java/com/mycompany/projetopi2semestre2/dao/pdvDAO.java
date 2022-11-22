package com.mycompany.projetopi2semestre2.dao;

import com.mycompany.projetopi2semestre2.PDV;
import static com.mycompany.projetopi2semestre2.dao.ClienteDAO.login;
import static com.mycompany.projetopi2semestre2.dao.ClienteDAO.senha;
import static com.mycompany.projetopi2semestre2.dao.ClienteDAO.url;
import static com.mycompany.projetopi2semestre2.dao.VendedorDAO.login;
import static com.mycompany.projetopi2semestre2.dao.VendedorDAO.senha;
import static com.mycompany.projetopi2semestre2.dao.VendedorDAO.url;
import com.mycompany.projetopi2semestre2.model.Cliente;
import com.mycompany.projetopi2semestre2.model.PDVClasse;
import com.mycompany.projetopi2semestre2.model.Vendedor;
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
public class pdvDAO {

    /**
     *
     */
    public static String url = "jdbc:mysql://localhost:3308/lojaCalcados";

    /**
     *
     */
    public static String login = "root";

    /**
     *
     */
    public static String senha = "";

    /**
     *
     * @param tipo
     * @param arg
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static ResultSet carregaTabelaCliente(String tipo, String arg) throws ClassNotFoundException, SQLException {

        Connection conexao = null;

        String argumento = tipo + " " + "like '" + arg + "%'";
        Class.forName("com.mysql.cj.jdbc.Driver");
        conexao = DriverManager.getConnection(url, login, senha);

        PreparedStatement comandoSQL = conexao.prepareStatement("SELECT idCliente,nomeCliente,cpfCliente FROM Cliente where " + argumento + "");
        ResultSet rs = comandoSQL.executeQuery();

        return rs;

    }

    /**
     *
     * @param tipo
     * @param arg
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static ResultSet carregaTabelaVendedor(String tipo, String arg) throws ClassNotFoundException, SQLException {

        Connection conexao = null;

        String argumento = tipo + " " + "like '" + arg + "%'";
        Class.forName("com.mysql.cj.jdbc.Driver");
        conexao = DriverManager.getConnection(url, login, senha);

        PreparedStatement comandoSQL = conexao.prepareStatement("SELECT idVendedor,nomeVendedor,cpfVendedor FROM Vendedor where " + argumento + "");
        ResultSet rs = comandoSQL.executeQuery();

        return rs;

    }

    /**
     *
     * @param objPdv
     * @return
     */
    public static boolean salvarVenda(PDVClasse objPdv){
             boolean retorno = false;
        Connection conexao = null;
        

        try {


            Class.forName("com.mysql.cj.jdbc.Driver");

            conexao = DriverManager.getConnection(url, login, senha);
           PreparedStatement comandoSQL = conexao.prepareStatement("insert into Venda values(idVenda, idCliente, dataVenda now(), valorVenda, idVendedor );"
                    + "VALUES(?,?,?,?)", Statement.RETURN_GENERATED_KEYS);                
           int numeroLinhas = comandoSQL.executeUpdate();
           comandoSQL.setInt(1, objPdv.getIdVenda());
            comandoSQL.setInt(2, objPdv.getIdCliente());
            comandoSQL.setDouble(3, objPdv.getValorVenda());
            comandoSQL.setInt(4, objPdv.getIdVendedor());

            if (numeroLinhas > 0) {
                retorno = true;

                ResultSet rs = comandoSQL.getGeneratedKeys();
                if (rs != null) {
                    if (rs.next()) {
                        objPdv.setIdVenda(rs.getInt(1));
                    }
                }

            }
        comandoSQL.executeUpdate();
            JOptionPane.showMessageDialog(null, "venda realizada com sucesso");

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "ERRO AO inserir venda erro:" + e);
        }

        return retorno;

        }
        
    /**
     *
     * @param objPdv
     * @return
     */
    public static boolean salvarItemVenda(PDVClasse objPdv) {
        boolean retorno = false;
        Connection conexao = null;
        

        try {


            Class.forName("com.mysql.cj.jdbc.Driver");

            conexao = DriverManager.getConnection(url, login, senha);
            PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO ItemVenda(idItemVenda,idVenda, idProduto, quantidadeProduto, valorUnitario) "
                    + "VALUES(?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            comandoSQL.setInt(1, objPdv.getIdItemVenda());
            comandoSQL.setInt(2, objPdv.getIdVenda());
            comandoSQL.setInt(3, objPdv.getIdProduto());
            comandoSQL.setString(4, objPdv.getQuantidadeProdutoVenda());
            comandoSQL.setString(5, objPdv.getValorUnitario());

            

            int numeroLinhas = comandoSQL.executeUpdate();
            if (numeroLinhas > 0) {
                retorno = true;

                ResultSet rs = comandoSQL.getGeneratedKeys();
                if (rs != null) {
                    if (rs.next()) {
                        objPdv.setIdItemVenda(rs.getInt(1));
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


}
