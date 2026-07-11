/*
Object oriented programming Lab 5 question 5

Complete the Cinema class by

1.	writing the public Double revenue(Double ticketCost) method
which returns the revenue: the number of reserved seats multiplied by the ticketCost
For example:
Test	Result
Boolean[][] seats = 
{{false, false, false},
 {false, false, false},
 {false, false, false}};

Cinema cinema = new Cinema(seats);
System.out.println(cinema.revenue(1.24));	0.0

Boolean[][] seats = 
{{true, false, false},
 {false, true, false},
 {false, false, true}};

Cinema cinema = new Cinema(seats);
System.out.println(cinema.revenue(4.54));	13.620000000000001

Boolean[][] seats = 
{{true, true, true},
 {true, true, true},
 {true, true, true}};

Cinema cinema = new Cinema(seats);
System.out.println(cinema.revenue(1.0));

Starter code

public class Cinema 
{
	
	final public boolean reserved = true;
	public Boolean seats[][];

	//------------------------------------------------
   //complete this method
    public Double revenue(Double ticketCost)
	{
		
	return 0.0
		
	}
	//------------------------------------------------
	public Cinema(Boolean[][] seats)
	{
		this.seats = seats;
	}
	//------------------------------------------------
}	9.0
*/

public class Cinema
{
    final public boolean reserved = true;
    public Boolean seats[][];

    //------------------------------------------------
    //complete this method
    public Double revenue(Double ticketCost)
    {
        int reservedSeatsCount = 0;
        
        // Loop through all seats
        for (int row = 0; row < seats.length; row++) {
            for (int col = 0; col < seats[row].length; col++) {
                // Check if the seat is reserved (true)
                if (seats[row][col] == true) {
                    reservedSeatsCount++;
                }
            }
        }
        
        // Calculate total revenue
        return reservedSeatsCount * ticketCost;
    }
    //------------------------------------------------
    public Cinema(Boolean[][] seats)
    {
        this.seats = seats;
    }
    //------------------------------------------------
}        
