import java.util.Scanner;
public class task2v1 {
    public static void main(String[] args){
        //varibales
        Scanner scan = new Scanner(System.in);
        int[] nums;
        int[] nums_ans;
        int n=0;
        int del=0;
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
        nums = new int[n];
        nums_ans= new int[n];
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

        //input delete trigger
        while (true) {
            System.out.print("Input Number to delete: ");
            System.out.println();
            if (!scan.hasNextInt())
            {System.out.println("Error type! Input a integer!");
            scan.next();}
            else{del=scan.nextInt();break;}
        }



        //algorithm
        int[] nums_temp = new int[n];
        for (int i=0; i<n; i++){
            if (nums[i]!=del){nums_temp[i-del_c]=nums[i];}
            else{del_c++;}
        }
        nums_ans = new int[n-del_c];
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
