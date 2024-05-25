package eu.epfc.c1158.holiday.repositories;

import eu.epfc.c1158.holiday.entities.HolidayRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HolidayRequestRepository extends JpaRepository<HolidayRequest, Long> {
}
