/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopi2semestre2.model;

public class Vendedor {

    private int idVendedor;
    private String nomeVendedor = "";
    private String cpfVendedor = "";
    private String telefoneVendedor = "";

    public Vendedor() {
    }

    public Vendedor(String nomeVendedor, String cpfVendedor, String telefoneVendedor) {
        this.nomeVendedor = nomeVendedor;
        this.cpfVendedor = cpfVendedor;
        this.telefoneVendedor = telefoneVendedor;

    }

    public Vendedor(int idVendedor,String nomeVendedor, String cpfVendedor, String telefoneVendedor) {
        this.idVendedor = idVendedor;
        this.nomeVendedor = nomeVendedor;
        this.cpfVendedor = cpfVendedor;
        this.telefoneVendedor = telefoneVendedor;

    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }

    public String getCpfVendedor() {
        return cpfVendedor;
    }

    public void setCpfVendedor(String cpfVendedor) {
        this.cpfVendedor = cpfVendedor;
    }

    public String getTelefoneVendedor() {
        return telefoneVendedor;
    }

    public void setTelefoneVendedor(String telefoneVendedor) {
        this.telefoneVendedor = telefoneVendedor;
    }
}