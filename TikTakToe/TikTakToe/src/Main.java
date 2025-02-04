import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] pole = new String[9];
        int[] IdPole = new int[9];

        String Gracz1;
        String Gracz2;

        int odpGracz1;
        int odpGracz2;
        boolean czyJestZwyciezca = false;
        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<pole.length;i++){
            pole[i] = " ";
        }

        for(int i=0; i< IdPole.length;i++){
            IdPole[i] = i;
        }


        System.out.println("Witajcie w kółko i krzyrzk, wybierzcie swoje nazwy: ");
        System.out.println();
        System.out.println("Nazwa gracza nr 1 to:");
        Gracz1 = scanner.next();
        System.out.println("Nazwa gracza nr 2 to:");
        Gracz2 = scanner.next();
        System.out.println(Gracz1+ " gra jako X");
        System.out.println(Gracz2+ " gra jako @");

        while(true){
            drukujPlansze(pole);
            System.out.println("Kolej "+ Gracz1+" wybierz pole, które chcesz zająć: ");
            odpGracz1 = scanner.nextInt();

            warunek(pole, IdPole, odpGracz1, Gracz1, scanner, "X");

            drukujPlansze(pole);

            if (checkThereIsWinner(pole, Gracz1, Gracz2, czyJestZwyciezca)) break;

            if (checkCzyRemis(czyJestZwyciezca, pole)) break;

            System.out.println("Kolej "+ Gracz2+" wybierz pole, które chcesz zająć: ");
            odpGracz2 = scanner.nextInt();

            warunek(pole,IdPole, odpGracz2, Gracz2, scanner, "@");
            if (checkThereIsWinner(pole, Gracz1, Gracz2, czyJestZwyciezca)) break;
            if (checkCzyRemis(czyJestZwyciezca, pole)) break;
            continue;
        }

    }

    public static void warunek(String[] pole,int[] IdPole, int odpGracz1, String Gracz1, Scanner scanner, String X) {
        if (pole[odpGracz1].equals("X") || pole[odpGracz1].equals("@")) {
            System.out.println(Gracz1 + " wybierz inne pole:");
            odpGracz1 = scanner.nextInt();
        } else {
            for(int i =0;i<9;i++){
                if(odpGracz1 == IdPole[i]){
                    pole[i] = X;
                }
                else{
                    ;
                }
            }
        }
    }

    public static boolean checkCzyRemis(boolean czyJestZwyciezca, String[] pole) {
        if(!czyJestZwyciezca && !pole[0].equals(" ") && !pole[1].equals(" ") && !pole[2].equals(" ") && !pole[3].equals(" ") && !pole[4].equals(" ") && !pole[5].equals(" ") && !pole[6].equals(" ") && !pole[7].equals(" ") && !pole[8].equals(" ")){
            System.out.println("Nie ma zwycięzcy!");
            return true;
        }
        else{
            ;
        }
        return false;
    }

    public static boolean checkThereIsWinner(String[] pole, String Gracz1, String Gracz2, boolean czyczyJestZwyciezca) {
        if(pole[0].equals("X") && pole[1].equals("X") && pole[2].equals("X")){
            System.out.println(Gracz1 + " Wygrywa!");
            czyczyJestZwyciezca = true;
            return true;
        } else if(pole[3].equals("X") && pole[4].equals("X") && pole[5].equals("X")) {
            System.out.println(Gracz1 + " Wygrywa!");
            czyczyJestZwyciezca = true;
            return true;
        }
        else if(pole[6].equals("X") && pole[7].equals("X") && pole[8].equals("X")){
            System.out.println(Gracz1 + " Wygrywa!");
            czyczyJestZwyciezca = true;
            return true;
        }
        else if(pole[0].equals("X") && pole[3].equals("X") && pole[6].equals("X")){
            System.out.println(Gracz1 + " Wygrywa!");
            czyczyJestZwyciezca = true;
            return true;
        }
        else if(pole[1].equals("X") && pole[4].equals("X") && pole[7].equals("X")){
            System.out.println(Gracz1 + " Wygrywa!");
            czyczyJestZwyciezca = true;
            return true;
        }
        else if(pole[2].equals("X") && pole[5].equals("X") && pole[8].equals("X")){
            System.out.println(Gracz1 + " Wygrywa!");
            czyczyJestZwyciezca = true;
            return true;
        }
        else if(pole[0].equals("X") && pole[4].equals("X") && pole[8].equals("X")){
            System.out.println(Gracz1 + " Wygrywa!");
            czyczyJestZwyciezca = true;
            return true;
        }
        else if(pole[2].equals("X") && pole[4].equals("X") && pole[6].equals("X")){
            System.out.println(Gracz1 + " Wygrywa!");
            czyczyJestZwyciezca = true;
            return true;
        }
        else if(pole[0].equals("@") && pole[1].equals("@") && pole[2].equals("@")){
            System.out.println(Gracz2 + " Wygrywa!");
            czyczyJestZwyciezca = true;
            return true;
        } else if(pole[3].equals("@") && pole[4].equals("@") && pole[5].equals("@")) {
            System.out.println(Gracz2 + " Wygrywa!");
            czyczyJestZwyciezca = true;
            return true;
        }
        else if(pole[6].equals("@") && pole[7].equals("@") && pole[8].equals("@")){
            System.out.println(Gracz2 + " Wygrywa!");
            czyczyJestZwyciezca = true;
            return true;
        }
        else if(pole[0].equals("@") && pole[3].equals("@") && pole[6].equals("@")){
            System.out.println(Gracz2 + " Wygrywa!");
            czyczyJestZwyciezca = true;
            return true;
        }
        else if(pole[1].equals("@") && pole[4].equals("@") && pole[7].equals("@")){
            System.out.println(Gracz2 + " Wygrywa!");
            czyczyJestZwyciezca = true;
            return true;
        }
        else if(pole[2].equals("@") && pole[5].equals("@") && pole[8].equals("@")){
            System.out.println(Gracz2 + " Wygrywa!");
            czyczyJestZwyciezca = true;
            return true;
        }
        else if(pole[0].equals("@") && pole[4].equals("@") && pole[8].equals("@")){
            System.out.println(Gracz2 + " Wygrywa!");
            czyczyJestZwyciezca = true;
            return true;
        }
        else if(pole[2].equals("@") && pole[4].equals("@") && pole[6].equals("@")){
            System.out.println(Gracz2 + " Wygrywa!");
            czyczyJestZwyciezca = true;
            return true;
        }
        else{
            ;
        }
        return false;
    }

    public static void drukujPlansze(String[] pole) {
        System.out.println("#---#---#---#");
        System.out.println("|   |   |   |");
        System.out.println("| "+ pole[0]+" | "+ pole[1]+" | "+ pole[2]+" |");
        System.out.println("|   |   |   |");
        System.out.println("#---#---#---#");
        System.out.println("|   |   |   |");
        System.out.println("| "+ pole[3]+" | "+ pole[4]+" | "+ pole[5]+" |");
        System.out.println("|   |   |   |");
        System.out.println("#---#---#---#");
        System.out.println("|   |   |   |");
        System.out.println("| "+ pole[6]+" | "+ pole[7]+" | "+ pole[8]+" |");
        System.out.println("|   |   |   |");
        System.out.println("#---#---#---#");
    }
}
