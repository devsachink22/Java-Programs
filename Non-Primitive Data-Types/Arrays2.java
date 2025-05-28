class Arrays2
{
    public static void main (String[] args)
    {
        int[] numbers = new int[5]; //declaration of array
        //insertion in array
        numbers[0] = 88;
        numbers[1] = 76;
        numbers[2] = 91;
        numbers[3] = 63;
        numbers[4] = 98;
        //iteration of array
        for (int number : numbers) {
            System.out.println(number); //print the iterated elements of array
        }
        System.out.println(numbers.length); //length of an array
        numbers[2]=74; //updation in array
        System.out.println(numbers[2]); //print an element at 2nd index value of array
    }
}