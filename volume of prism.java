class VolumeOfPrism 
{
   public static void main(String args[]) 
    {   
	
         Scanner scanner= new Scanner(System.in);
         System.out.println("Enter the area of base:");
         double base=scanner.nextDouble();
         System.out.println("Enter the height:");
         double height=scanner.nextDouble();
 
      `double  a= VolumeOfPrism.Volume(base,height); 
 
             System.out.println("Volume Of Prism is:" +a);
      }
     public static double Volume(double b,double h) 
    {   
       
                 double  a=b*h ;
 
                 return a;
      }
}
