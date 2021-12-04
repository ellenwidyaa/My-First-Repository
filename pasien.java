//RENA
import java.util.*;
public class pasien {
    static Scanner in = new Scanner(System.in);
//        input data pasien
        String nama, id_member, jenis_kelamin, umur, pekerjaan;
        System.out.println("========DATA PASIEN========");
        System.out.print("Nama              : ");
        nama = in.nextLine();
        System.out.print("Id Pasien         : ");
        id_member = in.nextLine();
//        Pilihan Menu
        System.out.println("Pilihan Menu : ");
        System.out.println("1. Daftar");
        System.out.println("2. Jadwal Kontrol");
        System.out.println("3. Jadwal Dokter");
        System.out.println("4. Biaya Perawatan");
        System.out.println("5. Daftar Obat");
        System.out.println("6. Status Ketersediaan Dokter");
        System.out.println("7. Dokter yang Dapat Dikunjungi");
        System.out.print("Masukkan Pilihan Menu : ");
        String pilihan = in.nextLine();
            switch(pilihan) {
            case "1":
                daftar();
                break;
            case "2":
                JadwalKontrol();
                break;
            case "3":
                JadwalDokter();
                break;
            case "4":
                BiayaPerawatan;
                break;
            case "5":
                DaftarObat()
                break;
            case "6":
                StatusDokter();
                break;
            case "7":
                DokAvailable();
                break;
            default:
                System.out.println("Pilihan tidak ada");
                break;
        }
    }
    }
    
        
//SHELLEN
