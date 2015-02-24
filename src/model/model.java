package model;

import controller.Controller;


public class Model implements ModelBehaviour {

    public Controller controller;
    private Mission appletMission;

    public Mission getAppletMission() {
        return appletMission;
    }

    public void setAppletMission(Mission appletMission) {
        this.appletMission = appletMission;
    }

    private String description;

    public Model(){
        init();
    }

    public void init(){
        appletMission = new Mission();
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
    public Mission getMission(){
        return appletMission;
    }


    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

}
