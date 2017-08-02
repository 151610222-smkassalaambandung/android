package assalaam.menampilkangambar.id.menampilkangambar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button linear = (Button) findViewById(R.id.button1);
        linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(),LenearLayoutSederhana.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button RELAT = (Button) findViewById(R.id.button2);
        RELAT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(),RelativeLayoutSederhana.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button gam = (Button) findViewById(R.id.button3);
        gam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(),TampilanGambar.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button AUT = (Button) findViewById(R.id.button4);
        AUT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(),AutocompleteSederhana.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button tab = (Button) findViewById(R.id.button5);
        tab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(),LayoutTable.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button kotak = (Button) findViewById(R.id.button6);
        kotak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(),KotakDialog.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button ppick = (Button) findViewById(R.id.button7);
        ppick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(),picker.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button sele = (Button) findViewById(R.id.button8);
        sele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), seleksi.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button CHE = (Button) findViewById(R.id.button9);
        CHE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(),checkBox.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button RAD = (Button) findViewById(R.id.button10);
        RAD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(),RadioButton.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button PLA = (Button) findViewById(R.id.button11);
        PLA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(),playingAudio.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button audio = (Button) findViewById(R.id.button12);
        audio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(),Audio.class);
                startActivityForResult(myIntent,0);
            }
        });
    }

}
