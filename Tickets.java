import java.util.jar.Attributes.Name;

import javax.swing.InputMap;

public class Tickets {
    int row;
    int seat;
    int price;
    person tPerson;
    
     public Tickets(int row,int seat,int price,person tPerson){ //tperson=person object
       this.row=row;
       this.seat=seat;
       this.price=price;
       this.tPerson=tPerson;


    }
    public void print(){
        System.out.println("Name: "+tPerson.name);
        System.out.println( "Surname: "+tPerson.surname);
        System.out.println("Email: " +tPerson.email);
        System.out.println( "Row Number: "+row);
        System.out.println("Seat Number: "+seat);
        System.out.println("Ticket Price: "+price+"$");
    }
}
