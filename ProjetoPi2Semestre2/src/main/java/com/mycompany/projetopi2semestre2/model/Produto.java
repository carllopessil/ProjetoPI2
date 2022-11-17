
package com.mycompany.projetopi2semestre2.model;


public class Produto {
    private  String codBarras = "";
    private  String categoria= "";
    private  int tamanho;
    private  Double preco;
    private  String marca = "";
    private int quantidade;
    private int idProduto;
    private String modelo="";

    public Produto(){
    }
    public Produto(String codBarras,String categoria,int tamanho,Double preco,String marca,int quantidade,int idProduto,String modelo){
        this.codBarras = codBarras;
        this.categoria =categoria;
        this.tamanho = tamanho;
        this.preco = preco;
        this.marca = marca;
        this.quantidade = quantidade;
        this.idProduto = idProduto;
        this.modelo= modelo;
    }

    public String getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(String codBarras) {
        this.codBarras = codBarras;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
}