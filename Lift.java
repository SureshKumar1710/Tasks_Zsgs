package test2;

public class Lift 
{
	static int[] lifts= {0,0,0,0,0};
	static int[] capacity= {10,20,10,20,30};
	
    public static void main(String[] args) 
    {
    	int i=0;
    	while(true)
    	{
    	    int source=Integer.parseInt(args[i]);
    	 
    	    if(source==-1) // end of input
    	        return;
    	 
    	    int destination=Integer.parseInt(args[i+1]);
    	    
    	    int usersCount=Integer.parseInt(args[i+2]);
    	 
    	    allocateLift(source,destination,usersCount);
    	    i+=3;
    	}
	}
    
    public static void allocateLift(int src,int dest,int usersCount)
    {
    	int distance=Integer.MAX_VALUE;
    	int lift=0;
    	for(int i =0;i<5;i++)
    	{	
    		if(isRestricted(src,dest,i))
    			continue;
    		
    		if(Math.abs(lifts[i]-src)<distance) // if lift is near
    		{
    			distance=Math.abs(lifts[i]-src);
    			lift=i+1;
    		}
    		else if(Math.abs(lifts[i]-src)==distance) // if two lifts at same distance
    		{
    			int srcDestDistance=Math.abs(src-dest);
    			int srcLiftDistance=Math.abs(lifts[i]-src);
    			if(lifts[i]!=lifts[lift] && srcDestDistance*srcLiftDistance>=0)  // check which is in same direction
    			{
    				distance=srcLiftDistance;
    			    lift=i+1;
    			}
    		}
    	}	
    	lifts[lift-1]=dest;
    	displayLifts(lift);
//    	if(capacity[lift-1]<usersCount)
//    	{
//    		usersCount-=capacity[lift-1];
//    		allocateLift(src,dest,usersCount);
//    	}
    }
    
    public static void displayLifts(int liftAllocated)
    {
    	System.out.println("L"+liftAllocated+" is assigned");
    	System.out.println("L1 L2 L3 L4 L5");
    	System.out.println(lifts[0]+"  "+lifts[1]+"  "+lifts[2]+"  "+lifts[3]+"  "+lifts[4]+"\n");
    }
    
    public static boolean isRestricted(int src,int dest,int lift)
    {
    	if(((src>=1 && src<=5) || (dest>=1 && dest<=5)) && (lift==2 || lift==3)) // restrict L3 and L4 to floors 6 to 10
			return true;
    	
		if(((src>=6 && src<=10) || (dest>=6 && dest<=10)) && (lift==0 || lift==1)) // restrict L1 and L2 to floors 1 to 5
			return true;
		
		if(lift==4 && ((src==0 && dest>=6 && dest<=10) || (src>=6 && src<=10 && dest==0)))// to select lift with few stops
			if(lifts[2]!=-1 || lifts[3]!=-1) // whether at least one life is not under maintenance
			    return true;
		
		if(lifts[lift]==-1) // if it is under maintenance;
			return true;
		
		return false;
    }
}
