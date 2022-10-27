import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);

        int dataPoints[] = new int[100];
        for (int l=0; l<dataPoints.length; l++)
            dataPoints[l] = rnd.nextInt(100)+1;
        for (int l=0; l<dataPoints.length; l++)
            System.out.printf("%d | ", dataPoints[l]);
        int sum = 0;
        for (int l=0; l<dataPoints.length; l++)
            sum+= dataPoints[l];
        System.out.println("\nThe sum of the array values is " + sum);
        System.out.println("The sum of the array values is " + sum(dataPoints)); //Method
        System.out.println("The average is " + sum/dataPoints.length);

        //Linear Scan
        int target = SafeInput.getRangedInt(in, "Enter an int", 1, 100);

        int times = 0;
        for (int i=0; i < dataPoints.length; i++)
            if (dataPoints[i] == target){
                times += 1;

            }
        System.out.println("Number of times found: " + times);
        System.out.println("Number of times found: " + occuranceScan(dataPoints,target)); //Method

        boolean found = false;
        int val = SafeInput.getRangedInt(in, "Enter an int", 1, 100);
        for (int i=0; i < dataPoints.length; i++)
            if (dataPoints[i] == target){
                System.out.println("The value " + val + " was found at array index " + i);
                found = true;
                break;
            }
        if (!found)
            System.out.println("Did not find the value " + val);
        System.out.println("Found = " + contains(dataPoints,val));

        int min = dataPoints[0];
        int max = dataPoints[0];
        for (int l=0; l<dataPoints.length; l++) {
            if (dataPoints[l] < min) //got new min
                min = dataPoints[l];
            if (dataPoints[l] > max) //got new max
                max = dataPoints[l];
        }
        System.out.println("Min is " + min);
        System.out.println("Min is " + min(dataPoints)); //Method
        System.out.println("Max is " + max);
        System.out.println("Max is " + max(dataPoints)); //Method

        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }
    public static double getAverage(int values[]) {
        int sum = 0;
        double ave = 0;
        for (int l = 0; l < values.length; l++)
            sum += values[l];

        ave = sum / values.length;
        return ave;
    }
    public static int min(int values[]){
        int min = values[0];
        for (int l=0; l<values.length; l++) {
            if (values[l] < min) //got new min
                min = values[l];
        }
        return min;
    }
    public static int max(int values[]){
        int max = values[0];
        for (int l=0; l<values.length; l++) {
            if (values[l] > max) //got new max
                max = values[l];
        }
        return max;
    }
    public static int occuranceScan(int values[], int target){
        int times = 0;
        for (int i=0; i < values.length; i++)
            if (values[i] == target){
                times += 1;

            }
        return times;
    }
    public static int sum(int values[]){
        int sum = 0;
        for (int l=0; l<values.length; l++)
            sum+= values[l];
        return sum;
    }
    public static boolean contains(int values[], int target){
        boolean found = false;
        for (int i=0; i < values.length; i++)
            if (values[i] == target){
                found = true;
                break;
            }
        if (!found)
            found = false;
        System.out.println();
        return found;
    }
}