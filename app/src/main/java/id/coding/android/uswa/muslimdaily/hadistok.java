package id.coding.android.uswa.muslimdaily;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

public class hadistok extends AppCompatActivity {

    //Data-Data yang Akan dimasukan Pada ListView
    private String[] hadist = {"Hadits Menjaga Kebersihan","Hadits Berbagi Hadiah","Hadits Pemahaman Agama","Hadits Kewajiban Mengikuti Sunnah Rasulullah",
            "Hadits Larangan Menggambar Makhluk Hidup Bernyawa","Hadits Menyatakan Cinta","Hadits Niat Beramal",
            "Hadits Menuntut Ilmu","Hadits Perintah Istiqamah","Hadits Apabila Merasa Ragu","Hadits Menunjukkan Kebaikan",
            "Hadits Menyampaikan Dalil","Hadits Berpegang Kepada Sunnah","Hadits Berbuat Dosa Terang-terangan","Hadits Menuntut Ilmu Agama",
            "Hadits Berkata Baik atau Diam","Hadits Berkata Baik adalah Sedekah",
            "Hadits Mengenai Larangan Bunuh Diri","Hadits Setiap Orang adalah Pemimpin",
            "Hadits Memilih Teman","Hadits Memilih Sahabat","Hadits mengenai perintah bersiwak"};
    //ArrayList digunakan Untuk menampung Data mahasiswa
    private ArrayList<String> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hadistok);

        getSupportActionBar().setTitle("Kumpulan Hadist");

        ListView listView = findViewById(R.id.listitem);
        data = new ArrayList<>();
        getData();
        //ArrayAdapter digunakan untuk mengatur, bagaimana item pada ListView akan tampil
        ArrayAdapter<String> adapter = new ArrayAdapter<>
                (this, R.layout.support_simple_spinner_dropdown_item, data);
        listView.setAdapter(adapter);

        //Menambahan Listener, untuk menangani kejadian saat salah satu item listView di klik
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Mendapatkan Nama pada salah satu item yang diklik, berdasarkan posisinya
                String getName = data.get(position);

                //Berpindah Activity dan Mempassing data Nama pada Activity Selanjutnya
                Intent sendData = new Intent(hadistok.this, DataHadist.class);
                sendData.putExtra("MyName", getName);
                startActivity(sendData);
            }
        });
    }

    private void getData(){
        //Memasukan Semua Data ayat kedalam ArrayList
        Collections.addAll(data, hadist);
    }
}

