import java.util.Scanner;
public class task1v2 {
    public static void main(String[] args){
        //varibales
        Scanner scan = new Scanner(System.in);
        double[] nums={};
        double[] nums_ans={};
        double in=0;
        int n=0;
        double s=0;
        

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
            double nums_ans_temp[] = new double[n];

            //copy from main to temp
            for (int i=0; i<n;i++){nums_temp[i]=nums[i];}
            for (int i=0; i<n;i++){nums_ans_temp[i]=nums_ans[i];}

            //increase count of elements on 1 
            n++;

            //resize main array
            nums = new double[n];
            nums_ans = new double[n];

            //from temp to main
            for (int i=0; i<n-1;i++){nums[i]=nums_temp[i];}
            for (int i=0; i<n-1;i++){nums_ans[i]=nums_ans_temp[i];}

            //input new element
            nums[n-1]=in;
            System.out.println("quit or Input a " +(n+1)+" element: ");

            //algorithm
            s=s+nums[n-1];
            nums_ans[n-1]=s/n;
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