 //name:     date:   
   import java.text.DecimalFormat;
    public class SmartCard_shell
   {
       public static void main(String[] args) 
      {
         Station downtown = new Station("Downtown", 1);
         Station center = new Station("Center City", 1);
         Station uptown = new Station("Uptown", 2);
         Station suburbia = new Station("Suburb", 4);
        
         SmartCard jimmy = new SmartCard(20.00); //bought with $20.00 
         jimmy.board(center);            		    //boarded in zone 1
         jimmy.disembark(suburbia);					 //disembark in zone 4
			jimmy.board(suburbia);
			jimmy.addMoney(2.75);
			jimmy.disembark(center);
			jimmy.board(center);
			jimmy.disembark(downtown);
         //jimmy.disembark(uptown);					 //disembark without having boarded
      	
      	//lots more test cases!				
      }
   }
   class SmartCard 
   {
		private int boardZone;
		private double moneyRemaining;
		private boolean boarded;
		
		public SmartCard(double z)
		{
			moneyRemaining = z;
			boardZone = 1;
			boarded = false;
		}
		public void addMoney(double z)
		{
			System.out.println("You added "+z+" dollars to your card");
			moneyRemaining = moneyRemaining+z;
		}
		public void board(Station s)
		{
			if(moneyRemaining<.50)
			{
				System.out.println("Lol you poor. Get some mula up in that joint before you try to crack another diggity-dizzle");
				System.exit(0);
			}
			if(boarded)
			{
				System.out.println("Woops, you already boarded, but you didn't get off. You look like a fool now, don't you");
				System.exit(0);
			}
			//add if statement for disembark and stuff
			boardZone = s.getZone();
			boarded = true;
		}
		public double cost(Station d)
		{
			int ba = boardZone;
			int da = d.getZone();
			double c = .5;
			
			if(ba==da)
			{
				return c;
			}
			else
			{
				if(ba>da)
				{
					for(int i = ba-1; i>=da; i--)
					{
						c= c+.75;
					}
					return c;
				}
				else if(ba<da)
				{
					for(int i = ba+1; i<=da; i++)
					{
						c = c+.75;
					}
					return c;
				}
			}
			return .9999999999999999;
		}
		public void disembark(Station s)
		{
			if(boarded)
			{
				boarded = false;
				moneyRemaining = moneyRemaining - cost(s);
				String x = ("Disembarking at "+s.getName()+" costed "+cost(s)+". You have "+moneyRemaining+" left on your card.");
				System.out.println(x);
			}
			else
			{
				System.out.println("Stop this maddness and get on a train before you try to get off one.");
				System.exit(0);
			}
		}
						
						
   
   }
   class Station
   {
		private String name;
		private int zone;
		
		public Station(String n, int z)
		{
			name = n;
			zone = z;
		}
		public Station()
		{
			name = "Dunn Loring";
			zone = 3;
		}
		public int getZone()
		{
			return zone;
		}
		public String getName()
		{
			return name;
		}  
		public String toString()
		{
			String s = (name+"station is located in zone"+zone);
			return s;
		} 
   }