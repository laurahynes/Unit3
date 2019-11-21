package Lesson8.SamplePrograms;

public class Attendance {

    public static void main(String[] args) {
        String attendance[][] = {
            {"JOE", "S09", "S12", "O14"},
            {"AMY"},
            {"SUE", "S24"},
            {"BOB", "S05", "S23", "O11", "O23"}
        };
        //PRINT OUT Attendance Report
        //any 2D.length = first number, or number of rows
        int abs[] = countAbs(attendance);
        for (int i = 0; i < attendance.length; i++) {
            for (int j = 0; j < attendance[i].length; j++) {
                System.out.print(j == 0 ? attendance[i][j] + " | Total Absences: " + abs[i] + "\tDates: " : attendance[i][j] + ", ");
            }
            System.out.println("");
        }
        System.out.println("Here are Bob's dates");
        String bdates[] = getDates(attendance, "BOB");
        for (int i = 0; i < bdates.length; i++) {
            System.out.print(bdates[i] + "\n");
        }

    }

    public static String[] getDates(String data[][], String nm){
        String dates = "";
        for (int i = 0; i < data.length; i++) {
            if(data[i][0].equals(nm)){
                for (int j = 1; j < data[i].length; j++) {
                    dates += data[i][j] + ",";
                }
            }
        }
        return dates.split(",");
    }
    
    public static int[] countAbs(String data[][]) {
        int abs[] = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            abs[i] = data[i].length - 1;   //1st one is not an absence,its a name
        }
        return abs;
    }

}
