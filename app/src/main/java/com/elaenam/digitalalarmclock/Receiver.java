package com.elaenam.digitalalarmclock;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.widget.Toast;

class Receiver extends BroadcastReceiver {
    Ringtone   mCurrentRingtone;

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"Alarm Wake up, now !!,Alarm Wake up, now !!",Toast.LENGTH_LONG).show();
     Uri alarmUri=RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM);
        playRingtone(RingtoneManager.getRingtone(context, alarmUri));
    }
    private void playRingtone(Ringtone ringtone) {
        if(null != mCurrentRingtone && mCurrentRingtone.isPlaying()) {
            mCurrentRingtone.stop();

            mCurrentRingtone = ringtone;

            if (null != ringtone) {
                mCurrentRingtone.play();
            }
        }
    }

}
