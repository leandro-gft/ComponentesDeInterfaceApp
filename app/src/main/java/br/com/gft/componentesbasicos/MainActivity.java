package br.com.gft.componentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private Switch switchLembrarSenha;
    private ToggleButton toggleButton;
    private TextView tvResultado;
    private CheckBox checkBoxLembrarSenha;
    private Button btEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchLembrarSenha = findViewById(R.id.switchLembrarSenha);
        toggleButton = findViewById(R.id.toggleButton);
        tvResultado = findViewById(R.id.tvResultado);
        btEnviar = findViewById(R.id.btEnviar);
        checkBoxLembrarSenha = findViewById(R.id.checkBoxLembrarSenha);
    }

    public void enviar(View view) {
        if (switchLembrarSenha.isChecked()){
            tvResultado.setText("Switch está ativado");
        }
        if (toggleButton.isChecked()){
            tvResultado.setText("ToggleButton está LIGADO");
        }
        if (checkBoxLembrarSenha.isChecked()){
            tvResultado.setText("Checkbox está ativada");
        }
    }

    public void abrirToast(View view){
        Toast.makeText(this, "Toast aberto", Toast.LENGTH_LONG).show();
    }
}
