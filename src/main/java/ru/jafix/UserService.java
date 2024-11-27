package ru.jafix;

public class UserService {

    private NotificationService notificationService;

    public NotificationService getNotificationService() {
        return notificationService;
    }

    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notifyUser(String text) {
        notificationService.send(text);
    }
}
