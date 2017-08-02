package assalaam.memanggilactivity.id.memanggilactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class CallActiviy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_activiy);

        Button next = (Button) findViewById(R.id.Button01);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), CallActivity2.class);
                        startActivityForResult(myIntent, 0);
            }
        });
    }
}
