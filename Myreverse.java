import java.util.*;
class Myreverse
{
public static void main(String  args[])
{
LinkedList ll=new LinkedList();
ll.add("first");
ll.add("Second");
ll.add("third");
ll.add("four");
ll.add("five");
Iterator it=ll.listIterator();
while(it.hasPrevious())
{
System.out.println(it.previous());
}
}
}