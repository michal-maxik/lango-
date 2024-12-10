public class ukol {


    public void vratCau() {
        String cau = ".AhojSvěte";
        int i = 1;
        while (i <= 30) {
            System.out.println(i + cau);
            i++;
        }


    }

    public void Slovo(String palma) {
        System.out.println("Opravdu si napsal tohle slovo?: " + palma);
    }

    public void Panda(int ponozka) {
        if (ponozka < 0) {
            System.out.println("Bylo zadáno číslo záporné.");
        } else if (ponozka == 0) {
            System.out.println("0");
        } else if (ponozka > 12) {
            System.out.println("Moc velké číslo.");
        } else {
            if (ponozka == 1) {
                System.out.println("Jedna");
            } else if (ponozka == 2) {
                System.out.println("dva");
            } else if (ponozka == 3) {
                System.out.println("Tři");
            } else if (ponozka == 4) {
                System.out.println("Čtyři");
            } else if (ponozka == 5) {
                System.out.println("Pět");
            } else if (ponozka == 6) {
                System.out.println("Šest");
            } else if (ponozka == 7) {
                System.out.println("Sedm");
            } else if (ponozka == 8) {
                System.out.println("Osm");
            } else if (ponozka == 9) {
                System.out.println("Devět");
            } else if (ponozka == 10) {
                System.out.println("Deset");
            } else if (ponozka == 11) {
                System.out.println("Jedenáct");
            } else if (ponozka == 12) {
                System.out.println("Dvanáct");
            }


        }


    }
    public void Puding(){
        int i = 1;
        while(i <= 20){
            System.out.println("Násobek 5 * " +i + " je "+5*i);
            i++;
        }
    }


    public void Slovo1(String palma1, String palma2) {
        System.out.println("Tvé jméno je " + palma1 + " " + palma2 + ". Dle toho, co uživatel zadal.");
    }









}














