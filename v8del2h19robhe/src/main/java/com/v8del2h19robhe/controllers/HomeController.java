package com.v8del2h19robhe.controllers;

import com.v8del2h19robhe.demo.MySQLSaverStrategy;
import com.v8del2h19robhe.models.Users;
import com.v8del2h19robhe.services.SaverContextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {
    @Autowired
    MySQLSaverStrategy mySQLSaverStrategy;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showPage(Model model) {
        model.addAttribute("users", new Users());
        return "index";
    }

    @RequestMapping(value = "/saveMySQLuser", method = RequestMethod.POST)
    public String saveMySQLuser(@ModelAttribute("users") Users user){
        MySQLSaverStrategy mySqlSaver = new MySQLSaverStrategy();
        mySqlSaver.save(user);
        return "redirect:/";
    }
}
