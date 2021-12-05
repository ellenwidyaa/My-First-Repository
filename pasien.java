import java.util.Scanner;

class pasien {
    Scanner in = new Scanner(System.in);
    pasien[] arr = new pasien[100];
    pasien[] dokter1 = new pasien[100];
    pasien[] dokter2 = new pasien[100];
    pasien[] dokter3 = new pasien[100];
    Dokter d = new Dokter();
    int pointer = 0;
    int pointer1 =0;
    int pointer2 =0;
    int pointer3 =0;
    private String name;
    private int age;
    private String address;
    private String gender;
    private String keluhan;
    private String Pekerjaan;
    private int jawabDokter;

    public pasien(String name, int age, String address, String gender, String keluhan, String Pekerjaan) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.gender = gender;
        this.keluhan = keluhan;
        this.Pekerjaan = Pekerjaan;
    }
    
    public pasien() {
        
    }

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
        System.out.println("Silahkan pilih dokter yang tersedia ");
        d.showDokter();
        System.out.println("Jawaban : ");
        int jawabDokter = in.nextInt();
        switch (jawabDokter){
            case 1 :
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
                System.out.println("Pendaftaran berhasil. Silakan melakukan konsultasi dengan dokter yang dipilih");
                pasien Dokter1= new pasien(name, age, address, gender, Pekerjaan, keluhan);
                pasien Pasien = new pasien(name, age, address, gender, Pekerjaan, keluhan);
                dokter1[pointer1]=Dokter1;
                arr[pointer] = Pasien;
                pointer1++;
                pointer++;
                break;
            case 2 :
                System.out.println("Nama            : ");
                name = in.nextLine();
                System.out.println("Umur            : ");
                age = in.nextInt();
                in.nextLine();
                System.out.println("Alamat  :       : ");
                address = in.nextLine();
                System.out.println("Jenis kelamin   : ");
                gender = in.nextLine();
                System.out.println("Pekerjaan       : ");
                Pekerjaan = in.nextLine();
                System.out.println("Keluhan          : ");
                keluhan = in.nextLine();
                System.out.println("Pendaftaran berhasil. Silakan melakukan konsultasi dengan dokter yang dipilih");
                pasien Dokter2 = new pasien(name, age, address, gender, Pekerjaan, keluhan);
                pasien Pasien2 = new pasien(name, age, address, gender, Pekerjaan, keluhan);
                dokter2 [pointer2]= Dokter2;
                arr [pointer] = Pasien2;
                pointer++;
                pointer2++;
                break;
            case 3 :
                System.out.println("Nama            : ");
                name = in.nextLine();
                System.out.println("Umur            : ");
                age = in.nextInt();
                in.nextLine();
                System.out.println("Alamat          : ");
                address = in.nextLine();
                System.out.println("Jenis kelamin   : ");
                gender = in.nextLine();
                System.out.println("Pekerjaan       : ");
                Pekerjaan = in.nextLine();
                System.out.println("Keluhan          : ");
                keluhan = in.nextLine();
                System.out.println("Pendaftaran berhasil. Silakan melakukan konsultasi dengan dokter yang dipilih");
                pasien Dokter3 = new pasien(name, age, address, gender, Pekerjaan, keluhan);
                pasien Pasien3 = new pasien(name, age, address, gender, Pekerjaan, keluhan);
                dokter3 [pointer]=Dokter3;
                arr[pointer] = Pasien3;
                pointer2++;
                pointer++;
                break;
            default :
                System.out.println("Pilihan tidak tersedia");
        }

    }


    public void ListPasien() {
        System.out.println("==========LIST PASIEN===============");
        for (int i = 0; i < arr.length; i++) {
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
            System.out.println("----------------------------------------------");
        }
    }

    public void ListPasienDokter1() {
        System.out.println("==========LIST PASIEN DOKTER 1===============");
        for (int i = 0; i < dokter1.length; i++) {
            pasien Dokter1 = dokter1[i];
            if (Dokter1 == null) {
                System.out.println("==================================================");
                return;
            }
            System.out.printf("Nama Pasein %d \t\t: \t%s \n", i + 1, Dokter1.getName());
            System.out.printf("Umur Pasien %d \t\t: \t%s \n", i + 1, Dokter1.getAge());
            System.out.printf("Alamat Pasein %d \t\t: \t%s \n", i + 1, Dokter1.getAddress());
            System.out.printf("Jenis Kelamin Pasein %d \t\t: \t%s \n", i + 1, Dokter1.getGender());
            System.out.printf("Pekerjaan Pasein %d \t\t: \t%s \n", i + 1, Dokter1.getPekerjaan());
            System.out.printf("Keluhan Pasein %d \t\t: \t%s \n", i + 1, Dokter1.getKeluhan());
            System.out.println("----------------------------------------------");
        }
    }

    public void ListPasienDokter2() {
        System.out.println("==========LIST PASIEN DOKTER 2===============");
        for (int i = 0; i < dokter2.length; i++) {
            pasien Dokter2 = dokter2[i];
            if (Dokter2 == null) {
                System.out.println("==================================================");
                return;
            }
            System.out.printf("Nama Pasein %d \t\t: \t%s \n", i + 1, Dokter2.getName());
            System.out.printf("Umur Pasien %d \t\t: \t%s \n", i + 1, Dokter2.getAge());
            System.out.printf("Alamat Pasein %d \t\t: \t%s \n", i + 1, Dokter2.getAddress());
            System.out.printf("Jenis Kelamin Pasein %d \t\t: \t%s \n", i + 1, Dokter2.getGender());
            System.out.printf("Pekerjaan Pasein %d \t\t: \t%s \n", i + 1, Dokter2.getPekerjaan());
            System.out.printf("Keluhan Pasein %d \t\t: \t%s \n", i + 1, Dokter2.getKeluhan());
            System.out.println("----------------------------------------------");
        }
    }

    public void ListPasienDokter3() {
        System.out.println("==========LIST PASIEN DOKTER 3===============");
        for (int i = 0; i < dokter3.length; i++) {
            pasien Dokter3 = dokter3[i];
            if (Dokter3 == null) {
                System.out.println("==================================================");
                return;
            }
            System.out.printf("Nama Pasein %d \t\t: \t%s \n", i + 1, Dokter3.getName());
            System.out.printf("Umur Pasien %d \t\t: \t%s \n", i + 1, Dokter3.getAge());
            System.out.printf("Alamat Pasein %d \t\t: \t%s \n", i + 1, Dokter3.getAddress());
            System.out.printf("Jenis Kelamin Pasein %d \t\t: \t%s \n", i + 1, Dokter3.getGender());
            System.out.printf("Pekerjaan Pasein %d \t\t: \t%s \n", i + 1, Dokter3.getPekerjaan());
            System.out.printf("Keluhan Pasein %d \t\t: \t%s \n", i + 1, Dokter3.getKeluhan());
            System.out.println("----------------------------------------------");
        }
    }
    
    public void BiayaPerawatan() {
        int harga1;
        int harga2;
        int harga3;
        switch (getJawabDokter()) {
            case 1:
                harga1 = 150000;
                break;
            case 2:
                harga2 = 200000;
                break;
            case 3:
                harga3 = 100000;
                break;

        }
    }
    public void DaftarObat(){
        d.showObatPasien();
    }

    public void MenuPasien() {
//        Pilihan Menu
        int pilihan = 0;
        do {
            System.out.println("Pilihan Menu : ");
            System.out.println("1. Daftar");
            System.out.println("2. Biaya Perawatan");
            System.out.println("3. Daftar Obat");
            System.out.println("4. Keluar");
            System.out.print("Masukkan Pilihan Menu : ");
            pilihan = in.nextInt();
            switch (pilihan) {
                case 1:
                    daftarMandiri();
                    break;
                case 2:
                    BiayaPerawatan();
                    break;
                case 3:
                    DaftarObat();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }
        }while(pilihan !=4);
    }
}
