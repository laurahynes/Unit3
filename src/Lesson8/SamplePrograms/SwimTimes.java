package Lesson8.SamplePrograms;

public class SwimTimes {

        public static void main(String[] args) {
        String athletes[] = {"BOB", "SUE","ANDY", "JOE"};
        
        double times[][] = {
            {12.8, 14.2, 11.7},
            {13.8},
            {10.9, 9.8, 10.7, 12.2},
            {12.8, 10.4},
        };
        //get each athletes avg time
        double avgtime[] = getAvg(times);
            for (int i = 0; i < athletes.length; i++) {
                System.out.print(athletes[i]);
                System.out.format("\tAverage Time: %.2f |\tTimes: ", avgtime[i]);
                for (int j = 0; j < times[i].length; j++) {
                    System.out.print(times[i][j] + "\t");
                }
                System.out.println("");
            }
    }
        
        //this sends back an array of the avg times for each athlete
        public static double[] getAvg(double t[][]){
            double avg[] = new double[t.length];
            for (int i = 0; i < t.length; i++) {
                for (int j = 0; j < t[i].length; j++) {
                    avg[i] += t[i][j];
                }
                avg[i] = avg[i] / t[i].length;
            }            
            return avg;
        }
    
}
