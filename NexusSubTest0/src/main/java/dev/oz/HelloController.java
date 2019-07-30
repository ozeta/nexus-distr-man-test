package dev.oz;

import dev.oz.dto.Body;
import dev.oz.dto.BodyResp;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/health")
    public String health(@RequestParam(name = "par") String par) {
        return "ok: " + par;
    }

    @PostMapping("/pet")
    public BodyResp pet(@RequestBody Body body) {
        return new BodyResp(body, 200);
    }

}