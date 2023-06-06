import java.util.Scanner;
public class Main {
   public static void main(String[] args){
     Scanner s=new Scanner(System.in);
     System.out.println("enter the string");
     String str=s.nextLine();
     int counter=0;
     int count=0;
     int counting=0;
      for(int i=0;i<str.length();i++)
        {
     char ch=str.charAt(i);
          if(ch=='{')
            counter++;
          else if(ch=='}')
            counter--;
          else if(ch=='(')
            count++;
          else if(ch==')')
            count--;
          else if(ch=='[')
            counting++;
          else if(ch==']')
            counting--;
     
        }
     if(count==0 && counting==0 && counter==0)
     {
       System.out.println("True");
     }
     else
     {
       System.out.println("False");
     }
   }
  
  
    }
