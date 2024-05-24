package eu.epfc.c1158.holiday;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class InsertDataInDb {
    private static final Logger log = LoggerFactory.getLogger(InsertDataInDb.class);

    @Bean
    CommandLineRunner insertRecords(HolidayRequestRepository repository) {
        return args -> {
            var hr = new HolidayRequest("new");
            var savedHr = repository.save(hr);
            log.info("Inserting " + savedHr);

            hr = new HolidayRequest("approved");
            savedHr = repository.save(hr);
            log.info("Inserting " + savedHr);
        };
    }
}
