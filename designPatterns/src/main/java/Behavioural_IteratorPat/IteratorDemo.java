package Behavioural_IteratorPat;



public class IteratorDemo {
	 public static void main(String[] args) {  
         Names cmpnyRepository = new Names();  
           
         for(Iterator iter = cmpnyRepository.getIterator(); iter.hasNext();){  
             String name = (String)iter.next();  
             System.out.println("Name : " + name);  
          }      
   }  
}
