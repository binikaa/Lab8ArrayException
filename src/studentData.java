import java.util.Scanner;
// student database program

public class studentData {

	 static public Scanner scr= new Scanner(System.in);
	 static String[] StudentHometown= { "Detroit","Chicago","Florida","Texas","Detroit",
             "California","Detroit","Chicago","Boston","Boston",
             "Florida","Boston","Texas","Chicago","California",
             "California","Detroit","Chicago","Boston","Boston"};
	 static String[] StudentFavfood= {"pizza","pasta","tacos","frenchfries","cupcake",
			                          "pizza","pasta","tacos","frenchfries","cupcake",
			                          "pizza","pasta","tacos","frenchfries","cupcake",
			                          "pizza","pasta","tacos","frenchfries","cupcake"};
	 static String[] studentName= {"Kim","John","Emma","Ava","Emily"
             ,"Jacob","Liam","Ethan","William"
             ,"Alexander","Madison","Abigail"
             ,"Mia","Olivia","Sofia","Avery"
             ,"Harper","Charlotte","Zoey","Grace"};


	public static void main(String[] args) {
		try {
		System.out.println("Welcome to our java class."
				+ "\nWhich student would you like to learn more about?"
				+ "\n(enter a number 1-20):");
		
		
		int[] studentNum= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
	   
		
		 
		int studentNo= studentDataScanInput();//scan input from user
      
        boolean a = studentValidation(studentNo);//check for valid student no
         while(a!=true)// keep asking user untill valid input is entered 
         {
    	   System.out.println("This student does not exist.\n"
    	   		+ "Please try again(enter a number 1-20)");
    	   studentNo= studentDataScanInput();
    	     	   a = studentValidation(studentNo);
         }
         for(int i =0;i<studentName.length;i++)
         { 
        	 if(studentNo==i)
        	 {
        	 System.out.println(studentName[studentNo]);
        	 System.out.println("\nDo you want to know more about "+studentName[studentNo]+
        			             "?\n(Enter y /n ?)");
        	 String  userInput = scr.nextLine();
        	 
        	        while(userInput.equals("y"))
        	          {
        	        	System.out.println("Enter hometown or favorite food");
        	        	String choice= scr.nextLine();
        	     
        	        	boolean b = choiceValidation(choice);
        	        	if (b==true)
        	        	{
        	        		switch(choice)
        	        		{
        	        		case "hometown":provideHometownData(studentNo);
        	        		                System.exit(0);
            	        	                 break;
        	        		           
        	        		
        	        		case "favorite food":provideFoodData(studentNo);
        	        		                   System.exit(0);
            	        	break;	
        	        		}
        	        	}	
        	        	else
        	        	{
        	        		System.out.println("That data does not exist");
        	        		System.out.println("Please try again");
        	        		userInput="y";
        	        
        	        	}
        	      
                      }
        	       
        	          	System.out.println("Thanks");
        	        	System.exit(0);
        	        	                    
        	 }
        	 
         
         }
	
}
     catch(IndexOutOfBoundsException | IllegalArgumentException e)
        {
	        System.out.println("That data is not valid");
        }
	}
   public static void provideHometownData(int stNo)
	{
		for(int i=0;i<StudentHometown.length;i++) {
			if(stNo==i)
				System.out.println(studentName[i]+" is from " + StudentHometown[i]);
		}	
	}
public static void provideFoodData(int stNo)
	{
		for(int i=0;i<StudentFavfood.length;i++) {
			if(stNo==i)
				System.out.println(studentName[i]+" 's favorite food is "+StudentFavfood[i]);
		}	
	}
	public static boolean choiceValidation(String choice)
	{
		if(choice.equals("hometown")||choice.equals("favorite food")) 
			return true;
		else 
			return false;
	}
	public static int studentDataScanInput()
	{
		 
	       int studentNo = Integer.parseInt(scr.nextLine());
	       return studentNo;
	
	}
	public static boolean studentValidation(int num)
	{
		if(num>20 || num<0)
			return false;
		else
			return true;
	}

}
