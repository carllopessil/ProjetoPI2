
package com.mycompany.projetopi2semestre2;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

    //Herança

public class ModelRelatorios {
    private String clienteDados;
    private String dataDados;
    private double valorDados;
    private String nomeProduto;
    
    
    public ModelRelatorios(){
        
    }
    
    public ModelRelatorios(String clienteDados){
        this.clienteDados = clienteDados;
    }
    
    public ModelRelatorios(String clienteDados, String dataDados){
        this.clienteDados = clienteDados;
        this.dataDados = dataDados;
    }
    
    public ModelRelatorios(String clienteDados, String dataDados, double valorDados){
        this.clienteDados = clienteDados;
        this.dataDados = dataDados;
        this.valorDados = valorDados;
    }

    public String getClienteDados() {
        return clienteDados;
    }

    public void setClienteDados(String clienteDados) {
        this.clienteDados = clienteDados;
    }

    public String getDataDados() {
        return dataDados;
    }

    public void setDataDados(String dataDados) {
        this.dataDados = dataDados;
    }

    public double getValorDados() {
        return valorDados;
    }

    public void setValorDados(double valorDados) {
        this.valorDados = valorDados;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    
}

//public class modelRelatorios extends AbstractTableModel {
    
//    //Declarando os valores dentro do array que irá pra tabela
//    ArrayList<Dados> dados = new ArrayList<Dados>;
//    //Declarando os nomes das colunas
//    String[] colunas = {"Cliente", "Data", "Valor das Vendas", "total"};
//    
//    @Override
//    public int getRowCount() {
//        return dados.size();
//    }
//
//    @Override
//    public int getColumnCount() {
//        return colunas.length;
//    }
//
//    @Override
//    public String getColumnName(int column) {
//        return colunas[column];
//    } 
//    
//    @Override
//    public Object getValueAt(int rowIndex, int columnIndex) {
//        if(columnIndex == 0) {
//            return dados.get(rowIndex).getCliente();
//        }else if(columnIndex == 1) { 
//            return dados.get(rowIndex).getData();
//        }else if(columnIndex == 2) {
//            return dados.get(rowIndex).getValorTotalVendas();
//        }else {
//            return dados.get(rowIndex).getTotal();
//        }
//    }
//    
//}
