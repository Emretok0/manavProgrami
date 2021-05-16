import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double armut = 2.14;
		double elma = 3.67;
		double domates = 1.11;
		double muz = 0.95;
		double patlican = 5;

		System.out.print("Armut kaç kilo: ");
		double armutV = input.nextDouble();

		System.out.print("Elma kaç kilo: ");
		double elmaV = input.nextDouble();

		System.out.print("Domates kaç kilo: ");
		double domatesV = input.nextDouble();

		System.out.print("Muz kaç kilo: ");
		double muzV = input.nextDouble();

		System.out.print("Patlıcan kaç kilo: ");
		double patlicanV = input.nextDouble();

		double toplam = (armut*armutV)+(elma*elmaV)+(domates*domatesV)+(muz*muzV)+(patlican*patlicanV);
		System.out.println("Toplam Fiyat: " + toplam);

	}
}
