import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Scanner;

/**
 * Created by Robert.Sullivan on 2/23/2016.
 * Scan a file with this format:
 * day, source, dest
 * Then, write each new edge to standard output
 */
public class EdgeFind {

        public static void main(String[] args) throws FileNotFoundException {
            int day = 0;
            String result, key;
            String source, dest;
            Scanner scanner = new Scanner(new File("C:\\Users\\Robert.Sullivan\\My Documents\\res\\fun\\coursera\\StudentProject\\"+ args[0]));
            scanner.useDelimiter(",");
            HashSet edgeSet = new HashSet();
            // add elements to the edge set
            while(scanner.hasNextLine()) {
                day = scanner.nextInt();
                source = scanner.next();
                dest = scanner.nextLine();
                key = source + dest;
                //check for the edge in the set
                if (!edgeSet.contains(key)){
                // if it is new, add it to the dictionary and output the edge and day.
                    edgeSet.add(key);
                    result = day + "," + source + dest + "\n";
                    System.out.print(result);
                }
            }
            scanner.close();
        }
    }
