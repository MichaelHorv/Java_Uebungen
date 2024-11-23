package t1a2;

import java.util.Scanner;

public class Spieler {
    private String name;

    public Spieler(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public int rateZahl(){
        return (int) (Math.random() * 10);
    }
}
