package com.eazybytes.eazyschool.service;

import com.eazybytes.eazyschool.model.Contact;
import org.springframework.stereotype.Service;

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
