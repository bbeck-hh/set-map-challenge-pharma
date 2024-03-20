package neueFische;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting");

        Medication medication1 = new Medication("Aspirin", 12.30, true);
        Medication medication2 = new Medication("Holsten", 0.99, true);
        Medication medication3 = new Medication("Astra", 1.99, false);
        Medication medication4 = new Medication("Pils", 1.39, true);
        Medication medication5 = new Medication("Guiness", 2.39, true);

        Pharmacy pharmacy = new Pharmacy();

        // Name der Map -> medications
        Map<String, Medication> medications = new HashMap<>();
        // Medikamente werden in die Map  mittels put() eingefügt
        medications.put("Aspirin", medication1);
        medications.put("Holsten", medication2);
        medications.put("Astra", medication3);
        medications.put("Pils", medication4);
        medications.put("Guiness", medication5);

        pharmacy.setMedication(medications);

        System.out.println("Gib mir alles aus: " + pharmacy.getMedication()+"\n");
        System.out.println("Wieviele Sorten gibt es ? " + pharmacy.getCount());
        System.out.println("Was ist hier: " + pharmacy.find("Holsten"));

        // remove one medication
        pharmacy.delete("Astra");
        System.out.println("Eines gelöscht, da waren es nur noch: " + pharmacy.getCount());

        pharmacy.printAll();
    }
}
