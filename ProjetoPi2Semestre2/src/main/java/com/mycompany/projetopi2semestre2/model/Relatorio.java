/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopi2semestre2.model;

/**
 *
 * @author Fellipe
 */
public class Relatorio {

    private String tipo;
    private int id;
    private String vendedor;
    private String produto;
    private String cliente;
    private String dataVenda;
    private double valor;
    private String comboFiltro;
    private String txtFiltro;

    /**
     *
     */
    public Relatorio() {
        //
    }

    /**
     *
     * @return
     */
    public String getTipo() {
        return tipo;
    }

    /**
     *
     * @param tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     *
     * @param tipo
     */
    public Relatorio(String tipo) {
        this.tipo = tipo;
    }

    /**
     *
     * @return
     */
    public String getComboFiltro() {
        return comboFiltro;
    }

    /**
     *
     * @param comboFiltro
     */
    public void setComboFiltro(String comboFiltro) {
        this.comboFiltro = comboFiltro;
    }

    /**
     *
     * @return
     */
    public String getTxtFiltro() {
        return txtFiltro;
    }

    /**
     *
     * @param txtFiltro
     */
    public void setTxtFiltro(String txtFiltro) {
        this.txtFiltro = txtFiltro;
    }

    /**
     *
     * @param id
     */
    public Relatorio(int id) {
        this.id = id;
    }

    /**
     *
     * @param id
     * @param vendedor
     */
    public Relatorio(int id, String vendedor) {
        this.id = id;
        this.vendedor = vendedor;
    }

    /**
     *
     * @param id
     * @param vendedor
     * @param produto
     */
    public Relatorio(int id, String vendedor, String produto) {
        this.id = id;
        this.vendedor = vendedor;
        this.produto = produto;
    }

    /**
     *
     * @param id
     * @param vendedor
     * @param produto
     * @param cliente
     */
    public Relatorio(int id, String vendedor, String produto, String cliente) {
        this.id = id;
        this.vendedor = vendedor;
        this.produto = produto;
        this.cliente = cliente;
    }

    /**
     *
     * @param id
     * @param vendedor
     * @param produto
     * @param cliente
     * @param dataVenda
     */
    public Relatorio(int id, String vendedor, String produto, String cliente, String dataVenda) {
        this.id = id;
        this.vendedor = vendedor;
        this.produto = produto;
        this.cliente = cliente;
        this.dataVenda = dataVenda;
    }

    /**
     *
     * @param id
     * @param vendedor
     * @param produto
     * @param cliente
     * @param dataVenda
     * @param valor
     */
    public Relatorio(int id, String vendedor, String produto, String cliente, String dataVenda, double valor) {
        this.id = id;
        this.vendedor = vendedor;
        this.produto = produto;
        this.cliente = cliente;
        this.dataVenda = dataVenda;
        this.valor = valor;
    }

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getVendedor() {
        return vendedor;
    }

    /**
     *
     * @param vendedor
     */
    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    /**
     *
     * @return
     */
    public String getProduto() {
        return produto;
    }

    /**
     *
     * @param produto
     */
    public void setProduto(String produto) {
        this.produto = produto;
    }

    /**
     *
     * @return
     */
    public String getCliente() {
        return cliente;
    }

    /**
     *
     * @param cliente
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    /**
     *
     * @return
     */
    public String getDataVenda() {
        return dataVenda;
    }

    /**
     *
     * @param dataVenda
     */
    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    /**
     *
     * @return
     */
    public double getValor() {
        return valor;
    }

    /**
     *
     * @param valor
     */
    public void setValor(double valor) {
        this.valor = valor;
    }
}
