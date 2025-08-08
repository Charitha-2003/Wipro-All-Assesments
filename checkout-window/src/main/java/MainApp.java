import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    private static ApplicationContext context;

	public static void main(String[] args) {
        context = new AnnotationConfigApplicationContext(AppConfig.class);
        OrderService orderService = context.getBean(OrderService.class);
        System.out.println(orderService.checkout("CART001"));
    }
}