package aKingdomApp;

import java.util.List;
import java.util.ArrayList;

public class Main
    {
        private static List<AbstAnimals> filterAnimals(List<AbstAnimals> theList, CheckAnimal tester)
        {
            List<AbstAnimals> tempList = new ArrayList<>();
    
            for (AbstAnimals v : theList)
            {
                if (tester.test(v))
                {
                    tempList.add(v);
                }
            }
    
            return tempList;
        }

        public static void main(String[] arg)
        {
            System.out.println("***Behold the Animal Kingdom!***");

            Mammals panda = new Mammals(0, "Panda", 1869);
            Mammals zebra = new Mammals(1, "Zebra", 1778);
            Mammals koala = new Mammals(2, "Koala", 1816);
            Mammals sloth = new Mammals(3, "Sloth", 1804);
            Mammals armadillo = new Mammals(4, "Armadillo", 1758);
            Mammals raccoon = new Mammals(5, "Raccoon", 1758);
            Mammals bigfoot = new Mammals(6, "Bigfoot", 2021);

            Birds pigeon = new Birds(7, "Pigeon", 1837);
            Birds peacock = new Birds(8, "Peacock", 1821);
            Birds toucan = new Birds(9, "Toucan", 1758);
            Birds parrot = new Birds(10,"Parrot", 1824);
            Birds swan = new Birds(11, "Swan", 1758);

            Fish salmon = new Fish(12, "Salmon", 1758);
            Fish catfish = new Fish(13, "Catfish", 1817);
            Fish perch = new Fish(14, "Perch", 1758);

            System.out.println();   
            System.out.println();

            List<AbstAnimals> myList = new ArrayList<>();
            myList.add(panda);
            myList.add(zebra);
            myList.add(koala);
            myList.add(sloth);
            myList.add(armadillo);
            myList.add(raccoon);
            myList.add(bigfoot);
            myList.add(pigeon);
            myList.add(peacock);
            myList.add(toucan);
            myList.add(parrot);
            myList.add(swan);
            myList.add(salmon);
            myList.add(catfish);
            myList.add(perch);
    
            System.out.println(myList.toString());
            System.out.println();

            myList.sort((v1, v2) -> v2.getYear() - v1.getYear());
            myList.forEach((v) -> System.out.println(v.getYear()));

            System.out.println();
            System.out.println();
            
            myList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
            myList.forEach((v) -> System.out.println(v.getName()));
            System.out.println();
            System.out.println();
        
            // List<AbstAnimals> filteredList = filterAnimals(myList, (v) -> v.getYear() < 0);
            // filteredList.forEach((v) -> System.out.println(v));

        // System.out.println();
        // filteredList = filterVehicles (myList, (v) -> (v.getFuelLevel() > 0) && (v instanceof HorseFromVehicle));
        // filteredList.forEach((v) -> System.out.println(v));

        }
        
    }