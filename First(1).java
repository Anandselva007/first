import java.util.*;
public class Demo
{
    public static void main(String[] args) 
    {
        int number;
        Scanner sc = new Scanner(System.in);
        number=sc.next();
        if(number > 0)
        {
            System.out.println(number+" is a positive number");
        }
        else if(number < 0)
        {
            System.out.println(number+" is a negative number");
        }
        else
        {
            System.out.println(number+" is neither positive nor negative");
        }
    }
}

