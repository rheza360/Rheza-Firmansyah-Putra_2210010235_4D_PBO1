package PBO;

import java.util.Scanner;
 
public class Utama {
    public static void main(String[] args) {
        Kebun kebun = new Kebun("Kebun Sayur");
        Petani petani1 = new Petani("Budi", 1);
        Petani petani2 = new Petani("Siti", 2);

        // Menambahkan tanaman
        Tanaman tanaman1 = new Tanaman("Bayam", "Sayur", 30);
        Tanaman tanaman2 = new Tanaman("Kangkung", "Sayur", 20);
        Tanaman tanaman3 = new Tanaman("Wortel", "Umbi", 50);

        kebun.tambahTanaman(tanaman1);
        kebun.tambahTanaman(tanaman2);
        kebun.tambahTanaman(tanaman3);

        // Menambahkan petani
        kebun.tambahPetani(petani1);
        kebun.tambahPetani(petani2);

        // Input/Output sederhana
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Panen Tanaman");
            System.out.println("2. Tandai Tanaman Siap Panen");
            System.out.println("3. Keluar");
            System.out.print("Pilih opsi: ");
            int opsi = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline

            if (opsi == 1) {
                try {
                    System.out.print("Masukkan ID Petani: ");
                    int idPetani = scanner.nextInt();
                    scanner.nextLine(); // Konsumsi newline
                    System.out.print("Masukkan Nama Tanaman: ");
                    String namaTanaman = scanner.nextLine();
                    kebun.panenTanaman(idPetani, namaTanaman);
                } catch (Exception e) {
                    System.out.println("Kesalahan: " + e.getMessage());
                }
            } else if (opsi == 2) {
                try {
                    System.out.print("Masukkan Nama Tanaman: ");
                    String namaTanaman = scanner.nextLine();
                    Tanaman tanaman = kebun.cariTanamanBerdasarkanNama(namaTanaman);
                    if (tanaman != null) {
                        tanaman.tandaiSiapPanen();
                        System.out.println("Tanaman " + namaTanaman + " siap panen!");
                    } else {
                        System.out.println("Tanaman tidak ditemukan!");
                    }
                } catch (Exception e) {
                    System.out.println("Kesalahan: " + e.getMessage());
                }
            } else if (opsi == 3) {
                System.out.print("Keluar.....");
                break;
            } else {
                System.out.println("Opsi tidak valid!");
            }
        }
        scanner.close();
    }
}
