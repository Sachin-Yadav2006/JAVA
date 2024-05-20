import java.util.Scanner;

class Card {
    class VISA {
        void visacard(long cardno) {
            long cno = cardno;
            int l1 = (int) cardno % 10000;
            cardno = cardno / 10000;
            int sum1 = l1 % 10 + (l1 / 10) % 10 + (l1 / 100) % 10 + (l1 / 1000) % 10;
            int l2 = (int) cardno % 10000;
            cardno = cardno / 10000;
            int sum2 = l2 % 10 + (l2 / 10) % 10 + (l2 / 100) % 10 + (l2 / 1000) % 10;
            int l3 = (int) cardno % 10000;
            int sum3 = l3 % 10 + (l3 / 10) % 10 + (l3 / 100) % 10 + (l3 / 1000) % 10;
            int l4 = (int) cardno / 10000;
            int sum4 = l4 % 10 + (l4 / 10) % 10 + (l4 / 100) % 10 + (l4 / 1000) % 10;
            sum1 = sum1 + sum2;
            sum3 = sum3 + sum4;
            int n1 = l4 % 100;
            int n2 = l4 / 100;
            int r1 = sum1 % n2;
            int r2 = sum2 % n1;
            if (r1 > 50 & r2 > 50) {
                System.out.println("The entered card is a VISA card.");
            } else {
                Master m = new Master();
                m.cardtype(cno);
            }
        }
    }

    class Master {
        void cardtype(long cardno) {
            int l1 = (int) cardno % 10000;
            cardno = cardno / 10000;
            int l2 = (int) cardno % 10000;
            cardno = cardno / 10000;
            int l3 = (int) cardno % 10000;
            int l4 = (int) cardno / 10000;
            long l5 = l1 * l2;
            long l6 = l3 * l4;
            int n1 = l2 / 100;
            int n2 = l3 / 100;
            int r1 = (int) l5 % n1;
            int r2 = (int) l6 % n2;
            if (r1 > 20 && r1 < 40 && r2 < 40) {
                System.out.println("The entered card number is of MASTER card");
            }
            // else if((r1/r2)>10){
            // System.out.println("The entered card number is of RUPAY card:");
            // }
            // else if((r2/r1)>20 && (r2/r1)<50){
            // System.out.println("The entered card number is of AMEX Card.");
            // }
            else {
                Rupay r = new Rupay();
                r.rupayCard(r1, r2);
            }

        }
    }

    class Rupay {
        void rupayCard(int r1, int r2) {
            if ((r1 / r2) > 10) {
                System.out.println("The entered card number is of Rupay Card.");
            } else {
                Amex a = new Amex();
                a.amexCard(r1, r2);
            }
        }
    }

    class Amex {
        void amexCard(int r1, int r2) {
            if ((r2 / r1) > 20 && (r2 / r1) < 50) {
                System.out.println("The entered card number is of AMEX card ");
            } else {
                System.out.println("Please enter the correct Card Number.");
                System.out.println(
                        "The card number you entered does not satisfy any of the card service providers conditions!!!!");
            }
        }
    }

}

public class CardServiceProvider {
    public static void main(String[] args) {
        System.out.println("Enter the 16 digit card number : ");
        Scanner obj = new Scanner(System.in);
        long cardno = obj.nextLong();
        Card c = new Card();
        Card.VISA v = c.new VISA();
        v.visacard(cardno);
        obj.close();
    }
}
