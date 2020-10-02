package com.vinaylogics.playwithjava.designpatterns.behavioral.iterator;

public class NotificationIterator implements Iterator {

    Notification[] notificationList;

    int pos = 0;

    public NotificationIterator(Notification[] notificationList) {
        this.notificationList = notificationList;
    }

    @Override
    public boolean hasNext() {
        return pos < notificationList.length && notificationList[pos] != null;
    }

    @Override
    public Object next() {
        return notificationList[pos++];
    }
}
