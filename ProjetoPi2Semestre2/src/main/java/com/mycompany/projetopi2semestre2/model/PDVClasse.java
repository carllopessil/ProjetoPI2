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

    /**
     *
     */
    public String tblCarrinho = "";

    /**
     *
     */
    public static int idItemVenda;

    /**
     *
     */
    public static int idVenda ;

    /**
     *
     */
    public static int idProduto ;

    /**
     *
     */
    public static String quantidadeProdutoVenda = "";

    /**
     *
     */
    public static String valorUnitario = "";

    /**
     *
     */
    public static int idCliente;

    /**
     *
     */
    public static double valorVenda;

    /**
     *
     */
    public static int idVendedor;

    /**
     *
     * @param idCliente
     * @param ValorVenda
     * @param idVendedor
     */
    public PDVClasse(int idCliente, double ValorVenda, int idVendedor) {
        this.idCliente= idCliente;
        this.valorVenda= ValorVenda;
        this.idVendedor= idVendedor;
    }

    /**
     *
     * @param idVenda
     * @param idCliente
     * @param ValorVenda
     * @param idVendedor
     */
    public PDVClasse(int idVenda, int idCliente, double ValorVenda, int idVendedor) {
        this.idVenda= idVenda;
        this.idCliente= idCliente;
        this.valorVenda= ValorVenda;
        this.idVendedor= idVendedor;
    }

    /**
     *
     * @param idItemVenda
     * @param idVenda
     * @param idProduto
     * @param quantidadeProdutoVenda
     * @param valorUnitario
     */
    public PDVClasse(int idItemVenda, int idVenda,int idProduto, String quantidadeProdutoVenda, String valorUnitario) {
        this.idItemVenda = idItemVenda;
        this.idVenda = idVenda;
        this.idProduto = idProduto;
        this.quantidadeProdutoVenda = quantidadeProdutoVenda;
        this.valorUnitario = valorUnitario;
    }

    /**
     *
     * @return
     */
    public static int getIdCliente() {
        return idCliente;
    }

    /**
     *
     * @return
     */
    public static double getValorVenda() {
        return valorVenda;
    }

    /**
     *
     * @param idCliente
     */
    public static void setIdCliente(int idCliente) {
        PDVClasse.idCliente = idCliente;
    }

    /**
     *
     * @param valorVenda
     */
    public static void setValorVenda(double valorVenda) {
        PDVClasse.valorVenda = valorVenda;
    }

    /**
     *
     * @param idVendedor
     */
    public static void setIdVendedor(int idVendedor) {
        PDVClasse.idVendedor = idVendedor;
    }

    /**
     *
     * @return
     */
    public static int getIdVendedor() {
        return idVendedor;
    }

    /**
     *
     */
    public PDVClasse() {

    }

    /**
     *
     * @param nomeCliente
     * @param cpfCliente
     * @param nomeVendedor
     * @param cpfVendedor
     * @param codBarras
     * @param quantidadeProduto
     */
    public PDVClasse(String nomeCliente, String cpfCliente, String nomeVendedor, String cpfVendedor, int codBarras, int quantidadeProduto) {
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
        this.nomeVendedor = nomeVendedor;
        this.cpfVendedor = cpfVendedor;
        this.codBarras = codBarras;
        this.quantidadeProduto = quantidadeProduto;
    }

    /**
     *
     * @return
     */
    public static int getIdItemVenda() {
        return idItemVenda;
    }

    /**
     *
     * @param idItemVenda
     */
    public static void setIdItemVenda(int idItemVenda) {
        PDVClasse.idItemVenda = idItemVenda;
    }

    /**
     *
     * @return
     */
    public static int getIdVenda() {
        return idVenda;
    }

    /**
     *
     * @param idVenda
     */
    public static void setIdVenda(int idVenda) {
        PDVClasse.idVenda = idVenda;
    }

    /**
     *
     * @return
     */
    public static int getIdProduto() {
        return idProduto;
    }

    /**
     *
     * @param idProduto
     */
    public static void setIdProduto(int idProduto) {
        PDVClasse.idProduto = idProduto;
    }

    /**
     *
     * @return
     */
    public static String getQuantidadeProdutoVenda() {
        return quantidadeProdutoVenda;
    }

    /**
     *
     * @param quantidadeProdutoVenda
     */
    public static void setQuantidadeProdutoVenda(String quantidadeProdutoVenda) {
        PDVClasse.quantidadeProdutoVenda = quantidadeProdutoVenda;
    }

    /**
     *
     * @return
     */
    public static String getValorUnitario() {
        return valorUnitario;
    }

    /**
     *
     * @param valorUnitario
     */
    public static void setValorUnitario(String valorUnitario) {
        PDVClasse.valorUnitario = valorUnitario;
    }

    /**
     *
     * @return
     */
    public static String getNomeCliente() {
        return nomeCliente;
    }

    /**
     *
     * @param nomeCliente
     */
    public static void setNomeCliente(String nomeCliente) {
        PDVClasse.nomeCliente = nomeCliente;
    }

    /**
     *
     * @return
     */
    public static String getCpfCliente() {
        return cpfCliente;
    }

    /**
     *
     * @param cpfCliente
     */
    public static void setCpfCliente(String cpfCliente) {
        PDVClasse.cpfCliente = cpfCliente;
    }

    /**
     *
     * @return
     */
    public static String getNomeVendedor() {
        return nomeVendedor;
    }

    /**
     *
     * @param nomeVendedor
     */
    public static void setNomeVendedor(String nomeVendedor) {
        PDVClasse.nomeVendedor = nomeVendedor;
    }

    /**
     *
     * @return
     */
    public static String getCpfVendedor() {
        return cpfVendedor;
    }

    /**
     *
     * @param cpfVendedor
     */
    public static void setCpfVendedor(String cpfVendedor) {
        PDVClasse.cpfVendedor = cpfVendedor;
    }

    /**
     *
     * @return
     */
    public static int getCodBarras() {
        return codBarras;
    }

    /**
     *
     * @param codBarras
     */
    public static void setCodBarras(int codBarras) {
        PDVClasse.codBarras = codBarras;
    }

    /**
     *
     * @return
     */
    public static int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    /**
     *
     * @param quantidadeProduto
     */
    public static void setQuantidadeProduto(int quantidadeProduto) {
        PDVClasse.quantidadeProduto = quantidadeProduto;
    }

    /**
     *
     * @return
     */
    public String getTblCarrinho() {
        return tblCarrinho;
    }

    /**
     *
     * @param tblCarrinho
     */
    public void setTblCarrinho(String tblCarrinho) {
        this.tblCarrinho = tblCarrinho;
    }

}
