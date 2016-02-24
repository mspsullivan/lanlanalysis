 // Program for dishing lines to up to 58 files based on time.
 // The expected innput format is:
 // time, source user, dest user, source computer, destination computer
 import java.io.File;
 import java.io.FileNotFoundException;
 import java.util.Scanner;
 import java.io.BufferedWriter;


        public class TestScanner {
            final static int SECONDS_IN_A_DAY = 86400;

            public static void main(String[] args) throws FileNotFoundException {
                long lval = 0;
                String source, dest, result;
                Scanner scanner = new Scanner(new File("C:\\Users\\Robert.Sullivan\\My Documents\\res\\fun\\coursera\\StudentProject\\"+ args[0]));
                scanner.useDelimiter(",");
                while(scanner.hasNextLine()) {
                    lval = scanner.nextLong();
                    scanner.next(); // skip src user
                    scanner.next(); // skip dest user
                    source = scanner.next();
                    dest = scanner.next();
                    scanner.nextLine();
                    if ((!dest.equals("TGT") && (!dest.equals(source)))) {
                        result = (Math.round(lval / SECONDS_IN_A_DAY) + 1) + "," + source + "," + dest + "\n";
                        System.out.print(result);
                    }
                }
                    scanner.close();
            }
        }
