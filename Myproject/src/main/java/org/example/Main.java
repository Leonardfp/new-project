package org.example;
import java.io.*;
import java.awt.GraphicsEnvironment;
import java.net.URISyntaxException;
import javax.swing.*;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException, URISyntaxException  {
    Console console = System.console();
    connection conection = new connection();
    week wek = new week();
    conection.condition();
    if(console == null && !GraphicsEnvironment.isHeadless()){
        String filename = Main.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath();
        String classpath = Main.class.getName();
        Runtime.getRuntime().exec(new String[]{"cmd", "/c", "start", "cmd", "/k", "java -cp \"" + filename + "\" " + classpath});

    }else {
        System.out.println(wek.returnDays());
        conection.condition();
    }


    }
}