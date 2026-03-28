public class Exp {
    public int method3(int a, int b)throws ArithmeticException {
        if(b==0){
            throw new ArithmeticException("Not Divisible by Zero");
        }
        
            return a/b;
         
        
    }
     public int method2(int a, int b) throws ArithmeticException{
       return  method3(a,b);
    }
     public int method1(int a, int b) throws ArithmeticException{
        return method2(a,b);
    }
    public static void main(String args[]){
        Exp exp=new Exp();
        try {
            int res=exp.method1(10,0);
            System.out.println(res);
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
         
        
    }
    
}
