
package com.mycompany.projetopi2semestre2.model;


public class Produto {
    private  String txtCodBarras = "";
    private  String cboCategorias= "";
    private  int cboTamanho;
    private  int cboPreco;
    private  String cboMarca = "";
    private int txtQuantidade;

    public String getTxtCodBarras() {
        return txtCodBarras;
    }

    public Produto() {
       
    }

    public void setTxtCodBarras(String txtCodBarras) {
        this.txtCodBarras = txtCodBarras;
    }

    public String getCboCategorias() {
        return cboCategorias;
    }

    public void setCboCategorias(String cboCategorias) {
        this.cboCategorias = cboCategorias;
    }

    public int getCboTamanho() {
        return cboTamanho;
    }

    public void setCboTamanho(int cboTamanho) {
        this.cboTamanho = cboTamanho;
    }

    public int getCboPreco() {
        return cboPreco;
    }

    public void setCboPreco(int cboPreco) {
        this.cboPreco = cboPreco;
    }

    public String getCboMarca() {
        return cboMarca;
    }

    public void setCboMarca(String cboMarca) {
        this.cboMarca = cboMarca;
    }

    public int getTxtQuantidade() {
        return txtQuantidade;
    }

    public void setTxtQuantidade(int txtQuantidade) {
        this.txtQuantidade = txtQuantidade;
    }



}