package eu.epfc.c1158.holiday.controllers;

import eu.epfc.c1158.holiday.entities.HolidayRequest;
import eu.epfc.c1158.holiday.repositories.HolidayRequestRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HolidayRequestController {
    private final HolidayRequestRepository repository;

    public HolidayRequestController(HolidayRequestRepository repository) {
        this.repository = repository;
    }

    @GetMapping(path = "/requests")
    public String getHolidayRequest(Model model) {
        List<HolidayRequest> list = repository.findAll();
        model.addAttribute("list", list);
        return "requests";
    }
}
