import java.io.*;
import java.util.Scanner;
import java.lang.*;
public class Encrypt
{
public static void main(String args[]) throws IOException
{
 int a[]=new int[1000];
char ch[][]=new char [10][10];
int count=0;
String st="";
FileInputStream f0=new FileInputStream("d:/game/p531/IDEA/send.txt");
int s=f0.available();
for(int i=0;i<(s);i++)
{
char w=(char)f0.read();
st+=w;
}

//sending side


int n=32;
while(n<130)
{
for(int j=0;j<10;j++)
{
for(int k=0;k<10;k++)
{
ch[j][k]=(char)n;
n++;
}
}
}

int k=st.length();
//System.out.println(n);
for(int i=0;i<k;i++)
{
char c=st.charAt(i);
for(int p=0;p<=9;p++)
{
for(int q=0;q<=9;q++)
{
if(c==ch[p][q])
{
a[count++]=p;
a[count++]=q;
}
}
}
}

OutputStream f1=new FileOutputStream("file.txt");
int i=0;
String rst="";
while(i<(2*k))
{
rst+=a[i];
i++;
}
byte buf[]=rst.getBytes();
f1.write(buf);
f1.close();
}
}