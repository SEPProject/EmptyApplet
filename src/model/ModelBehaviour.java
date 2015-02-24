package model;
import controller.*;
import java.io.*;
import java.util.ArrayList;

public interface ModelBehaviour {
    public Controller getController();
    public void setController(Controller c);
    public File getFile();
    public PasswordManager getPasswordManager();
    public ArrayList<Mission> getMission();
}
