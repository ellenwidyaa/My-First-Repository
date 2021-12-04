
package projekdpsi;
import java.util.*;
/**
 *
 * @author Gatot
 */

public class Keuangan {

    public static void main(String[] args) {
        LinkedList1 masuk = new LinkedList1();
        LinkedList1 keluar = new LinkedList1();
        Scanner in = new Scanner(System.in);
        
        do{
            System.out.print("Pembayaran masuk atau keluar? ");
            if(in.next().matches("masuk")){
                System.out.print("Jumlah yang dibayarkan: ");
                masuk.input(in.nextInt());
            }else{
                System.out.print("Jumlah yang dibayarkan: ");
                keluar.input(in.nextInt());         
            }
            System.out.print("Ingin melakukan transaksi(ya/tidak)? ");
        } while(in.next().matches("ya"));
        
        System.out.println("List pembayaran masuk: ");
        masuk.tampil();
        System.out.println("List pembayaran keluar: ");
        keluar.tampil();
    }
    
}

class Node1{
    int data;
    Node next;
}
class LinkedList1{
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
