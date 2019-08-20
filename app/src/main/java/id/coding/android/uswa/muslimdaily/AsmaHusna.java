package id.coding.android.uswa.muslimdaily;

public class AsmaHusna {
    private  String no;

    public AsmaHusna(String no, String nama, String arti, String arab){
        this.no = no;
        this.nama = nama;
        this.arti=  arti;
        this.arab=  arab;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getArti() {
        return arti;
    }

    public void setArti(String arti) {
        this.arti = arti;
    }

    public String getArab() {
        return arab;
    }

    public void setArab(String arab) {
        this.arab = arab;
    }

    private String nama;
    private String arti;
    private String arab;

}
