package com.example.timerapp

import android.content.Context
import android.content.Intent
import com.example.timerapp.util.PrefUtil.PrefUtil

class TimerExpiredReceiver {
    fun onReceive(context: Context, intent: Intent) {
        //TODO: show notification

        PrefUtil.setTimerState(MainActivity.TimerState.Stopped, context)
        PrefUtil.setAlarmSetTime(0, context)
    }
}