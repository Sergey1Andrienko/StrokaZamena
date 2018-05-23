package com.company;

import java.util.Scanner;

public class slovo {

    public void zamena(String l, String k, int count) {

        String[] strings = l.split(" "); // делим строку на отдельные слова
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length()==count)
                strings[i]=k;
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i]+" ");
        }
    }
}

