package pbo.kuis.model;

public class MahasiswaDataView extends DataView<Mahasiswa> {
    protected String getPrimaryKey(Mahasiswa item) {
        return item.getNim();
    }
    protected String getFields() {
        return "NIM, Nama, Email, Umur";
    }
    protected Mahasiswa convertValuesTModel(String[] values) {
        String nim = values[0];
        String nama = values[1];
        String email = values[2];
        int umur = Integer.parseInt(values[3]);
        return new Mahasiswa(nim, nama, email, umur) {};
    }
    protected String[] comvertModelToValues(Mahasiswa item) {
        String[] values = new String[4];
        values[0] = item.getNim();
        values[1] = item.getNama();
        values[2] = item.getEmail();
        values[3] = String.valueOf(item.getUmur());
        return values;
    }
}
