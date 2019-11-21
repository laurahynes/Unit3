package Lesson8.SamplePrograms;

public class TestReview {

    public static void main(String[] args) {


        /*

       Definitions - Parallel Arrays - Data in 1 array matches the data in the same location of the other array, 
        2D Arrays - An array with the same type of information which can be organized into rows and columns, 
        Ragged Arrays - A 2D array where each row is a different length, 
        logical vs physical size 
        - logical size is the amount of items currently in an array 
        - physical is the amount of items that the array can hold

       3 Coding Questions - Sum a 2D array, count numbers in a 1D array, CodingBat(1 or 2)

         */
        System.out.println("Review Part 1 - Sum a 2D array");

        int nums[][] = new int[4][5];

        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums[i].length; j++) {

                nums[i][j] = 10 * i + j;

                System.out.print(nums[i][j] + "\t");

            }

            System.out.println("");

        }

        System.out.println("The sum of this 2D array is ...");

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums[i].length; j++) {

                sum += nums[i][j];

            }

        }

        System.out.println("" + sum);

        System.out.println("\n-------\nPart 2\n");

        int x[] = {10, 8, 5, 6, 7, 7, 3, 7, 5, 8, 7, 2, 4, 7, 9, 10};

        //          0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
        int y[] = {6, 7, 7, 9, 10};

        int x7 = getCount(x);

        int y7 = getCount(y);

        System.out.format("There are %d 7s in x and %d 7s in y\n", x7, y7);

        System.out.println("\n------\nPart 3: Coding bat\n");

        int cb1[] = fizzArray3(5, 10);

        System.out.println("[");

        for (int i = 0; i < cb1.length; i++) {

            System.out.print(cb1[i] + ", ");

        }

        System.out.println("]");

        System.out.println("\n--------\nPart 3B: Coding bat again\n");

        int cb2[] = {6, 2, 5, 3};

        cb2 = shiftLeft(cb2);

        System.out.println("[");

        for (int i = 0; i < cb2.length; i++) {

            System.out.print(cb2[i] + ", ");

        }

        System.out.println("]");

    }

    public static int getCount(int arr[]) {

        int total = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 7) {
                total++;
            }

        }

        return total;

    }

    public static int[] fizzArray3(int start, int end) {

        int nums[] = new int[end - start];

        int index = 0;

        for (int i = start; i < end; i++) {

            nums[index] = i;

            index++; // go to next array location

        }

        return nums;

    }

    public static int[] shiftLeft(int[] nums) {

        if (nums.length == 0) {
            return nums;
        }

        int first = nums[0];

        for (int i = 0; i < nums.length - 1; i++) {

            nums[i] = nums[i + 1];

        }

        nums[nums.length - 1] = first;

        return nums;

    }

}
