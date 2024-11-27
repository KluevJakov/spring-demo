package ru.jafix;

public class EmailService implements NotificationService {
    public void sendEmail(String text) {
        System.out.println("EMAIL SENT : " + text);
    }

    @Override
    public void send(String text) {
        sendEmail(text);
    }
}
