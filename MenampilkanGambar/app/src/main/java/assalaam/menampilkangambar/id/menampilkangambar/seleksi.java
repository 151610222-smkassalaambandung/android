package assalaam.menampilkangambar.id.menampilkangambar;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class seleksi extends ListActivity {
    /**
     * Called when the activity is first created.
     */
    TextView seleksi;
    String[] pilihan = {
            "Merbabu", " Merapi", "Lewu", "Rinjani",
            "Sumbing", " Sindoro", " Krakatau", "Selat sunda",
            "Selat Bali", " Selat malaka", " kalimantan",
            "sulawesi", "jawa"};


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleksi);
        setListAdapter(new ArrayAdapter<String>
                (this,android.R.layout.simple_list_item_1, pilihan));
        seleksi = (TextView) findViewById(R.id.yangDipilih);

    }

    public void onListItemClick(ListView parent, View v,
                                int position, long id) {
        seleksi.setText(pilihan[position]);
    }
}
