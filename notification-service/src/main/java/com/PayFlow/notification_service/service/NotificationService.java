package com.PayFlow.notification_service.service;

import com.PayFlow.notification_service.entity.Notification;

import java.util.List;

public interface NotificationService {
    Notification sendNotification(Notification notification);
    List<Notification> getNotificationsByUserId(Long userId);

}

