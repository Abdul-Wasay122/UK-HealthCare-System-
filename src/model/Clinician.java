package model;
import java.util.Date;
public class Clinician extends user {
    protected String clinicianId;
    protected String title;
    protected String speciality;
    protected String registrationNumber; //gmc for Docs nursing number for nurses
    protected String workplaceId;
    protected String workplaceType;
    protected String employmentStatus;
    protected Date startDate;

public Clinician(int userId, String name, String email, String phone, String address, String password,
                 String clinicianId, String title, String speciality, String gmcNumber, String workplaceId, String workplaceType, String employmentStatus, Date startDate) {
    super(userId, name, email, phone, address, password);
    this.clinicianId = clinicianId;
    this.title = title;
    this.speciality = speciality;
    this.registrationNumber = registrationNumber;
    this.workplaceId = workplaceId;
    this.workplaceType = workplaceType;
    this.employmentStatus = employmentStatus;
    this.startDate = startDate;


}
}
