/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hmh_sam_collections;

/**
 *
 * @author felip
 */
public class Person {
    
    //instantiating the variables for my objects
        private int id;
        private String firstName;
        private String lastName;
        private String email;

        //my constructor to save the data from the file into their respective groups: id, firstName....
        public Person(int id, String firstName, String lastName, String email) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
        }

        //method toString so I Can deal only with firstName and lastName
        @Override
        public String toString() {
            return firstName + " " + lastName;
        }
        
    
}
