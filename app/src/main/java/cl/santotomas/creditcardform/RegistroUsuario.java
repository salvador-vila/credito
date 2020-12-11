package cl.santotomas.creditcardform;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import utilidades.Utilidades;

public class RegistroUsuario extends AppCompatActivity {

    EditText compoNombre,campoApellido,campoAlo,campoNumeroTarjeta,campoMes,campoCodigo,campoDireccion,campoCallerNumero,campoCiudad,campoEstado,campoCaodigoPostal;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContenView(R.layout.activity_main);

        EditText campoNombre = (EditText) findViewById(R.id.nombre_edit);
        EditText campoApellido = (EditText) findViewById(R.id.apellido_edit);
        EditText campoAlo = (EditText) findViewById(R.id.año_edit);
        EditText campoNumeroTarjeta = (EditText) findViewById(R.id.num_tarjeta);
        EditText campoMes = (EditText) findViewById(R.id.mes_edit);
        EditText campoCodigo = (EditText) findViewById(R.id.code_edit);
        @SuppressLint("WrongViewCast") EditText campoDireccion = this.<EditText>findViewById(R.id.dierccion_edit);
        EditText campoCalleNumero = (EditText) findViewById(R.id.calle_num);
        EditText campoCiudad = (EditText) findViewById(R.id.ciudad_edi);




    }

    private void setContenView(int activity_main) {
    }



    private void registroUsuario() {
        ConexionSQLitehelper conn=new ConexionSQLitehelper(this, "bd_usuarios", null,1);
        SQLiteDatabase db=conn.getWritableDatabase();

        ContentValues values=new ContentValues();
        values.put(Utilidades.nombre,compoNombre.getText().toString());
        values.put(Utilidades.apellido,campoApellido.getText().toString());
        values.put(Utilidades.AlO,campoAlo.getText().toString());
        values.put(Utilidades.NUMERO_TARJETA,campoNumeroTarjeta.getText().toString());
        values.put(Utilidades.MES,campoMes.getText().toString());
        values.put(Utilidades.CODIGO,campoCodigo.getText().toString());
        values.put(Utilidades.DIRECCION,campoDireccion.getText().toString());
        values.put(Utilidades.CALLE_NUMERO,campoCallerNumero.getText().toString());
        values.put(Utilidades.CIUDAD,campoCiudad.getText().toString());

        Long idResultante=db.insert(Utilidades.TABLA_USUARIO,Utilidades.nombre,values);




    }

}
