import java.util.Scanner;
public class MaxHandshakes{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        int handshake;
        handshake =(n*(n-1))/2;
        System.out.println(handshake);
    }
}