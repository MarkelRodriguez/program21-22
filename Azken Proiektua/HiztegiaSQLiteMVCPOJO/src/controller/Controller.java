/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Model;
import model.Model;
import model.Terminoa;
import view.View;
import view.View;

public class Controller implements ActionListener {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        gehituActionListener(this);
    }

    private void gehituActionListener(ActionListener listener) {
        //GUIaren konponente guztiei gehitu listenerra
        view.jButtonTxertatu.addActionListener(listener);
        view.jButtonInprimatu.addActionListener(listener);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        //listenerrak entzun dezakeen eragiketa bakoitzeko. Konponenteek 'actionCommad' propietatea daukate
        switch (actionCommand) {
            case "TXERTATU":
                
                System.out.println("TXERTATU botoia sakatu duzu");
                Terminoa t = new Terminoa(0,view.jTextFieldEuskaraz.getText().toLowerCase(),view.jTextFieldGazteleraz.getText().toLowerCase());
                
                int txertatu = model.terminoaGehitu(t);
                
                if (txertatu == 1){
                    view.jLabelKonfirmatu.setText("ONDO TXERTATU DA!");
                }
                else if(txertatu == 0){
                    view.jLabelKonfirmatu.setText("Errepikatuta dago");
                }
                else{
                    view.jLabelKonfirmatu.setText("Errore bat egon da");
                }
                break;
                
                
            case "INPRIMATU":
                System.out.println("INPRIMATU botoia sakatu duzu");
                model.terminoakInprimatu();
                break;
            }
    }
}
