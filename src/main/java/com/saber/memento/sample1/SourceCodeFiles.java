package com.saber.memento.sample1;

public class SourceCodeFiles {

    private String content;

    public SourceCodeFiles(String content) {
        this.content = content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Commit add() {
        return new Commit(this.content);
    }

    public void rollBack(Commit commit){
        this.content = commit.getContent();
    }

    public String getContent() {
        return content;
    }
}
