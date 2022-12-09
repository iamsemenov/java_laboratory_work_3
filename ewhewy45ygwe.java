import java.util.Scanner;
public class ewhewy45ygwe {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] nums;
        int n=0;
        nums = new int[n];


        while (true) {
            System.out.print("Input count elements: ");
            System.out.println();
            if (!scan.hasNextInt())
            {System.out.println("Error type! Input a integer!");
            scan.next();continue;}
            {n=scan.nextInt();break;}
        }
        nums = new int[n];


        for (int i=0; i < n; i++){
            while (true) {
                System.out.print("Input a " +(i+1)+" element: ");
                System.out.println();
                if (!scan.hasNextInt())
                {System.out.println("Error type! Input a integer!");
                scan.next();continue;}
                {nums[i]=scan.nextInt();break;}
            }
        
        }


        for (int i=0; i < n; i++){
            System.out.print((nums[i])+" ");
        }



        for (int i=0; i < n/2; i++){
            nums[i]=nums[i]+nums[n-i-1];
            nums[n-i-1]=nums[i]-nums[n-i-1];
            nums[i]=nums[i]-nums[n-i-1];
        }



        System.out.println();
        for (int i=0; i < n; i++){
            System.out.print((nums[i])+" ");
        }
        scan.close();
        }
}
