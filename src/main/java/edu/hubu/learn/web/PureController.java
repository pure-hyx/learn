package edu.hubu.learn.web;

import java.util.List;

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
@RequestMapping("/pure")
public class PureController {


    @Autowired
    private PureService pureService;

    @RequestMapping("/pure")
    public ModelAndView pure() {
        ModelAndView mav = new ModelAndView();
        Pure pure = pureService.getPure(1l);
        mav.addObject("pure", pure);
        mav.setViewName("pure");
        return mav;
    }

    @RequestMapping("/{id}")
    public ModelAndView getPure(@PathVariable Long id) {
        ModelAndView mav = new ModelAndView();
        Pure pure = pureService.getPure(id);
        mav.addObject("pure", pure);
        mav.setViewName("pure");
        return mav;
    }

    @RequestMapping("/list")
    public ModelAndView pures(){
        ModelAndView mav = new ModelAndView();
        List<Pure> pures = pureService.getPures();
        mav.addObject("pures", pures);
        mav.setViewName("pures");
        return mav;
    }
}