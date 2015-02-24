package main;

import model.PasswordManager;

import java.io.*;


public class Test {

    public void parseFile(){

        FileReader fr;
        FileWriter fw;
        BufferedReader br ;
        BufferedWriter bw;
        String newLine;

        System.out.println("### Starting TEST ###");
        System.out.println(">> We are going to try to create a dictionnary and after find a password in it");
        System.out.println(">> creating worstList : ");

        try{
            System.out.println(">> initialize buffer ...");

            fr = new FileReader("/Users/seb/Desktop/Test/badfile.txt");
            br = new BufferedReader(fr);

            fw = new FileWriter("./data/worstList.txt");
            bw = new BufferedWriter(fw);

            System.out.println(">> end initialization");

            while ((newLine = br.readLine())!= null){
                System.out.println(">> reading + writing to file...");
                System.out.println(">> data : "+ newLine);
                String[] lineManaged = newLine.split("\\s");

                String line1 = lineManaged[1];
                String line2 = lineManaged[2];
                String line3 = lineManaged[3];
                String line4 = lineManaged[4];
                System.out.println(">> real data :" + line1  + " " + line2 + " " + line3 + " " + line4);
                bw.write(line1+"\n");
                bw.write(line2+"\n");
                bw.write(line3+"\n");
                bw.write(line4+"\n");

            }

            bw.close();
            System.out.println(">> done...");

        }catch(IOException e){
            System.err.println(e);
        }
        System.out.println(">> ... ");
    }



}
