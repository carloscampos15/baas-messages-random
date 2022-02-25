package com.campos.randommessages.controllers;

import com.campos.randommessages.services.MessageService;
import com.campos.randommessages.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = Constants.API_VERSION)
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping(value = "/message")
    public String getMessage(){
        return messageService.getMessage();
    }

}
