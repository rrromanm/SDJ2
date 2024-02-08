package traffic;

public class Person
{
    private boolean isWalking;
    private final String name;
    public Person(String name){
        this.name = name;
        this.isWalking = false;
    }

    public void walk(){
        if(!isWalking){
            System.out.println(name + " is walking");
            isWalking = true;
        }
    }

    public void waiting(){
        if(!isWalking){
            System.out.println(name + " is waiting");
        }
    }
    public void running(){
        if(isWalking){
            System.out.println(name + " is running");
        }
    }

}
