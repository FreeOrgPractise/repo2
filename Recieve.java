import java.io.*;
import java.util.Scanner;
import java.lang.*;
public class Recieve
{
public static void main(String args[]) throws IOException
{
 int a[]=new int[1000];
char ch[][]=new char [10][10];
int count=0;
String st="";
int n=32;
while(n<130)
{
for(int i=0;i<=9;i++)
{
for(int j=0;j<=9;j++)
{
ch[i][j]=(char)(n);
n++;
}
}
}
FileInputStream f0=new FileInputStream("d:/game/p531/IDEA/file.txt");
int s=f0.available();
for(int i=0;i<(s);i++)
{
char w=(char)f0.read();
st+=w;
}
int i=0;
while(i<s)
{
a[i]=Integer.parseInt(st.substring(i,i+1));
i++;
}
String rs="";
i=0;
while(i<s)
{
int p=a[i++];
int q=a[i++];
rs+=ch[p][q];
}
OutputStream f1=new FileOutputStream("recieved.txt");
byte buf[]=rs.getBytes();
f1.write(buf);
f1.close();
}
}