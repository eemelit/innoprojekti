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
        return new Hojohojo("ayyyy", "lmao");
    }

    @RequestMapping("/asdi")
    public Hojohojo hairahdus() {
        return new Hojohojo("wlolol", "1337");
    }
}
