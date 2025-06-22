package com.saber.mediator.sample1;

public class Main {
    public static void main(String[] args) {
        System.out.println("sample 1 mediator .....");
        ChatMediator chatMediator = new ChatMediatorImpl();
        User saber66 = new User("saber66",chatMediator);
        User bruce = new User("bruce",chatMediator);
        User ali78 = new User("ali78",chatMediator);
        User jackie54 = new User("jackie54",chatMediator);
        User jet62 = new User("saber62",chatMediator);
        chatMediator.joinToChat(saber66);
        chatMediator.joinToChat(bruce);
        chatMediator.joinToChat(ali78);
        chatMediator.joinToChat(jackie54);
        chatMediator.joinToChat(jet62);

        chatMediator.sendMessage("Hello I am saber",saber66);
        System.out.println("========================================================");
        chatMediator.sendMessage("Hello I am jackie",jackie54);
        System.out.println("========================================================");
        chatMediator.sendMessage("Hello I am bruce",bruce);
    }
}
