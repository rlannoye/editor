package org.ulco;

public class ID {
    private int id;
    private static ID generator;


    private ID(){
        id=0;
    }

    public static ID getGenerator(){
        if(generator==null){
            generator = new ID();
        }
        return generator;
    }

    public int getID(){
        return id++;
    }
}