package pe.indigolabs.invoicing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
        /* (exclude = {DataSourceAutoConfiguration.class}) */
public class InvoicingApplication {


    public static void main(String[] args) {
        SpringApplication.run(InvoicingApplication.class, args);
    }

}
