package com.mycompany.projetopi2semestre2.model;

public class Cliente {

    private int id_cli;
    private String nome_cli = "";
    private String cpf_cli;
    private String data_nasci;
    private String estado_cli;
    private String sexo_cli = "";
    private String email_cli = "";
    private String tel_cli;
    private String cep_cli;
    private String end_cli = "";
    private int numero_cli;
    private String compl_cli = "";

    public Cliente() {
    }

    public Cliente(String nome_cli,String cpf_cli, String data_nasci, String estado_cli, String sexo_cli, String email_cli, String tel_cli, String cep_cli, String end_cli, int numero_cli, String compl_cli) {
        this.nome_cli = nome_cli;
      this.cpf_cli = cpf_cli;
 this.data_nasci = data_nasci;
        this.estado_cli = estado_cli;
        this.sexo_cli = sexo_cli;
        this.email_cli = email_cli;
      this.tel_cli = tel_cli;
       this.cep_cli = cep_cli;
        this.end_cli = end_cli;
        this.numero_cli = numero_cli;
        this.compl_cli = compl_cli;

    }
       public Cliente(int id_cli, String nome_cli,String cpf_cli, String data_nasci, String estado_cli, String sexo_cli, String email_cli, String tel_cli, String cep_cli, String end_cli, int numero_cli, String compl_cli) {
        this.id_cli = id_cli;
           this.nome_cli = nome_cli;
      this.cpf_cli = cpf_cli;
 this.data_nasci = data_nasci;
        this.estado_cli = estado_cli;
        this.sexo_cli = sexo_cli;
        this.email_cli = email_cli;
      this.tel_cli = tel_cli;
       this.cep_cli = cep_cli;
        this.end_cli = end_cli;
        this.numero_cli = numero_cli;
        this.compl_cli = compl_cli;
       }

    public int getId_cli() {
        return id_cli;
    }

    public void setId_cli(int id_cli) {
        this.id_cli = id_cli;
    }

    public String getNome_cli() {
        return nome_cli;
    }

    public void setNome_cli(String nome_cli) {
        this.nome_cli = nome_cli;
    }

    public String getCpf_cli() {
        return cpf_cli;
    }

    public void setCpf_cli(String cpf_cli) {
        this.cpf_cli = cpf_cli;
    }

    public String getData_nasci() {
        return data_nasci;
    }

    public void setData_nasci(String data_nasci) {
        this.data_nasci = data_nasci;
    }

    public String getEstado_cli() {
        return estado_cli;
    }

    public void setEstado_cli(String estado_cli) {
        this.estado_cli = estado_cli;
    }

    public String getSexo_cli() {
        return sexo_cli;
    }

    public void setSexo_cli(String sexo_cli) {
        this.sexo_cli = sexo_cli;
    }

    public String getEmail_cli() {
        return email_cli;
    }

    public void setEmail_cli(String email_cli) {
        this.email_cli = email_cli;
    }

    public String getTel_cli() {
        return tel_cli;
    }

    public void setTel_cli(String tel_cli) {
        this.tel_cli = tel_cli;
    }

    public String getCep_cli() {
        return cep_cli;
    }

    public void setCep_cli(String cep_cli) {
        this.cep_cli = cep_cli;
    }

    public String getEnd_cli() {
        return end_cli;
    }

    public void setEnd_cli(String end_cli) {
        this.end_cli = end_cli;
    }

    public int getNumero_cli() {
        return numero_cli;
    }

    public void setNumero_cli(int numero_cli) {
        this.numero_cli = numero_cli;
    }

    public String getCompl_cli() {
        return compl_cli;
    }

    public void setCompl_cli(String compl_cli) {
        this.compl_cli = compl_cli;
    }
}
