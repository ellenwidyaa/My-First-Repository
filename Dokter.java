/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rumah.sakit.pkg2;
import java.util.*;

class Dokter {
    public Dokter[] arr = new Dokter[3];
    int pointer = 0;
    Scanner sc = new Scanner(System.in);
    private String nama; 
    private String day; 
    private String jam; 
    private String spesialis;
    
    public Dokter(String nama, String day, String jam, String spesialis)
    {
        this.nama = nama;
        this.day = day;
        this.jam = jam;
        this.spesialis=spesialis;
    }
    
    public Dokter() {
        
    }
    
    public void setNama (String nama) {
        this.nama = nama;
    }
    
    public String getNama () {
        return nama;
    }
    
    public void setDay (String day) {
        this.day = day;
    }
    
    public String getDay () {
        return day;
    }
    
    public void setJam (String jam) {
        this.jam = jam;
    }
    
    public String getJam () {
        return jam;
    }
    
    public void setSpesialis(String spesialis) {
        this.spesialis= spesialis;
    }
    
    public String getSpesialis () {
        return spesialis;
    }
    
    public void inputData() {
        System.out.print("Masukkan nama Anda : ");
        nama = sc.nextLine();
        System.out.print("Masukkan hari kerja Anda : ");
        day = sc.nextLine();
        System.out.print("Masukkan jam kerja Anda : ");
        jam = sc.nextLine();
        System.out.print("Masukkan spesialis Anda : ");
        spesialis = sc.nextLine();
        Dokter dokter = new Dokter(nama, day, jam, spesialis);
        arr[pointer] = dokter;
        pointer++;
    }
    
    public void showObat () {
        
    }
    
    public void listPasien() {
        
    }
    
    public void showDokter() {
        System.out.println("==================================================");
        for (int i = 0; i < arr.length; i++) {
            Dokter dokter = arr[i];
            if (dokter == null) {
                System.out.println("==================================================");
                return;
            }
            System.out.printf("Nama dokter %d \t\t: \t%s \n", i + 1, dokter.getNama());
            System.out.printf("Hari dokter praktik %d \t: \t%s \n", i + 1, dokter.getDay());
            System.out.printf("Jam dokter praktik %d \t: \t%s \n", i + 1, dokter.getJam());
            System.out.printf("Spesialisasi dokter %d \t: \t%s \n", i + 1, dokter.getSpesialis());
            System.out.println("----------------------------------------------");
        }
    }
    
    public void kontrolPasien () {
        
    }
    
    public void obatPasien() {
        
    }
    
    public void methodDokter() {
        int pilih = 0;
        do{
            System.out.println("Apa yang ingin Anda lakukan?");
            System.out.println("Pilihan : ");
            System.out.println("1. Memasukkan data Anda");
            System.out.println("2. Daftar Pasien");
            System.out.println("3. Lihat list Obat");
            System.out.println("4. Memasukkan jadwal kontrol pasien");
            System.out.println("5. Melihat daftar obat yang diberikan kepada pasien");
            System.out.println("6. Keluar");
            System.out.print("Masukkan Pilihan Menu : ");
            pilih = sc.nextInt();
                    sc.nextLine();
            
            switch (pilih){
                case 1: inputData(); break;
                case 2: listPasien(); break;
                case 3: showObat (); break;
                case 4: kontrolPasien(); break;
                case 5: obatPasien(); break;
                case 6: break;
                default: System.out.println("Pilihan menu tidak ada!\n");
            }
        }
        while (pilih != 6);  
    }
    }
