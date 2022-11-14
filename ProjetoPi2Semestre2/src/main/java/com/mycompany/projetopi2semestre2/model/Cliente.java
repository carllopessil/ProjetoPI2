package com.mycompany.projetopi2semestre2.model;

public class Cliente {

    private int idCliente;
    private String nomeCliente = "";
    private String cpfCliente;
    private String dataNascimento;
    private String estadoCliente;
    private String sexoCliente = "";
    private String emailCliente = "";
    private String telefoneCliente;
    private String cepCliente;
    private String enderecoCliente = "";
    private int numeroEndCliente;
    private String complementoCliente = "";

    public Cliente() {
    }

    public Cliente(String nomeCliente,String cpfCliente, String dataNascimento, String estadoCliente, String sexoCliente, String emailCliente, String telefoneCliente, String cepCliente, String enderecoCliente, int numeroEndCliente, String complementoCliente) {
        this.nomeCliente = nomeCliente;
      this.cpfCliente = cpfCliente;
 this.dataNascimento = dataNascimento;
        this.estadoCliente = estadoCliente;
        this.sexoCliente = sexoCliente;
        this.emailCliente = emailCliente;
      this.telefoneCliente = telefoneCliente;
       this.cepCliente = cepCliente;
        this.enderecoCliente = enderecoCliente;
        this.numeroEndCliente = numeroEndCliente;
        this.complementoCliente = complementoCliente;

    }
       public Cliente(int idCliente, String nomeCliente,String cpfCliente, String dataNascimento, String estadoCliente, String sexoCliente, String emailCliente, String telefoneCliente, String cepCliente, String enderecoCliente, int numeroEndCliente, String complementoCliente) {
        this.idCliente = idCliente;
           this.nomeCliente = nomeCliente;
      this.cpfCliente = cpfCliente;
 this.dataNascimento = dataNascimento;
        this.estadoCliente = estadoCliente;
        this.sexoCliente = sexoCliente;
        this.emailCliente = emailCliente;
      this.telefoneCliente = telefoneCliente;
       this.cepCliente = cepCliente;
        this.enderecoCliente = enderecoCliente;
        this.numeroEndCliente = numeroEndCliente;
        this.complementoCliente = complementoCliente;
        
       }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEstadoCliente() {
        return estadoCliente;
    }

    public void setEstadoCliente(String estadoCliente) {
        this.estadoCliente = estadoCliente;
    }

    public String getSexoCliente() {
        return sexoCliente;
    }

    public void setSexoCliente(String sexoCliente) {
        this.sexoCliente = sexoCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    public String getCepCliente() {
        return cepCliente;
    }

    public void setCepCliente(String cepCliente) {
        this.cepCliente = cepCliente;
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    public int getNumeroEndCliente() {
        return numeroEndCliente;
    }

    public void setNumeroEndCliente(int numeroEndCliente) {
        this.numeroEndCliente = numeroEndCliente;
    }

    public String getComplementoCliente() {
        return complementoCliente;
    }

    public void setComplementoCliente(String complementoCliente) {
        this.complementoCliente = complementoCliente;
    }
    @Override
    public String toString(){
        return getEstadoCliente();
    }
}

   