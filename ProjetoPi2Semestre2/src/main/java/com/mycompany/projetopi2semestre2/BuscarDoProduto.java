
package com.mycompany.projetopi2semestre2;

/**
 *
 * @author carlos silva lopes
 */
public class BuscarDoProduto {
    private static String txtCodBarras = "";
    private static String cboCategorias= "";
    private static String cboTamanho = "";
    private static String cboPreco = "";
    private static String cboMarca = "";
    


//Codigo de Barras

    /**
     *
     * @return
     */
    public static String getCodBarras() {
        return txtCodBarras;
    }

    /**
     *
     * @param txtcodBarras
     */
    public static void setCodBarras(String txtcodBarras) {
        BuscarDoProduto.txtCodBarras=txtcodBarras;
    }


//Categorias 

    /**
     *
     * @return
     */
    public static String getCategorias() {
        return cboCategorias;
    }

    /**
     *
     * @param cboCategorias
     */
    public static void setCategorias(String cboCategorias) {
        BuscarDoProduto.cboCategorias=cboCategorias;
    }


//Tamanho

    /**
     *
     * @return
     */
    public static String getTamanho() {
        return cboTamanho;
    }

    /**
     *
     * @param cboTamanho
     */
    public static void setTamanho(String cboTamanho) {
        BuscarDoProduto.cboTamanho=cboTamanho;
    }


//Preço

    /**
     *
     * @return
     */
    public static String getPreco() {
        return cboPreco;
    }
    
    /**
     *
     * @param cboPreco
     */
    public static void setPreco(String cboPreco) {
        BuscarDoProduto.cboPreco=cboPreco;
    }


//Marca

    /**
     *
     * @return
     */
   public static String getMarca() {
        return cboMarca;
    }

    /**
     *
     * @param cboMarca
     */
    public static void setMarca(String cboMarca) {
        BuscarDoProduto.cboMarca=cboMarca;
    }

}