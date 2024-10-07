import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String d;
        String r;
        String i;
        System.out.println("Please enter your party affiliation: ");
        System.out.println("'d' if you are a part of the Democrat party");
        System.out.println("'r' if you are a part of the Republican party");
        System.out.println("'i' if you are an Independent");
        System.out.print("Enter your choice here: ");
        String choice = scanner.nextLine();
        if (choice.equals("d")) {
            System.out.println("You are a Democratic Donkey.");
        } else if (choice.equals("r")) {
            System.out.println("You are a Republican Elephant.");
        } else if (choice.equals("i")) {
            System.out.println("You get to be Independent.");
        } else {
            System.out.println("You are another party affiliation.");
        }
        scanner.close();
    }
}