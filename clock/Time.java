
package clock;


public class Time extends Clock {
    
    public Time(int a, int b, int c){
        super(a, b, c);
        
    }
    @Override
    public void display(){
        
        super.display();
        
        if (super.hours<=12){
        System.out.println(super.hours+":"+super.mins+":"+super.sec+"am");
    }
        else{
            super.hours = super.hours - 12;
            System.out.println(super.hours+":"+super.mins+":"+super.sec+"pm");
    }
        
        
    }
    
}
