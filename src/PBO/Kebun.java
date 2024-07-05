package PBO;

import java.util.ArrayList;

class Kebun {
    private final String Nama;
    private final ArrayList<Tanaman> tanaman;
    private final ArrayList<Petani> petani;

    public Kebun(String Nama) {
        this.Nama = Nama;
        this.tanaman = new ArrayList<>();
        this.petani = new ArrayList<>();
    }

    public void tambahTanaman(Tanaman tanaman) {
        this.tanaman.add(tanaman);
    }

    public void tambahPetani(Petani petani) {
        this.petani.add(petani);
    }

    public Tanaman cariTanamanBerdasarkanNama(String nama) {
        for (Tanaman tanaman : this.tanaman) {
            if (tanaman.getNama().equalsIgnoreCase(nama)) {
                return tanaman;
            }
        }
        return null;
    }

    public Petani cariPetaniBerdasarkanId(int id) {
        for (Petani petani : this.petani) {
            if (petani.getId() == id) {
                return petani;
            }
        }
        return null;
    }

    public void panenTanaman(int idPetani, String namaTanaman) {
        Petani petani = cariPetaniBerdasarkanId(idPetani);
        Tanaman tanaman = cariTanamanBerdasarkanNama(namaTanaman);
        if (petani != null && tanaman != null && tanaman.isSiapPanen()) {
            tanaman.setSiapPanen(false);
            petani.hapusTanaman(tanaman);
            System.out.println("Panen berhasil dilakukan!");
        } else {
            System.out.println("Tanaman tidak bisa dipanen!");
        }
    }
}
