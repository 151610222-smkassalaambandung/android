package assalaam.menampilkangambar.id.menampilkangambar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class checkBox extends AppCompatActivity implements OnCheckedChangeListener {
    CheckBox cb;
    /** Called when the activity is first created. */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        cb=(CheckBox) findViewById(R.id.activity_check_box);
        cb.setOnCheckedChangeListener(this);
    }

    public void onCheckedChanged(CompoundButton buttonView, boolean isCheked) {
        if (isCheked) {
            cb.setText("checkBox ini : Dicentang!");
        }
        else {
            cb.setText("checkBox ini  : Tidak di centang!");
        }
    }
}
