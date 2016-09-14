package foobar;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AsdController {

    @RequestMapping("/hojohojo")
    public Hojohojo huudahdus() {
        return new Hojohojo("HOJO", "ASD");
    }

    @RequestMapping("/asd")
    public Hojohojo heilahdus() {
        return new Hojohojo("ayyy", "lmao");
    }

    @RequestMapping("/asd2")
    public Hojohojo huilahdus() {
        return new Hojohojo("lmao", "ayyy");
    }
}
