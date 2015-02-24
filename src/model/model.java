package model;

import controller.*;
import java.io.File;


public class Model implements ModelBehaviour {

    public Controller controller;
    public File worstList;
    private PasswordManager passManager;

    public Model(){
        init();
    }

    public void init(){
            worstList = new File("./data/worstList.txt");
            passManager = new PasswordManager();
    }

    public File getWorstList() {
        return worstList;
    }

    @Override
    public void setController(Controller c){
        this.controller = c;
    }

    @Override
    public Controller getController(){
        return this.controller;
    }

    @Override
    public File getFile(){
        return worstList;
    }

    public PasswordManager getPasswordManager(){
        return passManager;
    }







}
