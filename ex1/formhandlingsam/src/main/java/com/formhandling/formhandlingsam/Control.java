package com.formhandling.formhandlingsam;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Control {
  @RequestMapping("/login")
  public String registerform(@ModelAttribute("frm") Forms frm) {
    return "Registration_Form";
  }
  @RequestMapping("/RegisterSucc")
  public java.lang.String RegisterSucc(@ModelAttribute("frm") Forms frm)
  {
    return "Registration_succ";
  }
}
