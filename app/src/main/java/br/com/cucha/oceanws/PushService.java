package br.com.cucha.oceanws;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.TaskStackBuilder;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by eduardocucharro on 30/10/16.
 */

public class PushService extends FirebaseMessagingService {
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);

        RemoteMessage.Notification notification = remoteMessage.getNotification();

        if (notification != null) {

            Intent intent = new Intent(this, ImageActivity.class);

            TaskStackBuilder stackBuilder = TaskStackBuilder.create(this);
            stackBuilder.addParentStack(MainActivity.class);
            stackBuilder.addNextIntent(intent);

            PendingIntent resultPendingIntent = stackBuilder.getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT);

            Notification notif = new NotificationCompat.Builder(this)
                    .setSmallIcon(android.R.drawable.ic_media_ff)
                    .setContentTitle(notification.getTitle())
                    .setContentText(notification.getBody())
                    .setContentIntent(resultPendingIntent)
                    .build();

            NotificationManager mNotificationManager =
                    (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
            mNotificationManager.notify(1, notif);
        }
    }
}
