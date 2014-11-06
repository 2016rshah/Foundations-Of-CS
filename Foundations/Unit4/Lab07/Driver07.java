	//Name______________________________ Date_____________
    public class Driver07
   {
      public static final int TRIALS = 100;
       public static void main(String[] args)
      {
         Dice d = new Dice();
         int count = 0;
         do
         {
            d.roll();
            count = count + 1;
         }while(d.total() != 12);
         System.out.println("It took " + count 
                           + " rolls to get boxcars.");
      
      	int count2=0;
			int roll=0;
			do
			{
				d.roll();
				//System.out.println(d.total());
				if(d.doubles()==false)
				{
				count2=count2+1;
				}
				roll=(d.total()/2);
				
			}while(d.doubles()==false);
			System.out.println("It took " + count2 + " rolls to get doubles."+"{"+roll+","+roll+"}");
			
			int[] array = new int[12];
			
			
			for(int i=0; i<100; i++)
			{
				d.roll();
				if(d.doubles()==true)
				{
					count++;
				}
				array[d.total()-1]++;
				// switch (d.total())
// 				{
// 					case 2:
// 					{
// 						array[1]++;
// 						break;
// 					}
// 					case 3:
// 					{
// 						array[2]++;
// 						
// 						break;
// 					}
// 					case 4:
// 					{
// 						array[3]++;
// 						break;
// 					}
// 					case 5:
// 					{
// 						array[4]++;
// 						break;
// 					}
// 					case 6:
// 					{
// 						array[5]++;
// 						break;
// 					}
// 					case 7:
// 					{
// 						array[6]++;
// 						break;
// 					}
// 					case 8:
// 					{	array[7]++;
// 						break;
// 					}
// 					case 9:
// 					{	array[8]++;
// 						break;
// 					}
// 					case 10:
// 					{	array[9]++;
// 						break;
// 					}
// 					case 11:
// 					{	array[10]++;
// 						break;
// 					}
// 					case 12:
// 					{	array[11]++;
// 						break;
// 					}
// 					default:
// 					{
// 							System.out.print("lol wut?");
// 					}

							
				}
					
				
					System.out.println("2's: "+array[1]);
					System.out.println("3's: "+array[2]);
					System.out.println("4's: "+array[3]);
					System.out.println("5's: "+array[4]);
					System.out.println("6's: "+array[5]);
					System.out.println("7's: "+array[6]);
					System.out.println("8's: "+array[7]);
					System.out.println("9's: "+array[8]);
					System.out.println("10's :"+array[9]);
					System.out.println("11's :"+array[10]);
					System.out.println("12's :"+array[11]);	
					System.out.println("Number of doubles: "+count);				
      
      }
   }
	/******
	 It took 35 rolls to get boxcars.
    It took 4 rolls to get doubles: {1, 1}
    2's:  6
    3's:  6
    4's:  5
    5's:  10
    6's:  12
    7's:  20
    8's:  17
    9's:  6
    10's:  10
    11's:  4
    12's:  4
    Number of doubles in 100 rolls: 18
	 ********/