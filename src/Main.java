import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ukol cau = new ukol();
        cau.vratCau();


        System.out.println("Napiš mi nějaké slovo: ");
        String palm = sc.nextLine();
        cau.Slovo(palm);


        System.out.println("Napiš mi nějaké číslo: ");
        int cislo = sc.nextInt();
        sc.nextLine();
        cau.Panda(cislo);
        cau.Puding();



        System.out.println("Napiš mi tvoje Křestní jméno : ");
        String palma = sc.nextLine();
        System.out.println("Napiš mi tvoje Přijmení : ");
        String palma1 = sc.nextLine();
        cau.Slovo1(palma , palma1);








    }















}