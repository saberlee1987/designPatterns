package com.saber.memento.sample1;

import java.util.ArrayList;
import java.util.List;

public class VersionSourceController {
    private List<Commit> commits = new ArrayList<>();

    public void push(Commit commit){
        this.commits.add(commit);
    }
    public Commit pull(){
        if (commits.isEmpty()) {
            throw new RuntimeException("commits is empty");
        }
         commits.remove(commits.size() - 1);
        return commits.get(commits.size() - 1);
    }

    public List<Commit> getCommits() {
        return commits;
    }
}
