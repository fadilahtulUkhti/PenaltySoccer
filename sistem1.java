package PinaltySoccer;
import java.util.Scanner;

public class sistem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String playAgain = "y";

            System.out.println("SELAMAT DATANG DI PINALY SOCCER!");
            System.out.println("---------------------------------");

            System.out.println("Aturan Main:\nPermainan akan terdiri dari 3 ronde.  ");
            System.out.println("Masing-masing tim akan diberika  3 kali kesempatan untuk menendang ketika tim lainnya menangkap\n Tim yang mencetak gol akan meraih 1 poin, namun bila gagal mencetak gol, tim lain akan meraih 1 poin \n Tim yang paling banyak meraih poin adalah pemenangnya");
            System.out.println("Arah Tendangan: \n1. Atas kanan\n2. Atas kiri \n3. bawah kanan\n4. bawah kiri\n5. tengah kanan\n6. tengah kiri ");
            System.out.println("\nMasukkan nama tim yang akan bermain : ");

            System.out.print("Tim Pertama: ");
            String timPertama = input.next();
            System.out.print("Tim Kedua: ");
            String timKedua = input.next();

            System.out.println("\n" + "Tim" + timPertama + " vs " + "Tim" + timKedua);
            //deklarasi variabel skor
            int scoreTimPertama = 0;
            int scoreTimKedua = 0;

            // Tendangan Pertama, tim pertama yang menendang
            for (int i = 0; i < 6; i++) {
                System.out.print("Masukkan arah tendangan tim " + timPertama + ": ");
                int arahTendangan = input.nextInt();1
                System.out.print("Masukkan arah tangkapan tim " + timKedua + ": ");
                int arahTangkapan = input.nextInt();
                if (arahTendangan == arahTangkapan) {
                    System.out.println("tim \n" + timPertama + " Gagal Mencetak Gol");
                    scoreTimKedua++;

                } else {
                    System.out.println("tim \n" + timPertama + " Mencetak  GOOLLL!!!");
                    scoreTimPertama++;

                }


            }
            System.out.println("\n" + timPertama + " vs " + timKedua + " = " + scoreTimPertama + ":" + scoreTimKedua);
            if (scoreTimPertama > scoreTimKedua) {
                System.out.println("Tim" + timPertama + " Menang");
            } else if (scoreTimPertama == scoreTimKedua) {
                System.out.println("Seimbang");
            } else {
                System.out.println("Tim " + timKedua + " Menang!");
            }
            System.out.println("Terima Kasih telah bermainn!! :)");

        }

}
