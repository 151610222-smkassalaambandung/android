package assalaam.menampilkangambar.id.menampilkangambar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.io.IOException;
import android.app.Activity;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class playingAudio extends AppCompatActivity {
    ImageButton mainkan;
    TextView keterangan;
    Button pause;
    Button btnStop;

    MediaPlayer mp;
    /** Called when the activity is first created.*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing_audio);

        pause = (Button) findViewById(R.id.pause);
        btnStop = (Button) findViewById(R.id.btnSTOP);
        keterangan =(TextView) findViewById(R.id.ket);
        keterangan.setText("Silahkan klik tombol play");

        mainkan = (ImageButton) findViewById(R.id.putarMusik);
        mainkan.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                mainkan.setEnabled(false);
                keterangan.setText("Tombol play tidak aktif");
                go();

            }
        });
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pause();
            }
        });

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stop();
            }
        });

    }

    public void stateAwal(){
        btnStop.setEnabled(false);
    }
    public void go(){
        mp=MediaPlayer.create(playingAudio.this, R.raw.gaza);
        try {
            mp.prepare();
        } catch (IllegalStateException e) {
            // TODO Auto-generated catch block e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block e.printStackTrace();
        }
        mp.start();
        mp.setOnCompletionListener(new OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer arg0) {
                mainkan.setEnabled(true);
                keterangan.setText("silahkan tekan tombol play");

            }
        });
    }

    public void pause(){
        if(mp.isPlaying()){
            if(mp!=null){
                mp.pause();

            }
        } else {
            if(mp!=null){
                mp.start();

            }
        }
    }
    public void stop(){
        mp.stop();

        try{
            mp.prepare();
            mp.seekTo(0);
        }catch (Throwable t) {
            t.printStackTrace();
        }

        stateAwal();
    }

}
