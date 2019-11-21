package Lesson9.Employee;

public class Blob {

    private String name;
    private static int blobcount;

    public Blob(String x) {
        name = x;
        blobcount++;
    }

    public String getName() {
        return name;
    }

    public static String identify() {
        return "We are blobs";
    }

    public static int getBlobCount(){
        return blobcount;
    }
}
