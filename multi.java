public class multi{
    public static void main(String [] args){
       

     

        int n = 3,r=1;

        for(int i = 1 ;i<=12;i++) {

            for(int j=1;j<=12;j++) {
                System.out.print(i + " x " + j + " = "  +(i*j) + "\t");
            }
            
            
                System.out.println("");
                r++;
                if((r>=13)&&((r%12)==1)){
                    n+=3;
                    j=n-2;
                    
                }
          
            System.out.println();

           
        }

      
      
        
    }
}