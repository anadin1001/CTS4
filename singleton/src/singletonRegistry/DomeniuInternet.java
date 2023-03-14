package singletonRegistry;

import java.util.HashMap;
import java.util.Map;

public class DomeniuInternet {
    private static Map<String, DomeniuInternet> domeniiInternet = new HashMap<>();
    private String nume;
    private int anInregistrare;
//static independent de oobiect, la nivel de clasa
    // metoda este legata de obiect
    // functia e independenta de obiect se apeleaza pe clasa
    public DomeniuInternet(String nume, int anInregistrare) {

        this.nume = nume;
        this.anInregistrare = anInregistrare;
    }

    @Override
    public String toString() {
        return "DomeniuInternet{" +
                "nume='" + nume + '\'' +
                ", anInregistrare=" + anInregistrare +
                '}';
    }

    public void setAnInregistrare(int anInregistrare) {
        this.anInregistrare = anInregistrare;
    }

    public static DomeniuInternet getDomeniu(String nume){
        if(domeniiInternet.containsKey(nume)){
            return domeniiInternet.get(nume);
        }else{
            DomeniuInternet domeniuInternet = new DomeniuInternet(nume, 2023);
            domeniiInternet.put(domeniuInternet.nume, domeniuInternet);
            return domeniuInternet;
        }
    }


}
