package view;

import controller.*;
import javax.swing.*;

public interface ViewBehaviour {
    public JFrame getFirstPage();
    public void setController(Controller p);
    public Controller getController();

}
