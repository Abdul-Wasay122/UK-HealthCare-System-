package data;
import model.Appointment;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
public class AppointmentRepository {
    private final String filePath;
    public AppointmentRepository(String filePath) {
        this.filePath = filePath;
    }
    public List<Appointment> loadAppointments() {
        List<Appointment> appointments = new ArrayList<>();
        List<String[]> rows = CSVFileHandler.readCSV(this.filePath);
        for (String[] row : rows) {
            Appointment appointment = new Appointment(
                    row[0], // appoitnemnt id
                    row[1], // patient id
                    row[2], //clinician id
                    row[3], // facility id
                    LocalDate.parse(row[4]), //appointment date
                    LocalTime.parse(row[5]),//appointment time
                    Integer.parseInt(row[6]),
                    row[7], // type
                    row[8], // status
                    row[9], // reasom
                    row[10], // notes
                    LocalDate.parse(row[11]), // date created
                    LocalDate.parse(row[12]) //last modified
            );
        appointments.add(appointment);
        }
        return appointments;
    }
}

