package controller;

import model.Model;
import view.View;

public class Controller implements Controller2Model, Controller2View {

    private Model model ;
    private View view;

    public Controller(Model m ,View v){
        this.model = m;
        this.view = v;
    }

    @Override
    public void setModel(Model m){
        this.model=m;
    }

    @Override
    public Model getModel(){
        return model;
    }

    @Override
    public void setView(View v){
        this.view=v;
    }

    @Override
    public View getView(){
        return view;
    }


}
