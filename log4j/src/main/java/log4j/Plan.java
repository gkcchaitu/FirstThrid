package log4j;


abstract class Plan {
    protected double rate;  
    abstract void getRate();  

    public double calculateBill(double Sqrfoot){  
         return(Sqrfoot*rate);  
     }  
}
