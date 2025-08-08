package com.healthcare;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.healthcare.service.AppointmentService;

public class Apprunner {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        AppointmentService service = context.getBean("appointmentService", AppointmentService.class);

        System.out.println(service.book("DOC101", "2025-04-10")); // Appointment confirmed
        System.out.println(service.book("DOC101", "2025-04-11")); // Doctor not available
    }
}