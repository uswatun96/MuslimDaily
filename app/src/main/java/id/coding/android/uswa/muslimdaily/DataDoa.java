package id.coding.android.uswa.muslimdaily;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DataDoa extends AppCompatActivity {

    //Deklarasi Variable
    private TextView Getdoa, Getarab, Getbaca, Getarti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_doa);

        getSupportActionBar().setTitle("Doa Harian");
        Getdoa = findViewById(R.id.getdoa);
        Getarab = findViewById(R.id.getarab);
        Getbaca = findViewById(R.id.getbaca);
        Getarti = findViewById(R.id.getarti);
        showData();
    }

    @SuppressLint("SetTextI18n")
    private void showData(){
        //Mendapatkan Nama Mahasiswa dari Activity sebelumnya
        String nama = getIntent().getExtras().getString("MyName");

        //Menentukan identitas yang ditampilkan bedasarkan nama yang dipilih
        switch (nama) {
            case "Doa Sebelum Makan":
                Getdoa.setText("Doa Sebelum Makan");
                Getarab.setText("اَللّٰهُمَّ بَارِكْ لَنَا فِيْمَا رَزَقْتَنَا وَقِنَا عَذَابَ النَّارِ");
                Getbaca.setText("Alloohumma barik lanaa fiimaa razatanaa waqinaa 'adzaa bannar");
                Getarti.setText("Artinya: Ya Allah, berkahilah kami dalam rezeki yang telah Engkau berikan kepada kami dan peliharalah kami dari siksa api neraka");
                break;

            case "Doa Sesudah Makan":
                Getdoa.setText("Doa Sesudah Makan");
                Getarab.setText("اَلْحَمْدُ ِللهِ الَّذِىْ اَطْعَمَنَا وَسَقَانَا وَجَعَلَنَا مُسْلِمِيْنَِ");
                Getbaca.setText("Alhamdu lillaahil ladzii ath'amanaa wa saqoonaa wa ja'alnaa muslimiin");
                Getarti.setText("Artinya: Segala puji bagi Allah yang telah memberi makan kami dan minuman kami, serta menjadikan kami sebagai orang-orang islam");
                break;

            case "Doa Ketika Makan Lupa Membaca Doa":
                Getdoa.setText("Doa Ketika Makan Lupa Membaca Doa");
                Getarab.setText("بِسْمِ اللهِ فِىِ أَوَّلِهِ وَآخِرِهِ");
                Getbaca.setText("Bismillaahi fii awwalihi wa aakhirihi");
                Getarti.setText("Artinya: “Dengan menyebut nama Allah pada awal dan akhirnya”");
                break;

            case "Doa Sebelum Tidur":
                Getdoa.setText("Doa Sebelum Tidur");
                Getarab.setText("بِسْمِكَ االلّٰهُمَّ اَحْيَا وَبِاسْمِكَ اَمُوْتَُِ");
                Getbaca.setText("Bismikallaahuma ahyaa wa bismika amuutu");
                Getarti.setText("Artinya: Dengan menyebut nama-Mu, Ya Allah, aku hidup dan dengan menyebut nama-Mu aku mati");
                break;

            case "Doa Bangun Tidur":
                Getdoa.setText("Doa Bangun Tidur");
                Getarab.setText("اَلْحَمْدُ ِللهِ الَّذِى أَحْيَانَا بَعْدَمَا أَمَاتَنَا وَإِلَيْهِ النُّشُورَُُِ");
                Getbaca.setText("Alhamdulillahilladzii ahyanaa ba’damaa amatanaa wailaihin nusyuur");
                Getarti.setText("Artinya: Segala puji bagi Allah yang telah menghidupkan kami sesudah kami mati (membangunkan dari tidur) dan hanya kepada-Nya kami dikembalikan.");
                break;

            case "Doa Ketika Susah Tidur":
                Getdoa.setText("Doa Ketika Susah Tidur");
                Getarab.setText("اَللّٰهُمَّ غَارَتِ النُّجُوْمُ وَهَدَاتِ الْعُيُوْنُ وَأَنْتَ حَيٌّ قَيُّوْمُ لاَتَأْخُذُكَ سِنَةٌ وَلاَنَوْمٌ يَاحَيُّ يَاقَيُّوْمُ أَهْدِىءْ لَيْلِى وَأَنِمْ عَيْنِيْ َُُِ");
                Getbaca.setText("Allaahumma ghaaratin-nujuum wa hadaatil ‘uyuun wa anta hayyuun qayyuum, la ta’khudzuka sinatuw wa laa naumu yaa hayyu yaa qoyyumu adhi’ lailii wa anim ‘ainii");
                Getarti.setText("Artinya: Ya Allah, bintang-bintang telah redup, mata-mata telah memejam dan Engkau Maha Hidup lagi Maha Terus-menerus mengurus makhluk. Tidak menimpa-Mu rasa kantuk dan tidur. Wahai Dzat Yang Maha Hidup dan Maha mengurusi makhluk, tenangkanlah malamku dan tidurkanlah mataku.");
                break;

            case "Doa Ketika Mimpi Buruk":
                Getdoa.setText("Doa Ketika Mimpi Buruk");
                Getarab.setText("اَللّٰهُمَّ إِنّىِ أَعُوْذُ بِكَ مِنْ عَمَلِ الشَّيْطَانِ وَسَيِّئاَتِ اْلأَحْلاَمِِ");
                Getbaca.setText("Allaahumma innii a'uudzubika min 'amalisy syaithaani wa sayyiaatil ahlami");
                Getarti.setText("Artinya: Ya Allah, sesungguhnya aku mohon perlindungan kepada Engkau dari perbuatan setan dan dari mimpi-mimpi yang buruk");
                break;

            case "Doa Di Pagi Hari":
                Getdoa.setText("Doa di pagi hari");
                Getarab.setText("اَللَّهُمَّ بِكَ أَصْبَحْنَا وَبِكَ أَمْسَيْنَا، وَبِكَ نَحْيَا، وَبِكَ نَمُوْتُ، وَإِلَيْكَ النُّشُوْرُ");
                Getbaca.setText("Allahumma bika ashbahnaa, wa bika amsainaa, wa bika nahyaa, wa bika namuutu, wa ilaikan nusyuur");
                Getarti.setText("Artinya: “Ya Allah karena Engkau kami mengalami waktu pagi dan waktu petang dan karena Engkau kami hidup dan mati dan kepada-Mu juga kami kembali.”");
                break;

            case "Doa Di Sore Hari":
                Getdoa.setText("Doa di sore hari");
                Getarab.setText("اَللَّهُمَّ بِكَ اَمْسَيْنَا وَبِكَ اَصْبَحْنَا وَبِكَ نَحْيَا وَبِكَ نَمُوْتُ وَاِلَيْكَ الْمَصِيْرُ");
                Getbaca.setText("Allahumma bika amsainaa, wa bika asbahnaa, wa bika nahyaa, wa bika namuutu, wa ilaikal masiir");
                Getarti.setText("Artinya: “Ya Allah, karena Engkau kami mengalami waktu petang dan pagi, karena Engkau kami hidup dan mati dan kepada-Mu juga kami akan kembali.”");
                break;

            case "Doa Ketika Bercermin":
                Getdoa.setText("Doa ketika bercermin");
                Getarab.setText("اَلْحَمْدُ ِللهِ كَمَا حَسَّنْتَ خَلْقِىْ فَحَسِّـنْ خُلُقِىْ");
                Getbaca.setText("Alhamdulillaahi kamaa hassanta kholqii fahassin khuluqii");
                Getarti.setText("Artinya: “Segala puji bagi Allah, baguskanlah budi pekertiku sebagaimana Engkau telah membaguskan rupa wajahku.”");
                break;

            case "Doa Masuk Kedalam Rumah":
                Getdoa.setText("Doa Masuk Kedalam Rumah");
                Getarab.setText("اَللّٰهُمَّ اِنِّىْ اَسْأَلُكَ خَيْرَالْمَوْلِجِ وَخَيْرَالْمَخْرَجِ بِسْمِ اللهِ وَلَجْنَا وَبِسْمِ اللهِ خَرَجْنَا وَعَلَى اللهِ رَبِّنَا تَوَكَّلْنَا");
                Getbaca.setText("Allahumma innii as-aluka khoirol mauliji wa khoirol makhroji bismillaahi wa lajnaa wa bismillaahi khorojnaa wa’alallohi robbina tawakkalnaa");
                Getarti.setText("Artinya: “Ya Allah, sesungguhnya aku memohon kepada-Mu baiknya tempat masuk dan baiknya tempat keluar dengan menyebut nama Allah kami masuk,dan dengan menyebut nama Allah kami keluar dan kepada Allah Tuhan kami, kami berserah diri.”");
                break;

            case "Doa Keluar Rumah":
                Getdoa.setText("Doa Keluar Rumah");
                Getarab.setText("بِسْمِ اللهِ تَوَكَّلْتُ عَلَى اللهِ لاَحَوْلَ وَلاَقُوَّةَ اِلاَّ بِالله");
                Getbaca.setText("Bismillaahi tawakkaltu ‘alallooh laa hawlaa walaa quwwata illaa bilaah");
                Getarti.setText("Artinya: “Dengan menyebut nama Allah aku berserah diri kepada Allah, tiada daya dan kekuatan kecuali Allah.”");
                break;

            case "Doa Masuk Masjid":
                Getdoa.setText("Doa Masuk Masjid");
                Getarab.setText("اَللّٰهُمَّ افْتَحْ لِيْ اَبْوَابَ رَحْمَتِكَ");
                Getbaca.setText("Allahummaf tahlii abwaaba rohmatik");
                Getarti.setText("Artinya: “Ya Allah, bukakanlah bagiku pintu-pintu rahmat-Mu.”");
                break;

            case "Doa Keluar Dari Masjid":
                Getdoa.setText("Doa Keluar Dari Masjid");
                Getarab.setText("اَللّٰهُمَّ اِنِّى اَسْأَلُكَ مِنْ فَضْلِكَ");
                Getbaca.setText("Allahumma innii as aluka min fadlik");
                Getarti.setText("Artinya: “Ya Allah, sesungguhnya aku memohon keutamaan dari-Mu.”");
                break;

            case "Doa Ketika Masuk WC":
                Getdoa.setText("Doa Ketika Masuk WC");
                Getarab.setText("اَللّٰهُمَّ اِنِّيْ اَعُوْذُبِكَ مِنَ الْخُبُثِ وَالْخَبَآئِثِ");
                Getbaca.setText("Alloohumma Innii a’uudzubika minal khubutsi wal khobaaits");
                Getarti.setText("Artinya: ” Ya Allah, aku berlindung dari godaan setan laki-laki dan setan perempuan.”");
                break;

            case "Doa Keluar Dari WC":
                Getdoa.setText("Doa Keluar Dari WC");
                Getarab.setText("غُفْرَانَكَ الْحَمْدُ ِللهِ الَّذِىْ اَذْهَبَ عَنِّى اْلاَذَى وَعَافَانِىْ");
                Getbaca.setText("Ghufraanaka. Alhamdulillaahil ladzii adzhaba ‘annil adzaa wa’aafaani");
                Getarti.setText("Artinya: “Dengan mengharap ampunan-Mu, segala puji milik Allah yang telah menghilangkan kotoran dari badanku dan telah menyehatkanku.”");
                break;

            case "Doa Ketika Turun Hujan":
                Getdoa.setText("Doa Ketika Turun Hujan");
                Getarab.setText("اللَّهُمَّ صَيِبًا نَافِعًا");
                Getbaca.setText("Allahumma Shayyiban naafi’an");
                Getarti.setText("Artinya: “Ya Allah semoga (hujan yang Engkau turunkan ini) lebat dan membawa manfaat.”");
                break;

            case "Doa Setelah Hujan":
                Getdoa.setText("Doa Setelah Hujan");
                Getarab.setText("مُطِرْنَا بِفَضْلِ اللهِ وَرَحْمَتِهِ");
                Getbaca.setText("Mutirnaa bifadhlillahi wa rahmatih");
                Getarti.setText("Artinya: “Kita diberi hujan karena keutamaan dan rahmatNya.");
                break;

            case "Doa Ketika Melihat Petir":
                Getdoa.setText("Doa Ketika Melihat Petir");
                Getarab.setText("سُبْحَانَ مَنْ يُرِيْكُمُ الْبَرْقَ خَوْفًا وَطَعَمًا");
                Getbaca.setText("Subhana may yurikumul barqo khaufan wa thoma’a");
                Getarti.setText("Artinya: “Maha suci Allah yang telah melihatkan pada kita semua pada petir dengan perasaan takut dan berharap.”");
                break;

            case "Doa Ketika Mendengar Suara Petir":
                Getdoa.setText("Doa Ketika Mendengar Suara Petir");
                Getarab.setText("سُبْحَانَ مَنْ يُسَبّحُ الرَّعْدُ بِحَمْدِهِ وَالْمَلآئِكَةُ مِنْ خِيْفَتِهِ");
                Getbaca.setText("Subhana may yusabbihur ra’du bihamdihi wal malaikatu min khifatih");
                Getarti.setText("Artinya: “Maha suci Allah, yang halilintar itu bertasbih dengan memuji kepadaNya demikian juga para malaikat karena takut kepadaNya.”");
                break;

            case "Doa Saat Ada Angin Kencang":
                Getdoa.setText("Doa Saat Ada Angin Kencang");
                Getarab.setText("اللَّهُمَّ إِنِّي أَسْأَلُكَ خَيْرَهَا وَخَيْرَ مَا فِيهَا وَخَيْرَ مَا أُرْسِلَتْ بِهِ وَأَعُوذُ بِكَ مِنْ شَرِّهَا وَشَرِّ مَا فِيهَا وَشَرِّ مَا أُرْسِلَتْ بِهِ");
                Getbaca.setText("Allahumma inni as aluka khairaha wa khaira maa fiha wa khaira maa ursilat bihi wa a’udzubika min syarriha wa syarri maa fiihaa wa syarri maa ursilat bih");
                Getarti.setText("Artinya: “Ya Allah! aku memohon kepada-Mu kebaikannya (angin) dan kebaikannya apa yang ada padanya, dan kebaikan yang dibawanya dan aku berlindung kepada-Mu dari kejahatannya dan kejahatan yang ada padanya dan kejahatan yang dibawanya (angin).”");
                break;

            case "Doa Untuk Kedua Orangtua":
                Getdoa.setText("Doa Untuk Kedua Orangtua");
                Getarab.setText("اَللّٰهُمَّ اغْفِرْلِيْ وَلِوَالِدَيَّ وَارْحَمْهُمَاكَمَارَبَّيَانِيْ صَغِيْرَا");
                Getbaca.setText("Allahummaghfirlii waliwaalidayya warham humaa kamaa rabbayaa nii shaghiiraa");
                Getarti.setText("Artinya: “Ya Allah, ampunilah segala dosa-dosaku dan dosa-dosa kedua orangtuaku dan kasihanilah keduanya sebagaimana mereka merawatku ketika aku masih kecil.”");
                break;

            case "Doa Agar Diberi Keselamatan Dunia Akhirat":
                Getdoa.setText("Doa Agar Diberi Keselamatan Dunia Akhirat");
                Getarab.setText(" ِرَبَّنَا آتِنَا فِي الدُّنْيَا حَسَنَةً وَفِي الْآخِرَةِ حَسَنَةً وَقِنَا عَذَابَ النَّار");
                Getbaca.setText("Rabbana aatina fiddunya hasanah, wa fil aakhirati hasanah wa qina ‘adzaabannar");
                Getarti.setText("Artinya: “Ya Tuhan kami, berilah kami kebaikan hidup di dunia dan kebaikan hidup di akhirat dan jagalah kami dari siksa api neraka.”");
                break;

            case "Doa Ketika Marah":
                Getdoa.setText("Doa Ketika Marah");
                Getarab.setText("اَللّٰهُمَّ اغْفِرْلِىْ ذَنْبِىْ وَاذْهِبْ غَيْظَ قَلْبِىْ وَاَجِرْنِىْ مِنَ الشَّيْطَانِ");
                Getbaca.setText("Allahummaghfir lii dzambii wadzhib ghoidzho qolbii wa ajirnii minasy syaithooni");
                Getarti.setText("Artinya: “Ya Allah, ampunilah dosa-dosaku, hilangkanlah kemarahan hatiku dan selamatkanlah aku dari kejahatan syetan.”");
                break;

            case "Doa Ketika Lupa":
                Getdoa.setText("Doa Ketika Lupa");
                Getarab.setText("سُبْحَانَ مَنْ لاَيَسْهُوْ وَلاَ يَنَـامُ");
                Getbaca.setText("Subhaana man laa yas huu wa laa yanaam");
                Getarti.setText("Artinya: “Maha Suci Dzat yang tidak lupa dan tidak tidur.”");
                break;

            case "Doa Ketika Hendak Belajar":
                Getdoa.setText("Doa Ketika Hendak Belajar");
                Getarab.setText("رَبِّ زِدْنِي عِلْمًا وَارْزُقْنِيْ فَهْمًا");
                Getbaca.setText("Robbi zidnii ‘ilmaa warzuqnii fahmaa");
                Getarti.setText("Artinya: “Ya Allah, tambahkanlah aku ilmu dan berilah aku rizqi akan kepahaman.”");
                break;

            case " Doa Sesudah Belajar":
                Getdoa.setText(" Doa Sesudah Belajar");
                Getarab.setText("اَللّٰهُمَّ اِنِّى اِسْتَوْدِعُكَ مَاعَلَّمْتَنِيْهِ فَارْدُدْهُ اِلَىَّ عِنْدَ حَاجَتِىْ وَلاَ تَنْسَنِيْهِ يَارَبَّ الْعَالَمِيْنَ");
                Getbaca.setText("Allaahumma innii astaudi’uka maa ‘allamtaniihi fardud-hu ilayya ‘inda haajatii wa laa tansaniihi yaa robbal ‘alamiin");
                Getarti.setText("Artinya : “Ya Allah, sesungguhnya aku menitipkan kepada Engkau ilmu-ilmu yang telah Engkau ajarkan kepadaku, dan kembalikanlah kepadaku sewaktu aku butuh kembali dan janganlah Engkau lupakan aku kepada ilmu itu wahai Tuhan seru sekalian alam.”");
                break;

            case "Doa Naik Kendaraan":
                Getdoa.setText("Doa Naik Kendaraan");
                Getarab.setText("سُبْحَانَ الَّذِىْ سَخَّرَلَنَا هَذَا وَمَاكُنَّالَهُ مُقْرِنِيْنَ وَاِنَّآ اِلَى رَبِّنَا لَمُنْقَلِبُوْنَ");
                Getbaca.setText("Subhaanalladzii sakkhara lanaa hadza wama kunna lahu muqriniin wa-inna ilaa rabbina lamunqalibuun.");
                Getarti.setText("Artinya: “Maha Suci Tuhan yang menundukkan kendaraan ini untuk kami, padahal kami sebelumnya tidak mampu menguasainya. Dan sesungguhnya kami akan kembali kepada Tuhan kami (di hari Kiamat).”");
                break;

            case "Doa Saat Mengalami Kesulitan Agar Diberikan Kemudahan":
                Getdoa.setText("Doa Saat Mengalami Kesulitan Agar Diberikan Kemudahan");
                Getarab.setText("اللَّهُمَّ لاَ سَهْلَ إِلاَّ مَا جَعَلْتَهُ سَهْلاً وَأَنْتَ تَجْعَلُ الحَزْنَ إِذَا شِئْتَ سَهْلاً");
                Getbaca.setText("Allahumma laa sahla illa maa ja’altahu sahlan wa anta taj’alul hazna idza syi’ta sahlan");
                Getarti.setText("Artinya: “Ya Allah, tidak ada kemudahan kecuali apa yang Engkau jadikan mudah. Dan apabila Engkau berkehendak, Engkau akan menjadikan kesusahan menjadi kemudahan.”");
                break;

            case "Doa Agar Diberi Kefahaman Dalam Belajar Dan Dimudahkan Dalam Menghafal":
                Getdoa.setText("Doa Agar Diberi Kefahaman Dalam Belajar Dan Dimudahkan Dalam Menghafal");
                Getarab.setText("اَللّٰهُمَّ زِدْنَا وَلَا تَنْقُصْنَا وَأَكْرِمْنَا وَلَا تُهِنَّا وَأَعْطِنَا وَلَا تَحْرِمْنَا وَاَثِرْنَا وَلَا تُؤْثِرْ عَلَيْنَا وَارْضِنَا وَارْضَ عَنَّا");
                Getbaca.setText("Allahumma zidnaa walaa tan-qushnaa wa akrimnaa walaa tuhinna wa a’thinaa walaa tahrimnaa wa atsirnaa walaa tu’tsir ‘lainaa waardhinaa wardho ‘annaa");
                Getarti.setText("Artinya: “Ya Allah, tambahkanlah buat kami jangan Engkau kurangkan, muliakanlah kami jangan dihina, berilah buat kami jangan ditahan, pilihlah kami jangan Engkau biarkan dan ridhoilah kami dan ridhoilah pula semua usaha kami.“");
        }
    }
}

