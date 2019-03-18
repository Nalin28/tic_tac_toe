import java.util.*;
public class tic_tac_toe {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int model[][] = {{0,0,0},
		                {0,0,0},
		                {0,0,0}};
		boolean flag = false;
		int k = 1;
		int moves = 1;
		System.out.println("----------------------------lets start!--------------------------------");
		HashMap<Integer,Integer> map = new HashMap<>();
		map.put(0,0);
		map.put(1,0);
		map.put(2,0);
		map.put(10,0);
		map.put(11,0);
		map.put(12,0);
		map.put(20,0);
		map.put(21,0);
		map.put(22,0);
		while(flag != true)
		{
			if(moves>9)
			{
				System.out.println("----------------------deadlock!-------------------------");
				break;
			}
	    System.out.println("its player "+k+"'s turn : ");
	    int x = sc.nextInt();//1
	    int y = sc.nextInt();//2
	    while(x<0 || x>2 || y<0 || y>2)
	    {
	    	System.out.println("watch it!");
	    	x = sc.nextInt();//1
		    y = sc.nextInt();//2
	    }
	    int xy = x+10*y;
	    
	    	while(map.get(xy)==1)
	    	{
	    	System.out.println("dont cheat!");
	    	System.out.println("re-enter!! : ");
	    	 x = sc.nextInt();//1
		     y = sc.nextInt();//2
		     xy = x+10*y;
	    	}
		    
	    	model[x][y] = k;
	    	map.put(xy,map.get(xy)+1);
	    System.out.println(model[0][0]+"_|_"+model[0][1]+ "_|_"+model[0][2]);
	    System.out.println(model[1][0]+"_|_"+model[1][1]+ "_|_"+model[1][2]);
	    System.out.println(model[2][0]+" | "+model[2][1]+ " | "+model[2][2]);
	    
	    if((model[0][0] == k && model[0][1] == k && model[0][2] == k)||(model[0][0] == k && model[1][1] == k && model[2][2] == k)||(model[0][0] == k && model[1][0] == k && model[2][0] == k)||(model[0][1] == k && model[1][1] == k && model[2][1] == k)||(model[1][0] == k && model[1][1] == k && model[1][2] == k)||(model[0][2] == k && model[1][2] == k && model[2][2] == k)||(model[2][0] == k && model[2][1] == k && model[2][2] == k)||(model[0][2] == k && model[1][1] == k && model[2][0] == k))
	       {
	           System.out.println("-----------------------------player "+k+" is the winner!!!---------------------------------");
	           flag = true;
	       }
	    ++k;//3
	    if(k%2 != 0)
	        k = 1;//1
	    ++moves;
		}
	}
}
