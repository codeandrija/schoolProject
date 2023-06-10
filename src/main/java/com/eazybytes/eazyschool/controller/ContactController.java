package com.eazybytes.eazyschool.controller;

import com.eazybytes.eazyschool.model.Contact;
import com.eazybytes.eazyschool.service.ContactService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContactController {

    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("/contact")
    public String displayContactPage(Model model) {
        return "contact.html";
    }


    @PostMapping("/saveMsg")
    public String saveMessage(@Valid Contact contact, Errors errors, String name) {
        name = "Drama";
        if (errors.hasErrors()) {
            System.out.println("ContactController.saveMessage" + errors.toString());
            return "contact.html";
        }
        contactService.saveMessageDetail(contact);
        return "redirect:/contact";
    }

    @ModelAttribute("contact")
    public Contact contactAttribute() {
        return new Contact();
    }


}
