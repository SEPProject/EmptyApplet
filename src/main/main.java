package main;

import controller.Controller;
import model.Model;
import view.View;


public class Main {

    public static void main (String argv[]){

        Test test = new Test();
        Model model = new Model();
        View view = new View();
        Controller ctrl = new Controller(model,view);
        ctrl.getView().getFirstPage().setVisible(true);



    }



}
