import java.util.Scanner;

public class Homework4 {
    static int swap(int num1, int num2){
        int temp;
        temp=num1;
        num1=num2;
        num2=temp;
    }

    static int gcd(int m,int n){
    if (m==0)
        return m;
    else if (m%n==0)
        return n;
    else if (m<n){
        swap(m,n);
        gcd(m,n);}
    else
        while (n !=0){
            int temp;
            temp=m%n;
            m=n;
            n=temp;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("두수를 입력하세요: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("두수의 최대공약수는 "+ gcd(num1,num2)+" 입니다.");
    }
}