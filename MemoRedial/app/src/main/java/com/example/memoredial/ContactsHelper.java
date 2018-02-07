package com.example.memoredial;

import android.widget.Button;

import java.util.HashMap;

/**
 * Created by jrcb7 on 2/6/2018.
 */

public class ContactsHelper {

    static HashMap<String, String> contacts;

    public static void start() {
        contacts = new HashMap<String,String>();
        contacts.put("Linda J", "8167341299");
    }

    static String getNumber(String name) {
        return contacts.get(name);
    }

}
