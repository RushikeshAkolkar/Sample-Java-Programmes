import java.util.*;
class Sorting
{
public static void main(String args[])
{
List arryList=new ArrayList();
Scanner sc=new Scanner(System.in);
System.out.println("how many element do you want");
int n=sc.nextInt();
int no;
System.out.println("enter your element");
for(int i=0;i<n;i++)
{
no=sc.nextInt();
arryList.add(no);
}
HashSet hashset=new HashSet(arryList);
List arrayList2=new ArrayList(hashset);
System.out.println("your element in sorted order is ");
for(Object o:arrayList2)
System.out.println(o);
}
}