package Working_with_Numbers;

public class Convert_digit_or_number_to_words {
    public static void main(String[] args) {
        int n = 9011, num = 0;
        System.out.println(n);
        int t = n, rem = 0;

        // Reverse the number
        while (t > 0) {
            rem = t % 10;
            num = num * 10 + rem;
            t = t / 10;
        }

        n = num;
        int l = Integer.toString(n).length();

        while (l > 0) {

            // Handle teens (10–19)
            if (l == 2 && (n % 100) >= 10 && (n % 100) <= 19) {
                switch (n % 100) {
                    case 10: System.out.print("ten "); break;
                    case 11: System.out.print("eleven "); break;
                    case 12: System.out.print("twelve "); break;
                    case 13: System.out.print("thirteen "); break;
                    case 14: System.out.print("fourteen "); break;
                    case 15: System.out.print("fifteen "); break;
                    case 16: System.out.print("sixteen "); break;
                    case 17: System.out.print("seventeen "); break;
                    case 18: System.out.print("eighteen "); break;
                    case 19: System.out.print("nineteen "); break;
                }
                break; // handled 2 digits at once
            }

            // Only print digit words if not in tens place
            if (!(l == 2)) {
                switch (n % 10) {
                    case 1: System.out.print("one "); break;
                    case 2: System.out.print("two "); break;
                    case 3: System.out.print("three "); break;
                    case 4: System.out.print("four "); break;
                    case 5: System.out.print("five "); break;
                    case 6: System.out.print("six "); break;
                    case 7: System.out.print("seven "); break;
                    case 8: System.out.print("eight "); break;
                    case 9: System.out.print("nine "); break;
                }
            }

            if (l == 4) {
                System.out.print("Thousand ");
            } else if (l == 3 && n % 10 != 0) {
                System.out.print("Hundred ");
            } else if (l == 2) { // tens place
                switch (n % 10) {
                    case 2: System.out.print("twenty "); break;
                    case 3: System.out.print("thirty "); break;
                    case 4: System.out.print("forty "); break;
                    case 5: System.out.print("fifty "); break;
                    case 6: System.out.print("sixty "); break;
                    case 7: System.out.print("seventy "); break;
                    case 8: System.out.print("eighty "); break;
                    case 9: System.out.print("ninety "); break;
                }
            }

            l--;
            n = n / 10;
        }
    }
}
