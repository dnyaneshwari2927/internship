import java.util.*;
class factorial{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the Number :");
                int n = sc.nextInt();
                if(n>0){
                int num = 1;
                for(int i = 1;i<=n;i++){
                        num =num * i;

                }
                System.out.println("The factorial of "+n+" is :"+num);
                }else{
                        System.out.println("The Number is negative");
        }
}
}
