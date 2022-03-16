/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.Model;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author rodriguez.markel
 */
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
        view.jButtonIrten.addActionListener(listener); 
        view.jButtonBueltatu.addActionListener(listener); 
        view.jButtonGehitu.addActionListener(listener);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        //listenerrak entzun dezakeen eragiketa bakoitzeko. Konponenteek 'actionCommad' propietatea daukate
        switch (actionCommand) {
            
            case "TXERTATU":
                view.jDialogHitzaSartu.setVisible(true);
                break;
            case "INPRIMATU":
                 model.selectAll();
                 break;
            case "GEHITU":
                Terminoa t = new Terminoa(0,view.jTextFieldEuskaraz.getText(),view.jTextFieldGazteleraz.getText());
                model.insert(t);
                view.jTextFieldEuskaraz.setText(" ");
                view.jTextFieldGazteleraz.setText(" ");
                break;
                
            case "BUELTATU":
                view.jDialogHitzaSartu.dispose();
                break;
            case "IRTEN":
                view.dispose();
        }
    }
}