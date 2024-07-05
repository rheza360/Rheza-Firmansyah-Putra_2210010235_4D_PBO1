# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi Program ini dirancang untuk mengelola kebun sayur, termasuk tanaman & menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama sayur & Id, dan memberikan output berupa informasi Tanaman apa saja yang siap/tidak di panen.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, yaitu: Orang, Petani, Tanaman, Kebun, dan Main. adalah contoh dari class.

```bash
abstract class Orang {
    ...
}

class Petani extends Orang {
    ...
}

class Tanaman {
    ...
}

class Kebun {
    ...
}

class Utama {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `super(nama, idPetani);
        this.daftarTanaman = new ArrayList<>();` adalah contoh pembuatan object.

```bash
class Petani extends Orang {
    private ArrayList<Tanaman> daftarTanaman;

    public Petani(String nama, int idPetani) {
        super(nama, idPetani);
        this.daftarTanaman = new ArrayList<>();
    }
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` `jenis` `usia` dan `siapPanen` adalah contoh atribut.

```bash
class Tanaman {
    private String nama;
    private String jenis;
    private int usia;
    private boolean siapPanen;

    public Tanaman(String nama, String jenis, int usia) {
        this.nama = nama;
        this.jenis = jenis;
        this.usia = usia;
        this.siapPanen = false;
    }
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Tanaman` `Kebun` 'orang' .

```bash
  public tanaman(String tanggal, int jumlah, Tanaman tanaman) {
        this.tanggal = tanggal;
    }
  
  public Orang(String nama, int id) {
        this.nama = nama;
        this.id = id;
  }

  public Kebun(String Nama) {
        this.Nama = Nama;
  }

```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setSiapPanen' adalah contoh method mutator.

```bash
class Tanaman {
    private String nama;
    private String jenis;
    private int usia;
    private boolean siapPanen;

    public void setSiapPanen(boolean siapPanen) {
        this.siapPanen = siapPanen;
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getJenis`, `getSiapPanen`,  adalah contoh method accessor.

```bash
    public String getNama() {
        return nama;
    }

    public String getJenis() {
        return Jenis;
    }

    public int getUsia() {
        return usia;
    }

```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `id` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private String id;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `Petani` mewarisi `Orang` dengan sintaks `extends`.

```bash
class Petani extends Orang {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini,@Override
    public String toString()  merupakan override

```bash
 @Override
    public String toString() {
        return super.toString() + ", Daftar Tanaman: " + daftarTanaman;
    }
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `namaTanaman`.

```bash
// Example of selection
if (opsi == 1) {
    // melakukan aksi
} else if (opsi == 2) {
    // melakukan aksi lain
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (Tanaman tanaman : kebun.getTanaman()) {
    System.out.println(tanaman.getNama());
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan nama tanaman: ");
String namaTanaman = scanner.nextLine();
System.out.println("Tanaman yang dimasukkan: " + namaTanaman);
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `Tanaman[] tanamanArray = new Tanaman[5];` adalah contoh penggunaan array.

```bash
Tanaman[] tanamanArray = new Tanaman[5];
tanamanArray[0] = new Tanaman("Bayam", "Sayur", 30);
tanamanArray[1] = new Tanaman("Kangkung", "Sayur", 20);
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Rheza Firmansyah Putra
NPM: 2210010235
