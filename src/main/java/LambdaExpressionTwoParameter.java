
interface Addable{
    int add(int a,int b);
}



public class LambdaExpressionTwoParameter {
//Without return
    public static void main(String[] args) {
   Addable a1=(a,b)-> a+b;
        System.out.println(a1.add(10,20));


//with return
        Addable a2=(int a,int b)->{return a+b;};
        System.out.println(a2.add(15,20));
    }


}
