package model;
import controller.Controller;

public interface ModelBehaviour {

    public Controller getController();
    public void setController(Controller c);
    public Mission getMission();
    public String getDescription();
    public void setDescription(String description);

}
