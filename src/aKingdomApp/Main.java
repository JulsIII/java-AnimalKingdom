package aKingdomApp;

import java.util.List;
import java.util.ArrayList;
// import java.util.Collections; 
// import java.util.Comparator;  

public class Main
    {
        private static void printAnimals(List<AbstAnimals> animals, CheckAnimal tester)
        {
            for (AbstAnimals a : animals)
            {
                if (tester.test(a))
                {
                    System.out.println(a.getName() + " " + a.reproduce() + " " + a.move() + " " + a.breath() + " " + a.getYear());
                }
            }
        }

        public static void main(String[] arg)
        {
            System.out.println("***Behold the Animal Kingdom!***");

            // Mammals panda = new Mammals(0, "Panda", 1869);
            // Mammals zebra = new Mammals(1, "Zebra", 1778);
            // Mammals koala = new Mammals(2, "Koala", 1816);
            // Mammals sloth = new Mammals(3, "Sloth", 1804);
            // Mammals armadillo = new Mammals(4, "Armadillo", 1758);
            // Mammals raccoon = new Mammals(5, "Raccoon", 1758);
            // Mammals bigfoot = new Mammals(6, "Bigfoot", 2021);

            // Birds pigeon = new Birds(7, "Pigeon", 1837);
            // Birds peacock = new Birds(8, "Peacock", 1821);
            // Birds toucan = new Birds(9, "Toucan", 1758);
            // Birds parrot = new Birds(10,"Parrot", 1824);
            // Birds swan = new Birds(11, "Swan", 1758);

            // Fish salmon = new Fish(12, "Salmon", 1758);
            // Fish catfish = new Fish(13, "Catfish", 1817);
            // Fish perch = new Fish(14, "Perch", 1758);

            // System.out.println();   
            // System.out.println();

            // List<AbstAnimals> animals = new ArrayList<>();

            List<AbstAnimals> animalsArrayList = new ArrayList<>();

            animalsArrayList.add(new Mammals("Panda", 1869));
            animalsArrayList.add(new Mammals("Zebra", 1778));
            animalsArrayList.add(new Mammals("Koala", 1816));
            animalsArrayList.add(new Mammals("Sloth", 1804));
            animalsArrayList.add(new Mammals("Armadillo", 1758));
            animalsArrayList.add(new Mammals("Raccoon", 1758));
            animalsArrayList.add(new Mammals("Bigfoot", 2021));

            animalsArrayList.add(new Birds("Pigeon", 1837));
            animalsArrayList.add(new Birds("Peacock", 1821));
            animalsArrayList.add(new Birds("Toucan", 1758));
            animalsArrayList.add(new Birds("Parrot", 1824));
            animalsArrayList.add(new Birds("Swan", 1758));

            animalsArrayList.add(new Fish("Salmon", 1758));
            animalsArrayList.add(new Fish("Catfish", 1817));
            animalsArrayList.add(new Fish("Perch", 1758));
    
            // System.out.println(animalsArrayList.toString());
            System.out.println();
            System.out.println("***By Year Discovered***");
            animalsArrayList.sort((a1, a2) -> a2.getYear() - a1.getYear());
            System.out.println(animalsArrayList.toString());;

            System.out.println();
            System.out.println("***By Name Aplhabetically***");
            animalsArrayList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
            System.out.println(animalsArrayList.toString());;

            System.out.println();
            System.out.println("***By Movement***");
            animalsArrayList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
            System.out.println(animalsArrayList.toString());;

            System.out.println();
            System.out.println("***By Lung Users***");
            printAnimals(animalsArrayList, a -> a.breath().equalsIgnoreCase("lungs"));

            System.out.println();
            System.out.println("***By Lung Users Discovered in 1758***");
            printAnimals(animalsArrayList, a -> (a.breath().equalsIgnoreCase("lungs") && a.getYear() == 1758));

            System.out.println();
            System.out.println("***By Lung Users that Lay Eggs***");
            printAnimals(animalsArrayList, a -> (a.reproduce().equalsIgnoreCase("eggs") && a.breath().equalsIgnoreCase("lungs")));

            System.out.println();
            System.out.println("***By Name Aplhabetically & Discovered in 1758***");
            animalsArrayList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
            printAnimals(animalsArrayList, a -> (a.getYear() == 1758));

            // System.out.println("\nSize of the ArrayList is " + animals.size());

            // for (int i = 0; i < animals.size(); i++)
            // {
            //     System.out.println("Index: " + i + " Value: " + animals.get(i));
            // }

            // Collections.sort(myList);
            // animals.sort((v1, v2) -> v2.getYear() - v1.getYear());
            // for (int i = 0; i < animals.size(); i++)
            // {
            //     System.out.println("Index: " + i + " Value: " + animals.get(i));
            // }
    
            // myList.sort((v1, v2) -> v2.getYear() - v1.getYear());
            // myList.forEach((v) -> System.out.println(v.getYear()));

            // System.out.println();
            // System.out.println();
            
            // myList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
            // myList.forEach((v) -> System.out.println(v.getName()));
            // System.out.println();
            // System.out.println();
        
            // List<AbstAnimals> filteredList = filterAnimals(myList, (v) -> v.getYear() < 0);
            // filteredList.forEach((v) -> System.out.println(v));


        }
        
    }