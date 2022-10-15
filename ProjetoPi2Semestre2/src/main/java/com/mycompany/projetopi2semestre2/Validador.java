
package com.mycompany.projetopi2semestre2;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Validador {
    public ArrayList<String> mensagensErro = new ArrayList<>();

    public void ValidarNumero(JTextField txt) {

        try {
            //Verifico se o campo está vazio
            if (txt.getText().trim().equals("")) {
                throw new IllegalArgumentException();
            }
            int valorConvertido = Integer.parseInt(txt.getText());
            txt.setBackground(Color.WHITE);

        } catch (NumberFormatException e) {

            this.mensagensErro.add("Falha ao converter o valor do campo " + txt.getName() + " em inteiro");
            JOptionPane.showMessageDialog(null, "Digite apenas números!");
            txt.setText("");

        } catch (IllegalArgumentException e) {
            this.mensagensErro.add("Digite um valor para o campo " + txt.getName());

        }

    }
}
