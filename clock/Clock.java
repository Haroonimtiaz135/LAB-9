
package clock;


public class Clock {
    public int hours;
    public int mins;
    public int sec;
    
    public Clock(int a, int b, int c){
        this.hours = a;
        this.mins = b;
        this.sec = c;
        
    }
    
    public void display(){
        System.out.println(hours+":"+mins+":"+sec);
    }
    
    
    
}

    

