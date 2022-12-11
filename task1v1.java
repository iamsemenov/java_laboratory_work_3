import java.util.Scanner;
public class task1v1 {
    public static void main(String[] args){
        //varibales
        Scanner scan = new Scanner(System.in);
        double[] nums;
        double[] nums_ans;
        int n=0;
        double s=0;


        //input
        while (true) {
            System.out.print("Input count elements: ");
            System.out.println();
            if (!scan.hasNextInt())
            {System.out.println("Error type! Input a integer!");
            scan.next();}
            else{n=scan.nextInt();break;}
        }
        nums = new double[n];
        nums_ans= new double[n];
        for (int i=0; i < n; i++){
            while (true) {
                System.out.print("Input a " +(i+1)+" element: ");
                System.out.println();
                if (!scan.hasNextDouble())
                {System.out.println("Error type! Input a Decimal Point!");
                scan.next();}
                else{nums[i]=scan.nextDouble();break;}
            }

            //algorithm
            s=s+nums[i];
            nums_ans[i]=s/(i+1);
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
