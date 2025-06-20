package com.saber.composite.sample1;

public class Main {
    public static void main(String[] args) {

        Employee dev1 = Developer.builder()
                .name("bruce")
                .position("senior developer")
                .build();

        Employee dev2 = Developer.builder()
                .name("jackie")
                .position("senior developer")
                .build();

        Employee dev3 = Developer.builder()
                .name("jet")
                .position("senior developer")
                .build();


        Employee dev4 = Developer.builder()
                .name("ali77")
                .position("middle developer")
                .build();
        Manager manager1 =Manager.builder()
                .name("saber")
                .position("cto")
                .build();
        Manager manager2 =Manager.builder()
                .name("ali")
                .position("tecLead")
                .build();
        manager1.hireEmployee(dev1);
        manager1.hireEmployee(dev2);
        manager1.hireEmployee(dev3);
        manager2.hireEmployee(dev4);

        manager1.displayDetails();
        System.out.println("====================================================");
        manager2.displayDetails();




    }
}