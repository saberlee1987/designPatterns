package com.saber.memento.sample1;

public class MainApp {
    public static void main(String[] args) {
        SourceCodeFiles sourceCodeFiles = new SourceCodeFiles("class Main {func main(){}}");
        VersionSourceController vcs = new VersionSourceController();
        vcs.push(sourceCodeFiles.add());
        sourceCodeFiles.setContent("class Person(){ }");
        vcs.push(sourceCodeFiles.add());

        sourceCodeFiles.setContent("class PersonService(){ }");
        vcs.push(sourceCodeFiles.add());

        vcs.getCommits().forEach(System.out::println);
        System.out.println("===================================");
        sourceCodeFiles.rollBack(vcs.pull());
        vcs.getCommits().forEach(System.out::println);
        System.out.println("===================================");
        System.out.println(sourceCodeFiles.getContent());

    }
}
