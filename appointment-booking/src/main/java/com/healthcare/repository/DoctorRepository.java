package com.healthcare.repository;

import java.time.LocalDate;
import java.util.*;

public class DoctorRepository {
    private Map<String, List<LocalDate>> doctorSchedule;

    public DoctorRepository() {
        doctorSchedule = new HashMap<>();
        doctorSchedule.put("DOC101", Arrays.asList(LocalDate.of(2025, 4, 10)));
    }

    public Map<String, List<LocalDate>> getDoctorSchedule() {
        return doctorSchedule;
    }

    public void setDoctorSchedule(Map<String, List<LocalDate>> doctorSchedule) {
        this.doctorSchedule = doctorSchedule;
    }

    public boolean isAvailable(String doctorId, LocalDate date) {
        return doctorSchedule.containsKey(doctorId) && doctorSchedule.get(doctorId).contains(date);
    }
}