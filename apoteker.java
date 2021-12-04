import java.util.*;

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
