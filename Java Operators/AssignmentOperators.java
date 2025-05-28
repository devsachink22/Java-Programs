class AssignmentOperators
{
    public static void main(String[] args)
    {
        int a=7, b=0, c=4, d=11, e=10, f=5, g=6, h=6, i=6, j=6;
        System.out.printf("Addition: %d\n",a+=2);
        System.out.printf("Subtraction: %d\n",b-=1);
        System.out.printf("Multiplication: %d\n",c*=10);
        System.out.printf("Division: %d\n",d/=2);
        System.out.printf("Modulus/Remainder: %d\n",e%=3);
        System.out.printf("AND Gate Multiplication: %d\n",f&=7);
        System.out.printf("OR Gate Addition: %d\n",g|=2);
        System.out.printf("XOR Gate Addition: %d\n",h^=2);
        System.out.printf("Right Shift: %d\n",i>>=3);
        System.out.printf("Left Shift: %d\n",j<<=3);
    }
}