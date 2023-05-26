package com.tjut.rubbish_java.controller;

import com.tjut.rubbish_java.service.CanRubbishService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class CanRubbishController {

    @Resource
    private CanRubbishService canRubbishService;
    @GetMapping("/rubbish")
    public String testRubbish(String rubbishName){
        System.out.println(rubbishName);
        Integer id = canRubbishService.selectIdFromRubbish(rubbishName);
        if (null == id){
            return "0";
        }
        return id.toString();
    }
}
