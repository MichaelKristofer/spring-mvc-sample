package by.sample.controller;

import by.sample.Calculator;
import by.sample.UserService;
import by.sample.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private Calculator calculator;

    @Autowired
    private UserService userService;

    @GetMapping
    public String index(){
        return "home";
    }

    @GetMapping("/calc")
    public String calculator(){
        return "calc";
    }

    @GetMapping("/logout")
    public String logout(HttpSession httpSession){
        httpSession.invalidate();
        return "redirect:/";
    }

    @PostMapping("/calc")
    public String calc(double a, double b, String operation, Model model){
        double result = 0;
        switch (operation) {
            case "sum":
                result = calculator.sum(a, b);
                break;

                case "mul":
                result = calculator.mul(a, b);
                break;

                case "div":
                result = calculator.div(a, b);
                break;

                case "sub":
                result = calculator.sub(a, b);
                break;
        }
        model.addAttribute("result", result);
        return "calc";
    }

    @GetMapping("/reg")
    public String reg(){
        return "reg";
    }

    @PostMapping("/reg")
    public String registration(User user, Model model){
        userService.save(user);
        model.addAttribute("name", user.getName());
        return "redirect:/auth";
    }

    @GetMapping("/auth")
    public String auth(){
        return "auth";
    }

    @PostMapping("/auth")
    public String authorisation(User user, HttpSession httpSession){
        User user2 = userService.containsAuth(user);
        httpSession.setAttribute("user", user2);
        return "redirect:/";
    }
}
