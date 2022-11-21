package com.mycompany.projetopi2semestre2.model;

/**
 *
 * @author heloysa.fsantos
 */
public class PDVClasse {

    private static String nomeCliente = "";
    private static String cpfCliente;
    private static String nomeVendedor = "";
    private static String cpfVendedor;
    private static int codBarras;
    private static int quantidadeProduto;
    public String tblCarrinho = "";

    public static int idItemVenda;
    public static int idVenda ;
    public static int idProduto ;
    public static String quantidadeProdutoVenda = "";
    public static String valorUnitario = "";

    public static int idCliente;
    public static String valorVenda = "";
    public static int idVendedor;

    public PDVClasse(int idCliente, String ValorVenda, int idVendedor) {
        this.idCliente= idCliente;
        this.valorVenda= ValorVenda;
        this.idVendedor= idVendedor;
    }
    public PDVClasse(int idVenda, int idCliente, String ValorVenda, int idVendedor) {
        this.idVenda= idVenda;
        this.idCliente= idCliente;
        this.valorVenda= ValorVenda;
        this.idVendedor= idVendedor;
    }
    public PDVClasse(int idItemVenda, int idVenda,int idProduto, String quantidadeProdutoVenda, String valorUnitario) {
        this.idItemVenda = idItemVenda;
        this.idVenda = idVenda;
        this.idProduto = idProduto;
        this.quantidadeProdutoVenda = quantidadeProdutoVenda;
        this.valorUnitario = valorUnitario;
    }

    public static int getIdCliente() {
        return idCliente;
    }

    public static String getValorVenda() {
        return valorVenda;
    }

    public static int getIdVendedor() {
        return idVendedor;
    }

    public PDVClasse() {

    }

    public PDVClasse(String nomeCliente, String cpfCliente, String nomeVendedor, String cpfVendedor, int codBarras, int quantidadeProduto) {
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
        this.nomeVendedor = nomeVendedor;
        this.cpfVendedor = cpfVendedor;
        this.codBarras = codBarras;
        this.quantidadeProduto = quantidadeProduto;
    }

    public static int getIdItemVenda() {
        return idItemVenda;
    }

    public static void setIdItemVenda(int idItemVenda) {
        PDVClasse.idItemVenda = idItemVenda;
    }

    public static int getIdVenda() {
        return idVenda;
    }

    public static void setIdVenda(int idVenda) {
        PDVClasse.idVenda = idVenda;
    }

    public static int getIdProduto() {
        return idProduto;
    }

    public static void setIdProduto(int idProduto) {
        PDVClasse.idProduto = idProduto;
    }

    public static String getQuantidadeProdutoVenda() {
        return quantidadeProdutoVenda;
    }

    public static void setQuantidadeProdutoVenda(String quantidadeProdutoVenda) {
        PDVClasse.quantidadeProdutoVenda = quantidadeProdutoVenda;
    }

    public static String getValorUnitario() {
        return valorUnitario;
    }

    public static void setValorUnitario(String valorUnitario) {
        PDVClasse.valorUnitario = valorUnitario;
    }

    public static String getNomeCliente() {
        return nomeCliente;
    }

    public static void setNomeCliente(String nomeCliente) {
        PDVClasse.nomeCliente = nomeCliente;
    }

    public static String getCpfCliente() {
        return cpfCliente;
    }

    public static void setCpfCliente(String cpfCliente) {
        PDVClasse.cpfCliente = cpfCliente;
    }

    public static String getNomeVendedor() {
        return nomeVendedor;
    }

    public static void setNomeVendedor(String nomeVendedor) {
        PDVClasse.nomeVendedor = nomeVendedor;
    }

    public static String getCpfVendedor() {
        return cpfVendedor;
    }

    public static void setCpfVendedor(String cpfVendedor) {
        PDVClasse.cpfVendedor = cpfVendedor;
    }

    public static int getCodBarras() {
        return codBarras;
    }

    public static void setCodBarras(int codBarras) {
        PDVClasse.codBarras = codBarras;
    }

    public static int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public static void setQuantidadeProduto(int quantidadeProduto) {
        PDVClasse.quantidadeProduto = quantidadeProduto;
    }

    public String getTblCarrinho() {
        return tblCarrinho;
    }

    public void setTblCarrinho(String tblCarrinho) {
        this.tblCarrinho = tblCarrinho;
    }

}
