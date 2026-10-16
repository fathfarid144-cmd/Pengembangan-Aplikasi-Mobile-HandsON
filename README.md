# Pengembangan Aplikasi Mobile — Hands-on & Materi

Repositori ini berisi kumpulan materi perkuliahan (Slide & Modul) dan latihan kode *hands-on* untuk mata kuliah **Pengembangan Aplikasi Mobile (IF25-22017)** — Teknik Informatika, Institut Teknologi Sumatera (ITERA).

**Identitas Mahasiswa:**
- **Nama:** Muhammad Fatahillah Farid
- **NIM:** 123140203

---

## Struktur Repositori

Setiap pertemuan memiliki struktur folder yang seragam:
- `materi/` : Berisi berkas Slide Presentasi dan Modul Praktikum (.pdf).
- `latihan/` : Proyek kode hands-on Kotlin / Compose Multiplatform.

| Folder | Topik Pertemuan |
|---|---|
| `Pertemuan 01` | Pengenalan KMP dan Setup Environment |
| `Pertemuan 02` | Model Data, Coroutines, dan Flow |
| `Pertemuan 03` | Dasar Compose Multiplatform |
| `Pertemuan 04` | State Management & MVVM |
| `Pertemuan 05` | Navigasi Antar Layar |
| `Pertemuan 06` | Networking REST API dengan Ktor |
| `Pertemuan 07` | Penyimpanan Lokal dan Offline-First |
| `Pertemuan 08` | Fitur Khusus Platform |
| `Pertemuan 09` | Integrasi AI dengan Gemini |
| `Pertemuan 10` | Testing, Dependency Injection, dan Debugging |

---

## Cara Menjalankan

1. Buka folder `Pertemuan XX/latihan` sebagai proyek terpisah di **Android Studio** (`File > Open`).
2. Tunggu proses Gradle sync selesai.
3. Jalankan aplikasi via tombol ▶️ (Run) di Android Studio atau lewat terminal:
   - **Android / KMP:** `./gradlew :composeApp:installDebug` (atau `./gradlew :composeApp:run` untuk desktop)
   - **Kotlin / JVM:** `./gradlew :<nama-subproyek>:run -q`
