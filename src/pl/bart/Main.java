package pl.bart;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    double pounds = scanner.nextDouble();
    double converter = 0.45359237d;
    double poundsTokg = pounds * converter;
    System.out.println(poundsTokg);
    }
}
