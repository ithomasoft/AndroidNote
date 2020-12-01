package com.thomas.note.common.helper;


import com.thomas.note.common.event.BasicEvent;

import org.greenrobot.eventbus.EventBus;

public class EventHelper {
    public static void register(Object subscriber) {
        if (!EventBus.getDefault().isRegistered(subscriber)) {
            EventBus.getDefault().register(subscriber);
        }
    }

    public static void unregister(Object subscriber) {
        if (EventBus.getDefault().isRegistered(subscriber)) {
            EventBus.getDefault().unregister(subscriber);
        }
    }

    public static void post(BasicEvent object) {
        EventBus.getDefault().post(object);
    }

    public static void post(String tag) {
        BasicEvent basicEvent = new BasicEvent();
        basicEvent.setTag(tag);
        EventBus.getDefault().post(basicEvent);
    }

    public static void postSticky(BasicEvent object) {
        EventBus.getDefault().postSticky(object);
    }

    public static void postSticky(String tag) {
        BasicEvent basicEvent = new BasicEvent();
        basicEvent.setTag(tag);
        EventBus.getDefault().postSticky(basicEvent);
    }
}
