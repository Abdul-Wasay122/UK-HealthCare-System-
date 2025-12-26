package model;
import java.util.Date;

public class specialistDoctor extends Clinician {
    public specialistDoctor(int userId, String name, String email, String phone,
                            String address, String password,
                            String clinicianId, String title, String speciality,
                            String gmcNumber, String workplaceId,
                            String workplaceType, String employmentStatus, Date startDate) {

        super(userId, name, email, phone, address, password,
                clinicianId, title, speciality, gmcNumber,
                workplaceId, workplaceType, employmentStatus, startDate);
    }
}
