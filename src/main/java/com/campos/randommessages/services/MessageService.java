package com.campos.randommessages.services;

import com.campos.randommessages.models.Message;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Random;

@Service
public class MessageService {

    @Value("classpath:data/data.json")
    private Resource resourceFile;

    public String getMessage() {
        ObjectMapper objectMapper = new ObjectMapper();
        String message = "";
        try {
            Message data = objectMapper.readValue(resourceFile.getFile(), Message.class);
            message += getRandomElement(data.getNicknames());
            message += getRandomElement(data.getDesires());
            message += getRandomElement(data.getEmojis());
            message += getRandomElement(data.getReinforcers());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return message;
    }

    private String getRandomElement(List<String> list){
        Random random = new Random();
        return list.get(random.nextInt(list.size()));
    }

}
