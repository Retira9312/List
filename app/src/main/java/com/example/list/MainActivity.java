package com.example.list;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class MainActivity extends ListActivity {

    String[] things = {"Рубик", "Иллюзия", "Картина", "Часы",};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, things);
        setListAdapter(adapter);

        AdapterView.OnItemClickListener itemListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent Intent1 = new Intent (MainActivity.this, Rubik.class);
                        startActivity(Intent1);
                        break;
                    case 1:
                        Intent Intent2 = new Intent (MainActivity.this, Illusion.class);
                        startActivity(Intent2);
                        break;
                    case 2:
                        Intent Intent3 = new Intent (MainActivity.this, Picture.class);
                        startActivity(Intent3);
                        break;
                    case 3:
                        Intent Intent4 = new Intent (MainActivity.this, Clock.class);
                        startActivity(Intent4);
                        break;
                }

                Toast.makeText(getApplicationContext(), "Вы выбрали " + parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
            }



        };
        getListView().setOnItemClickListener(itemListener);
    }
}