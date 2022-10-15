package com.example.qrcode;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class TwoActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.qrcode.Generate";
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.twolayout);

        Button GenerateQRButton = findViewById(R.id.generateQR);
        GenerateQRButton.setOnClickListener((new GenerateQRListener()));
        Button GenerateODButton = findViewById(R.id.generateOD);
        GenerateODButton.setOnClickListener((new GenerateODListener()));

        ImageView ret = findViewById(R.id.Ret);
        ret.setOnClickListener(new changeXmlListener());
    }

    public class GenerateQRListener implements View.OnClickListener {
        public void onClick(View v) {
            EditText multiText = findViewById(R.id.InputText);
            String text = multiText.getText().toString();
            if (text.length() == 0) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(TwoActivity.this);
                dialog.setTitle("Note");
                dialog.setMessage("输入栏为空，请输入内容。");
                dialog.setCancelable(false);
                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {}
                });
                dialog.show();
            } else {
                Intent intent = new Intent(TwoActivity.this, Generate.class);
                intent.putExtra(EXTRA_MESSAGE, text);
                startActivity(intent);
            }
        }
    }

    public class GenerateODListener implements View.OnClickListener {
        public void onClick(View v) {

        }
    }

    public class changeXmlListener implements View.OnClickListener {
        public void onClick(View v) {
            Intent intent = new Intent(TwoActivity.this, MainActivity.class);
            startActivity(intent);
        }
    }
}
