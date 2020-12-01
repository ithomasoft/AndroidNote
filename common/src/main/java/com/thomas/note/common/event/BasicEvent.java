package com.thomas.note.common.event;

public class BasicEvent {
    private String tag = getClass().getName();

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
