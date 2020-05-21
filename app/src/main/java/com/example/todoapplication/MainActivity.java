package com.example.todoapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<String> tasks;
    ArrayAdapter<String> adapter;
    EditText editText;
    LinearLayout linearLayout;
    boolean active=true;
    String task;

    public void addTheTask(View view){


        linearLayout.setVisibility(View.VISIBLE);
        editText= findViewById(R.id.taskEdit);

        task = editText.getText().toString();

        if(task.isEmpty()){
            
            if(active) {

                active=false;
            }
            else {
                Toast.makeText(this, "enter a valid task", Toast.LENGTH_SHORT).show();
            }
        }
        else {
            adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,tasks);
            tasks.add(task);
            editText.setText("");
            listView.setAdapter(adapter);
        }






    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView =  findViewById(R.id.listView);
        tasks = new ArrayList<String>();
        linearLayout = findViewById(R.id.linearLayout);
        //Button add= findViewById(R.id.add);









    }
}
