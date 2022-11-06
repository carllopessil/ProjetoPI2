/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopi2semestre2.model;

public class Vendedor {

    private int cod_vend;
    private String nome_vend = "";
    private String cpf_vend;
    private String tel_vend;

    public Vendedor() {
    }

    public Vendedor(String nome_vend, String cpf_vend, String tel_vend) {
        this.nome_vend = nome_vend;
        this.cpf_vend = cpf_vend;
        this.tel_vend = tel_vend;

    }

    public Vendedor(int cod_vend, String nome_vend, String cpf_vend, String tel_vend) {
        this.cod_vend = cod_vend;
        this.nome_vend = nome_vend;
        this.cpf_vend = cpf_vend;
        this.tel_vend = tel_vend;

    }

    public int getCod_vend() {
        return cod_vend;
    }

    public void setCod_vend(int cod_vend) {
        this.cod_vend = cod_vend;
    }

    public String getNome_vend() {
        return nome_vend;
    }

    public void setNome_vend(String nome_vend) {
        this.nome_vend = nome_vend;
    }

    public String getCpf_vend() {
        return cpf_vend;
    }

    public void setCpf_vend(String cpf_vend) {
        this.cpf_vend = cpf_vend;
    }

    public String getTel_vend() {
        return tel_vend;
    }

    public void setTel_vend(String tel_vend) {
        this.tel_vend = tel_vend;

    }
}
