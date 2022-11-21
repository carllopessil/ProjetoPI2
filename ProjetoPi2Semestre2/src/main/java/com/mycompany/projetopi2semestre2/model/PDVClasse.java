package com.mycompany.projetopi2semestre2.model;

/**
 *
 * @author heloysa.fsantos
 */
public class PDV {

    private static String nomeCliente = "";
    private static String cpfCliente;
    private static String nomeVendedor = "";
    private static String cpfVendedor;
    private static int codBarras;
    private static int quantidadeProduto;
    public String tblCarrinho = "";

    public PDV() {
    }

    public PDV(String nomeCliente, String cpfCliente, String nomeVendedor, String cpfVendedor, int codBarras, int quantidadeProduto) {
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
        this.nomeVendedor = nomeVendedor;
        this.cpfVendedor = cpfVendedor;
        this.codBarras = codBarras;
        this.quantidadeProduto = quantidadeProduto;
    }

    public static String getNomeCliente() {
        return nomeCliente;
    }

    public static void setNomeCliente(String nomeCliente) {
        PDV.nomeCliente = nomeCliente;
    }

    public static String getCpfCliente() {
        return cpfCliente;
    }

    public static void setCpfCliente(String cpfCliente) {
        PDV.cpfCliente = cpfCliente;
    }

    public static String getNomeVendedor() {
        return nomeVendedor;
    }

    public static void setNomeVendedor(String nomeVendedor) {
        PDV.nomeVendedor = nomeVendedor;
    }

    public static String getCpfVendedor() {
        return cpfVendedor;
    }

    public static void setCpfVendedor(String cpfVendedor) {
        PDV.cpfVendedor = cpfVendedor;
    }

    public static int getCodBarras() {
        return codBarras;
    }

    public static void setCodBarras(int codBarras) {
        PDV.codBarras = codBarras;
    }

    public static int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public static void setQuantidadeProduto(int quantidadeProduto) {
        PDV.quantidadeProduto = quantidadeProduto;
    }

    public String getTblCarrinho() {
        return tblCarrinho;
    }

    public void setTblCarrinho(String tblCarrinho) {
        this.tblCarrinho = tblCarrinho;
    }

}
