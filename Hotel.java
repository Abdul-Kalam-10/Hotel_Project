import java.util.*;
public class Hotel {
    public static void main(String[] args) {
        int i, qty, amt, bill = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cooker");
        do {
            System.out.println("Idly");
            System.out.println("Dosai");
            System.out.println("Vadai");
            System.out.println("Sambar");
            System.out.println("Pongal");
            System.out.println("What is your choice - ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Idly qty?");
                    qty = sc.nextInt();
                    amt = qty * 5;
                    bill = bill + amt;
                    break;
                case 2:
                    System.out.println("Dosai qty?");
                    qty = sc.nextInt();
                    amt = qty * 20;
                    bill = bill + amt;
                    break;
                case 3:
                    System.out.println("Vadai qty?");
                    qty = sc.nextInt();
                    amt = qty * 5;
                    bill = bill + amt;
                    break;
                case 4:
                    System.out.println("Sambar qty?");
                    qty = sc.nextInt();
                    amt = qty * 10;
                    bill = bill + amt;
                    break;
                case 5:
                    System.out.println("Pongal qty?");
                    qty = sc.nextInt();
                    amt = qty * 35;
                    bill = bill + amt;
                    break;
                default:
                    System.out.println("Item not found in menu,choose item from menu");
                    break;
            }
            System.out.println("do you want to cont.. press 1 or 0");
            i = sc.nextInt();
        }while (i==1);
        System.out.println("Your bill is :"+" "+bill+" rs");
    }
}


