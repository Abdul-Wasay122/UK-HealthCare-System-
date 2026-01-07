package model;

import java.time.LocalDate;


public class Patient extends User {

private String medicalHistory;
private String insuranceNumber;
private LocalDate dob;
private String firstName;
private String lastName;
private String nhsNumber;
private String gender;
    private String address;
    private String postcode;
    private String emergencyContactName;
    private String emergencyContactPhone;
    private LocalDate registrationDate;
    private String gpSurgeryId;

public Patient(String userId, String firstName, String lastName, String email, String phone,
               String address, String postcode, String password, LocalDate dob, String nhsNumber,
               String gender, String emergencyContactName, String emergencyContactPhone,
               LocalDate registrationDate, String gpSurgeryId, String medicalHistory, String insuranceNumber) {
 super(userId, firstName,lastName , email, phone, address, password);

    this.firstName = firstName;
    this.lastName = lastName;
    this.dob = dob;
    this.nhsNumber = nhsNumber;
    this.gender = gender;
    this.address = address;
    this.postcode = postcode;
    this.emergencyContactName = emergencyContactName;
    this.emergencyContactPhone = emergencyContactPhone;
    this.registrationDate = registrationDate;
    this.gpSurgeryId = gpSurgeryId;
    this.medicalHistory = medicalHistory;
    this.insuranceNumber = insuranceNumber;


}

    public LocalDate getDob() {
    return dob;
    }

    public String getFirstName() {
    return firstName;
    }
    public String getLastName() {
    return lastName;
    }
    public String getNhsNumber() {
    return nhsNumber;
    }
    public String getGender() {
    return gender;
    }
    public String getAddress() {
    return address;
    }
    public String getPostcode() {
    return postcode;
    }
    public String getEmergencyContactName() {
    return emergencyContactName;
    }
    public String getEmergencyContactPhone() {
    return emergencyContactPhone;
    }
    public LocalDate getRegistrationDate() {
    return registrationDate;


}
public String getGpSurgeryId() {
    return gpSurgeryId;
}
public String getMedicalHistory() {
    return medicalHistory;
}
public String getFullAddress(){
    return address + " " + postcode;
}

    public String toCSV() {
        return String.join(",",
                userId,
                firstName,
                lastName,
                dob.toString(),
                nhsNumber,
                gender,
                phone,
                email,
                address,
                postcode,
                emergencyContactName,
                emergencyContactPhone,
                registrationDate.toString(),
                gpSurgeryId

        );
    }

    public String getInsuranceNumber() {
    return insuranceNumber;
    }
}

