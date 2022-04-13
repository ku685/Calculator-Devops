import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public Calculator() {
    }
    public static  void main(String[] args)
    {
        Calculator calculator= new Calculator();
        Scanner scanner=new Scanner(System.in);
        double n1,n2;
        System.out.println("Calculator has started");

        do{

            System.out.println("Enter your choice");
            System.out.println("1.Factorial\n2.Square Root");
            int opt;
            try{
                opt= scanner.nextInt();
            }catch (InputMismatchException error)
            {
                return ;
            }
        switch (opt)
        {
            case 1://1 for factorial
            System.out.println("Enter Number");
            n1=scanner.nextDouble();
            System.out.println("Factorial of"+n1+"is:"+calculator.factorial(n1)+"\n");
            break;
            case 2:System.out.println("Enter Number");
            n1=scanner.nextDouble();
            System.out.println("Square Root of"+n1+" "+"is:"+calculator.squareroot(n1)+"\n");

            default:System.out.println("exiting calculator");
            return;
        }
        }while(true);
    }

    public double squareroot(double n1) {
        double ans = Math.sqrt(n1);
        return ans;
    }

    public double factorial(double ny)
        {
            double result=1 ;
            for(int i = 1; i <= ny; ++i)
            { result *= i;   }
            return result;
        }

}
