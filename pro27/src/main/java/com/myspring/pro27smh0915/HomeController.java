package com.myspring.pro27smh0915;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
  private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
  /**
  * Simply selects the home view to render by returning its name.
  */
  @RequestMapping(value = "/main", method = RequestMethod.GET)
  public String home(Locale locale, Model model) {
    logger.info("Welcome home! The client locale is {}.", locale);

    // ?μ€μ, ??Όλͺμ?, μ€λ³΅??Ό ?Ό?κΈ°μ? ?¬?©?? ?€?΄λ°? κΈ°λ² μ€ν??Έ?°.
    // 1) ?κ°? λ°? ? μ§λ?? ?΄?©?κ³?,
    // 2) UUID , ?Ή?  ??€? ?«? λ°? ?λ¬Έμλ₯? ??±?΄μ£Όλ ?κ΅¬λ?? ?΄?©?κΈ°λ?¨.
    Date date = new Date();
    DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, 
    DateFormat.LONG, locale);
    String formattedDate = dateFormat.format(date);
    // ?¨? ?°?΄?°λ§?, λ·°μ ? ?¬?? κ΅¬μ‘°λ§? ? ? λ³΄λ©΄ ?¨. 
    model.addAttribute("serverTime", formattedDate );
    // κ²°κ³Ό λ·°λ, λͺ¨λΈ&λ·? ???΄ ???Ό, ?¨? λ·? λ¦¬μ‘Έλ²? ?΄?Ή λ·°λ‘ ?΄??¨. 
//    return "home";
    // λ·? λ¦¬μ‘Έλ²? ??? , ???Όμ¦λ?? ?΄?©?΄?, λ©μΈ? ? ??΄λ³΄κΈ°.
    return "main";
  }
}


//οΏ½Ω±οΏ½οΏ½οΏ½ οΏ½οΏ½οΏ? οΏ½Ϊ΅οΏ½
/*
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@RequestMapping(value = "/main.do", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "main";
	}
}

*/