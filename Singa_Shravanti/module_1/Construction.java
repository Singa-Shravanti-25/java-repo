interface structure{
    public void constructionn();
    public void wiring();
    public void plumbing();
}
abstract class Building{
    public void floors(){

    };
    public void furniture(){
        System.out.println("This building consists of a basic furniture ");
    }
    public void paint(){
        System.out.println("By default the building is painted white");
    }
    public void windows(){
        System.out.println("Building consists of two windows for each room");
    }
}
 class Residential extends Building implements structure{
    public void constructionn(){
        System.out.println("It is  a italian style of construction.");
    }
    public void plumbing(){
        System.out.println("The plumbing style is segregated for each floor and flat");
    } 
    public void wiring(){
        System.out.println("The style of wiring is w.r.t the basic 220v AC current");
    }
    public void floors(){
        System.out.println("The residential building consists of 4 storey");
    }
 }
 class Industrial extends Building implements structure{
    public void constructionn(){
        System.out.println("It is  a traditional style of construction.");
    }
    public void plumbing(){
        System.out.println("The plumbing style is unit wise based on requirement");
    } 
    public void wiring(){
        System.out.println("The style of wiring is w.r.t the basic 1000watts of high voltage");
    }
    public void floors(){
        System.out.println("The industrial building consists of just one base storey");
    }
 }
 class Office extends Building implements structure{
    public void constructionn(){
        System.out.println("It is  a asethetic style of construction.");
    }
    public void plumbing(){
        System.out.println("The plumbing style is wing wise based on requirement");
    } 
    public void wiring(){
        System.out.println("The style of wiring is w.r.t the basic 230v of standard DC current");
    }
    public void floors(){
        System.out.println("The industrial building consists of just 15 base storey");
    }
 }
public class Construction {
    
}
