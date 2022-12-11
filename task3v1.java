import java.util.Scanner;
public class task3v1 {
    public static void main(String[] args){
        //varibales
        Scanner scan = new Scanner(System.in);
        double[] nums;
        double[] nums_ans;
        int n=0;
        int del_c=0;


        //input
        while (true) {
            System.out.print("Input count elements: ");
            System.out.println();
            if (!scan.hasNextInt())
            {System.out.println("Error type! Input a integer!");
            scan.next();continue;}
            {n=scan.nextInt();break;}
        }
        nums = new double[n];
        nums_ans= new double[n];
        for (int i=0; i < n; i++){
            while (true) {
                System.out.print("Input a " +(i+1)+" element: ");
                System.out.println();
                if (!scan.hasNextDouble())
                {System.out.println("Error type! Input a Decimal Point!");
                scan.next();continue;}
                {nums[i]=scan.nextDouble();break;}
            }
        }


        //algorithm
        double[] nums_temp = new double[n];
        int temp_del_c=0;
        nums_temp[0]=nums[0];
        for (int i=1; i<n; i++){
            if (nums[i-1-temp_del_c]<nums[i]){nums_temp[i-del_c]=nums[i];temp_del_c=0;}
            else{temp_del_c++;del_c++;}
        }
        nums_ans = new double[n-del_c];
        for (int i = 0; i<n-del_c; i++){
            nums_ans[i]=nums_temp[i];
        }
        


        //output
        System.out.println("Input array: ");
        for (int i=0; i < nums.length; i++){
            System.out.print((nums[i])+" ");
        }
        System.out.println();
        System.out.println("Output array: ");
        for (int i=0; i < nums_ans.length; i++){
            System.out.print((nums_ans[i])+" ");
        }
        System.out.println();
        scan.close();
        }
}
