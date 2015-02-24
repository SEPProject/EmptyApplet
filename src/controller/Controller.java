package controller;

import model.*;
import view.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

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

    public boolean bruteforceAttempt() {

        String password = "" ;
        String passHashed = "";
        Scanner sc = new Scanner(System.in);
        FileReader fr ;
        BufferedReader br ;
        String attempt;
        Boolean found = false;

        System.out.println("### Starting TEST ###");
        System.out.println(">> Aim of this is to provide a password and the attack is launched !");

        do {
            System.out.println(">> chose a password to Test : ");
            password = sc.nextLine();
        }while (password.equals(""));

        System.out.println(">> hashing the password...");
        model.getPasswordManager().setHashStored(password);
        passHashed = model.getPasswordManager().getHashStored();
        System.out.println(">> password hashed : " + passHashed);
        System.out.println(">> now the aim is to find the password from the hash you succeed to find :" + passHashed);
        System.out.println(" choosing dictionary : worstlist...");

        try{

            fr = new FileReader(model.getFile());
            br = new BufferedReader(fr);

            System.out.println(">> Attack starting... ");

            while (((attempt = br.readLine())!= null) && !found)  {
                System.out.println(">> attempting :" + attempt );
                if (model.getPasswordManager().hash(attempt).equals(passHashed)){
                    found = true;
                    System.out.println(">> SUCCEED password = " + attempt );
                }
            }

            if(!found){
                System.out.println(">> FAILED password not found");
            }
            br.close();

            System.out.println(">> done !");
        }catch(IOException e){
            System.err.println(e);
        }

        return found ;



    }

}
