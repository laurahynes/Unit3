
package Lesson8.SamplePrograms;


public class Array2D {

    
    public static void main(String[] args) {
       int nums[][] = {{34,56,67,67},{43,67,78,88},{67,45,45,77}};
       
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(nums[i][j] + "\t");
            }
            System.out.println("");
        }
        int total = sum(nums); //call sum, send in 2D array "nums", get back the total
        System.out.println("Average = " + total/12);
        
        System.out.println("Sending original array into add10");
        add10(nums);
        System.out.println("Here is nums now");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(nums[i][j] + "\t");
            }
            System.out.println("");
        }
        
        int x = 20;
        add10(x);
        System.out.println("" + x);
        
        int avg[] = getAvg(nums);  //get back average of the 3 rows
        System.out.println("The average for each student");
        for (int i = 0; i < avg.length; i++) {
            System.out.println("" + avg[i]);
        }
        
    } //end main method
    
    public static void add10(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]+=10;
            }
        }
    }
    
    public static int sum(int arr[][]){
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j< arr[i].length; j++) {
                total+=arr[i][j];
            }
        }
        return total;
    }
    
    public static void add10(int x){
        x+=10;
    }
    
    public static int[] getAvg(int marks[][]){
        int result[] = new int[marks.length];  //one avg per student
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                result[i] += marks[i][j]; //summing each row
            }
            result[i] = result[i] / marks[i].length;
        }
        return result;
    }
    
    
}
