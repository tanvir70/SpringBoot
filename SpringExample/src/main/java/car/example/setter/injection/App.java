package car.example.setter.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationSetterInjection.xml");
        Car car = (Car) context.getBean("myCar");
        car.displayDetails();
    }
}
