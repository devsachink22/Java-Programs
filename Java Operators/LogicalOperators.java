class LogicalOperators
{
    public static void main(String[] args)
    {
        int x=10, y=4;
        System.out.println(x>5 && y<=4); //AND operator checks both the conditions should be implemented
        System.out.println(x>=10 || y<3); //OR operator checks either one of the conditions should be implemented
        System.out.println(!(x>5 && y<=4)); //NAND operator checks both the conditions should not be implemented
        System.out.println(!(x>=10 || y<3)); //NOR operator checks either one of the conditions should not be implemented
    }
}