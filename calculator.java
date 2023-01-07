import java.util.*;

public class calculator {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=sc.nextInt();
        System.out.println("Enter a Math Symbol");
        char s=sc.next().charAt(0);
        if (s=='='){
            double cal=n;
            System.out.println(cal);
            System.exit(0);

        }
        System.out.println("Enter a Number");
        int n2=sc.nextInt();

        double cal;
        if(s=='+'){
            cal=n+n2;
        }
        else if(s=='-'){
            cal=n-n2;
        }
        else if(s=='*'){
            cal=n*n2;
        }
        else  {
            cal=n/n2;
        }
       
        
        System.out.println("Enter a Math Symbol");
         s=sc.next().charAt(0);
        if(s=='='){
            System.out.println(cal);
            System.exit(0);

        }
        while(s!='='){
            System.out.println("Enter a Number");
            n2=sc.nextInt();
            if(s=='+'){
                cal=cal+n2;
            }
            else if(s=='-'){
                cal=cal-n2;
            }
            else if(s=='*'){
                cal=cal*n2;
            }
            else{
                cal=cal/n2;
            }
            System.out.println("Enter a Math Symbol");
             s=sc.next().charAt(0);

        }
System.out.println(cal);

    }
}