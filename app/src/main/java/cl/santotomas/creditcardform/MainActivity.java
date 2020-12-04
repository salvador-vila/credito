package cl.santotomas.creditcardform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("MainActivity", "estamos onCreate");
        Toast.makeText(this, "hola mundo", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MainActivity", "estamos funcioando Onstart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i("MainActivity", "estamos en la funcion onResumen");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MainActivity", "estamos en onpause");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i("MainActivity", "estamos en Stop");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i("MainActivity", "estamos en onRestart");
    }

}