package AnimalPicker;

import java.util.Scanner;

public class AnimalPicker {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        String animalChoice = "";
        System.out.println("What animal would you like to see?");
        System.out.println("Dog or Cat?");
        animalChoice = scan.nextLine();
        while(!animalChoice.toUpperCase().equals("dog")|| !animalChoice.toUpperCase().equals("cat")){
            System.out.println("What animal would you like to see?");
            System.out.println("Dog or Cat?");
        }
        if (animalChoice.toUpperCase().equals("dog")){
            System.out.println("          __\n \\ ______/ V`-,\n  }        /~~\n /_)^ --,r\'\n|b      |b");

        }else if(animalChoice.toUpperCase().equals("cat")){
            System.out.println(" _._     _,-\'\"\"`-._\n(,-.`._,\'(       |\\`-/|\n    `-.-\' \\ )-`( , o o)\n          `-    \\`_`\"\'-");
        }
    }
}
