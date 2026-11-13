package pbo.kuis.view;
import pbo.kuis.model.Ruangan;

public class RuanganDataView extends DataView<Ruangan> {
    protected String getPrimaryKey(Ruangan item) {
        return item.getId();
    }
    protected String[] getFields() {
        return new String[]{"Kode", "Nama", "Kapasitas"};
    }
    protected Ruangan convertValuesTModel(String[] values) {
        String kode = values[0];
        String nama = values[1];
        int kapasitas = Integer.parseInt(values[2]);
        return new Ruangan(kode, nama, kapasitas);
    }
    protected String[] convertModelToValues(Ruangan item) {
        String[] values = new String[3];
        values[0] = item.getId();
        values[1] = item.getNama();
        values[2] = String.valueOf(item.getKapasitas());
        return values;
    }
}
