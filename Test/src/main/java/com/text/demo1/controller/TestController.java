package com.text.demo1.controller;

import com.sun.java.swing.plaf.motif.resources.motif_de;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;


@Controller
public class TestController {

    @GetMapping("test")
    public String Test(@RequestParam(name = "name") String name , Model model) {
        model.addAttribute("name",name);
        return "test1";
    }

    @RequestMapping("/test1")
    public String Test1(HttpServletRequest request){
        String name = request.getParameter("name");
        request.setAttribute("name",name);
        return "test1";
    }


}
