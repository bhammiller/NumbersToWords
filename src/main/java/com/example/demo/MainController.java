package com.example.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MainController {
    @RequestMapping ("/")
    public String magic_numberer(@RequestParam("number") int input_number){
        NumbersToWords magicNumber = new NumbersToWords();
        String result = magicNumber.convert(input_number);
        return "User Input: " + input_number + "<br/>" + "Output: " + result;

    }
}
