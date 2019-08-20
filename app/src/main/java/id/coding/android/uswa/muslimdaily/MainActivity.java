package id.coding.android.uswa.muslimdaily;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView btn_produk;
    private ImageView btn_sholat;
    private ImageView btn_doa;
    private ImageView btn_hadist;
    private ImageView btn_quran;
    private ImageView btn_surat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_produk = (ImageView) findViewById(R.id.btnproduk);
        btn_sholat = (ImageView) findViewById(R.id.btnsholat);
        btn_hadist = (ImageView) findViewById(R.id.btnhadist);
        btn_doa = (ImageView) findViewById(R.id.btndoa);
        btn_produk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, ProdukOk.class);
                startActivity(intent);
            }
        });

        btn_sholat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, jadwalsholatok.class);
                startActivity(intent);
            }
        });

        btn_doa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, DoaHarian.class);
                startActivity(intent);
            }
        });

        btn_hadist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, hadistok.class);
                startActivity(intent);
            }
        });
    }
}
