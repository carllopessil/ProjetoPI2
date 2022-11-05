package com.mycompany.projetopi2semestre2.model;

/**
 *
 * @author heloysa.fsantos
 */
public class pdv_ {

    private static String txtNomeCliente = "";
    private static int txtCpfCliente;
    private static String txtNomeVendedor = "";
    private static int txtCpfVendedor;
    private static int txtCodBarras;
    private static int txtQuantidade;
    public String tblCarrinho = "";

    public static String getTxtNomeCliente() {
        return txtNomeCliente;
    }
        public pdv_() {
    }

    public static void setTxtNomeCliente(String txtNomeCliente) {
        pdv_.txtNomeCliente = txtNomeCliente;
    }

    public static int getTxtCpfCliente() {
        return txtCpfCliente;
    }

    public static void setTxtCpfCliente(int txtCpfCliente) {
        pdv_.txtCpfCliente = txtCpfCliente;
    }

    public static String getTxtNomeVendedor() {
        return txtNomeVendedor;
    }

    public static void setTxtNomeVendedor(String txtNomeVendedor) {
        pdv_.txtNomeVendedor = txtNomeVendedor;
    }

    public static int getTxtCpfVendedor() {
        return txtCpfVendedor;
    }

    public static void setTxtCpfVendedor(int txtCpfVendedor) {
        pdv_.txtCpfVendedor = txtCpfVendedor;
    }

    public static int getTxtCodBarras() {
        return txtCodBarras;
    }

    public static void setTxtCodBarras(int txtCodBarras) {
        pdv_.txtCodBarras = txtCodBarras;
    }

    public static int getTxtQuantidade() {
        return txtQuantidade;
    }

    public static void setTxtQuantidade(int txtQuantidade) {
        pdv_.txtQuantidade = txtQuantidade;
    }

    public String getTblCarrinho() {
        return tblCarrinho;
    }

    public void setTblCarrinho(String tblCarrinho) {
        this.tblCarrinho = tblCarrinho;
    }



}
