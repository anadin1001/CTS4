package Classes;

public class Administrator {
    private String nume;
    private int varsta;

    //eager initializatiom = se creeaza un obiect
    private static Administrator instanta = new Administrator("Gigel", 12);

    public static Administrator getInstance(){
        return instanta;
    }

    private Administrator(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        return "Administrator{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                '}';
    }
}
