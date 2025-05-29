class JavaParameter1
{
    static void Method1(int a, int b)
    {
        System.out.printf("Sum of two numbers using method parameters: %d\n", a+b);
    }
    public static void main (String[] args)
    {
        Method1(5,6);
        Method1(8,5);
    }
}