//calculate the roots of equation
class root
{public static void main(String arg[])
{ double d,r1,r2,a=2.3,b=4,c=5.6,re,im;
  
  d=(b*b)-(4*a*c);
if(d>0)
{
r1=r2=(-b/(2*a));
System.out.println("\nfirst roots are "+r1);
System.out.println("\nsecond roots are "+r2);
}
else if(d==0)
{ r1=(((- b) + Math.sqrt(d))/(2*a));
  r2=(((- b) - Math.sqrt(d))/(2*a));
System.out.println("\n first root is "+r1);
System.out.println("\n second root is "+r2);
}
else
{
re = (-b/(2*a));
im = ((Math.sqrt(-d))/(2*a));
System.out.println("\nroot 1 ,real part= "+re);
System.out.println("root 1,imaginary part= i*"+im);
System.out.println("\nroot 2 ,real part= "+re);
System.out.println("root 2 imaginary part= -i*"+im);
}}}