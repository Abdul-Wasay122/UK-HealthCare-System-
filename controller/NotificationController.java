package controller;
import model.Notification;

import java.io.FileWriter;
import java.io.IOException;

public class NotificationController {
    public void sendNotufication(Notification notification) {
        writeToFile(notification);
    }
    private void writeToFile(Notification notification)
    {
        try(FileWriter writer = new FileWriter("notifications.txt",true)){
            writer.write(notification.getRecipientId()+" : "+notification.getMessage()+"\n");

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
