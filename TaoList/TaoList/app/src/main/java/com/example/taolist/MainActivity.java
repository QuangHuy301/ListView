package com.example.taolist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvMonAn;
    ArrayList<MonAn> arrayMonAn;
    MonAnAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();

        adapter = new MonAnAdapter(this, R.layout.dong_mon_an, arrayMonAn);
        lvMonAn.setAdapter(adapter);
        
        lvMonAn.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, ManHinhActivity.class);
                startActivity(intent);
            }
        });

    }

    private void AnhXa() {

        lvMonAn = (ListView) findViewById(R.id.listviewMonAn);
        arrayMonAn = new ArrayList<>();

        arrayMonAn.add(new MonAn("Lê Quang Huy", "2050531200158", R.drawable.foody1,"6$", R.drawable.cong, R.drawable.tru));
        arrayMonAn.add(new MonAn("Lê Quang Huy", "2050531200158", R.drawable.foody2,"6$", R.drawable.cong, R.drawable.tru));
        arrayMonAn.add(new MonAn("Lê Quang Huy", "2050531200158", R.drawable.foody3,"6$", R.drawable.cong, R.drawable.tru));
        arrayMonAn.add(new MonAn("Lê Quang Huy", "2050531200158", R.drawable.foody4,"6$", R.drawable.cong, R.drawable.tru));
        arrayMonAn.add(new MonAn("Lê Quang Huy", "2050531200158", R.drawable.foody5,"6$", R.drawable.cong, R.drawable.tru));

    }

}