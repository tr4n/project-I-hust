package com.example.m1k3y.projecti.services;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.support.v4.app.NotificationCompat;

import com.example.m1k3y.projecti.R;
import com.example.m1k3y.projecti.activities.SignInActivity;
import com.example.m1k3y.projecti.models.MessageModel;

public class NotificationService extends Service {
    public NotificationService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        MessageModel messageModel = intent.getExtras().getParcelable("message_model");

        String title = messageModel.getUsername() + ": \"" + messageModel.getContent() + "\"";
        createNotification( this, title);
        return START_NOT_STICKY;

    }

    private NotificationManager notifManager;
    public void createNotification(Context context, String title) {
        final int NOTIFY_ID = 0; // ID of notification
        String id = context.getString(R.string.default_notification_channel_id); // default_channel_id

        Intent intent;
        PendingIntent pendingIntent;
        NotificationCompat.Builder builder;
        if (notifManager == null) {
            notifManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            int importance = NotificationManager.IMPORTANCE_HIGH;
            NotificationChannel mChannel = notifManager.getNotificationChannel(id);
            if (mChannel == null) {
                mChannel = new NotificationChannel(id, title, importance);
                mChannel.enableVibration(true);
                mChannel.setVibrationPattern(new long[]{0L});"" +
                        ""
                notifManager.createNotificationChannel(mChannel);
            }
            builder = new NotificationCompat.Builder(context, id);
            intent = new Intent(context, SignInActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK );
            pendingIntent = PendingIntent.getActivity(context, 0, intent, 0);
            builder.setContentTitle(title)                            // required
                    .setSmallIcon(android.R.drawable.ic_popup_reminder)   // required
                    .setContentText(context.getString(R.string.tapping)) // required
                    .setDefaults(0)
                    // .setVibrate(null)
                    .setContentIntent(pendingIntent)
                    .setVibrate(new long[]{0L});
        } else {
            builder = new NotificationCompat.Builder(context, id);
            intent = new Intent(context, SignInActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK );
            pendingIntent = PendingIntent.getActivity(context, 0, intent, 0);
            builder.setContentTitle(title)                            // required
                    .setSmallIcon(android.R.drawable.ic_popup_reminder)   // required
                    .setContentText(context.getString(R.string.tapping)) // required
                    .setDefaults(0)
                    .setContentIntent(pendingIntent)
                    // .setVibrate(null)
                    .setVibrate(new long[]{0L})
                    .setPriority(Notification.PRIORITY_HIGH);
        }
        Notification notification = builder.build();

        notifManager.notify(NOTIFY_ID, notification);
    }
}
