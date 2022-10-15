
package com.mycompany.mavenproject2;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

    //Herança
public class modelRelatorios extends AbstractTableModel {
    
    //Declarando os valores dentro do array que irá pra tabela
    ArrayList<Dados> dados = new ArrayList();
    //Declarando os nomes das colunas
    String[] colunas = {"Cliente", "Data", "Valor das Vendas", "total"};
    
    @Override
    public int getRowCount() {
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    } 
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(columnIndex == 0) {
            return dados.get(rowIndex).getCliente();
        }else if(columnIndex == 1) { 
            return dados.get(rowIndex).getData();
        }else if(columnIndex == 2) {
            return dados.get(rowIndex).getValorTotalVendas();
        }else {
            return dados.get(rowIndex).getTotal();
        }
    }
    
}
