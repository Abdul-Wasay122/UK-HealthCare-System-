package model;

import java.util.Date;

public class patient extends user {
private Date Dob;
private String medicalHistory;
private String insuranceNumber;

public patient(int userId, String name, String email, String phone, String address, String password,
               Date dob, String medicalHistory, String insuranceNumber) {
 super(userId, name, email, phone, address, password);
 this.Dob = dob;
 this.medicalHistory = medicalHistory;
 this.insuranceNumber = insuranceNumber;

}
    public void bookAppointment(){
    System.out.println("Appointment Booking Requested");
    //logic handled by appointmentController
}
    // cancelAppointment()
    public void cancelAppointment() {
        // logic handled by AppointmentController
        System.out.println("Appointment cancellation requested.");
    }

    // viewPrescription()
    public void viewPrescription() {
        // data retrieved via PrescriptionController
        System.out.println("Viewing prescriptions.");
    }

    // viewReferral()
    public void viewReferral() {
        // data retrieved via ReferralController
        System.out.println("Viewing referrals.");
    }
}
