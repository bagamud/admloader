package ru.gibdd.ic.admloader;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ru.gibdd.ic.admloader.entity.Admpractice;

@SpringBootApplication
public class AdmloaderApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdmloaderApplication.class, args);
    }

    @Bean
    public CommandLineRunner loader(AdmRepository admRepository) {
        return (args) -> {
            Iterable<Admpractice> listAdm = admRepository.findAll();

            for (Admpractice adm : listAdm) {
                System.out.println(adm);
            }
        };
    }

}
