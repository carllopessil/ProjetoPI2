
package com.mycompany.projetopi2semestre2.model;

/**
 *
 * @author carlos silva lopes
 */
public class Produto {
    private  int idProduto;
    private  String codBarras = "";
    private  String categoria= "";
    private  String tamanho;
    private  String preco;
    private  String marca = "";
    private  String quantidade;
    private  String modelo="";

    /**
     *
     */
    public Produto(){
    }

    /**
     *
     * @param categoria
     * @param marca
     * @param modelo
     * @param tamanho
     * @param quantidade
     * @param preco
     * @param codBarras
     * @param idProduto
     */
    public Produto(String categoria,String marca,String modelo,String tamanho,String quantidade,String preco,String codBarras, int idProduto){
        
        this.categoria =categoria;
        this.marca = marca;
        this.modelo= modelo;
        this.tamanho = tamanho;
        this.quantidade = quantidade;
        this.preco = preco;
        this.codBarras = codBarras;
        this.idProduto= idProduto;
    }

    /**
     *
     * @param categoria
     * @param marca
     * @param modelo
     * @param tamanho
     * @param quantidade
     * @param preco
     * @param codBarras
     */
    public Produto(String categoria,String marca,String modelo,String tamanho,String quantidade,String preco,String codBarras){
        this.categoria =categoria;
        this.marca = marca;
        this.modelo= modelo;
        this.tamanho = tamanho;
        this.quantidade = quantidade;
        this.preco = preco;
        this.codBarras = codBarras;
    }

    /**
     *
     * @return
     */
    public String getCodBarras() {
        return codBarras;
    }

    /**
     *
     * @param codBarras
     */
    public void setCodBarras(String codBarras) {
        this.codBarras = codBarras;
    }

    /**
     *
     * @return
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     *
     * @param categoria
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     *
     * @return
     */
    public String getTamanho() {
        return tamanho;
    }

    /**
     *
     * @param tamanho
     */
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    /**
     *
     * @return
     */
    public String getPreco() {
        return preco;
    }

    /**
     *
     * @param preco
     */
    public void setPreco(String preco) {
        this.preco = preco;
    }

    /**
     *
     * @return
     */
    public String getMarca() {
        return marca;
    }

    /**
     *
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     *
     * @return
     */
    public String getQuantidade() {
        return quantidade;
    }

    /**
     *
     * @param quantidade
     */
    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    /**
     *
     * @return
     */
    public int getIdProduto() {
        return idProduto;
    }

    /**
     *
     * @param idProduto
     */
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    /**
     *
     * @return
     */
    public String getModelo() {
        return modelo;
    }

    /**
     *
     * @param modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
}