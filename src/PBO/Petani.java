package PBO;

import java.util.ArrayList;

// Class Petani yang mewarisi Orang
class Petani extends Orang {
    private ArrayList<Tanaman> daftarTanaman;

    public Petani(String nama, int idPetani) {
        super(nama, idPetani);
        this.daftarTanaman = new ArrayList<>();
    }

    public ArrayList<Tanaman> getDaftarTanaman() {
        return daftarTanaman;
    }

    public void tambahTanaman(Tanaman tanaman) {
        daftarTanaman.add(tanaman);
    }

    public void hapusTanaman(Tanaman tanaman) {
        daftarTanaman.remove(tanaman);
    }

    @Override
    public String toString() {
        return super.toString() + ", Daftar Tanaman: " + daftarTanaman;
    }
}


