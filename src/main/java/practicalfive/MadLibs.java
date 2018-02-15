package practicalfive;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;


public class MadLibs {

  public static void main(String[] args) {
    // display the name of the programmer and the date
    System.out.println("Janyl Jumadinova " + new Date());
    // declare the starting file and scanner
    File wordInputsFile = null;
    Scanner scanner = null;
    // connect the scanner to the input file
    try {
      wordInputsFile = new File("input/madlibs_inputs.txt");
      scanner = new Scanner(wordInputsFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate file");
    }
    // Step One: Read in and save the input from the text file
    
    // Step Two: Display the words and numbers in a Mad Libs story

    // Step Three: Display a final thankyou message
  }

}
