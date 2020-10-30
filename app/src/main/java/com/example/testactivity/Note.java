package com.example.testactivity;

import java.util.ArrayList;

public class Note {
    ArrayList<String> arrayList;
    static int count = 0;

    public Note() {
        arrayList = new ArrayList<String>();
    }

    public void addNote(String s) {
        this.arrayList.add(++count + "-" + s);
    }

    public String[] getNotes() {
        return (String[]) this.arrayList.toArray(new String[arrayList.size()]);
    }
}
