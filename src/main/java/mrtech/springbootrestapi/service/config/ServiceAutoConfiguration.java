package mrtech.springbootrestapi.service.config;

import mrtech.springbootrestapi.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceAutoConfiguration {
    @Bean
    public AdministratorService administratorService() {
        return new DefaultAdministratorService();
    }

    @Bean
    public ManufacturerService manufacturerService() {
        return new DefaultManufacturerService();
    }

    @Bean
    public PhoneService phoneService() {
        return new DefaultPhoneService();
    }
}
