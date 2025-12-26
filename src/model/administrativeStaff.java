package model;

import java.util.Date;

public class administrativeStaff extends  user {
    private String staffId;
    private String role;
    private String department;
    private String facilityId;
    private String employmentStatus;
    private Date startDate;
    private String lineManager;
    private String accessLevel;

    public administrativeStaff(
            int userId, String name, String email, String phone, String address, String password,
            String staffId,
            String role,
            String department,
            String facilityId,
            String employmentStatus,
            Date startDate,
            String lineManager,
            String accessLevel) {
        super(userId,name,email,phone,address,password);
        this.staffId = staffId;
        this.role = role;
        this.department = department;
        this.facilityId = facilityId;
        this.employmentStatus = employmentStatus;
        this.startDate = startDate;
        this.lineManager = lineManager;
        this.accessLevel = accessLevel;

    }
}
