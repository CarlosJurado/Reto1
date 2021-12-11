package com.example.reto1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menuopciones,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.opcion1) {
            Intent productos = new Intent(getApplicationContext(),MainActivity2.class);
            startActivity(productos);
            Toast.makeText(this, "Seleccionó Productos", Toast.LENGTH_LONG).show();
        }
        if (id == R.id.opcion2) {
            Intent servicios = new Intent(getApplicationContext(),MainActivity3.class);
            startActivity(servicios);
            Toast.makeText(this, "Seleccionó Servicios", Toast.LENGTH_LONG).show();
        }
        if (id == R.id.opcion3) {
            Intent sucursales = new Intent(getApplicationContext(),MainActivity4.class);
            startActivity(sucursales);
            Toast.makeText(this, "Seleccionó Sucursales", Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }
}