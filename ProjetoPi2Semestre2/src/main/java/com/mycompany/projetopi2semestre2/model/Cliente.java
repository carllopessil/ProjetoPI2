package com.mycompany.projetopi2semestre2.model;

import java.util.Date;

/**
 *
 * @author carlos silva lopes
 */
public class Cliente {

    private int idCliente;
    private String nomeCliente = "";
    private String cpfCliente;
    private Date dataNascimento;
    private String estadoCliente;
    private String sexoCliente = "";
    private String emailCliente = "";
    private String telefoneCliente;
    private String cepCliente;
    private String enderecoCliente = "";
    private int numeroEndCliente;
    private String complementoCliente = "";

    /**
     *
     */
    public Cliente() {
    }

    /**
     *
     * @param nomeCliente
     * @param cpfCliente
     * @param dataNascimento
     * @param estadoCliente
     * @param sexoCliente
     * @param emailCliente
     * @param telefoneCliente
     * @param cepCliente
     * @param enderecoCliente
     * @param numeroEndCliente
     * @param complementoCliente
     */
    public Cliente(String nomeCliente, String cpfCliente, Date dataNascimento, String estadoCliente, String sexoCliente, String emailCliente, String telefoneCliente, String cepCliente, String enderecoCliente, int numeroEndCliente, String complementoCliente) {
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

    /**
     *
     * @param idCliente
     * @param nomeCliente
     * @param cpfCliente
     * @param dataNascimento
     * @param estadoCliente
     * @param sexoCliente
     * @param emailCliente
     * @param telefoneCliente
     * @param cepCliente
     * @param enderecoCliente
     * @param numeroEndCliente
     * @param complementoCliente
     */
    public Cliente(int idCliente, String nomeCliente, String cpfCliente, Date dataNascimento, String estadoCliente, String sexoCliente, String emailCliente, String telefoneCliente, String cepCliente, String enderecoCliente, int numeroEndCliente, String complementoCliente) {
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

    /**
     *
     * @return
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     *
     * @param idCliente
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    /**
     *
     * @return
     */
    public String getNomeCliente() {
        return nomeCliente;
    }

    /**
     *
     * @param nomeCliente
     */
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    /**
     *
     * @return
     */
    public String getCpfCliente() {
        return cpfCliente;
    }

    /**
     *
     * @param cpfCliente
     */
    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    /**
     *
     * @return
     */
    public Date getDataNascimento() {
        return dataNascimento;
    }

    /**
     *
     * @param dataNascimento
     */
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /**
     *
     * @return
     */
    public String getEstadoCliente() {
        return estadoCliente;
    }

    /**
     *
     * @param estadoCliente
     */
    public void setEstadoCliente(String estadoCliente) {
        this.estadoCliente = estadoCliente;
    }

    /**
     *
     * @return
     */
    public String getSexoCliente() {
        return sexoCliente;
    }

    /**
     *
     * @param sexoCliente
     */
    public void setSexoCliente(String sexoCliente) {
        this.sexoCliente = sexoCliente;
    }

    /**
     *
     * @return
     */
    public String getEmailCliente() {
        return emailCliente;
    }

    /**
     *
     * @param emailCliente
     */
    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    /**
     *
     * @return
     */
    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    /**
     *
     * @param telefoneCliente
     */
    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    /**
     *
     * @return
     */
    public String getCepCliente() {
        return cepCliente;
    }

    /**
     *
     * @param cepCliente
     */
    public void setCepCliente(String cepCliente) {
        this.cepCliente = cepCliente;
    }

    /**
     *
     * @return
     */
    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    /**
     *
     * @param enderecoCliente
     */
    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    /**
     *
     * @return
     */
    public int getNumeroEndCliente() {
        return numeroEndCliente;
    }

    /**
     *
     * @param numeroEndCliente
     */
    public void setNumeroEndCliente(int numeroEndCliente) {
        this.numeroEndCliente = numeroEndCliente;
    }

    /**
     *
     * @return
     */
    public String getComplementoCliente() {
        return complementoCliente;
    }

    /**
     *
     * @param complementoCliente
     */
    public void setComplementoCliente(String complementoCliente) {
        this.complementoCliente = complementoCliente;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return getEstadoCliente();
    }

    /**
     *
     * @return
     */
    public String toStriing() {
        return getSexoCliente();
    }
}
