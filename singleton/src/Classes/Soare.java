package Classes;

public class Soare {
    private String culoare;
    private int dimensiune;

    //lazy initialization
    private static Soare instanta = null;

    public Soare(String culoare, int dimensiune) {
        this.culoare = culoare;
        this.dimensiune = dimensiune;
    }

    public static synchronized Soare getInstance(String culoarea, int dimensiune){
        if(instanta == null){
            instanta = new Soare(culoarea, dimensiune);

        }
        return instanta;
    }
    //synchronized pt a usura munca si a bloca apelul

    @Override
    public String toString() {
        return "Soare{" +
                "culoare='" + culoare + '\'' +
                ", dimensiune=" + dimensiune +
                '}';
    }


}
