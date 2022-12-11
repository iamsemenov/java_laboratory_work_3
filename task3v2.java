import java.util.Scanner;
public class task3v2 {
    public static void main(String[] args){
        //varibales
        Scanner scan = new Scanner(System.in);
        double[] nums={};
        double[] nums_ans={};
        double in=0;
        int n=0;
        int del_c=0;


        System.out.println("quit or Input a " +(n+1)+" element: ");
        while (!scan.hasNext("quit")){

            //check on correct
            while (true) {
                if (!scan.hasNextDouble())
                {System.out.println("Error type! Input a Decimal Point!");
                scan.next();}
                else{in=scan.nextDouble();break;}
            }

            //create temp array
            double nums_temp[] = new double[n];

            //copy from main to temp
            for (int i=0; i<n;i++){nums_temp[i]=nums[i];}

            //increase count of elements on 1 
            n++;

            //resize main array
            nums = new double[n];
            nums_ans = new double[n];

            //from temp to main
            for (int i=0; i<n-1;i++){nums[i]=nums_temp[i];}

            //input new element
            nums[n-1]=in;
            System.out.println("quit or Input a " +(n+1)+" element: ");
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
