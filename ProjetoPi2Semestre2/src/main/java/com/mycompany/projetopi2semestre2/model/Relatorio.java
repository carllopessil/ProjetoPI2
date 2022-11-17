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

    public Relatorio() {
        //
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Relatorio(String tipo) {
        this.tipo = tipo;
    }

    public String getComboFiltro() {
        return comboFiltro;
    }

    public void setComboFiltro(String comboFiltro) {
        this.comboFiltro = comboFiltro;
    }

    public String getTxtFiltro() {
        return txtFiltro;
    }

    public void setTxtFiltro(String txtFiltro) {
        this.txtFiltro = txtFiltro;
    }

    public Relatorio(int id) {
        this.id = id;
    }

    public Relatorio(int id, String vendedor) {
        this.id = id;
        this.vendedor = vendedor;
    }

    public Relatorio(int id, String vendedor, String produto) {
        this.id = id;
        this.vendedor = vendedor;
        this.produto = produto;
    }

    public Relatorio(int id, String vendedor, String produto, String cliente) {
        this.id = id;
        this.vendedor = vendedor;
        this.produto = produto;
        this.cliente = cliente;
    }

    public Relatorio(int id, String vendedor, String produto, String cliente, String dataVenda) {
        this.id = id;
        this.vendedor = vendedor;
        this.produto = produto;
        this.cliente = cliente;
        this.dataVenda = dataVenda;
    }

    public Relatorio(int id, String vendedor, String produto, String cliente, String dataVenda, double valor) {
        this.id = id;
        this.vendedor = vendedor;
        this.produto = produto;
        this.cliente = cliente;
        this.dataVenda = dataVenda;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
