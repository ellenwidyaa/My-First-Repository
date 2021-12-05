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
