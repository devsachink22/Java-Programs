class Strings
{
    public static void main(String[] args)
    {
        String name = "Sachin Kumar"; //declaration of string
        System.out.printf("My name is %s\n",name); //print a string
        System.out.println("Length of string is: "+name.length()); //length of a string
        System.out.println("Index value of h is: "+name.indexOf("h")); //identifies the index value of a character inside string
        System.out.println("Index value of Kumar is: "+name.indexOf("Kumar")); //identifies the index value of a character inside string
        System.out.println("Index value of a is: "+name.indexOf("a",2)); //identifies the index value of a character inside string after ignoring n indexes
        System.out.println(name.toUpperCase()); //converts all the characters of string to uppercase
        System.out.println(name.toLowerCase()); //converts all the characters of string to lowercase

        String surname = " Bhatia"; //initialization of string
        System.out.println("Length of string is: "+surname.length()); //identifies the number of characters inside a string
        String fullname = name + surname; //concatination of multiple strings
        System.out.println("My full name is "+fullname); //print a string

        String s = "\"45\\5\"\n=9"; //back slash is always used to print the special characters like " or \
        System.out.println(s); //print a string
    }
}