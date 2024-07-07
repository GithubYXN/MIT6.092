class FooCorporation{
    public static void Salary(double BasePay, int Hours){
        if(BasePay < 8.00 || Hours > 60)
            System.out.println("Illegal!");
        else{
            double salary = 0.0;
            if(Hours <= 40) salary += BasePay*Hours;
            else salary = 40*BasePay + (Hours-40)*BasePay*1.5;
            System.out.println("The salary is $" + salary);
        }
    }

    public static void main(String[] args){
        Salary(7.5,35);
        Salary(8.2, 47);
        Salary(10,73);
    }
}