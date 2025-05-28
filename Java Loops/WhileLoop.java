/*Program to find the sum of all the digits of integer*/
class WhileLoop
{
    public static void main(String[] args)
    {
        int number = 675, reminder = 0, sum = 0;
        while (number>0) //condition
        {
            reminder = number % 10;
            number=number/10;
            sum+=reminder;
        }
        System.out.println(sum);
    }
}