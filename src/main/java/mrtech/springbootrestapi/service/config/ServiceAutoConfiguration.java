package mrtech.springbootrestapi.service.config;

import mrtech.springbootrestapi.service.administrator.AdministratorService;
import mrtech.springbootrestapi.service.administrator.DefaultAdministratorService;
import mrtech.springbootrestapi.service.manufacturer.DefaultManufacturerService;
import mrtech.springbootrestapi.service.manufacturer.ManufacturerService;
import mrtech.springbootrestapi.service.phone.DefaultPhoneService;
import mrtech.springbootrestapi.service.phone.PhoneService;
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
