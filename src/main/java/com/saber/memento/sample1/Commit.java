package com.saber.memento.sample1;

public class Commit {
    private String content;

    public Commit(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Commit{" +
                "content='" + content + '\'' +
                '}';
    }
}
