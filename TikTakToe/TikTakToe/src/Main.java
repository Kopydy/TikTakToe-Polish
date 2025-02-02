import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] pole = new String[9];

        String Gracz1;
        String Gracz2;
        int odpGracz1;
        int odpGracz2;
        boolean czyJestZwyciezca = false;
        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<pole.length;i++){
            pole[i] = " ";
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

            if(pole[odpGracz1].equals("X")|| pole[odpGracz1].equals("@")){
                System.out.println(Gracz1 + " wybierz inne pole:");
                odpGracz1 = scanner.nextInt();
            }
            else{
                switch (odpGracz1){
                    case 0: pole[0] = "X"; break;
                    case 1: pole[1] = "X"; break;
                    case 2: pole[2] = "X"; break;
                    case 3: pole[3] = "X"; break;
                    case 4: pole[4] = "X"; break;
                    case 5: pole[5] = "X"; break;
                    case 6: pole[6] = "X"; break;
                    case 7: pole[7] = "X"; break;
                    case 8: pole[8] = "X"; break;
                    default: System.out.println("Nic się nie dzieje"); break;
                }
            }

            drukujPlansze(pole);

            if (checkThereIsWinner(pole, Gracz1, Gracz2, czyJestZwyciezca)) break;

            if (checkCzyRemis(czyJestZwyciezca, pole)) break;


            System.out.println("Kolej "+ Gracz2+" wybierz pole, które chcesz zająć: ");
            odpGracz2 = scanner.nextInt();

            if(pole[odpGracz2].equals("X") || pole[odpGracz2].equals("@")){
                System.out.println(Gracz2 + " wybierz inne pole:");
                odpGracz2 = scanner.nextInt();
            }
            else{
                switch (odpGracz2){
                    case 0: pole[0] = "@"; break;
                    case 1: pole[1] = "@"; break;
                    case 2: pole[2] = "@"; break;
                    case 3: pole[3] = "@"; break;
                    case 4: pole[4] = "@"; break;
                    case 5: pole[5] = "@"; break;
                    case 6: pole[6] = "@"; break;
                    case 7: pole[7] = "@"; break;
                    case 8: pole[8] = "@"; break;
                    default: System.out.println("Nic się nie dzieje"); break;
                }
            }
            if (checkThereIsWinner(pole, Gracz1, Gracz2, czyJestZwyciezca)) break;
            if (checkCzyRemis(czyJestZwyciezca, pole)) break;
            continue;
        }

    }

    public static boolean checkCzyRemis(boolean czyJestZwyciezca, String[] pole) {
        if(!czyJestZwyciezca && !pole[0].equals(" ") && !pole[1].equals(" ") && !pole[2].equals(" ") && !pole[3].equals(" ") && !pole[4].equals(" ") && !pole[5].equals(" ") && !pole[6].equals(" ") && !pole[7].equals(" ") && !pole[8].equals(" ")){
            System.out.println("Nie ma zwycięzcy!");
            return true;
        }
        else{
            System.out.println();
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
            System.out.println();
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
