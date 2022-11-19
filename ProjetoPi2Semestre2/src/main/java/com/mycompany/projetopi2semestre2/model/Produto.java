
package com.mycompany.projetopi2semestre2.model;


public class Produto {
    private  int idProduto;
    private  String codBarras = "";
    private  String categoria= "";
    private  String tamanho;
    private  String preco;
    private  String marca = "";
    private  String quantidade;
    private  String modelo="";

    public Produto(){
    }
    public Produto(int idProduto,String categoria,String marca,String modelo,String tamanho,String quantidade,String preco,String codBarras){
        this.idProduto= idProduto;
        this.categoria =categoria;
        this.marca = marca;
        this.modelo= modelo;
        this.tamanho = tamanho;
        this.quantidade = quantidade;
        this.preco = preco;
        this.codBarras = codBarras;
    }
    public Produto(String categoria,String marca,String modelo,String tamanho,String quantidade,String preco,String codBarras){
        this.categoria =categoria;
        this.marca = marca;
        this.modelo= modelo;
        this.tamanho = tamanho;
        this.quantidade = quantidade;
        this.preco = preco;
        this.codBarras = codBarras;
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

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
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