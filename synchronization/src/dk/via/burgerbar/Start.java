package dk.via.burgerbar;

public class Start
{
  public static void main(String[] args)
  {
    Burgerbar bar = new Burgerbar(20);

    BurgerbarEmployee employee1 = new BurgerbarEmployee("Marat", bar);
    BurgerbarEmployee employee2 = new BurgerbarEmployee("Patrik", bar);

    BurgerbarCustomer customer1 = new BurgerbarCustomer("Tomas", 5, bar);
    BurgerbarCustomer customer2 = new BurgerbarCustomer("Samuel", 2, bar);
    BurgerbarCustomer customer3 = new BurgerbarCustomer("Sebastian", 3, bar);
    BurgerbarCustomer customer4 = new BurgerbarCustomer("Romans", 1, bar);
    BurgerbarCustomer customer5 = new BurgerbarCustomer("Maciej", 4, bar);

    Thread t1 = new Thread(employee1);
    Thread t2 = new Thread(employee2);
    Thread t3 = new Thread(customer1);
    Thread t4 = new Thread(customer2);
    Thread t5 = new Thread(customer3);
    Thread t6 = new Thread(customer4);
    Thread t7 = new Thread(customer5);

    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();
    t6.start();
    t7.start();
  }

}
