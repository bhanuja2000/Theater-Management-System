import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.*;
import java.util.ArrayList;

public class Theatre {

    static ArrayList<Tickets> ticket1=new ArrayList<Tickets>(); //arraylist declaring
    static int quit_option=1;
    public static void main(String[] args){         //declaring main 3 arrays
        int[] Row_1={0,0,0,0,0,0,0,0,0,0,0,0};
        int[] Row_2={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int [] Row_3={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
       
        while(quit_option!=0){      //this for quit opton
            try{
            
        
        Scanner input = new Scanner(System.in); //get inputs for options
        System.out.println("");
        System.out.println("Welcome to the New Theatre");  // menu printing
            System.out.println(("----------------------------"));
            System.out.println("Please select an option:");
            System.out.println("1) Buy a ticket");
            System.out.println("2) Print seating area");
            System.out.println("3) Cancel ticket");
            System.out.println("4) List available seats");
            System.out.println("5) Save to file");
            System.out.println("6) Load from fil");
            System.out.println("7) Print ticket information and total price");
            System.out.println("8) Sort tickets by price");
            System.out.println("0) Quit");
            System.out.println(("----------------------------"));
            
           
            
            System.out.println("Enter option:");//get inputs for options
            int option=input.nextInt();
            if(option==1){
                //methods calling
            buy_ticket(Row_1,Row_2,Row_3);
            
            
            }
            else if(option==2){
                print_seating_area(Row_1,Row_2,Row_3);
            }
            else if(option==3){
                cancel_ticket(Row_1,Row_2,Row_3);
            }
            else if(option==4){
                show_available(Row_1,Row_2,Row_3);
            }
            else if(option==5){
                save(Row_1,Row_2,Row_3);
            }
            else if(option==6){
                load(Row_1,Row_2,Row_3);
            }
            else if(option==7){
                show_tickets_info(ticket1);
            }
            else if(option==0){
                Quit();
            }
            else if(option==8){
                BubbleSort();
            }
            else{
                System.out.println(" you entred wrong option number Please entre 0-8 numbers");
            }
        }
            catch(Exception e){
                System.out.println(e+" "+"you enter wrong input");
            }
            
            
            
            
           
        }
       
            

        
       
    }
    public static void buy_ticket(int x[],int y[],int z[]){ //   x=Row_1,y=Row_2,z=Row_3 buy ticket method
        Scanner m1_input=new Scanner(System.in); // m1_input object  for person class
        System.out.println("name");
        String name=m1_input.nextLine();    //input name
        System.out.println("Enter your seat row");
        int row_option=m1_input.nextInt(); //input row for book
        System.out.println("inpu your seat number");
        int seat_option=m1_input.nextInt(); //input seat for book
        System.out.println("ticket price");
        int price=m1_input.nextInt(); //input price for ticket printing and sorting process
        System.out.println("enter surname");
        String suraname=m1_input.next(); //input surname for print tickets
        System.out.println("enter email");
        String email=m1_input.next(); //input email for tikets
        person tPerson=new person(name, suraname, email); //create a object for person class
        Tickets tickets=new Tickets(row_option,seat_option, price,tPerson); //create a object for Tickets class
         
        
       
        
        
        if(row_option==1){ //first row seat availability and checking and booking seats
            for(int i=0;i<x.length;i++){
                if(x[seat_option-1]==0){
                    System.out.println("this seat is avalable");
                    x[seat_option-1]=1;
                    System.out.println("Seat booking is successful");
                    ticket1.add(tickets);   //adding arraylist
                    break;
                }else{
                    System.out.println("this seat not avalable in this row");
                    break;
                }
                


            }
            
        }

        else if(row_option==2){  // second  row seat availability and checking and booking seats
            for(int l=0;l<y.length;l++){
                if(y[seat_option-1]==0){
                    System.out.println("this seat is avalable");
                    y[seat_option-1]=1;
                    System.out.println("Seat booking is successful");
                    ticket1.add(tickets);  //adding arraylist
                    break;
                }
                else{
                    System.out.println("this seat not avalable in this row");
                    break; 
                }

            }
        }
        else if(row_option==3){    //third row seat availability and checking and booking seats
            for(int k=0;k<z.length;k++){
                if(z[seat_option-1]==0){
                    System.out.println("this seat is avalable");
                    z[seat_option-1]=1;
                    System.out.println("Seat booking is successful");
                    ticket1.add(tickets); //adding arraylist
                    break;
                }
                else{
                    System.out.println("this seat not avalable"); 
                    break;
                }
            }
        }
        else{
            System.out.println("you entred wrong row number Please entre valid row number"); //for wrong input
        }
        
        

    }
    public static void print_seating_area(int l[],int f[],int p[]){ //l=Row_1,f=Row_2,p=Row_3   printing seating area method
        for(int i=0;i<5;i++){
            System.out.print(" ");
           }
           System.out.println("***********"); //printing stage
           for(int k=0;k<5;k++){
            System.out.print(" ");
           }
           System.out.println("*  STAGE  *");
           for(int j=0;j<5;j++){
            System.out.print(" ");
           }
           System.out.print("***********");
           System.out.println(" ");
           System.out.print("    ");
           for(int w=0;w<l.length;w++){ //first row printing seats
            if(l.length/2==w){
                System.out.print(" ");
            }
            if(l[w]==0){
                System.out.print("o");
            }
            else{
                System.out.print("x");
            }
        }
        System.out.println("");//Second row printing seats
        System.out.print("   ");
        for(int q=0;q<f.length;q++ ){
            if(f.length/2==q){
                System.out.print(" ");
            }
            if(f[q]==0){
                System.out.print("o");
            }
            else{
                System.out.print("x");
            }
            
        }
        System.out.println(); //third row printing seats
        System.out.print("  ");
        for(int a=0;a<p.length;a++){
            if(p.length/2==a){
                System.out.print(" ");
            }
            if(p[a]==0){
                System.out.print("o");
            }
            else{
                System.out.print("x");
            }
            
        }
        System.out.println(" ");
        

    }
    public static void cancel_ticket(int r1[],int r2[],int r3[]){  //   r1=Row_1,r2=Row_2,r3=Row_3 cancel ticket method
        Scanner input_2=new Scanner(System.in);
        System.out.println("input a row number "); //input the row
        int cancel_row=input_2.nextInt();
        System.out.println("input the seat number");
        int cancel_seat=input_2.nextInt();   //input seat
        if(cancel_row==1){      //row 1 cancelling process
            
                if(r1[cancel_seat-1]==1){
                    r1[cancel_seat-1]=0;
                    
                    
                }
                else{
                    System.out.println("this seat is avalable not booked");
                    
                }
            
        }
        else if(cancel_row==2){         //row 2 cancelling process
            if(r2[cancel_seat-1]==1){
                r2[cancel_seat-1]=0;
            }
            else{
                System.out.println("this seat is avalable not booked");
            }
        }
        else if(cancel_row==3){   //row 3 cancelling process
            if(r3[cancel_seat-1]==1){
                r3[cancel_seat-1]=0;
            }
            else{
                System.out.println("this seat is avalable not booked");
            }
        }
        else{
            System.out.println("you enter wrong row number");
        }
        // arraylist ticket1 object cancelling prosees
        for(int i=0;i<ticket1.size();i++){ //
        Tickets tik=ticket1.get(i);
        if(tik.row==cancel_row&&tik.seat==cancel_seat){
            ticket1.remove(i);
        }
        }

    }
    public static void show_available (int y1[],int y2[],int y3[]){   //   y1=Row_1,y2=Row_2,y3=Row_3 show avalible method
        System.out.print("Seats available in row 1: ");
        for(int i=0;i<y1.length;i++){
            if(y1[i]==0){
                System.out.print(i+1+",");
            }
       

        }
        System.out.println();
        System.out.print("Seats available in row 2: ");
        for(int i=0;i<y2.length;i++){
            if(y2[i]==0){
                System.out.print(i+1+",");
            }
            
        }
        System.out.println();
        System.out.print("Seats available in row 3: ");
        for(int i=0;i<y3.length;i++){
            if(y3[i]==0){
                System.out.print(i+1+",");
            }
            
        }
        System.out.println("");
        
    }
    public static void save(int z1[],int z2[],int z3[]){    // z1=Row_1,z2=Row_2,z3=Row_3  save method
        try{
            FileWriter myWriter = new FileWriter("theater.txt"); //theater.txt (save file name)
            BufferedWriter bw = new BufferedWriter( myWriter);
            for(int i=0;i<z1.length;i++){
                bw.write(Integer.toString(z1[i]));
                bw.write(",");
              
            }
            bw.write("\n");
            
            
            
            

            for(int u=0;u<z2.length;u++){
                bw.write(Integer.toString(z2[u]));
                bw.write(",");
                
            }
            bw.write("\n");
          
            
            
            
    
            for(int j=0;j<z3.length;j++){
                bw.write(Integer.toString(z3[j]));
                bw.write(",");
            }
            bw.write("\n");
            
            
            bw.close();
            myWriter.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
       
    }
    public static void load(int l[], int r[], int p[]) { //  l=Row_1,r=Row_2,p=Row_3 loading file method
        try {
            File file = new File("theater.txt");
            Scanner scanner = new Scanner(file);
            
            String[] val;
            int indexL = 0; //for first row
            int indexR = 0; // for second row
            int indexP = 0; // for third row
            while (scanner.hasNextLine()) {
                val = scanner.nextLine().split(",");
                for (int j = 0; j < val.length; j++) {
                    if (indexL < l.length) { //first row 12 seats file loading
                        l[indexL] = Integer.parseInt(val[j]);
                        indexL++;
                    } else if (indexR < r.length) {     //second row 16 seats file loading
                        r[indexR] = Integer.parseInt(val[j]);
                        indexR++;
                    } else if (indexP < p.length) {     //third row 20 seats file loding 
                        p[indexP] = Integer.parseInt(val[j]);
                        indexP++;
                    }
                }
            }
            System.out.println("file load complete");
            
            scanner.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    
    
    public static void show_tickets_info(ArrayList<Tickets> ticket1){   //ticket show method
        int c=1;
        for(Tickets elemnts:ticket1){       //ticket1 arraylist reading
            System.out.println("ticket Number: "+c);  //printing ticket number
            elemnts.print();
            c=c+1;
            
        }
        
    }
    private static void BubbleSort() {  //sort method
        int bottom = ticket1.size() - 2;
        Tickets temp;
        boolean exchanged = true;
        while (exchanged) {
            exchanged = false;
            for (int i = 0; i <= bottom; i++) {
                if (ticket1.get(i).price > ticket1.get(i+1).price) {
                    temp = ticket1.get(i);
                    ticket1.set(i, ticket1.get(i+1));
                    ticket1.set(i+1, temp);
                    exchanged = true;
                }       
            }
        }
        bottom--;
    }

    public static void Quit(){    
        quit_option=0;
    }
}
