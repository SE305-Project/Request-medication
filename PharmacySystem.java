import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PharmacySystem {
    private Map<Integer, MedicationRequest> medicationRequests;

    public PharmacySystem() {
        medicationRequests = new HashMap<>();
    }

    public void addMedicationRequest(int patientNumber, String medicationName, int requiredDose) {
        MedicationRequest request = new MedicationRequest(medicationName, requiredDose);
        medicationRequests.put(patientNumber, request);
    }

    public MedicationRequest getMedicationRequest(int patientNumber) {
        return medicationRequests.get(patientNumber);
    }

    public static void main(String[] args) {
        PharmacySystem pharmacySystem = new PharmacySystem();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter patient number (0 to exit): ");
            int patientNumber = scanner.nextInt();

            if (patientNumber == 0) {
                break;
            }

            System.out.print("Enter medication name: ");
            String medicationName = scanner.next();

            System.out.print("Enter required dose: ");
            int requiredDose = scanner.nextInt();

            pharmacySystem.addMedicationRequest(patientNumber, medicationName, requiredDose);

            System.out.println("Medication request added successfully!");
            System.out.println();
        }

        System.out.println("Exiting the pharmacy system.");
    }
}

class MedicationRequest {
    private String medicationName;
    private int requiredDose;

    public MedicationRequest(String medicationName, int requiredDose) {
        this.medicationName = medicationName;
        this.requiredDose = requiredDose;
    }

    public String getMedicationName() {
        return medicationName;
    }

    public int getRequiredDose() {
        return requiredDose;
    }
}