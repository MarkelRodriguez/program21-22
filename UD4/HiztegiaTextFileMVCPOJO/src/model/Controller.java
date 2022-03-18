/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.Model;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        
        view.jButtonGorde.addActionListener(listener); 
        

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        //listenerrak entzun dezakeen eragiketa bakoitzeko. Konponenteek 'actionCommad' propietatea daukate
        switch (actionCommand) {
            
            
            case "Gorde":
                
            {
                try {
                    model.terminoakJaso(view.jTextAreaHitzak.getText());
                } catch (IOException ex) {
                    Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                 
                 break;

            
            
            case "IRTEN":
                view.dispose();
        }
    }
}