package model;

import java.util.Date;

public class Nurse extends Clinician {

    public Nurse(int userId, String name, String email, String phone,
                 String address, String password,
                 String clinicianId, String title, String speciality,
                 String nursingNumber, String workplaceId,
                 String workplaceType, String employmentStatus, Date startDate) {

        super(userId, name, email, phone, address, password,
                clinicianId, title, speciality, nursingNumber,
                workplaceId, workplaceType, employmentStatus, startDate);
    }
}
