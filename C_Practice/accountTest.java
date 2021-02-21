import java.util.*;
class account
{
int actno
float balance=100;
String str="";
void deposite(float amt)
{
}
balance=balance+amt;
}
void withdrawl(float amt)
{
balance=balance-amt;
}
String showbalance()
{
str="actno"+actno+"balance"+balance;
return str;
}
}
class saving extends account
{
int interest=200;
//overrridng the acccount deposite methode
void deposite(float amt)
{
balance=balance+amt;
}
}
class cuurent extends account
{
}
class accountTest
{
public static void main(Sting[] args)
{
account act=null;//create a base class vriable
Scanner s1=new Scanner(System.in);
System.out.println("enter account no");
int ano=s1.nextInt();
System.out.println("enter amount");
float amt=s1.nextFloat();
System.out.println("enter account (saving or current)");
String acttype =s1.next();
System.out.println("enter deposite or withdrawl");
String tran =s1.next();
String result="";
if(acttype equals("saving"))
{
act=new saving();
act.actno=ano;
if(tran.equals("deposite"))
{
act.deposite(amt);
}
else if(tran.equals("withdrawl"))
{
act.withdrawl(amt);
}
result=act.showbalance();
}
else if(acttype.equals("current"))
{
act=new current();
act.actno=ano;
if(tran.equals("deposit"))
{
act.deposit(amt);
}
else if(tran.equals("withdrawl"))
{
act.withdrawl(amt);
}
result= act.showbalance();
}
else
{
System.out.println("invalid inputs");
}
System.out.println(result);
}
}