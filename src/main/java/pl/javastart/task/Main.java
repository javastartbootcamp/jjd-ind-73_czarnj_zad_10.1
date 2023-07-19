package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Vegetable[] vegetables = VegetableController.createVegetableArray(3);
        System.out.println(VegetableController.getArrayAsString(vegetables));
    }
}
