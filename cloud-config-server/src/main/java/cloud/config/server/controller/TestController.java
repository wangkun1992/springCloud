package cloud.config.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wk on 2017/3/28.
 */
@RestController
@RequestMapping(value = "test")
public class TestController {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String test(){
        return "test ";
    }
}
