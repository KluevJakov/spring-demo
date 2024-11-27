package ru.jafix;

public class SmsService implements NotificationService {
    public void sendSms(String text) {
        System.out.println("SMS SENT : " + text);
    }

    @Override
    public void send(String text) {
        sendSms(text);
    }
}
