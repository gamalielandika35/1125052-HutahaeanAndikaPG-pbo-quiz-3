package pbo.kuis.model;

public abstract class MataKuliah{
    private String kode;
    private String nama;    
    private int jumlahsks;
    private int semester;

    public MataKuliah(String kode, String nama, int jumlahsks,  int semester) {
        this.kode = kode;
        this.nama = nama;
        this.jumlahsks = jumlahsks;
        this.semester = semester;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJumlahsks() {
        return jumlahsks;
    }

    public void setJumlahsks(int jumlahsks) {
        this.jumlahsks = jumlahsks;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
    
}

