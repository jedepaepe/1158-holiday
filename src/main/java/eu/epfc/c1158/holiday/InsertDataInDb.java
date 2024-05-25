package eu.epfc.c1158.holiday;

import eu.epfc.c1158.holiday.entities.HolidayRequest;
import eu.epfc.c1158.holiday.repositories.HolidayRequestRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertDataInDb {
    private static final Logger logger = LoggerFactory.getLogger(InsertDataInDb.class);
    private final HolidayRequestRepository repository;

    public InsertDataInDb(HolidayRequestRepository repository) {
        this.repository = repository;
    }

    @Bean
    CommandLineRunner insertRecords() {
        return args -> {
            HolidayRequest hr = new HolidayRequest("new");
            HolidayRequest savedHr = repository.save(hr);
            logger.info("Inserting " + savedHr);

            hr = new HolidayRequest("approved");
            savedHr = repository.save(hr);
            logger.info("Inserting " + savedHr);
        };
    }
}
