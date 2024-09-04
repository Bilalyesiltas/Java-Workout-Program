import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("İdman Programına Hoşgeldiniz...");
        
        String idmanlar = "Geçerli Hareketler:\n"
                          + "Burpee\n"
                          + "Pushup (Şınav)\n"
                          + "Situp (Mekik)\n"
                          + "Squat\n"
                          + "Çıkış";
        
        System.out.println(idmanlar);
        
        System.out.println("Bir idman oluşturun....");
        
        System.out.print("Burpee Sayısı : ");
        int burpee = scanner.nextInt();
        
        System.out.print("Pushup (Şınav) Sayısı : ");
        int pushup = scanner.nextInt();
        
        System.out.print("Situp (Mekik) Sayısı : ");
        int situp = scanner.nextInt();
        
        System.out.print("Squat Sayısı : ");
        int squat = scanner.nextInt();
        
        scanner.nextLine();
        
        Idman idman = new Idman(burpee, pushup, situp, squat);
        
        System.out.println("İdmanınız Başlıyor!");

        while (idman.idmanBittiMi()== false ) {
            System.out.println("Hareket Türü (Burpee, Pushup, Situp, Squat) veya Çıkış:");
            String tur = scanner.next();
            
            if (tur.equals("Çıkış")) {
                System.out.println("İdman sonlandırılıyor...");
                break;
            }
            
            System.out.println("Bu hareketten kaç tane yapacaksınız?: ");
            int sayi = scanner.nextInt();
            
            idman.hareketYap(tur, sayi);
        }

       
    }
}
