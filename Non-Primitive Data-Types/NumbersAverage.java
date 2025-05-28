class NumbersAverage
{
    public static void main (String[] args)
    {
        int[] numbers = new int[10];
        numbers[0]=67;
        numbers[1]=89;
        numbers[2]=54;
        numbers[3]=71;
        numbers[4]=99;
        numbers[5]=74;
        numbers[6]=41;
        numbers[7]=92;
        numbers[8]=86;
        numbers[9]=77;
        int sum = 0;
        int length = numbers.length;
        for (int i : numbers)
        {
            sum+=i;
        }
        System.out.println(sum/length);
    }
}