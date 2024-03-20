package neueFische;

import java.util.Map;

public class Pharmacy {

    private Map<String, Medication> medication;

    public Map<String, Medication> getMedication() {
        return medication;
    }

    public void setMedication(Map<String, Medication> medication) {
        this.medication = medication;
    }

    // Zählt die Medikamente
    public long getCount() {
        return this.medication.size();
    }

    // Finde ein Medikament nach dem Namen
    public Medication find(String medicationName) {
        return this.medication.get(medicationName);
    }

    // Lösche ein Medikament
    public void delete(String medicationName) {
        this.medication.remove(medicationName);
    }

    public void printAll() {
        System.out.println(this.medication);
    }

    @Override
    public String toString() {
        return "Pharmacy{" +
                "medication=" + medication +
                '}';
    }
}
