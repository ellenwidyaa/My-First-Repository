
class pasien {
    ArrayList<String> listPasien = new ArrayList<>();
    static Scanner in = new Scanner(System.in);

    //        input data pasien
    String nama, id_member, jenis_kelamin, umur, pekerjaan;

    public void JadwalKontrol(){}
    
    public void JadwalDokter(){}
    public void BiayaPerawatan(){
       int harga1,harga2,harga3;

        switch(noDokter) {
            case 1:
                harga1 = 150000;
                System.out.println("Biaya perawatan : " + harga1);
                break;
            case 2:
                harga1 = 200000;
                System.out.println("Biaya perawatan : " + harga2);
                break;
            case 3:
                harga1 = 100000;
                System.out.println("Biaya perawatan : " + harga3);
                break;
       }
  
    }
    public void DaftarObat(){}
    //lihat ketersediaan dokter
    void lihatAdaDokter() {
        for (int i = 0; i < listDokter.length; i++) {
            if (listDokter.getStatus().contains("Ada")) {
                System.out.println(listDokter[i]);
            } else {
                System.out.println("Tidak ada dokter yang sedang kosong.");
            }
        }
    }

    //daftar mandiri
    public void daftarMandiri() {
        boolean jalan = true;
        String nama = in.nextLine();
        String umur = in.nextLine();
        String pekerjaan = in.nextLine();
        String keluhan = in.nextLine();
        String alamat = in.nextLine();
        String jadwal = in.nextLine();
        int pilihan = in.nextLine();

        while(jalan) {
            System.out.println("-----Daftar disini-----");
            System.out.println("Nama      : " + nama);
            listPasien.add("Nama      : " + nama);
            System.out.println("Umur      : " + umur);
            listPasien.add("Umur      : " + umur);
            System.out.println("Pekerjaan : " + pekerjaan);
            listPasien.add("Pekerjaan : " + pekerjaan);
            System.out.println("Alamat    : " + alamat);
            listPasien.add("Alamat    : " + alamat);
            System.out.println("Keluhan   : " + keluhan);
            listPasien.add("Keluhan   : " + keluhan);
            System.out.println("Daftar Dokter yang Tersedia dan Jadwalnya : " + "\n" + lihatAdaDokter());
            System.out.println("Pilih dokter (masukkan angka)   : " + pilihan);
            switch(pilihan) {
                case 1:
                    listPasien.add("Dokter      : xxx" + "\n" + "Spesialis      : xxx");
                    break;
                case 2:
                    listPasien.add("Dokter      : xxx" + "\n" + "Spesialis      : xxx");
                    break;
                case 3:
                    listPasien.add("Dokter      : xxx" + "\n" + "Spesialis      : xxx");
                    break;
            }
            System.out.println("Jadwal   : " + jadwal);
            listPasien.add("Jadwal   : " + jadwal);

            System.out.println("Pendaftaran berhasil. Silakan beralih ke menu pembayaran.");
            jalan = false;
        }
    }
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
	System.out.println("7. Keluar");
        System.out.print("Masukkan Pilihan Menu : ");
    String pilihan = in.nextLine();
            switch(pilihan) {
        case "1":
            daftarMandiri();
            break;
        case "2":
            JadwalKontrol();
            break;
        case "3":
            JadwalDokter();
            break;
        case "4":
            BiayaPerawatan();
            break;
        case "5":
            DaftarObat()break;
        case "6":
            lihatAdaDokter();break;
        case "7": break;
        default:
            System.out.println("Pilihan tidak ada");break;
    }
}
