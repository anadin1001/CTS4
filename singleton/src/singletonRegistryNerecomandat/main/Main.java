package singletonRegistryNerecomandat.main;

import singletonRegistryNerecomandat.Firma;
import singletonRegistryNerecomandat.Registru;

public class Main {
    public static void main(String[] args) {
        // nu e recomandat pt ca lucram in doua clase separate
        Firma firma1 = Registru.getFirma("Amicii SRL");
        Firma firma2 = Registru.getFirma("Amicii SRL");
        Firma firma3 = Registru.getFirma("Cisco SRL");

        firma1.incheiereContract(100);
        firma2.incheiereContract(200);

        System.out.println(firma1.toString());
        System.out.println(firma2.toString());
        System.out.println(firma3.toString());

    }
}
