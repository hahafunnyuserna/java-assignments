package org.example;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String... args) {
        String input = "cheese_data.csv";
        String output = "output.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(input));
       BufferedWriter bw = new BufferedWriter(new FileWriter(output))) {
        {
            

            String line = br.readLine();

            while (line != null) {

                String[] cheeses = line.split(",");

                for (String cheese : cheeses)
                {
                    bw.write(cheese);
                    bw.write(", ");
                }
                bw.newLine();

                String id = cheeses[0];
                String manufCode = cheeses[1];
                String manufType = cheeses[2];
                double moisture = Double.parseDouble(cheeses[3]);
                String flavorProfile = cheeses[4];
                String traits = cheeses[5];
                boolean organic = Boolean.valueOf(cheeses[6]);
                String cheeseType = cheeses[7];
                String milkType = cheeses[8];
                String milkTreatment = cheeses[9];
                String rindType = cheeses[10];
                String cheeseName = cheeses[11];
                String fatLevel = cheeses[12];
                
               
            }

            br.close();
            
        } catch (FileNotFoundException fe) {


            System.out.println("File " + input + " not found.");



            
            
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        
    }

}