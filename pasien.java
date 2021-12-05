class pasien {
    static Scanner in = new Scanner(System.in);
    pasien[]arr= new pasien[100];
    int pointer=0;
    private String name;
    private int age;
    private String address;
    private String gender;
    private String keluhan;
    private String Pekerjaan;
    private int jawabDokter;

    public int getAge() {
        return age;
    }

    public int getJawabDokter() {
        return jawabDokter;
    }

    public void setJawabDokter(int jawabDokter) {
        this.jawabDokter = jawabDokter;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public String getKeluhan() {
        return keluhan;
    }

    public String getPekerjaan() {
        return Pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        Pekerjaan = pekerjaan;
    }

    public void setKeluhan(String keluhan) {
        this.keluhan = keluhan;
    }

    public void setAddress(String address) {
        this.address = address;
    }



 public void daftarMandiri() {
        System.out.println("=======DAFTAR PASIEN============");
        System.out.println("Nama            : ");
        String name = in.nextLine();
        System.out.println("Umur            : ");
        int age = in.nextInt();
        in.nextLine();
        System.out.println("Alamat  :       : ");
        String address = in.nextLine();
        System.out.println("Jenis kelamin   : ");
        String gender = in.nextLine();
        System.out.println("Pekerjaan       : ");
        String Pekerjaan = in.nextLine();
        System.out.println("Keluhan          : ");
        String keluhan = in.nextLine();
        System.out.println("Silahkan pilih dokter yang tersedia ");
//      panggil method list dokter
        System.out.println("Jawaban : ");
        int jawabDokter = in.nextInt();
        System.out.println("Pendaftaran berhasil. Silakan melakukan konsultasi dengan dokter yang dipilih");
        pasien Pasien = new pasien(name,age,address,gender,Pekerjaan,keluhan,jawabDokter);
        arr[pointer]=pasien;
        pointer++;
        }


    public void ListPasien() {
        System.out.println(=========="LIST PASIEN===============");
    for(int i = 0; i < arr.length;i++) {
        pasien Pasien = arr[i];
        if (Pasien == null) {
            System.out.println("==================================================");
            return;
        }
        System.out.printf("Nama Pasein %d \t\t: \t%s \n", i + 1, Pasien.getName());
        System.out.printf("Umur Pasien %d \t\t: \t%s \n", i + 1, Pasien.getAge());
        System.out.printf("Alamat Pasein %d \t\t: \t%s \n", i + 1, Pasien.getAddress());
        System.out.printf("Jenis Kelamin Pasein %d \t\t: \t%s \n", i + 1, Pasien.getGender());
        System.out.printf("Pekerjaan Pasein %d \t\t: \t%s \n", i + 1, Pasien.getPekerjaan());
        System.out.printf("Keluhan Pasein %d \t\t: \t%s \n", i + 1, Pasien.getKeluhan());
        System.out.printf("Dokter pilihan Pasein %d \t\t: \t%s \n", i + 1, Pasien.getJawabDokter());
        System.out.println("----------------------------------------------");
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
