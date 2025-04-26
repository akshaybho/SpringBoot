package main;

import setterdi.Vehicle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainVehicle {

    public static void main(String[] args) {

        String path = "vehicleContext.xml";

        ApplicationContext context = new ClassPathXmlApplicationContext(path);

        Vehicle v = (Vehicle)context.getBean("vehId");
        v.display();
    }
}
