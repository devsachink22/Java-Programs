class TypeCasting
{
    public static void main(String[] args)
    {
        int a = 2;
        float b = a; //widening java type casting
        System.out.println(b);

        char c = 's';
        int i = c; //convert the char type to ASCII using widening java type casting
        System.err.println(i);

        double x = 5.6;
        short y = (short)x; //narrowing java type casting
        System.out.println(y);
    }
}