public class ConcatStrategy implements OperationStrategy{
    public int execute(int a, int b){
        String aStr = String.valueOf(a);
        String bStr = String.valueOf(b);
        return Integer.parseInt( aStr + bStr);
    }
}
