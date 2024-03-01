import java.util.Scanner;

public class App {
    static int guest = 0;

    public static void main(String[] args) throws Exception {
        guestAsk();
        companyBorder();
        calc();

    }

    public static int guestAsk() {
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("How many people are attending this event?");
        guest = Keyboard.nextInt();
        return guest;
    }

    public static void calc() {
        int total = 0;
        boolean big = false;
        String isBig = "";
        total = guest * 35;

        if (guest >= 50) {
            big = true;
            isBig = "Big party";
        } else {
            big = false;
            isBig = "small party";
        }

        System.out.println("there are " + guest + " guests as a " + isBig + " where its 35$ per guest at a total of "
                + total + "$.");
    }

    public static void companyBorder() {
        System.out.println("********************************************");
        System.out.println("*Yummy makes the food that makes it a party*");
        System.out.println("********************************************");
    }

}
