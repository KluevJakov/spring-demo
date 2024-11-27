package ru.jafix;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        NotificationService notificationService = context.getBean(SmsService.class);

        notificationService.send("FFDFDF");

        UserService userService = context.getBean(UserService.class);
        userService.notifyUser("Hello");
    }
}