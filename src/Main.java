import java.io.*;

public class Main {

    public static void main(String[] args)throws IOException {
        //Opens the file and reads it.
        String inputFile = "files/Records.txt";
        File testFile = new File(inputFile);
        readFile(inputFile);
    }
    public static void readFile(String inputFile)throws IOException{
        String line = null;                     //Holds a line of integers from text file
        int total=0;                            //Holds the total amount
        int field1=0;                           //Holds field1 first integer in a line of text file
        int field2=0;                           //Holds field2 second integer in a line of text file
        int counter=0;                          //Holds the counter value

        //Reading a whole line of text from text file with BufferedReader
        FileReader fileReader = null;
        fileReader = new FileReader(inputFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);


        while((line = bufferedReader.readLine()) != null) {
            String[] field = line.split(" ");   //Splits a line of text into an array using space a delimiter
            field1 = Integer.valueOf(field[0]); //field1 is first number in array
            field2 = Integer.valueOf(field[1]); //field2 is second number in array

            if(field1 == 0){
                total = total + field1;
                counter++;
            }
            else{
                if(field2 == 0){
                    System.out.println("The total is: " + total+"." + " The number of counters is: " + counter);
                    counter=0;
                }
                else{
                    total = total - field2;
                }
            }
            //Prints "End Record"
            System.out.println("End Record");
        }
        //Prints the counter amount.
        System.out.println("The number of counters is: " + counter);

        //Closes the file.
        bufferedReader.close();
    }

    public int unit(int field1, int field2){
        int total=0;
        int counter=0;
        if(field1 == 0){
            total += field1;
            counter++;
        }
        else{
            if(field2 == 0){
                System.out.println("The total is: " + total+"." + " The number of counters is: " + counter);
                counter=0;
            }
            else{
                total -= field2;
            }
        }
        //Prints "End Record"
        System.out.println("End Record");

        return total;
    }
}

