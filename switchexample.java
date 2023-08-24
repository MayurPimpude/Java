class switchexample

{
   
 public static void main(String arg[])
 
   {
   
     int week=2;
   
     String day =null;
    
    switch (week){
        
  
          case 1:
             
   	day="mon";
         
       break;
        
  	  case 2:
           
    	 day="tue";
       
         break;
           
 	case 3:
        
        day="wed";
        
        break;
        
  	  case 4:
           
   	 day="thurs";
       
         break;
        
    	case 5:
         
    	  day="fri";
       
         break;
        
   	 default:
         
      day="weekend";
         
       break;
      
  }
   
 System.out.println("day is "+day);
}

}