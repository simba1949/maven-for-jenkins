package top.simba1949.mavenforjenkins.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author SIMBA1949
 * @date 2019/8/22 17:22
 */
@Slf4j
@RestController
@RequestMapping("hello")
public class HelloController {

    private static final String MSG = "君不见黄河之水天上来";

    @GetMapping
    public String sayHello(){
        try {
            log.debug(MSG);
        } catch (Exception e) {
            log.error(MSG);
        }
        return MSG;
    }
}
