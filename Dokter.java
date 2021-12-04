/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rumah.sakit.pkg2;
import java.util.*;

public class RumahSakit2 {
    
    
    public static void main(String[] args) {
    Dokter d = new Dokter();
    d.inputData();
    d.toString();
}
    }

class Dokter {
    int pointer1=0;
    int pointer2=0;
    Dokter[] arr;
    Scanner sc = new Scanner(System.in);
    String nama = sc.nextLine();
    String day = sc.nextLine();
    String jam = sc.nextLine();
    
    public void setData(String day, String jam)
    {
        this.day = day;
        this.jam = jam;
    }
    
    public void inputData() {
    for(int i=pointer1; i< pointer1+1; i++){
        System.out.print("Masukkan nama Anda : ");
        pointer1++;
        for(int j=pointer2; j< pointer2+5; j++) {
            System.out.print("Masukkan hari dan jam praktik Anda : ");
            arr[i][j] = new Dokter();
            pointer2++;
        } 
    }
    }
    
    public void showObat () {
        
    }
    
    public void listPasien() {
        
    }
    
    public String toString(){
         String str="";
        int i=0; int j=0;
        while(arr[i][j] != null){
            str += arr[i][j]+"\n";
            i++;
            j++;
        }
        return str;
    }
}

 
