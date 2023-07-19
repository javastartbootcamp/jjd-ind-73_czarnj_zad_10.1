package pl.javastart.task;

import java.util.Scanner;

public class VegetableController {
    public static Vegetable[] createVegetableArray(int length) {
        Vegetable[] vegetables = new Vegetable[length];
        for (int i = 0; i < vegetables.length;) {
            Vegetable newVegetable = readVegetable();
            if (isVegetableInArray(newVegetable, vegetables)) {
                System.out.println("Duplicate");
            } else {
                vegetables[i] = newVegetable;
                i++;
            }
        }
        return vegetables;
    }

    private static Vegetable readVegetable() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter weight:");
        double weight = scanner.nextDouble();
        scanner.nextLine();
        return new Vegetable(name, weight);
    }

    private static boolean isVegetableInArray(Vegetable vegetable, Vegetable[] vegetables) {
        for (int i = 0; i < vegetables.length && vegetables[i] != null; i++) {
            if (vegetables[i].equals(vegetable)) {
                return true;
            }
        }
        return false;
    }

    public static String getArrayAsString(Vegetable[] vegetables) {
        StringBuilder stringBuilder = new StringBuilder("Objects in array:\n");
        for (Vegetable vegetable : vegetables) {
            stringBuilder.append(vegetable.toString()).append("\n");
        }
        return stringBuilder.toString();
    }
}
