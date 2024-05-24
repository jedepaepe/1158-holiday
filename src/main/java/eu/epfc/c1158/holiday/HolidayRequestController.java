package eu.epfc.c1158.holiday;

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
    public String getHolidayRequests(Model model) {
        var requests = repository.findAll();
        model.addAttribute("requests", requests);
        return "requests";
    }
}
