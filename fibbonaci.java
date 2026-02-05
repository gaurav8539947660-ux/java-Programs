import java.util.Scanner;

public class fibbonaci{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = 0;
        int second =1;
        if (n<=0){
          System.out.println("enter positiv");
        }
        else if(n==1){
          System.out.print(first);
        }
        else{
          System.out.print(first + " "+ second + " ");
        }
        for(int i =2 ;i<=n;i++){
          int next = first + second;
          System.out.print(next + " ");
          first = second;
          second = next;
        }

  }
  }