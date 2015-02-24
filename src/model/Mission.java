package model;


import java.util.ArrayList;

public class Mission implements MissionBehaviour {
    private String missionDescription;
    private ArrayList<String> parts;

    public Mission(){
        parts = new ArrayList<String>();
        missionDescription = "";
    }

    @Override
    public String getPart(int i){
        return parts.get(i);
    }

    @Override
    public void setPart(int i, String s){
        parts.add(i,s);
    }

    @Override
    public String getDescription(){
        return missionDescription;
    }

    @Override
    public void setDescription(String s){
        missionDescription = s;
    }
}
