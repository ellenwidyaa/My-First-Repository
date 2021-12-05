
class pasien {
    ArrayList<String> listPasien = new ArrayList<>();
    ArrayList<String> listPasienKeDokter1 = new ArrayList<>();
    ArrayList<String> listPasienKeDokter2 = new ArrayList<>();
    ArrayList<String> listPasienKeDokter3 = new ArrayList<>();
	
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
            System.out.println("Daftar Dokter yang Tersedia dan Jadwalnya : " + "\n" + lihatAdaDokter());
            System.out.println("Pilih dokter (masukkan angka)   : " + pilihan);
            switch(pilihan) {
                case 1:
                    listPasien.add("Dokter 1");
                    System.out.println("Nama      : " + nama);
                    listPasien.add("Nama      : " + nama);
		    listPasienKeDokter1.add("Nama      : " + nama);
                    System.out.println("Umur      : " + umur);
                    listPasien.add("Umur      : " + umur);
		    listPasienKeDokter1.add("Umur      : " + umur);
                    System.out.println("Pekerjaan : " + pekerjaan);
                    listPasien.add("Pekerjaan : " + pekerjaan);
		    listPasienKeDokter1.add("Pekerjaan : " + pekerjaan);
                    System.out.println("Alamat    : " + alamat);
                    listPasien.add("Alamat    : " + alamat);
		    listPasienKeDokter1.add("Alamat    : " + alamat);
                    System.out.println("Keluhan   : " + keluhan);
                    listPasien.add("Keluhan   : " + keluhan);
		    listPasienKeDokter1.add("Keluhan   : " + keluhan);
                    System.out.println("Jadwal   : " + jadwal);
                    listPasien.add("Jadwal   : " + jadwal);
		    listPasienKeDokter1.add("Jadwal   : " + jadwal);
                    break;
                case 2:
                    listPasien.add("Dokter 2");
                    System.out.println("Nama      : " + nama);
                    listPasien.add("Nama      : " + nama);
		    listPasienKeDokter2.add("Nama      : " + nama);
                    System.out.println("Umur      : " + umur);
                    listPasien.add("Umur      : " + umur);
		    listPasienKeDokter2.add("Umur      : " + umur);
                    System.out.println("Pekerjaan : " + pekerjaan);
                    listPasien.add("Pekerjaan : " + pekerjaan);
		    listPasienKeDokter2.add("Pekerjaan : " + pekerjaan);
                    System.out.println("Alamat    : " + alamat);
                    listPasien.add("Alamat    : " + alamat);
		    listPasienKeDokter2.add("Alamat    : " + alamat);
                    System.out.println("Keluhan   : " + keluhan);
                    listPasien.add("Keluhan   : " + keluhan);
		    listPasienKeDokter2.add("Keluhan   : " + keluhan);
                    System.out.println("Jadwal   : " + jadwal);
                    listPasien.add("Jadwal   : " + jadwal);
		    listPasienKeDokter2.add("Jadwal   : " + jadwal);
                    break;
                case 3:
                    listPasien.add("Dokter 3");
                    System.out.println("Nama      : " + nama);
                    listPasien.add("Nama      : " + nama);
		    listPasienKeDokter3.add("Nama      : " + nama);
                    System.out.println("Umur      : " + umur);
                    listPasien.add("Umur      : " + umur);
		    listPasienKeDokter3.add("Umur      : " + umur);
                    System.out.println("Pekerjaan : " + pekerjaan);
                    listPasien.add("Pekerjaan : " + pekerjaan);
		    listPasienKeDokter3.add("Pekerjaan : " + pekerjaan);
                    System.out.println("Alamat    : " + alamat);
                    listPasien.add("Alamat    : " + alamat);
		    listPasienKeDokter3.add("Alamat    : " + alamat);
                    System.out.println("Keluhan   : " + keluhan);
                    listPasien.add("Keluhan   : " + keluhan);
		    listPasienKeDokter3.add("Keluhan   : " + keluhan);
                    System.out.println("Jadwal   : " + jadwal);
                    listPasien.add("Jadwal   : " + jadwal);
		    listPasienKeDokter3.add("Jadwal   : " + jadwal);
                    break;
            }
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
            DaftarObat()
	    break;
        case "6":
            lihatAdaDokter();
            break;
        case "7":
            break;
        default:
            System.out.println("Pilihan tidak ada");break;
    }
}
