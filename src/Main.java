import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        int total=0;    // Holds the total value
        int counter=0;  // Counts how many records has been tallied

        //Opens the file for reading
        File file = new File("Records.txt");
        Scanner inputFile = new Scanner(file);

        //Read values from file line by line and tallies counter and total if it has a next line
        while (inputFile.hasNext()){
            if(field1 == 0){
               total = total + field1;
               counter++;
            }
            else{
                if(field2 == 0){
                    System.out.println("The total is: " + total + "The number of records is: " + counter);
                    counter=0;
                }
                else{
                    total = total - field2;
                }
            }
            //Prints "End Record"
            System.out.println("End Record");
        }
        //Prints the record counter
        if(counter!=0) {
            System.out.println("The number of records is: " + counter);
        }
    }
}
