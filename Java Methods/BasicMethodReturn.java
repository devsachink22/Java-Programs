public class BasicMethodReturn
{
    static int Method1(String name, int age)
    {
        int name1 = (int)(name);
        return name1+age;
    }
    public static void main (String[] args)
    {
        System.out.println(Method1("Sachin", 25));
    }
}