package airline;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.airline.Service.TciketService;
public class AppRunner {
    private static ApplicationContext context;

	public static void main(String[] args) {
        context = new ClassPathXmlApplicationContext("airline-context.xml");
        TciketService ticketService = context.getBean("ticketService", TciketService.class);

        System.out.println(ticketService.confirmBooking("FL123", "USER456")); // Confirmed
        System.out.println(ticketService.confirmBooking("FL123", "USER789")); // Confirmed
        System.out.println(ticketService.confirmBooking("FL123", "USER999")); // Flight is full
    }
}