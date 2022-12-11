import java.util.Scanner;
public class task2v2 {
    public static void main(String[] args){
        //varibales
        Scanner scan = new Scanner(System.in);
        int[] nums={};
        int[] nums_ans={};
        int in=0;
        int n=0;
        int del=0;
        int del_c=0;


        System.out.println("quit or Input a " +(n+1)+" element: ");
        while (!scan.hasNext("quit")){
            while (true) {
                if (!scan.hasNextInt())
                {System.out.println("Error type! Input a Integer!");
                scan.next();continue;}
                else{in=scan.nextInt();break;}
            }
            //create temp array
            int nums_temp[] = new int[n];

            //copy from main to temp
            for (int i=0; i<n;i++){nums_temp[i]=nums[i];}

            //increase count of elements on 1 
            n++;

            //resize main array
            nums = new int[n];

            //from temp to main
            for (int i=0; i<n-1;i++){nums[i]=nums_temp[i];}

            //input new element
            nums[n-1]=in;
            System.out.println("quit or Input a " +(n+1)+" element: ");

        }

        scan.next();

        //input delete trigger
        while (true) {
            System.out.print("Number to delete: ");
            System.out.println();
            if (!scan.hasNextInt())
            {System.out.println("Error type! Input a Integer!");
            scan.next();}
            else{del=scan.nextInt();break;}
        }



        //algorithm
        int[] nums_ans_temp = new int[n];
        for (int i=0; i<n; i++){
            if (nums[i]!=del){nums_ans_temp[i-del_c]=nums[i];}
            else{del_c++;}
        }
        nums_ans = new int[n-del_c];
        for (int i = 0; i<n-del_c; i++){
            nums_ans[i]=nums_ans_temp[i];
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
