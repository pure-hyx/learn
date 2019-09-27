package edu.hubu.learn.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.hubu.learn.entity.User;
import edu.hubu.learn.service.UserService;

import edu.hubu.learn.entity.Pure;
import edu.hubu.learn.service.PureService;

@Controller
@RequestMapping("/")
public class IndexController {



    @Autowired
    private UserService userService;

    @Autowired
    private PureService pureService;

    @RequestMapping("/")
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        return mav;
    }

    @RequestMapping("/user")
    public ModelAndView user() {
        ModelAndView mav = new ModelAndView();
        User user = userService.getUser(1l);
        mav.addObject("user", user);
        mav.setViewName("user");
        return mav;
    }

    @RequestMapping("/pure")
    public ModelAndView pure() {
        ModelAndView mav = new ModelAndView();
        Pure pure = pureService.getPure(1l);
        mav.addObject("pure", pure);
        mav.setViewName("pure");
        return mav;
    }

    @RequestMapping("/pure/{id}")
    public ModelAndView getPure(@PathVariable Long id) {
        ModelAndView mav = new ModelAndView();
        Pure pure = pureService.getPure(id);
        mav.addObject("pure", pure);
        mav.setViewName("pure");
        return mav;
    }
}