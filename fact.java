import java.io.*;
class fact
{
public static void main(String args[])throws IOException
{
int fact=1;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter number:");
int num=Integer.parseInt(br.readLine());
for(int i=1;i<=num;i++)
{
fact=fact*i;
}
System.out.println("factorial of a number:"+fact);
}
}
