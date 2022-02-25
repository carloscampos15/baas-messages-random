package com.campos.randommessages.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Message {

    private List<String> nicknames;
    private List<String> desires;
    private List<String> emojis;
    private List<String> reinforcers;

}
