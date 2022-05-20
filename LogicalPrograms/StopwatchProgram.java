package Day6.LogicalPrograms;

import java.util.Scanner;

public class StopwatchProgram {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println(" Start ");
        long startTime = 0;
        long stopTime = 0;
        int start = s.nextInt();
        if(start == 1) {
            startTime = System.currentTimeMillis();
        }
        else {
            System.out.println("For Starting stopwatch type 1");
        }
        System.out.println("Stop");
        int stop=s.nextInt();
        if(stop == 0) {
            stopTime = System.currentTimeMillis();
        }
        else {
            System.out.println("For Stoppin Stopwatch type 0");
        }

        System.out.println("The Elapsed Time is");
        long Elapsedtime = stopTime - startTime ;
        System.out.println(Elapsedtime + "MiliSeconds");

    }
}
