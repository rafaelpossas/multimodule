package br.com.multimodule.controller;

import br.com.multimodule.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by rafaelpossas on 5/8/14.
 */
@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public String getHome() {
        System.out.println("Teste Hot-Deploys");
        userService.findAll();
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView getLogin() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        ModelAndView modelAndView = new ModelAndView("login");
        if (!auth.getName().equals("anonymousUser")) {
            modelAndView.addObject("logged", true);
        } else {
            modelAndView.addObject("logged", false);
        }
        return modelAndView;
    }
}
