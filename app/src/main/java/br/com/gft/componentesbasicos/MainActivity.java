package br.com.gft.componentesbasicos;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
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

    public void abrirAlertDialog(View view){
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);

        //Configura o ícone, título e mensagem da Dialog
        dialog.setIcon(android.R.drawable.ic_delete);
        dialog.setMessage("AlertDialog aberta");
        dialog.setTitle("AlertDialog");

        //Configura cancelamento, não é possivel clicar fora da Dialog
        dialog.setCancelable(false);

        //Configura ações para botão Sim e Não
        dialog.setPositiveButton("SIM", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Você clicou em SIM", Toast.LENGTH_LONG).show();
            }
        });
        dialog.setNegativeButton("NÃO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Você clicou em NÃO", Toast.LENGTH_LONG).show();
            }
        });
        //Criar e mostrar Dialog
        dialog.create();
        dialog.show();
    }
}
