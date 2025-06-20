package com.saber.observer.sample1;

import java.util.Objects;

public class UserSubscriber implements Subscriber {
    private final String username;

    public UserSubscriber(String username) {
        this.username = username;
    }

    @Override
    public void update(String channel, String video) {
        System.out.println("subscriber " + username +
                " received a notification : "
                + "new video " + video
                + " uploaded on channel");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserSubscriber that = (UserSubscriber) o;
        return Objects.equals(username, that.username);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(username);
    }

    @Override
    public String getUserName() {
        return this.username;
    }
}
