package app.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpController {
    @PostMapping("/req")
    @ResponseBody
    public String answer(){
        String answer = "\"statusCode\":1";
        return answer;
    }
}
