final class Employee
{
    final String pancardNumber;

    public Employee(String pancardNumber){
        this.pancardNumber=pancardNumber;
    }

    public String getPancardNumber(){
        return pancardNumber;
    }

}


public class imm1
{
    public static void main(String[] arg)
    {
        Employee e=new Employee("abc123");
        System.out.println("pancard no " + e.getPancardNumber());
    }
}
