package nl.hanze;

import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class DemoController {

    @GetMapping("/")
    public String test() {
        return "hallo";
    }

    // VOORBEELD 1 en 2
    @GetMapping("/greeting")
    public String index(@RequestParam(name="name") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }


    // VOORBEELD 3
    @GetMapping ("/login")
    public String login(){
        return "login";
    }
}