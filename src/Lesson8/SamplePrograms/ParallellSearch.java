
package Lesson8.SamplePrograms;

import java.util.Scanner;


public class ParallellSearch {

    
    public static void main(String[] args) {
        String name[] = {"BOB","SUE","JOE","ANDY","KIM"};
        //ages are in same order as names = parallel array
        int age[] = {45,17,21,35,57};
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter name to search for age > ");
        String searchName = scan.nextLine();
        
        //search for name
        int location = -1;
        for (int i = 0; i < name.length; i++) {
            if(name[i].equals(searchName))
                location = i;
        }
        if(location == -1)
            System.out.println(searchName + " not found");
        else
            System.out.println(searchName + "'s age is " + age[location]);
    }
    
}
