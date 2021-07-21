package bai_1_introduction_to_java.bai_tap;
import java.util.Scanner;
public class UngDungDocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to read: ");
        short weight = scanner.nextShort();
        String read = "";
        int check1DigitNumber = 0;
        int check2DigitNumber = 0;
        int check3DigitNumber = 0;
        if (weight > 10 && weight < 100) {
            check1DigitNumber = weight % 10;
            check2DigitNumber = weight / 10;
        }
        if (weight > 100 && weight < 1000) {
            check1DigitNumber = weight % 100;
            check2DigitNumber = weight / 100;
            check3DigitNumber = weight / 100;
        }
        if (weight == 0) {
            read = "zero";
        } else if (weight == 10) {
            read = "ten";
        }
        if (weight<1000) {
            switch (check3DigitNumber) {
                case 1:
                    read += "one hundred and";
                    break;
                case 2:
                    read += "two hundred and";
                    break;
                case 3:
                    read += "three hundred and";
                    break;
                case 4:
                    read += "four hundred and";
                    break;
                case 5:
                    read += "five hundred and";
                    break;
                case 6:
                    read += "six hundred and";
                    break;
                case 7:
                    read += "seven hundred and";
                    break;
                case 8:
                    read += "eight hundred and";
                    break;
                case 9:
                    read += "nine hundred and";
                    break;
            }
            switch (check2DigitNumber) {
                case 2:
                    read += " twenty";
                    break;
                case 3:
                    read += " thirty";
                    break;
                case 4:
                    read += " fourty";
                    break;
                case 5:
                    read += " fifty";
                    break;
                case 6:
                    read += " sixty";
                    break;
                case 7:
                    read += " seventy";
                    break;
                case 8:
                    read += " eighty";
                    break;
                case 9:
                    read += " ninety";
                    break;
            }
            switch (check1DigitNumber) {
                case 1:
                    read += " one";
                    break;
                case 2:
                    read += " two";
                    break;
                case 3:
                    read += " three";
                    break;
                case 4:
                    read += " four";
                    break;
                case 5:
                    read += " five";
                    break;
                case 6:
                    read += " six";
                    break;
                case 7:
                    read += " seven";
                    break;
                case 8:
                    read += " eight";
                    break;
                case 9:
                    read += " nine";
                    break;
            }
            if (weight > 10 && weight < 20) {
                switch (weight) {
                    case 11:
                        read = "eleven";
                        break;
                    case 12:
                        read = "Twelve";
                        break;
                    case 13:
                        read = "thirteen";
                        break;
                    case 14:
                        read = "fourteen";
                        break;
                    case 15:
                        read = "fifteen";
                        break;
                    case 16:
                        read = "sixteen";
                        break;
                    case 17:
                        read = "seventeen";
                        break;
                    case 18:
                        read = "eighteen";
                        break;
                    case 19:
                        read = "nineteen";
                        break;
                }
            }
        } else {
            System.out.println("Enter wrong");
        }
        System.out.println(read);
    }
}
