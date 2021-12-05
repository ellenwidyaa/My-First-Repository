import java.util.Scanner;

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

class apoteker {
	static int increasePatient = 1;
	static int increaseDrug = 1;
	static Drug[]drug = new Drug[0];
	static Scanner scan;
        static Dokter d = new Dokter();
	public static void main(String args[]) {
		scan = new Scanner(System.in);
		menu();
	}
	static void menu() {
		System.out.println("Menu Klinik Bersama");
		System.out.println("Pilihan : ");
		System.out.println("1. Tambah Obat");
		System.out.println("2. Daftar Obat");
		System.out.println("3. Obat yang diberikan ke pasien");
                System.out.println("4. Obat yang stocknya telah habis");
		System.out.println("5. Keluar");
		System.out.print("Masukkan Pilihan Menu : ");
		String pilihan = scan.nextLine();
		switch(pilihan) {
			case "1": tambahObat(); break;
			case "2": daftarObat(); break;
			case "3": obatPasien(); break;
                        case "4": obatStockHabis(); break;
			case "5": break;
			default: System.out.println("Pilihan tidak ada"); break;
		}
	}
	
        static void tambahObat() {
		Drug[]obat = new Drug[increaseDrug];
		System.arraycopy(drug, 0, obat, 0, drug.length);
		System.out.println("Masukkan nama obat : ");
		String name = scan.nextLine();
		System.out.println("Masukkan nomor seri obat : ");
		String no = scan.nextLine();
		System.out.println("Masukkan kategori obat : ");
		String category = scan.nextLine();
		System.out.println("Masukkan stock obat : ");
		int stock = scan.nextInt();
                            scan.nextLine();
                            System.out.println("Masukkan stock obat : ");
		int harga = scan.nextInt();
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
		//manggil method yg ada di dokter
                d.obatPasien();
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
