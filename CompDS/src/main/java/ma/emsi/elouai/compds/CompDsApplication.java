package ma.emsi.elouai.compds;

import ma.emsi.elouai.compds.dto.ComputerDTO;
import ma.emsi.elouai.compds.service.ComputerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CompDsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CompDsApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ComputerService computerService) {
        List<ComputerDTO> computerDTOS = List.of(
                ComputerDTO.builder().proce("model1").ram(8).hardDrive(234).price(12345.1).macAddress("23121.121").build(),
                ComputerDTO.builder().proce("model2").ram(8).hardDrive(256).price(12345.1).macAddress("23121.121").build(),
                ComputerDTO.builder().proce("model3").ram(16).hardDrive(234).price(12345.1).macAddress("23121.121").build(),
                ComputerDTO.builder().proce("model4").ram(24).hardDrive(512).price(12345.1).macAddress("23121.121").build()
      );

        return args -> {
            computerDTOS.forEach(computerService::saveComputer);

        };

    }
}