
package com.mycompany.projetopi2semestre2.model;


public class Produto {
    private static String txtCodBarras = "";
    private static String cboCategorias= "";
    private static String cboTamanho = "";
    private static String cboPreco = "";
    private static String cboMarca = "";
    


//Codigo de Barras
    public static String getCodBarras() {
        return txtCodBarras;
    }

    public static void setCodBarras(String txtcodBarras) {
        Produto.txtCodBarras=txtcodBarras;
    }


//Categorias 
    public static String getCategorias() {
        return cboCategorias;
    }
     public static void setCategorias(String cboCategorias) {
        Produto.cboCategorias=cboCategorias;
    }


//Tamanho
    public static String getTamanho() {
        return cboTamanho;
    }

    public static void setTamanho(String cboTamanho) {
        Produto.cboTamanho=cboTamanho;
    }


//Preço
    public static String getPreco() {
        return cboPreco;
    }
    
    public static void setPreco(String cboPreco) {
        Produto.cboPreco=cboPreco;
    }


//Marca
   public static String getMarca() {
        return cboMarca;
    }

   public static void setMarca(String cboMarca) {
        Produto.cboMarca=cboMarca;
    }

}