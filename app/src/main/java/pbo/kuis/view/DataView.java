package pbo.kuis.view;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class DataView<T>{
    private ArrayList<T> items;

    public DataView() {
        items = new ArrayList<T>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public ArrayList<T> getItems() {
        return items;
    }

    public void setItems(ArrayList<T> items) {
        this.items = items;
    }

    public void printAll(){
        String[] fields = this.getFields();
        for (int i = 0; i < this.items.size(); i++) {
            T item = this.items.get(i);
            String[] values = this.comvertModelToValues(item);
            for (int j = 0; j < fields.length; j++) {
                System.out.println(fields[j] + ": " + values[j]);
            }
            System.out.println();
        }
    }

    public void printByPk(String primaryKey) {
        for (int i = 0; i < this.items.size(); i++) {
            T item = this.items.get(i);
            if (this.getPrimaryKey(item).equals(primaryKey)) {
                String[] values = this.comvertModelToValues(item);
                String[] fields = this.getFields();
                for (int j = 0; j < fields.length; j++) {
                    System.out.println(fields[j] + ": " + values[j]);
                }
                break;
            }
        }
    }

    public void showInsertForm(){
        String[] fields = this.getFields();
        String[] values = new String[fields.length];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < fields.length; i++) {
            System.out.println(fields[i] + ": ");
            values[i] = scanner.nextLine();
        }
        T newItem = this.convertValuesTModel(values);
        this.addItem(newItem);
    }

    public void showUpdateForm() {
        String[] fields = this.getFields();
        String[] values = new String[fields.length];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan " + fields[0] + " yang ingin diupdate: ");
        String primaryKey = scanner.nextLine();
        for (int i = 0; i < this.items.size(); i++) {
            T item = this.items.get(i);
            if (this.getPrimaryKey(item).equals(primaryKey)) {
                for (int j = 0; j < fields.length; j++) {
                    System.out.println(fields[j] + " (" + this.comvertModelToValues(item)[j] + "): ");
                    values[j] = scanner.nextLine();
                    if (values[j].isEmpty()) {
                        values[j] = this.comvertModelToValues(item)[j];
                    }
                }
                T updatedItem = this.convertValuesTModel(values);
                this.items.set(i, updatedItem);
                System.out.println("Item dengan " + fields[0] + " " + primaryKey + " telah diupdate.");
                return;
            }
        }
        System.out.println("Item dengan " + fields[0] + " " + primaryKey + " tidak ditemukan.");
    }

    public void promptDelete(){
        String[] fields = this.getFields();
        System.out.println("Masukkan " + fields[0] + " yang ingin dihapus: ");
        Scanner scanner = new Scanner(System.in);
        String primaryKey = scanner.nextLine();
        for (int i = 0; i < this.items.size(); i++) {
            T item = this.items.get(i);
            if (this.getPrimaryKey(item).equals(primaryKey)) {
                this.items.remove(i);
                System.out.println("Item dengan " + fields[0] + " " + primaryKey + " telah dihapus.");
                return;
            }
        }
        System.out.println("Item dengan " + fields[0] + " " + primaryKey + " tidak ditemukan.");
    }
    protected abstract String getPrimaryKey(T item);

    protected abstract String[] getFields();

    protected abstract T convertValuesTModel(String[] values);

    protected abstract String[] comvertModelToValues(T item);
}