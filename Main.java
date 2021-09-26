import java.util.*;

public class Main {
  public static void main(String[] args) {
    var in = new Scanner(System.in);
    var N = in.nextInt();
    /*System.out.println("Just like this:");
    System.out.println("♡♡♥♥♥♡♡♡♥♥♥♡♡");
    System.out.println("♡♥♥♥♥♥♡♥♥♥♥♥♡");
    System.out.println("♥♥♥♥♥♥♥♥♥♥♥♥♥");
    System.out.println("♡♥♥♥♥♥♥♥♥♥♥♥♡");
    System.out.println("♡♡♥♥♥♥♥♥♥♥♥♡♡");
    System.out.println("♡♡♡♥♥♥♥♥♥♥♡♡♡");
    System.out.println("♡♡♡♡♥♥♥♥♥♡♡♡♡");
    System.out.println("♡♡♡♡♡♥♥♥♡♡♡♡♡");
    System.out.println("♡♡♡♡♡♡♥♡♡♡♡♡♡");
    System.out.println("but in size "+N);
    */

    //Calculate the rows
  int rows;
  rows = N * 3 + (2 * ( N - 1 ));

  //If N is not odd, lastrow =0
  int lastrow;
  if (rows % 2 == 0) {
    lastrow = 1;
  }else{
    lastrow = 0;
  }
  //If N=1
 if (N==1){
 System.out.println("♥♡♥");
 System.out.println("♡♥♡");
 }

 //Top part
  else{
  for(int i=0; i<=N-2; i++)
{
  for (int j=1; j<=rows; j++)
  {
    if((j>=N-i && j<=2*N-1+i) || (j>=3*N-i && j<=3*N+N-1+i))
    System.out.print("♥");
    else
    System.out.print("♡");
  }
  System.out.println("");
}
 //triangle   
for (int i= 0; i<=rows/2-lastrow; i++)  
{ 
for (int j= 1; j<=rows; j++)
{
if (j>=i+1 && j<=rows-i)
System.out.print("♥");
else
System.out.print("♡");
}
System.out.println("");
}}}}
  
//for (int j=0; j<=i; j++ )  
//{  
//System.out.print("♡");  
//}  
//for (int k=0; k<=rows-i; k++)  
//{  
//System.out.print("♥");  
//}  
//System.out.println();  
//}  
//}  
//}  
  
 // }
  

