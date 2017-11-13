package spittr.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import spittr.pojo.Register;

@Controller
public class HomeController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(){
        return "home";
    }
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/spittr/register", method = RequestMethod.POST)
    public ModelAndView register(Register register){
        ModelAndView modelAndView = new ModelAndView();
        System.out.println(register);
        modelAndView.setViewName("register");
        return modelAndView;
    }

}
