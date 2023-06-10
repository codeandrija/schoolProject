package com.eazybytes.eazyschool.service;

import com.eazybytes.eazyschool.model.Contact;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

@Service
public class ContactService {


    public boolean saveMessageDetail(Contact contact) {
        boolean isSaved = false;
        //saves

        System.out.println(contact.toString());

        isSaved = true;
        return isSaved;

    }


}
