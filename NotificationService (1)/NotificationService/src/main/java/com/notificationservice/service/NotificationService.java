package com.notificationservice.service;

import com.notificationservice.model.Notification;
import com.notificationservice.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationService {

    @Autowired
    private NotificationRepository notificationRepository;

    public List<Notification> getAllNotifications() {
        return notificationRepository.findAll();
    }

    public List<Notification> getNotificationsByUserId(Long userId) {
        return notificationRepository.findByUserId(userId);
    }

    public Notification getNotificationById(Long id) {
        return notificationRepository.findById(id).orElse(null);
    }

    public Notification sendNotification(Notification notification) {
        notification.setStatus("Sent");
        notification.setTimestamp(java.time.LocalDateTime.now().toString());
        return notificationRepository.save(notification);
    }
}