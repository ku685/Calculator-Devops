package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class Calculator {

    private static final Logger logger = LogManager.getLogger(Calculator.class);
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
            System.out.println("1.Factorial\n2.Square Root\n3.Power of two number\n4.Natural Log \n5.EXIT");
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
            break;
            case 3:  // find power
                System.out.print("Enter  number 1 : ");
                n1 = scanner.nextDouble();
                System.out.print("Enter  number  2: ");
                n2 = scanner.nextDouble();
                System.out.println(n1+ "power "+n2+" is : " + calculator.power(n1, n2));
                System.out.println("\n");
                break;
            case 4:  System.out.print("Enter a number : ");
                n1 = scanner.nextDouble();
                System.out.println("Natural log of "+n1+" is : " + calculator.naturalLog(n1));
                System.out.println("\n");

                break;

            default:System.out.println("Terminating  calculator Application");
            return;
        }
        }while(true);
    }

    public double naturalLog(double n1) {

        logger.info("[Naturallog ]-"+n1);
        double result = 0;
        try {

            if (n1 <0 ) {
                result = Double.NaN;
                throw new ArithmeticException("Case of NaN 0.0/0.0");
            }
            else {
                result = Math.log(n1);
            }
        } catch (ArithmeticException error) {
            System.out.println(" Cannot find log of negative numbers " + error.getLocalizedMessage());
        }
        logger.info("[result]-"+result);
        return result;
    }

    public double power(double n1, double n2) {
        logger.info("[power]-"+n1+"[to]-"+n2);
        double ans =Math.pow(n1,n2);
        logger.info("[result]-"+ans);
        return ans;
    }

    public double squareroot(double n1) {
        logger.info("[squareroot]-"+n1);
        double ans = Math.sqrt(n1);
        logger.info("[result]-"+ans);
        return ans;
    }

    public double factorial(double ny)
        {
            logger.info("[factorial]-"+ny);
            double result=1 ;
            for(int i = 1; i <= ny; ++i)
            { result *= i;   }
            logger.info("[result]-"+result);
            return result;
        }

}
