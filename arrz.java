/*sum of array elements*/

import java.util.*;

class arrz

{

public static void main(String args[])

{

double sum=0;
System.out.println("");

Scanner in = new Scanner(System.in);

double arr[] =new double[2];

System.out.println("Enter array : ");



for (int i=0;i<2;i++)

{
    
arr[i] = in.nextDouble();
   

}


System.out.println("List is:");


for(int i=0;i<arr.length;i++)

{
   
 System.out.println(arr[i]);

}

for(int i=0;i<arr.length;i++)

{
sum = sum + arr[i];
}
System.out.println("sum of element:"+sum);
}


}