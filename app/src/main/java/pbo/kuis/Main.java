package pbo.kuis;
import java.util.Scanner;
import pbo.kuis.model.MahasiswaDataView;

public class Main {
    public static void main(String[] args) {
        MahasiswaDataView mahasiswaDataView = new MahasiswaDataView();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("=== PILIH MENU ===");
            System.out.println("1. Mahasiswa");
            System.out.println("2. Exit");
            System.out.print("Pilih menu: ");
            int menuChoice = scanner.nextInt();
            scanner.nextLine();

            switch (menuChoice) {
                case 1:
                    boolean backToMainMenu = false;
                    while (!backToMainMenu) {
                        System.out.println("=== PILIH AKSI ===");
                        System.out.println("1. Tampilkan semua data");
                        System.out.println("2. Cari satu data");
                        System.out.println("3. Tambah data");
                        System.out.println("4. Ubah data");
                        System.out.println("5. Delete data");
                        System.out.println("6. Kembali ke menu utama");
                        System.out.print("Pilih aksi: ");
                        int actionChoice = scanner.nextInt();
                        scanner.nextLine();

                        switch (actionChoice) {
                            case 1:
                                mahasiswaDataView.printAll();
                                break;
                            case 2:
                                System.out.print("Masukkan NIM untuk mencari: ");
                                String nimsearch = scanner.nextLine();
                                mahasiswaDataView.printByPk(nimsearch);
                                break;
                            case 3:
                                mahasiswaDataView.showInsertForm();
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                            case 6:
                                backToMainMenu = true;
                                break;
                            default:
                                System.out.println("Pilihan tidak valid.");
                        }
                    }
                    break;
                case 2:
                    exit = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
