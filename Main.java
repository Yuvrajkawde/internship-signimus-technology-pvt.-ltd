package com.singleton;

import java.io.IOException;

//1: create class
class AppConfig {
    private static AppConfig instance;

    private AppConfig(){
        System.out.println("AppConfig constructor calling");

    }
    public static AppConfig getInstance(){
        if (instance==null){
            instance=new AppConfig();
        }

        return instance;
    }

    public void showConfig(){
        System.out.println("this is the application config and this is an example of singleton clas");
    }

}

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        AppConfig myapp = AppConfig.getInstance();
        myapp.showConfig();

    }

}