package pbo.kuis.view;
import pbo.kuis.model.MataKuliah;

public class MataKuliahDataView extends DataView<MataKuliah> {
    protected String getPrimaryKey(MataKuliah item) {
        return item.getKode();
    }
    protected String[] getFields() {
        return new String[]{"Kode", "Nama", "SKS"};
    }
    protected MataKuliah convertValuesTModel(String[] values) {
        String kode = values[0];
        String nama = values[1];
        int sks = Integer.parseInt(values[2]);
        return new MataKuliah(kode, nama, sks);
    }
    protected String[] convertModelToValues(MataKuliah item) {
        String[] values = new String[3];
        values[0] = item.getKode();
        values[1] = item.getNama();
        values[2] = String.valueOf(item.getSks());
        return values;
    }
}
