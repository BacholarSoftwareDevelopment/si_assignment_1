package dk.si.webservices;

import com.example.consumingwebservice.wsdl.GetTownResponse;
import dk.si.webservices.soap.consume.TownClient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WebServicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebServicesApplication.class, args);
    }

    @Bean
    CommandLineRunner lookup(TownClient quoteClient) {
        return args -> {
            Integer zipCode = 2800;

/*            if (args.length > 0) {
                zipCode = args[0];
            }*/
            GetTownResponse response = quoteClient.getTown(zipCode);
            System.err.println(response.getTown().getCountry());
            System.err.println(response.getTown().getName());
            System.err.println(response.getTown().getZipCode());
        };
    }
}
