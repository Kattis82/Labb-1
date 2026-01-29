package se.iths.kattis.labb1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.iths.kattis.labb1.service.TimeReportService;

@Controller
@RequestMapping("/")
public class TimeReportController {
    private final TimeReportService timeReportService;

    public TimeReportController(TimeReportService timeReportService) {
        this.timeReportService = timeReportService;
    }

    @GetMapping("/timereports")
    public String getTimeReports(Model model) {
        model.addAttribute("timereports", timeReportService.getAllTimeReports());
        return "timereports";
    }

}
