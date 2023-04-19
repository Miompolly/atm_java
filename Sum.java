public class Sum{
Sum(){};
public int Sum(int a,int b){
    return a+b;
}
public int Sum(int a,int b,int c){
    return a+b+c;
}


    public static void main(String[]args) {
        Sum py=new Sum();
        py.Sum(12,13);
      
        System.out.println(py);
    }
}