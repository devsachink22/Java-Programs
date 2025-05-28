class SmallestNumber
{
    public static void main (String[] args)
    {
    int[] numbers = {45,675,24,36,7,9,10};
    for (int i=1; i<numbers.length; i++)
    {
        if (numbers[0]>numbers[i])
        {
            numbers[0] = numbers[i];
        }
    }
    System.out.println(numbers[0]);
    }
}