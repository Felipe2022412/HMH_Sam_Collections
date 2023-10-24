/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hmh_sam_collections;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author felip
 */
public class HMH_Sam_Collections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Created an ArrayList to store Person objects
        ArrayList<Person> data = new ArrayList<>();

        // Open and read data from the "MOCK_DATA.csv" file
        try ( Scanner readFile = new Scanner(new File("MOCK_DATA.csv"))) {
            while (readFile.hasNextLine()) {
                // if there is anything to read: Read a line from the file
                String line = readFile.nextLine();
                String[] person = line.split(",");
                // Splitting the line into an array using a comma
                // Parsing the ID as an integer and extrating id, name, lastName and email from the file and saving into the new object
                int id = Integer.parseInt(person[0]);
                String firstName = person[1];
                String lastName = person[2];
                String email = person[3];
                // Created a new Person object and added it to the data ArrayList, as many times as the file needs to be read
                data.add(new Person(id, firstName, lastName, email));

            }

        } catch (FileNotFoundException e) {
            // in case the File is not found
            System.out.println("File not found");
        }

        // declaring the amount of teams and people
        int amountOfTeams = 20;
        int numberOfPeople = 5;
        
        //ArrayList to store all the teams put into an array down bellow
        ArrayList<ArrayList<Person>> allTeams = new ArrayList<>();
        int dataIndex = 0;
        //to keep track of the amount of people
        
        
        for (int i = 0; i < amountOfTeams; i++) {
            ArrayList<Person> team = new ArrayList<>();
            Collections.shuffle(data);
            //Creating a team arrayList to put the 5 people, shuffling the order of the list to have random teams - library "collections".
            
            
            for (int j = 0; j < numberOfPeople; j++) {
                // Add 5 people to the team
                team.add(data.get(dataIndex));
                dataIndex++;
            }

            allTeams.add(team); // Add the team to the list of all teams
        }

        // Print all teams
        for (int i = 0; i < allTeams.size(); i++) {
            System.out.println("Group name " + (i + 1) + ": " + allTeams.get(i));
        }
        
            

        }

    }


