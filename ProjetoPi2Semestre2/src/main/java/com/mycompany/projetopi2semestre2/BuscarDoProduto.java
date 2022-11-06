
package com.mycompany.projetopi2semestre2;


public class BuscarDoProduto {
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
        BuscarDoProduto.txtCodBarras=txtcodBarras;
    }


//Categorias 
    public static String getCategorias() {
        return cboCategorias;
    }
     public static void setCategorias(String cboCategorias) {
        BuscarDoProduto.cboCategorias=cboCategorias;
    }


//Tamanho
    public static String getTamanho() {
        return cboTamanho;
    }

    public static void setTamanho(String cboTamanho) {
        BuscarDoProduto.cboTamanho=cboTamanho;
    }


//Preço
    public static String getPreco() {
        return cboPreco;
    }
    
    public static void setPreco(String cboPreco) {
        BuscarDoProduto.cboPreco=cboPreco;
    }


//Marca
   public static String getMarca() {
        return cboMarca;
    }

   public static void setMarca(String cboMarca) {
        BuscarDoProduto.cboMarca=cboMarca;
    }

}