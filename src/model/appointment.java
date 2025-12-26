package model;

import java.time.LocalDate;
import java.time.LocalTime;

public class appointment {
    private  String appointmentId;
    private String patientId;
    private String clinicianId;
    private String facilityId;

    private LocalDate appointmentDate;
    private LocalTime appointmentTime;
    private int durationMinutes;

    private String appoitmentType;
    private String status;
    private String reasonForVisit;
    private String notes;

    private LocalDate createdDate;
    private LocalDate lastModified;

    public appointment(String appointmentId,
                       String patientId,
                       String clinicianId,
                       String facilityId,
                       LocalDate appointmentDate,
                       LocalTime appointmentTime,
                       int durationMinutes,
                       String appointmentType,
                       String status,
                       String reasonForVisit,
                       String notes,
                       LocalDate createdDate,
                       LocalDate lastModified ) {
        this.appointmentId = appointmentId;
        this.patientId = patientId;
        this.clinicianId = clinicianId;
        this.facilityId = facilityId;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
        this.durationMinutes = durationMinutes;
        this.appoitmentType = appointmentType;
        this.status = status;
        this.reasonForVisit = reasonForVisit;
        this.notes = notes;
        this.createdDate = createdDate;
        this.lastModified = lastModified;

    }
    public String getAppointmentId() {
        return appointmentId;
    }
    public String getPatientId() {
        return patientId;
    }
    public String getClinicianId() {
        return clinicianId;
    }
    public String getFacilityId() {
        return facilityId;
    }
    public LocalDate getAppointmentDate() {
        return appointmentDate;
    }
    public LocalTime getAppointmentTime() {
        return appointmentTime;
    }
    public String getStatus() {
        return status;

    }

}
