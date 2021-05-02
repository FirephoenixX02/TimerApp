package com.example.timerapp.util

import android.content.Context
import android.preference.PreferenceManager
import com.example.timerapp.MainActivity

class PrefUtil {
    companion object {

        fun getTimerLenght(context: Context): Int {
            //placeholder
            return 1
        }

        private const val PREVIOUS_TIMER_LENGTH_SECONDS_ID =
            "com.example.timerapp.previous_timer_length"

        fun getPreviousTimerLenghtSeconds(context: Context): Long {
            val prefernces = PreferenceManager.getDefaultSharedPreferences(context)
            return prefernces.getLong(PREVIOUS_TIMER_LENGTH_SECONDS_ID, 0)
        }

        fun setPreviousTimerLenghtSeconds(seconds: Long, context: Context) {
            val editor = PreferenceManager.getDefaultSharedPreferences(context).edit()
            editor.putLong(PREVIOUS_TIMER_LENGTH_SECONDS_ID, seconds)
            editor.apply()
        }

        private const val TIMER_STATE_ID = "com.example.timer.timer_state"

        fun getTimerState(context: Context): MainActivity.TimerState {
            val prefernces = PreferenceManager.getDefaultSharedPreferences(context)
            val ordinal = prefernces.getInt(TIMER_STATE_ID, 0)
            return MainActivity.TimerState.values()[ordinal]
        }

        fun setTimerState(state: MainActivity.TimerState, context: Context) {
            val editor = PreferenceManager.getDefaultSharedPreferences(context).edit()
            val ordinal = state.ordinal
            editor.putInt(TIMER_STATE_ID, ordinal)
            editor.apply()
        }

        private const val SECONDS_REMAINING_ID =
            "com.example.timerapp.seconds_remaining"

        fun getSecondsRemaining(context: Context): Long {
            val prefernces = PreferenceManager.getDefaultSharedPreferences(context)
            return prefernces.getLong(SECONDS_REMAINING_ID, 0)
        }

        fun setSecondsRemaining(seconds: Long, context: Context) {
            val editor = PreferenceManager.getDefaultSharedPreferences(context).edit()
            editor.putLong(SECONDS_REMAINING_ID, seconds)
            editor.apply()
        }

        private const val ALARM_SET_ID = com.example.timerapp.backgrounded_time

        fun getAlarmSetTime(context: Context): Long {
            val preferences = PreferenceManager.getDefaultSharedPreferences(context)
            return
        }
    }
}