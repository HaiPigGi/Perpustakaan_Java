# Perpustakaan

![image](https://github.com/HaiPigGi/Perpustakaan_Java/assets/119752348/b707dabe-3058-4df1-a3dd-1394936f1ab9)

![image](https://github.com/HaiPigGi/Perpustakaan_Java/assets/119752348/42e286bc-011c-4ae4-b544-ad280a4efe26)

![image](https://github.com/HaiPigGi/Perpustakaan_Java/assets/119752348/cb864935-4b5d-44c2-bb26-5270bc727189)


Perpustakaan_Java adalah proyek Java yang mengimplementasikan aplikasi perpustakaan sederhana dengan fitur CRUD (Create, Read, Update, Delete) untuk buku dan peminjam. Proyek ini juga memiliki fitur transaksi peminjaman dan pencarian (search) untuk memudahkan pengguna dalam mencari buku.

## Fitur

- **CRUD Buku**: Pengguna dapat menambahkan, mengubah, dan menghapus informasi buku.
- **CRUD Peminjam**: Pengguna dapat menambahkan, mengubah, dan menghapus informasi peminjam.
- **Transaksi Peminjaman**: Pengguna dapat melakukan transaksi peminjaman buku oleh peminjam tertentu.
- **Pencarian (Search)**: Pengguna dapat melakukan pencarian buku berdasarkan judul, penulis, atau kategori.
- **Database Oracle**: Proyek ini menggunakan database Oracle untuk menyimpan data buku, data peminjam, dan informasi transaksi.


## Cara Menjalankan

Berikut adalah langkah-langkah untuk menjalankan proyek Perpustakaan_Java:

1. Pastikan Anda telah menginstal JDK (Java Development Kit) dan MySQL pada sistem Anda.
2. Clone repositori proyek ini ke direktori lokal Anda dengan perintah berikut:
git clone link_repositori
3. Masuk ke direktori proyek dengan perintah berikut:
```
cd Perpustakaan_Java
```
5. Ubah konfigurasi database Oracle di file `config.properties` sesuai dengan pengaturan database Anda:

```
db.url=jdbc:oracle:thin:@localhost:1521:XE
db.username=nama_pengguna
db.password=kata_sandi
```
7. Kompilasi file Java dalam proyek ini dengan perintah berikut:
```
javac -d bin src/*.java
```
9. Jalankan aplikasi menggunakan Java dengan perintah berikut:
```
java -cp bin MainApp
```
11. Aplikasi akan dijalankan dan antarmuka pengguna akan ditampilkan. Anda dapat menggunakan fitur-fitur yang tersedia di aplikasi ini.

Pastikan Anda telah mengikuti semua langkah dengan benar untuk memastikan proyek dapat berjalan dengan lancar di sistem lokal Anda.

## Kontribusi

Jika Anda ingin berkontribusi pada proyek ini, silakan ikuti langkah-langkah berikut:

1. Fork repositori ini.
2. Buatlah branch fitur baru.
3. Lakukan perubahan pada branch fitur.
4. Commit perubahan Anda.
5. Push branch ke repositori Anda.
6. Ajukan pull request ke repositori utama.

Kami sangat menghargai kontribusi Anda!

## Kontak

Jika Anda memiliki pertanyaan atau ingin berdiskusi lebih lanjut tentang proyek ini, silakan hubungi kami melalui email: [leonardobryan32@gmail.com]

Terima kasih telah menggunakan Perpustakaan_Java!
