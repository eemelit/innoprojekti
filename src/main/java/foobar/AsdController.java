package foobar;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AsdController {

    @RequestMapping("/hojohojo")
    public Hojohojo huudahdus() {
        return new Hojohojo("HOHOI", "HELLO WORLD");
    }

    @RequestMapping("/asd")
    public Hojohojo heilahdus() {
        return new Hojohojo("Maiju", "testaa");
    }

    @RequestMapping("/asd")
    public Hojohojo hupsan() {
        return new Hojohojo("Maiju", "testaa");
    }

}
