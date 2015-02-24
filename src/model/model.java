package model;

import controller.*;
import java.io.File;
import java.util.ArrayList;


public class Model implements ModelBehaviour {

    public Controller controller;
    public File worstList;
    private PasswordManager passManager;
    private ArrayList<Mission> appletMissions ;

    public Model(){
        init();
    }

    public void init(){
            worstList = new File("./data/worstList.txt");
            passManager = new PasswordManager();
            appletMissions = new ArrayList<Mission>();
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

    @Override
    public PasswordManager getPasswordManager(){
        return passManager;
    }

    @Override
    public ArrayList<Mission> getMission(){
        return appletMissions;
    }


}
