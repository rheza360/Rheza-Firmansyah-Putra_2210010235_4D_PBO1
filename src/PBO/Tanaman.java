package PBO;

class Tanaman {
    private final String nama;
    private final String jenis;
    private final int usia;
    private boolean siapPanen;

    public Tanaman(String nama, String jenis, int usia) {
        this.nama = nama;
        this.jenis = jenis;
        this.usia = usia;
        this.siapPanen = false;
    }

    public String getNama() {
        return nama;
    }

    public String getJenis() {
        return jenis;
    }

    public int getUsia() {
        return usia;
    }

    public boolean isSiapPanen() {
        return siapPanen;
    }

    public void setSiapPanen(boolean siapPanen) {
        this.siapPanen = siapPanen;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + ", Jenis: " + jenis + ", Usia: " + usia + " hari, Siap Panen: " + siapPanen;
    }
    
    public void tandaiSiapPanen() {
    this.siapPanen = true;
    }
}
