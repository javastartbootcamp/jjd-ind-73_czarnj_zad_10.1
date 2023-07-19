package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        VegetableController controller = new VegetableController();
        controller.fillVegetables();
        System.out.println(controller.getArrayAsString());
    }
}
