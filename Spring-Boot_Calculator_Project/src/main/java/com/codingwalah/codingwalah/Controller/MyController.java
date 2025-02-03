package com.codingwalah.codingwalah.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class MyController {
    
    @RequestMapping("m")
    public String mString() {
        return "<h1>hello world</h1>";
    }
    
    @GetMapping("process-form")
    public String getdata(@RequestParam int num1, @RequestParam int num2, @RequestParam String operation) {
        int res;
        switch (operation) {
            case "add":
                res = num1 + num2;
                break;
            case "subtract":
                res = num1 - num2;
                break;
            case "multiply":
                res = num1 * num2;
                break;
            case "divide":
                res = num1 / num2;
                break;
            default:
                res = 0;
                break;
        }
        return String.valueOf(res);
    }
    
}
