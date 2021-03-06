class Dokter {
    Dokter[] arr = new Dokter[3];
    int pointer = 0;
    Scanner sc = new Scanner(System.in);
    private String nama; 
    private String day; 
    private String jam; 
    
    public Dokter(String nama, String day, String jam)
    {
        this.nama = nama;
        this.day = day;
        this.jam = jam;
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
    
    public void inputData() {
        System.out.print("Masukkan nama Anda : ");
        String nama = sc.nextLine();
        System.out.print("Masukkan hari kerja Anda : ");
        String day = sc.nextLine();
        System.out.print("Masukkan jam kerja Anda : ");
        String jam = sc.nextLine();
        Dokter dokter = new Dokter(nama, day, jam);
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
            System.out.println("----------------------------------------------");
        }
    }
    
    public void kontrolPasien () {
        
    }
}


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
       public void listPasien(){
        System.out.println(listPasien);
    }
	
       System.out.println("========LOGIN========");
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
class Admin {
    
    Admin() {
    }
    
    String lihatDokter() {
        for (int i = 0; i < listDokter.length; i++) {
            System.out.println(listDokter[i]);
        }
        
        return "";
}
    String lihatPasien() {
        for (int i = 0; i < listPasien.length; i++) {
            System.out.println(listPasien[i]);
        }

        return "";
}
}

class Drug{
	private String name;
	private String noSerial;
	private String category;
	private int stock;
	
	public Drug() {
	}
	public Drug(String name, String noSerial, String category, int stock) {
		this.name = name;
		this.noSerial = noSerial;
		this.category = category;
		this.stock = stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getName() {
		return name;
	}
	public String getNoSerial() {
		return noSerial;
	}
	public String getCategory() {
		return category;
	}
	public int getStock() {
		return stock;
	}
}

class Patient{
	private String name;
	private int age;
	private String address;
	private String gender;
	private Drug [] drug;
	
	
	public Patient() {
	}
	public Patient(String name, int age, String address, String gender) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.gender = gender;
		this.drug = new Drug[3];
	}
	public void setDrug(Drug drug) {
		for(int i = 0; i < this.drug.length;i++) {
			if(this.drug[i] == null) {
				this.drug[i] = drug;
				break;
			}
		}
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getAddress() {
		return address;
	}
	public String getGender() {
		return gender;
	}
	public Drug[] getDrug() {
		return drug;
	}
	public Drug getDrugFromArray(int i) {
		if(drug[i] == null) {
			return null;
		}
		return drug[i];
	}
}

public class apoteker {
	static int increasePatient = 1;
	static int increaseDrug = 1;
	static Patient[]patient = new Patient[0];
	static Drug[]drug = new Drug[0];
	static Scanner scan;
	public static void main(String args[]) {
		scan = new Scanner(System.in);
		menu();
	}
	static void menu() {
		System.out.println("Menu Klinik Kita Bersama");
		System.out.println("Pilihan : ");
		System.out.println("1. Daftar Pasien");
		System.out.println("2. Tambah Obat");
		System.out.println("3. Daftar Obat");
		System.out.println("4. Obat yang akan diberikan ke pasien");
		System.out.println("5. Daftar Obat yang telah diberikan ke pasien");
		System.out.println("6. Obat yang stocknya telah habis");
		System.out.println("7. Keluar");
		System.out.print("Masukkan Pilihan Menu : ");
		String pilihan = scan.nextLine();
		switch(pilihan) {
			case "1": daftarPasien(); break;
			case "2": tambahObat(); break;
			case "3": daftarObat(); break;
			case "4": obatPasien(); break;
			case "5": daftarObatPasien(); break;
			case "6": obatStockHabis(); break;
			case "7": break;
			default: System.out.println("Pilihan tidak ada"); break;
		}
	}

	static void daftarPasien() {
		lihatPasien()
		}
		menu();
	}
	static void tambahObat() {
		Drug[]obat = new Drug[increaseDrug];
		System.arraycopy(drug, 0, obat, 0, drug.length);
		System.out.println("Masukkan nama obat       : ");
		String name = scan.nextLine();
		System.out.println("Masukkan nomor seri obat : ");
		String no = scan.nextLine();
		System.out.println("Masukkan kategori obat   : ");
		String category = scan.nextLine();
		System.out.println("Masukkan stock obat      : ");
		int stock = scan.nextInt();
		scan.nextLine();
		Drug d = new Drug(name,no,category,stock);
		obat[obat.length-1] = d;
		drug = obat;
		increaseDrug++;
		menu();
	}
	static void daftarObat() {
            for (int i = 0; i < drug.length; i++) {
                if (drug[i] == null) {
                    return;
                }
                System.out.printf("Nama Obat ke-%d \t\t: %s \n", i + 1, drug[i].getName());
                System.out.printf("Nomor Seri Obat ke-%d \t: %s \n", i + 1, drug[i].getNoSerial());
                System.out.printf("Kategori Obat ke-%d \t: %s \n", i + 1, drug[i].getCategory());
                System.out.printf("Stock Obat ke-%d \t: %s \n", i + 1, drug[i].getStock());
            }
            menu();
	}
	static void obatPasien() {
		System.out.println("Nama pasien yang ingin diberi obat : ");
		String name = scan.nextLine();
		System.out.println("Nomer Seri obat yang ingin diberikan : ");
		String serial = scan.nextLine();
		for(Patient p : patient) {
			if(name.equalsIgnoreCase(p.getName())) {
				for(Drug d : drug) {
					if(serial.equals(d.getNoSerial())) {
						p.setDrug(d);
						d.setStock(d.getStock()-1);
					}
				}
			}
		}
		menu();
	}
	static void daftarObatPasien() {
		System.out.println("Nama pasien yang ingin diperiksa obatnya : ");
		String name = scan.nextLine();
		for(Patient p : patient) {
			if(name.equalsIgnoreCase(p.getName())) {
				for(int i = 0; i < p.getDrug().length;i++) {
					if(p.getDrugFromArray(i) == null) {
						break;
					}else {
						System.out.println("Nama obat ke-"+(i+1)+" pasien : "
								+p.getDrugFromArray(i).getName());
						System.out.println("Nomor Serial obat ke-"+(i+1)+" pasien : "
								+p.getDrugFromArray(i).getNoSerial());
						System.out.println("Kategori obat ke-"+(i+1)+" pasien : "
								+p.getDrugFromArray(i).getCategory());
						System.out.println("Stok obat ke-"+(i+1)+" pasien : "
								+p.getDrugFromArray(i).getStock());
					}
				}
			}
		}
		menu();
	}
	static void obatStockHabis() {
		int looping = 1;
		for(Drug d : drug) {
			if(d.getStock() == 0) {
				System.out.println("Nama obat yang stock habis ke-"+1+" : "+d.getName());
				System.out.println("Nomor Seri obat yang stock habis ke-"+1+" : "+d.getNoSerial());
				System.out.println("Kategori yang stock habis ke-"+1+" : "+d.getCategory());
			}
		}
		menu();
	}
}

public class keuang {
    String[] karyawan = new String[2];
    LinkedList masuk = new LinkedList();
    LinkedList keluar = new LinkedList();
    Scanner in = new Scanner(System.in);
    Pasien p = new Pasien();
    public static void pembayaran(){   
        System.out.println("Biaya yang harus dibayar sebesar: ");
        p.BiayaPerawatan();
        do{
        System.out.println("Pilihan Menu : ");
        System.out.println("1. Pembayaran Masuk");
        System.out.println("2. Pembayaran keluar");
        String pilih = in.next();
        switch (in.next()){
            case "1":
                System.out.print("Jumlah yang dibayarkan: ");
                masuk.add(in.nextInt());
                break;
            case "2":
                System.out.print("Jumlah yang dibayarkan: ");
                keluar.add(in.nextInt()); 
                break; 
            default:
                break;
        }System.out.print("Ingin melakukan transaksi(ya/tidak)? ");
        }while(in.next().matches("ya"));
    }
    public static void print(){System.out.println("List pembayaran masuk: ");
        masuk.tampil();
        System.out.println("List pembayaran keluar: ");
        keluar.tampil();        
    }
}
class Node{
    int data;
    Node next;
}
class LinkedList{
     Node head;
    public void input(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        
        if(head==null){
            head = node;
        }else{
            Node n = head;
            while(n.next!=null){
                n = n.next;
            }
            n.next = node;
        }
    }
    public void tampil(){
        Node node = head;
        while(node.next!=null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
}

    public static void main(String[] args) {
        String dokter, pasien, apoteker, admin, keuangan;
        int jawab;
        System.out.println("=========SELAMAT DATANG DI KLINIK BEN MARI");
        System.out.println("Siapakah Anda ?");
        System.out.println("1. Dokter");
        System.out.println("2. Apoteker");
        System.out.println("3. Pasien");
        System.out.println("4. Administrasi");
        System.out.println("5. Bagian Keuangan");
        System.out.println("6. Keluar");
        System.out.print("Jawaban (mohon dijawab dengan angka) : ");
        jawab : in.nextInt();
        switch (jawab){
            case 1: break;
            case 2: break;
            case 3: break;
            case 4: break;
            case 5 : break;
            case 6 :
                System.out.println("=====TERIMA KASIH ATAS KUNJUNGANNYA======");break;
            default :
                System.out.println("Pilihan tidak ada");break
                
        }


    }
