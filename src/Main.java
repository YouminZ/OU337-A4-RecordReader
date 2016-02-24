import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        int total=0;    // Holds the total value
        int counter=0;  // Counts how many records has been tallied

        //Opens the file for reading
        File file = new File("files/Records.txt");
        Scanner inputFile = new Scanner(file);

        //Read values from file line by line and tallies counter and total if it has a next line
        while (inputFile.hasNext()){
            int number = inputFile.nextInt();
            if(number == 0){
                total = total + number;
                counter++;
                number = inputFile.nextInt();
            }
            else{
                number = inputFile.nextInt();
                if(number == 0){
                    System.out.println("The total is: " + total+"." + " The number of records is: " + counter);
                    counter=0;
                }
                else{
                    total = total - number;
                }
            }
            //Prints "End Record"
            System.out.println("End Record");
        }
        //Prints the record counter
        System.out.println("The number of records is: " + counter);

        //Close the file.
        inputFile.close();
    }
}
