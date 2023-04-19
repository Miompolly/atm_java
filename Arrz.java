public class Arrz {
    public static void main(String[] args) {
        int[] array1 = {0, 9, 8, 2, 5, 1};
        
        for (int i = 0; i < array1.length; i++) {
         
            for (int j = i; j <array1.length-1; j++) {
                int swap=0;
               if(array1[j]< array1[j+1]){
                swap=array1[j+1];
                array1[j+1]=array1[j];
                array1[j]=swap;
               }
            }
           
        };
        for(int k=0;k<array1.length;k++){
            System.out.print(array1[k]+" ");
        }
        System.out.println(" ");
}
}