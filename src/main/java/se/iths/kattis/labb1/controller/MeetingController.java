package se.iths.kattis.labb1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import se.iths.kattis.labb1.model.Meeting;
import se.iths.kattis.labb1.service.MeetingService;

@Controller
public class MeetingController {
    private final MeetingService meetingService;

    private Meeting meeting;

    public MeetingController(MeetingService meetingService) {
        this.meetingService = meetingService;
    }

    @GetMapping("/meetings")
    public String getMeetings(Model model) {
        model.addAttribute("meetings", meetingService.getAllMeetings());
        return "meetings";
    }
}
