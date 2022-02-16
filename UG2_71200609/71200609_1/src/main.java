import java.util.Scanner;

public class main {
    Mobil M_71200609 = new Mobil();
    PejalanKaki P_71200609 = new PejalanKaki();

    public static void main(String[] args){
    Scanner inp = new Scanner(System.in);
    System.out.println("Kode lampu lalu lintas saat ini:");
    int KodeLampu = inp.nextInt();
    if(KodeLampu == 3){
        System.out.println("-----Lampu Merah-----");
        Mobil.berhenti();
        PejalanKaki.menyebrang();}
    if(KodeLampu == 2){
        System.out.println("-----Lampu Kuning-----");
        Mobil.kurangiKecepatan();
        PejalanKaki.bersiap();}
    if(KodeLampu == 1){
        System.out.println("-----Lampu Hijau-----");
        Mobil.jalan();
        PejalanKaki.berhenti();}
    }

}
