package com.wyett.client.Msg;

import java.util.Date;

/**
 * @author : wyettLei
 * @date : Created in 2019/9/12 16:21
 * @description: TODO
 */

public class MsgWords {
    private static final String SEPERATOR = "\n";
    private final String username;
    private final Date sendTime;
    private final String words;

    public MsgWords(String username, Date sendTime, String words) {
        this.username = username;
        this.sendTime = sendTime;
        this.words = words;
    }

    public String getUsername() {
        return username;
    }

    public String getWords() {
        return words;
    }
}
