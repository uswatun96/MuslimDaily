package id.coding.android.uswa.muslimdaily;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DataHadist extends AppCompatActivity {

    //Deklarasi Variable
    private TextView Gethadist, Getarab, Getarti, Getsumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_hadist);

        getSupportActionBar().setTitle("Hadist");
        Gethadist = findViewById(R.id.gethadist);
        Getarab = findViewById(R.id.getarab);
        Getarti = findViewById(R.id.getarti);
        Getsumber = findViewById(R.id.getsumber);
        showData();
    }

    @SuppressLint("SetTextI18n")
    private void showData(){
        //Mendapatkan Nama Mahasiswa dari Activity sebelumnya
        String nama = getIntent().getExtras().getString("MyName");

        //Menentukan identitas yang ditampilkan bedasarkan nama yang dipilih
        switch (nama) {
            case "Hadits Menjaga Kebersihan":
                Gethadist.setText("Hadits Menjaga Kebersihan");
                Getarab.setText("اَلاِسْلاَمُ نَظِيْفٌ فَتَنَظَّفُوْافَاِنَّهُ لاَيَدْخُلُ الْجَنَّةَ اِلاَّ نَظِيْفٌ");
                Getarti.setText("”Al- islamu nadifun fatanaddafu fainnahu la yadkhululjannata illa nadifun”");
                Getsumber.setText("(HR. Baihaqiy)");
                break;
            case "Hadits Berbagi Hadiah":
                Gethadist.setText("Hadits  Berbagi Hadiah");
                Getarab.setText("تَهَادُوْا تَحَابُّوْا");
                Getarti.setText("“Berbagi hadiahlah kalian, niscaya kalian akan saling mencintai.”");
                Getsumber.setText("Hasan (Al-Albani): Hadits Riwayat Al-Bukhari dalam Al-Adab Al-Mufrad nomor 594 (الأدب المفرد)");
                break;

            case "Hadits Pemahaman Agama":
                Gethadist.setText("Hadits Pemahaman Agama");
                Getarab.setText("مَنْ يُرِدِ اللهُ بِهِ خَيْرًا يُفَقِّهْهُ فِي الدِّينِ");
                Getarti.setText("“Barang siapa yang dikehendaki kebaikan oleh Allāh, maka Allāh akan memahamkannya (diberi kepahaman) dalam urusan agama. …” ");
                Getsumber.setText("Shahih Muslim nomor 1037 (كتاب الزكاة)");
                break;

            case "Hadits Kewajiban Mengikuti Sunnah Rasulullah":
                Gethadist.setText("Hadits Kewajiban Mengikuti Sunnah Rasulullah");
                Getarab.setText(" مَنْ عَمِلَ عَمَلًا لَيْسَ عَلَيْحِ أَمرُنَا فَحُوَ رَدُّ");
                Getarti.setText("Dari ‘Aisyah (رضي الله عنها) berkata: “Rasulullāh (\u200Eصلى الله عليه وسلم) bersabda: ‘Barangsiapa yang melakukan sebuah amal perbuatan yang tidak ada contohnya dari kami maka amal perbuatan itu tertolak’.”");
                Getsumber.setText("Shahih Muslim nomor 1718 (كتاب الأقضية), al-Qowa’id al-Fiqhiyyah. II/26.");
                break;

            case "Hadits Larangan Menggambar Makhluk Hidup Bernyawa":
                Gethadist.setText("Hadits Larangan Menggambar Makhluk Hidup Bernyawa");
                Getarab.setText("اِنَّ أَشَدَّ النَّاسِ عَذَابًا يَوْمَ الْقِيَامَةِ الْمُصَوِّرُوْنَ");
                Getarti.setText("Sesungguhnya manusia yang paling keras siksaannya pada hari Kiamat adalah orang-orang yang menggambar (makhluk yang bernyawa).");
                Getsumber.setText("Hadits Muttafaq ‘Alaih: Diriwayatkan oleh Imam Al-Bukhari dan Imam Muslim. Sunan an-Nasa’i nomor 5357, 5364, Sahih al-Bukhari nomor 5950, 6109, Shahih Muslim nomor 2107.");
                break;

            case "Hadits Menyatakan Cinta":
                Gethadist.setText("Hadits Menyatakan Cinta");
                Getarab.setText("إِذَا أَحَبَّ أَحَدُكُمْ أَخَاهُ فَلْيُعْلِمْهُ إِيَّاهُ");
                Getarti.setText("Apabila seseorang mencintai saudaranya maka hendaklah dia memberi tau bahwa dia mencintainya. ");
                Getsumber.setText("Hadits Hasan (al-Albani): at-Tirmidzi nomor 2392 (كتاب الزهد عن رسول الله صلى الله عليه وسلم)");
                break;

            case "Hadits Niat Beramal":
                Gethadist.setText("Hadits Pendek Niat Beramal");
                Getarab.setText("إِنَّمَا الأَعْمَالُ بِالنِّيَّاتِ وَإِنَّمَا لِكُلِّ امْرِئٍ مَا نَوَى");
                Getarti.setText("Sesungguhnya setiap amal itu (tergantung) pada niatnya, dan seseorang itu akan mendapatkan sesuai dengan  yang dia niatkan. ");
                Getsumber.setText("Hadits Shahih (al-Albani): Shahih Bukhari nonor 1, 6689, 6953, Shahih Muslim nomor 1907, Sunan Abi Dawud nomor 2201, Sunan an-Nasa’i nomor 3794.");
                break;

            case "Hadits Menuntut Ilmu":
                Gethadist.setText("Hadits Menuntut Ilmu");
                Getarab.setText("طَلَبُ الْعِلْمِ فَرِيضَةٌ عَلَى كُلِّ مُسْلِمٍ");
                Getarti.setText("Menuntut ilmu itu wajib bagi setiap muslim.");
                Getsumber.setText("Shahih: Ibnu Majah no. 224 (كتاب المقدمة), dari Shahabat Anas bin Malik رضى الله عنه.");
                break;

            case "Hadits Perintah Istiqamah":
                Gethadist.setText("Hadits Perintah Istiqamah");
                Getarab.setText("قُلْ آمَنْتُ بِاللهِ فَاسْتَقِمْ");
                Getarti.setText("Katakanlah, ‘Aku beriman kepada Allah’, kemudian beristiqamahlah (berpegang teguh kepada ketaatan). ");
                Getsumber.setText("Shahih Muslim nomor 38.");
                break;

            case "Hadits Apabila Merasa Ragu":
                Gethadist.setText("Hadits Apabila Merasa Ragu");
                Getarab.setText("دَعْ مَا يَرِيبُكَ إِلَى مَا لاَ يَرِيبُكَ");
                Getarti.setText("“Tinggalkan apa yang engkau ragukan dan kerjakan apa yang engkau tidak ragu.” ");
                Getsumber.setText(" Hadits Shaih (Darussalam): Sunan an-Nasa’i nomor 5711, an-Nawawi, Jami at-Tirmidzi nomor 2518 dengan lafazh (دَعْ مَا يَرِيبُكَ إِلَى مَا لاَ يَرِيبُكَ فَإِنَّ الصِّدْقَ طُمَأْنِينَةٌ وَإِنَّ الْكَذِبَ رِيبَةٌ); “Tinggalkan apa yang meragukanmu kepada apa yang tidak meragukanmu, Karena sesungguhnya Kebenaran adalah Ketentraman dan Dusta adalah Keraguan.” Dari al-Hasan bin ‘Ali bin Abi Thalib.");
                break;

            case "Hadits Menunjukkan Kebaikan":
                Gethadist.setText("Hadits Menunjukkan Kebaikan");
                Getarab.setText("مَنْ دَلَّ عَلَى خَيْرٍ فَلَهُ مِثْلُ أَجْرِ فَاعِلِهِ");
                Getarti.setText("“Barangsiapa yang menunjuki kepada kebaikan maka dia akan mendapatkan pahala seperti pahala orang yang mengerjakannya.”");
                Getsumber.setText("Shahih Muslim nomor 1893 (كتاب الإمارة).");
                break;

            case "Hadits Menyampaikan Dalil":
                Gethadist.setText("Hadits Menyampaikan Dalil");
                Getarab.setText("بَلِّغُوا عَنِّي وَلَوْ آيَةً");
                Getarti.setText("“Sampaikanlah dariku walau satu ayat.”");
                Getsumber.setText("Sahih al-Bukhari nomor 3461");
                break;

            case "Hadits Berpegang Kepada Sunnah":
                Gethadist.setText("Hadits Berpegang Kepada Sunnah");
                Getarab.setText("فَعَلَيْكُمْ بِسُنَّتِي وَسُنَّةِ الْخُلَفَاءِ الرَّاشِدِينَ الْمَهْدِيينَ");
                Getarti.setText("“Hendaklah kamu berpegang kepada Sunnahku dan Sunnah para khalifah yang mendapat bimbingan (Petunjuk).”");
                Getsumber.setText("Hasan (Darussalam):  Sunan Ibnu Majah nomor 42 (كتاب المقدمة).");
                break;

            case "Hadits Berbuat Dosa Terang-terangan":
                Gethadist.setText("Hadits Berbuat Dosa Terang-terangan");
                Getarab.setText("كُلُّ أُمَّتِي مُعَافًى إِلاَّ الْمُجَاهِرِينَ");
                Getarti.setText("“Setiap umatku dosanya akan dimaafkan kecuali orang yang berbuat dosa secara terang-terangan. …”");
                Getsumber.setText("Shahih al-Bukhari nomor 6069 (كتاب الأدب), Shahih Muslim nomor 2990 (كتاب الزهد والرقائق) dengan lafazh (كُلُّ أُمَّتِي مُعَافَاةٌ إِلاَّ الْمُجَاهِرِينَ).");
                break;

            case "Hadits Menuntut Ilmu Agama":
                Gethadist.setText("Hadits Menuntut Ilmu Agama");
                Getarab.setText("مَنْ سَلَكَ طَرِيقًا يَلْتَمِسُ فِيهِ عِلْمًا سَهَّلَ اللهُ لَهُ طَرِيقًا إِلَى الْجَنَّةِ");
                Getarti.setText("“Barangsiapa yang berjalan menuntut ilmu, maka Allāh mudahkan jalannya menuju Surga. …”");
                Getsumber.setText("Sahih (Darussalam): Jami` at-Tirmidzi nomor 2646 (كتاب العلم عن رسول الله صلى الله عليه وسلم), dari Shahabat Abu Hurairah رضي الله عنه\u200E\u200E.");
                break;

            case "Hadits Berkata Baik atau Diam":
                Gethadist.setText("Hadits Berkata Baik atau Diam");
                Getarab.setText("وَمَنْ كَانَ يُؤْمِنُ بِاللَّهِ وَالْيَوْمِ اْلآخِرِ فَليَقُلْ خَيْرًا أَوْ لِيَصْمُتْ");
                Getarti.setText("“Barang siapa yang beriman kepada Allah dan hari akhir maka hendaknya dia berkata yang baik atau diam.”");
                Getsumber.setText("H.R. Bukhari, Muslim.");
                break;

            case "Hadits Berkata Baik adalah Sedekah":
                Gethadist.setText("Hadits Berkata Baik adalah Sedekah");
                Getarab.setText("الْكَلِمَةُ الطَّيِّبَةُ صَدَقَةٌ");
                Getarti.setText("“Perkataan yang baik adalah sedekah ");
                Getsumber.setText("Shahih Bukhari nomor 2989 (كتاب الجهاد والسير)");
                break;

            case "Hadits Mengenai Larangan Bunuh Diri":
                Gethadist.setText("Hadits Mengenai Larangan Bunuh Diri");
                Getarab.setText("مَنْ قَتَلَ نَفْسَهُ بِشَيْءٍ فِيْ الدُّنْيَا عُذِّبَ بِهِ يَوْمَ الْقِيَامَةِ");
                Getarti.setText("Barangsiapa yang bunuh diri dengan sesuatu di dunia, maka dia akan diadzab dengannya pada hari Kiamat (dengan cara seperti itu pula). ");
                Getsumber.setText("Shahih: al-Bukhari nomor 1363, Muslim nomor 110 & 176, dari Tsabit bin ad-Dhahhak رضى الله عنه. Ini lafazh Muslim.");
                break;

            case "Hadits Setiap Orang adalah Pemimpin":
                Gethadist.setText("Hadits Setiap Orang adalah Pemimpin");
                Getarab.setText("أَلاَ كُلُّكُمْ رَاعٍ وَكُلُّكُمْ مَسْئُولٌ عَنْ رَعِيَّتِهِ وَالرَّجُلُ رَاعٍ عَلَى أَهْلِ بَيْتِهِ وَهُوَ مَسْئُولٌ عَنْهُمْ أَلاَ فَكُلُّكُمْ رَاعٍ وَكُلُّكُمْ مَسْئُولٌ عَنْ رَعِيَّتِهِ");
                Getarti.setText("Ketahuilah setiap kalian adalah pemimpin, dan setiap dari kalian bertanggung jawab atas yang ia pimpin … seorang lelaki adalah pemimpin bagi keluarganya, dan ia bertanggung jawab atas keluarganya … Ketahuilah setiap dari kalian adalah pemimpin dan bertanggung jawab atas apa yang ia pimpin.");
                Getsumber.setText("Shahih Muslim, nomor 1829 (كتاب الإمارة).");
                break;

            case "Hadits Memilih Teman":
                Gethadist.setText("Hadits Memilih Teman");
                Getarab.setText("الرَّجُلُ عَلَى دِينِ خَلِيلِهِ فَلْيَنْظُرْ أَحَدُكُمْ مَنْ يُخَالِلُ");
                Getarti.setText("Seseorang itu tergantung pada agama temannya. Oleh karena itu, salah satu di antara kalian hendaknya memperhatikan siapa yang dia jadikan teman. ");
                Getsumber.setText("Hasan (Al-Albani): Abu Dawud nomor 4833 (كتاب الأدب).");
                break;

            case "Hadits Memilih Sahabat":
                Gethadist.setText("Hadits Memilih Sahabat");
                Getarab.setText("اَلْمَرْءُ عَلَىٰ دِيْنِ خَلِيْلِهِ، فَلْيَنْظُرْ أَحَدُكُمْ مَنْ يُخَالِلُ");
                Getarti.setText("");
                Getsumber.setText("");
                break;

            case "Hadits mengenai perintah bersiwak":
                Gethadist.setText("Hadits mengenai perintah bersiwak");
                Getarab.setText("أَكْثَرْتُ عَلَيْكُمْ فِي الـسِّوّاكِ");
                Getarti.setText("“Aku telah meminta kalian untuk memperbanyak bersiwak.”");
                Getsumber.setText("Shahih: Al-Bukhari nomor 888, kitab Al-Jum’ah.");
        }
    }
}
