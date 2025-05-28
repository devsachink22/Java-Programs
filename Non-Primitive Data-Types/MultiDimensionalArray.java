class MultiDimensionalArray
{
    public static void main(String[] args)
    {
        String[][] data = {{"Sachin","Amit","Balveer"},{"Bhatia","Bhatia","Singh"}}; //declaration of 2D array
        data[1][0]="Arora"; //update the first element in the 2nd dimension of array
        for (String[] name : data)
        {
            for (String namelist : name)
            {
                System.out.println(namelist); //print all the elements of array in all the dimensions
            }
        }
        System.out.println(data.length); //identify the number of array dimensions
        for (int i=0; i<data.length; i++) //iterated the loop inside the array dimensions
        {
            System.out.println(data[i].length); //print the number of elements of an array in all dimensions
        }
    }
}