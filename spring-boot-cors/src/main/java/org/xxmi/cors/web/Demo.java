package org.xxmi.cors.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Demo {

    @RequestMapping
    public Map hello() {
        Map map = new HashMap();
        map.put("msg", "来玩玩呀...");
        return map;
    }
}
