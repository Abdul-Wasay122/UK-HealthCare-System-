package controller;


import data.AppointmentRepository;
import model.Appointment;

import java.util.List;

    public class AppointmentController {


        private AppointmentRepository appointmentRepository;

        public void bookAppointment(Appointment appointment) {
            appointmentRepository.addAppointment(appointment);
        }


        public AppointmentController(AppointmentRepository appointmentRepository) {
            this.appointmentRepository = appointmentRepository;
        }



        public void cancelAppointment(String appointmentId) {
            appointmentRepository.updateAppointmentStatus(appointmentId, "Cancelled");
        }

        public List<Appointment> getAppointmentsByPatient(String patientId) {
            return appointmentRepository.getAppointmentsByPatient(patientId);
        }

        // View all appointments
        public List<Appointment> getAllAppointments() {
            return appointmentRepository.loadAppointments();

        }
    }



