package AnimalPicker;

import java.util.Scanner;

public class BranchAnimalPicker {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String animalChoice = "";
        System.out.println("What animal would you like to see?");
        System.out.println("Dog, Cat or Fish?");
        animalChoice = scan.nextLine();
        while(!animalChoice.toUpperCase().equals("dog")|| !animalChoice.toUpperCase().equals("cat")||!animalChoice.toUpperCase().equals("fish")){
            System.out.println("What animal would you like to see?");
            System.out.println("Dog, Cat, or Fish?");
        }
    }
}
