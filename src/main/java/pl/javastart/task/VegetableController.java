package pl.javastart.task;

import java.util.Scanner;

public class VegetableController {
    private static final int MAX_VEGETABLES_AMOUNT = 3;
    private Vegetable[] vegetables = new Vegetable[MAX_VEGETABLES_AMOUNT];

    public void fillVegetables() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < vegetables.length; i++) {
            boolean doesVegetableExist = false;
            do {
                System.out.println("Enter name:");
                String name = scanner.nextLine();
                System.out.println("Enter weight:");
                double weight = scanner.nextDouble();
                scanner.nextLine();
                Vegetable newVegetable = new Vegetable(name, weight);
                doesVegetableExist = isInArrayAlready(newVegetable);
                if (doesVegetableExist) {
                    System.out.println("Duplicate");
                } else {
                    vegetables[i] = newVegetable;
                }
            } while (doesVegetableExist);
        }
    }

    private boolean isInArrayAlready(Vegetable vegetable) {
        for (int i = 0; i < vegetables.length && vegetables[i] != null; i++) {
            if (vegetables[i].equals(vegetable)) {
                return true;
            }
        }
        return false;
    }

    public String getArrayAsString() {
        StringBuilder stringBuilder = new StringBuilder("Objects in array:\n");
        for (Vegetable vegetable : vegetables) {
            stringBuilder.append(vegetable.toString()).append("\n");
        }
        return stringBuilder.toString();
    }
}
