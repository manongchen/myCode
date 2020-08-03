package com.manongchen.sbm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName MainController
 * @Description TODO()
 * @Author xingchen
 * @Date 2020-07-31 14:51
 * @Version 1.0.0
 */

@Controller
public class MainController {

    @RequestMapping(value = "/")
    public String index() {
        return "index.html";
    }
}
