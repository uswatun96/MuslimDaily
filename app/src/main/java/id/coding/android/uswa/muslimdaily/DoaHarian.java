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

public class DoaHarian extends AppCompatActivity {

    //Data-Data yang Akan dimasukan Pada ListView
    private String[] doa = {"Doa Sebelum Makan","Doa Sesudah Makan","Doa Ketika Makan Lupa Membaca Doa",
            "Doa Sebelum Tidur","Doa Bangun Tidur","Doa Ketika Susah Tidur","Doa Ketika Mimpi Buruk",
            "Doa Di Pagi Hari","Doa Di Sore Hari","Doa Ketika Bercermin","Doa Masuk Kedalam Rumah",
            "Doa Keluar Rumah","Doa Masuk Masjid","Doa Keluar Dari Masjid","Doa Ketika Masuk WC",
            "Doa Keluar Dari WC","Doa Ketika Turun Hujan","Doa Setelah Hujan","Doa Ketika Melihat Petir",
            "Doa Ketika Mendengar Suara Petir","Doa Saat Ada Angin Kencang","Doa Untuk Kedua Orangtua",
            "Doa Agar Diberi Keselamatan Dunia Akhirat","Doa Ketika Marah","Doa Ketika Lupa","Doa Ketika Hendak Belajar",
            " Doa Sesudah Belajar","Doa Naik Kendaraan","Doa Saat Mengalami Kesulitan Agar Diberikan Kemudahan",
            "Doa Agar Diberi Kefahaman Dalam Belajar Dan Dimudahkan Dalam Menghafal"};

    //ArrayList digunakan Untuk menampung Data mahasiswa
    private ArrayList<String> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doa_harian);

        getSupportActionBar().setTitle("Kumpulan Doa Harian");

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
                Intent sendData = new Intent(DoaHarian.this, DataDoa.class);
                sendData.putExtra("MyName", getName);
                startActivity(sendData);
            }
        });
    }

    private void getData(){
        //Memasukan Semua Data ayat kedalam ArrayList
        Collections.addAll(data, doa);
    }
}

