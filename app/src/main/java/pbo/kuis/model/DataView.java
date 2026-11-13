package pbo.kuis.model;

import java.util.ArrayList;

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

    public void printAll()

    public void printByPk(String primaryKey)

    public void showInsertForm()

    public void showUpdateForm()

    public void promptDelete()

    protected abstract String getPrimaryKey(T item);

    protected abstract String getFields();

    protected abstract T convertValuesTModel(String[] values);

    protected abstract String[] comvertModelToValues(T item);
}