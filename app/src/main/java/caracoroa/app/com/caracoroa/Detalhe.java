package caracoroa.app.com.caracoroa;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class Detalhe extends AppCompatActivity {

    private ImageView moeda;
    private ImageView voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);

        voltar = findViewById(R.id.voltarId);
        moeda = findViewById(R.id.moedaId);

        Bundle extra = getIntent().getExtras();
        if (extra != null){
            String opcaoEscolhida = extra.getString("opcao");

            if (opcaoEscolhida.equals("cara")){
                //cara
                moeda.setImageDrawable(ContextCompat.getDrawable(Detalhe.this, R.drawable.moeda_cara));
            }else {
                //coroa
                moeda.setImageDrawable(ContextCompat.getDrawable(Detalhe.this, R.drawable.moeda_coroa));
            }
        }

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Detalhe.this, MainActivity.class));
            }
        });
    }
}
