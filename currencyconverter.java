import java. util.Scanner;

public class currencyconverter {

    public static void main(String[] args) {
        System.out.println("1 Ruppe");
        System.out.println("2 Dollar");
        System.out.println("3 Euro");
        // take input
        Scanner sc = new Scanner(System.in);
        System. out.println("Choose the currency");
        int choice = sc.nextInt();
        System.out.println("Enter the amount");
        double amount = sc.nextDouble();
        // convert the amount
        switch (choice) {
            case 1:
                Ruppe_to_other(amount);
                break;
            case 2:
                Dollar_to_other(amount);
                break;
            case 3:
                Euro_to_other(amount);
                break;
            default:
                System.out.println("Invalid choice");
        }

    }

public static void Ruppe_to_other(double amt) {
    System.out.println("1.000 INR = " + 0.01 + " Dollar");
    System.out.println();

    System.out.println(amt+" Ruppe = " + (amt*85) + " Dollar");
    System.out.println();

    System.out.println("1 Ruppe = " + 0.01 + " Euro");
    System.out.println();
    System.out.println(amt+" Ruppe = " + (amt*90) + "  Eur");
    System.out.println();

}
    

public static void Dollar_to_other(double amt) {
    System.out.println("1 Dollar = " + 84.00 + " Ruppe");
    System.out.println();
    System.out.println(amt+" Dollar = " + (amt*84.00) + " Ruppe");
    System.out.println();

    System.out.println("1 Dollar= " + 0.92 + " Euro");
    System.out.println();

    System.out.println(amt+" Dollar = " + (amt*0.92) + " Euro");
}

    

public static void Euro_to_other(double amt){
    System.out.println("1 Euro = " + 91.05 + " Ruppe");
    System.out.println();
    System.out.println(amt+" Euro = " + (amt*91.05) + " Ruppe");
    System.out.println();

    System.out.println("1 Euro = " + 1.09 + " Dollar");
    System.out.println();

    System.out.println(amt+" Euro = " + (amt*1.09) + " Dollar");
}
}
