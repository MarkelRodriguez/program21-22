/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarria;

import view.View;
import model.Model;
import controller.Controller;



/**
 *
 * @author imadariaga
 */
public class ProgramaNagusia {

 public static void main(String args[]) {

        View view = View.viewaSortuBistaratu();

        Model model = new Model();

        Controller controller = new Controller(model, view);
    }
}