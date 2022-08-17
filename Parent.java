class Parent 
{
    //base class
    void show()
    {
        System.out.println("Parent's show()");
    }
}
//inherited class
class child extends Parent
{
    void show()
    {
        System.out.println("Child's show()"); //this method overrides the Parent show()
    }
}
//another ingerited class
class grandChild extends child
{
    void show()
    {
        System.out.println("grand Child's show()"); //this method overrides the Parent show()
    }
}
class Main
{
    public static void main(String[] args) 
    {
        Parent myObj = new grandChild();
        Parent myObj1 = new child();
        myObj.show();
        myObj1.show();
    }
}
