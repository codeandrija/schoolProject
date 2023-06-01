package com.eazybytes.eazyschool.controller;

import com.eazybytes.eazyschool.model.Contact;
import com.eazybytes.eazyschool.service.ContactService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContactController {

    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("/contact")
    public String displayContactPage() {
        return "contact.html";
    }

//    @PostMapping("/saveMsg")
//    public ModelAndView saveMessage(@RequestParam String name, @RequestParam String mobileNum,
//                                    @RequestParam String email, @RequestParam String subject,
//                                    @RequestParam String message, Model model) {
//
//        System.out.println(name);
//        System.out.println(mobileNum);
//        System.out.println(email);
//        System.out.println(subject);
//        System.out.println(message);
//        model.addAttribute("username", "Andrija Aleksic");
//        return new ModelAndView("redirect:/contact");
//    }

    @PostMapping("/saveMsg")
    public ModelAndView saveMessage(Contact contact) {
        if(contactService.saveMessageDetail(contact)){
            System.out.println("ContactController.saveMessage succesfully");
        }
        else{
            System.out.println("ContactController.saveMessage unsuccesfully");
        }

        return new ModelAndView("redirect:/contact");
    }

}
