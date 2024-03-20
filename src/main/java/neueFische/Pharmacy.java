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

    public long getCount() {
        return this.medication.size();
    }

    public Medication find(String medicationName) {
        return this.medication.get(medicationName);
    }

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
