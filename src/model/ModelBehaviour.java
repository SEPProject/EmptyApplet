package model;
import controller.*;
import java.io.*;

public interface ModelBehaviour {
    public Controller getController();
    public void setController(Controller c);
    public File getFile();
    public PasswordManager getPasswordManager();
}
