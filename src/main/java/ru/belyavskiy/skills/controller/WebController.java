package ru.belyavskiy.skills.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.belyavskiy.skills.entity.Language;
import ru.belyavskiy.skills.entity.Programmer;

import java.util.List;

@Controller
public class WebController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("user", new Programmer(1L, "Igor",
                List.of(new Language(1L, "Java", null, null),
                        new Language(2L, "JS", null, null)),
                null));
        return "index";
    }

    @GetMapping("/developer")
    public String developer() {
        return "developer";
    }


    @GetMapping("/language")
    public String language() {
        return "language";
    }


}
