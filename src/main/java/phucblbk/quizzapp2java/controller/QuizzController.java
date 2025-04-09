package phucblbk.quizzapp2java.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quizz-java-app")
public class QuizzController {
    @GetMapping()
    public String getAll(){
        return "Hello ae";
    }
}
