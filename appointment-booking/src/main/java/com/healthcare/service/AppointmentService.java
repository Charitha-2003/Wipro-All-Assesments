package com.healthcare.service;

import com.healthcare.repository.DoctorRepository;
import java.time.LocalDate;

public class AppointmentService {
    private DoctorRepository doctorRepository;

    public DoctorRepository getDoctorRepository() {
        return doctorRepository;
    }

    public void setDoctorRepository(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    public String book(String doctorId, String dateStr) {
        LocalDate date = LocalDate.parse(dateStr);
        boolean available = doctorRepository.isAvailable(doctorId, date);
        return available ? "Appointment confirmed" : "Doctor not available";
    }
}