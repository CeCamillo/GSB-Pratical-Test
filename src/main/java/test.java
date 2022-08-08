import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

//        Ignoring every blank space in the string
        input = input.replace(" ", "");
//        Ignoring every numeric value in the string
        input = input.replaceAll("[0-9]", "");

        System.out.printf("Original String: %s%n", input);

        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i) + " : " + input.chars().count());
        }
    }
}