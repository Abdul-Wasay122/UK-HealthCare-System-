package data;

import model.Appointment;
import model.Prescription;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class PrescriptionRepository {
    private final String filePath;
    public PrescriptionRepository(String filePath) {
        this.filePath = filePath;
    }
    public List<Prescription> loadPrescriptions() {
        List<Prescription> prescriptions = new ArrayList<>();
        List<String[]> rows = CSVFileHandler.readCSV(this.filePath);
        for (String[] row : rows) {
            Prescription prescription= new Prescription(
                    row[0], // Prescription id
                    row[1], // patient id
                    row[2], //clinician id
                    row[3], // appointment id
                    LocalDate.parse(row[4]), //appointment date

                    row[5], // medication
                    row[6], // dosage
                    row[7], // frequency
                    Integer.parseInt(row[8]),
                    row[9], // quantity
                    row[10], // instruction
                    row[11], // pharmacy
                    row[12], // status

                    LocalDate.parse(row[13]), // date created
                    row.length > 14 && !row[14].isEmpty() ? LocalDate.parse(row[14]) : null

            );
            prescriptions.add(prescription);
        }
        return  prescriptions ;
    }
}
