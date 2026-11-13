package pbo.kuis.model;

public abstract class Ruangan{
    private String id;
    private String nama;    
    private int lokasilantai;
    private int kapasitas;

    public Ruangan(String id, String nama, int lokasilantai, int kapasitas) {
        this.id = id;
        this.nama = nama;
        this.lokasilantai = lokasilantai;
        this.kapasitas = kapasitas;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getLokasilantai() {
        return lokasilantai;
    }

    public void setLokasilantai(int lokasilantai) {
        this.lokasilantai = lokasilantai;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }
    
}

