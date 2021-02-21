class operation
{
int square(int r)
{
return r*r;
}
}
//creating a class circle
class circle
{
operation op;
double pi=3.14;
double area (int r)
{
operation op=new operation();
int sq=op.square(r);
double ar=pi*sq;
return ar;
}
}
class aggregationex1
{
public static void main(String[] args)
{
circle c=new circle();
double res=c.area(6);
System.out.println("square of circle=" +res);
}
} 