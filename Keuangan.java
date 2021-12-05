
package projekdpsi;
import java.util.*;
/**
 *
 * @author Gatot
 */

public class keuang {
    String[] karyawan = new String[2];
    LinkedList masuk = new LinkedList();
    LinkedList keluar = new LinkedList();
    Pasien p = new Pasien();
    public void pembayaran(){
        Scanner in = new Scanner(System.in);
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
    public void print(){System.out.println("List pembayaran masuk: ");
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
