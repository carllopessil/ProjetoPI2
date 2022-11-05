
package com.mycompany.projetopi2semestre2.model;


public class Cliente {
    private int id_cli;
    private String nome_cli = "";
    private int CPF_cli;
    private int Data_Nasci;
    private String estadoCivil_cli;
    private String email_cli = "";
    private String sexo_cli = "";
    private int telefone_cli;
    private int CEP_cli;
    private String endereco_cli = "";
    private int numero_cli;
    private String complemento_cli = "";

    public Cliente() {
    }

     public Cliente(String nome_cli,int CPF_cli,int Data_Nasci) {
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

    public int getCPF_cli() {
        return CPF_cli;
    }

    public void setCPF_cli(int CPF_cli) {
        this.CPF_cli = CPF_cli;
    }

    public int getData_Nasci() {
        return Data_Nasci;
    }

    public void setData_Nasci(int dataNascimento_cli) {
        this.Data_Nasci = dataNascimento_cli;
    }

    public String getEstadoCivil_cli() {
        return estadoCivil_cli;
    }

    public void setEstadoCivil_cli(String estadoCivil_cli) {
        this.estadoCivil_cli = estadoCivil_cli;
    }

    public String getEmail_cli() {
        return email_cli;
    }

    public void setEmail_cli(String email_cli) {
        this.email_cli = email_cli;
    }

    public String getSexo_cli() {
        return sexo_cli;
    }

    public void setSexo_cli(String sexo_cli) {
        this.sexo_cli = sexo_cli;
    }

    public int getTelefone_cli() {
        return telefone_cli;
    }

    public void setTelefone_cli(int telefone_cli) {
        this.telefone_cli = telefone_cli;
    }

    public int getCEP_cli() {
        return CEP_cli;
    }

    public void setCEP_cli(int CEP_cli) {
        this.CEP_cli = CEP_cli;
    }

    public String getEndereco_cli() {
        return endereco_cli;
    }

    public void setEndereco_cli(String endereco_cli) {
        this.endereco_cli = endereco_cli;
    }

    public int getNumero_cli() {
        return numero_cli;
    }

    public void setNumero_cli(int numero_cli) {
        this.numero_cli = numero_cli;
    }

    public String getComplemento_cli() {
        return complemento_cli;
    }

    public void setComplemento_cli(String complemento_cli) {
        this.complemento_cli = complemento_cli;
    }

}
