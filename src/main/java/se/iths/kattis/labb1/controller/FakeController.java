package se.iths.kattis.labb1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.iths.kattis.labb1.service.FakeService;

@Controller
@RequestMapping("/")
public class FakeController {

    private final FakeService fakeService;

    public FakeController(FakeService fakeService) {
        this.fakeService = fakeService;
    }


    @GetMapping("/fake")
    public String getFakes(Model model) {
        model.addAttribute("fake", fakeService.getAllFake());
        return "fake";
    }
}

