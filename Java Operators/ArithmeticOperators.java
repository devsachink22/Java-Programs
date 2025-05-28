class ArithmeticOperators
{
    public static void main(String[] args)
    {
        int x, y, sum, sub, mul, mod, inc, dec;
        float div;
        x = 12;
        y = 5;
        sum = x+y;
        sub = x-y;
        mul = x*y;
        div = x/y;
        mod = x%y;
        inc = ++x;
        dec = --y;
        System.out.println("Addition: "+sum);
        System.out.println("Subtraction: "+sub);
        System.out.println("Multiplication: "+mul);
        System.out.println("Division: "+div);
        System.out.println("Modulus/Remainder: "+mod);
        System.out.println("Pre-increment: "+inc);
        System.out.println("Pre-decrement: "+dec);
    }
}