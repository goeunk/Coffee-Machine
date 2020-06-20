package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        /*System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");*/

        int water = 200;
        int milk = 50;
        int beans = 15;
        int neededWater = 0;
        int neededMilk = 0;
        int neededBeans = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Write how many cups of coffee you will need:");
        int numCoffee = input.nextInt();

        neededWater = water * numCoffee;
        neededMilk = milk * numCoffee;
        neededBeans = beans * numCoffee;
        System.out.println("For " + numCoffee + " cups of coffee you will need:");
        System.out.println(neededWater + " ml of water");
        System.out.println(neededMilk + " ml of milk");
        System.out.println(neededBeans + " ml of coffee beans");
    }
}
