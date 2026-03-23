public class OTP 
{  
public static void main( String args[] )   
{  
int min = 0;  
int max = 9;
char z='A';    
System.out.println("Random value of type double between "+min+" to "+max+ ":");  
int a =(int)( Math.random()*(max-min+1)+min);   
int b =(int)( Math.random()*(max-min+1)+min);   
int c =(int)( Math.random()*(max-min+1)+min);   
int d =(int)( Math.random()*(max-min+1)+min);   
int e =(int)( Math.random()*(max-min+1)+min);   
int f =(int)( Math.random()*(max-min+1)+min);
++z;   
System.out.println("Your OTP is:"+z+a+b+c+d+e+f);
}  
}  