package edu.uc.cech.soit.myclassjournal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class MyclassjournalApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyclassjournalApplication.class, args);
    }

}
