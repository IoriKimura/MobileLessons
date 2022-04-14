package ru.mirea.ivanov.mireaproject.ui.mediaPlayer;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

import ru.mirea.ivanov.mireaproject.R;

public class PlayerService extends Service {
    private MediaPlayer mediaPlayer;

    public PlayerService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate(){
        mediaPlayer=MediaPlayer.create(this, R.raw.devil);
        mediaPlayer.setLooping(true);
    }
    @Override
    public int onStartCommand(Intent intent, int flags, int startId){
        mediaPlayer.start();
        return START_STICKY;
    }
    @Override
    public void onDestroy() {
        mediaPlayer.stop();
    }
}