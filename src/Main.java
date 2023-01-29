import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int dogumTarihi,kalan;
        System.out.print("Doğum Tarihinizi Giriniz: ");
        dogumTarihi=input.nextInt();
        kalan=dogumTarihi%12;
        switch (kalan){
            case 0:
                System.out.println("Çin Zodyağı Bucunuz: Maymun");
                break;
            case 1:
                System.out.println("Çin Zodyağı Bucunuz: Horoz");
                break;
            case 2:
                System.out.println("Çin Zodyağı Bucunuz: Köpek");
                break;
            case 3:
                System.out.println("Çin Zodyağı Bucunuz: Domuz");
                break;
            case 4:
                System.out.println("Çin Zodyağı Bucunuz: Fare");
                break;
            case 5:
                System.out.println("Çin Zodyağı Bucunuz: Öküz");
                break;
            case 6:
                System.out.println("Çin Zodyağı Bucunuz: Kaplan");
                break;
            case 7:
                System.out.println("Çin Zodyağı Bucunuz: Tavşan");
                break;
            case 8:
                System.out.println("Çin Zodyağı Bucunuz: Ejderha");
                break;
            case 9:
                System.out.println("Çin Zodyağı Bucunuz: Yılan");
                break;
            case 10:
                System.out.println("Çin Zodyağı Bucunuz: At");
                break;
            case 11:
                System.out.println("Çin Zodyağı Bucunuz: Koyun");
                break;
            default:
                System.out.println("HATA!!!!!!");
        }
    }
}