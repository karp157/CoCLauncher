package pl.infiniteshield.main;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;

public class IntentSender {

    private static final int REQUEST_CODE = 666;

    public static void sendAfterDelay(Context context, final int delay) {
        Log.d("coc", "sendAfterDelay: " + delay);

        getAlarmManager(context).set(AlarmManager.ELAPSED_REALTIME_WAKEUP, SystemClock.elapsedRealtime() + delay,
                getAlarmIntent(context));
        Prefs.setIsDelayingToSend(context, true);
    }

    public static void cancelSendAfterDelay(Context context) {
        Log.d("coc", "cancelSendAfterDelay");

        getAlarmManager(context).cancel(getAlarmIntent(context));
    }

    private static AlarmManager getAlarmManager(Context context) {
        return (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
    }

    private static PendingIntent getAlarmIntent(Context context) {
        return PendingIntent.getService(context, REQUEST_CODE, createReceiverIntent(context), PendingIntent.FLAG_UPDATE_CURRENT);
    }

    private static Intent createReceiverIntent(Context context) {
        Intent receiverIntent = new Intent("pl.infiniteshield.LAUNCH_ACTION");
        receiverIntent.setClass(context, IntentReceiver.class);
        return receiverIntent;
    }
}
