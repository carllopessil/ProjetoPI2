/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopi2semestre2.model;

/**
 *
 * @author carlos silva lopes
 */
public class Vendedor {

    private int idVendedor;
    private String nomeVendedor = "";
    private String cpfVendedor = "";
    private String telefoneVendedor = "";

    /**
     *
     */
    public Vendedor() {
    }

    /**
     *
     * @param nomeVendedor
     * @param cpfVendedor
     * @param telefoneVendedor
     */
    public Vendedor(String nomeVendedor, String cpfVendedor, String telefoneVendedor) {
        this.nomeVendedor = nomeVendedor;
        this.cpfVendedor = cpfVendedor;
        this.telefoneVendedor = telefoneVendedor;

    }

    /**
     *
     * @param idVendedor
     * @param nomeVendedor
     * @param cpfVendedor
     * @param telefoneVendedor
     */
    public Vendedor(int idVendedor,String nomeVendedor, String cpfVendedor, String telefoneVendedor) {
        this.idVendedor = idVendedor;
        this.nomeVendedor = nomeVendedor;
        this.cpfVendedor = cpfVendedor;
        this.telefoneVendedor = telefoneVendedor;

    }

    /**
     *
     * @return
     */
    public int getIdVendedor() {
        return idVendedor;
    }

    /**
     *
     * @param idVendedor
     */
    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    /**
     *
     * @return
     */
    public String getNomeVendedor() {
        return nomeVendedor;
    }

    /**
     *
     * @param nomeVendedor
     */
    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }

    /**
     *
     * @return
     */
    public String getCpfVendedor() {
        return cpfVendedor;
    }

    /**
     *
     * @param cpfVendedor
     */
    public void setCpfVendedor(String cpfVendedor) {
        this.cpfVendedor = cpfVendedor;
    }

    /**
     *
     * @return
     */
    public String getTelefoneVendedor() {
        return telefoneVendedor;
    }

    /**
     *
     * @param telefoneVendedor
     */
    public void setTelefoneVendedor(String telefoneVendedor) {
        this.telefoneVendedor = telefoneVendedor;
    }
}