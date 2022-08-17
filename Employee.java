class Employee 
{
    public static int base = 10000;
    int salary()
    {
        return base;
    }
}
//inherited class
class Manager extends Employee
{
    int salary()
    {
        return base + 20000; // this method overrides parent salary()
    }
}
//another inherited class
class Clerk extends Employee
{
    int salary()
    {
        return base + 10000;
    }
}
class Main //Driver class
{
    static void printSalary(Employee e) // function method used to print salary for any type of employee using base class ref
    {
        System.out.println(e.salary());
    }
    public static void main(String[] args)
    {
        // print using funtion printSalary
        Employee myObj = new Manager();
        System.out.println("Manager's salary: ");
        printSalary(myObj); 

        Employee myObj1 = new Clerk();
        System.out.println("Clerk's salary: ");
        printSalary(myObj1);
/////////////////////////////////////////////////////////////////////
        //using objects to print salary
        System.out.println("This is the manager's salary: R" + myObj.salary());
        System.out.println("This is the clerk's salary: R" + myObj1.salary());

    }
}