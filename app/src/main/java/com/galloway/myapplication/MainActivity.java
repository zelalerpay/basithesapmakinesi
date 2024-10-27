package com.galloway.myapplication;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText editText;
    EditText editText2;
    Button btncarp;
    Button btncikar;
    Button btntopla;
    Button btnböl;
    String birincisayi, ikincisayi;
    int s1,s2,sonuc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        editText =(EditText)findViewById(R.id.editText);
        editText2=(EditText)findViewById(R.id.editText2);
        textView=(TextView) findViewById(R.id.textView);
        btntopla=(Button) findViewById(R.id.btntopla);
        btncikar = (Button) findViewById(R.id.btncikar);
        btnböl=(Button) findViewById(R.id.btnböl);
        btncarp=(Button) findViewById(R.id.btncarp);



    }
    public void btnhesapla(View v) {

        birincisayi =editText.getText().toString();
        ikincisayi =editText2.getText().toString();

        if(!TextUtils.isEmpty(birincisayi)&& !TextUtils.isEmpty(ikincisayi) ){
            s1 =Integer.valueOf(birincisayi);
            s2=Integer.valueOf(ikincisayi);
            hesapla hesapla =new hesapla(s1,s2);

            if (v.getId()==R.id.btntopla){
                sonuc=hesapla.toplam();
                textView.setText(String.valueOf(sonuc));
            } else if (v.getId() == R.id.btncikar) {
                sonuc = hesapla.cikar();
                textView.setText(String.valueOf(sonuc));
                
            } else if (v.getId()==R.id.btncarp) {
                sonuc = hesapla.çarp();
                textView.setText(String.valueOf(sonuc));

            } else if (v.getId()==R.id.btnböl){
                if(s2!=0){
                    sonuc=hesapla.böl();
                    textView.setText(String.valueOf(sonuc));
                }else {
                    textView.setText("bölme işleminde sıfıra bölme hatasoo ");
                }
            } else {
                    textView.setText("hatalı işlem");
                    }

        }else {
            textView.setText("her iki sayıyı da girmeniz gerekmektedir ");
        }

        };

    }
