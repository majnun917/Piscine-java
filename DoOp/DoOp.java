public class DoOp {
    public static String operate(String[] args) {
        if (args.length != 3){
            return "Error";
        }
        int res = 0;
        int a1 = Integer.parseInt(args[0]);
        String op = args[1];
        int a3 = Integer.parseInt(args[2]);

        switch(op){
            case "+":
                res = a1 + a3;
                break;
            case "-":
                res = a1 - a3;
                break;
            case "*":
                res = a1 * a3;
                break;
            case "/":
                if (a3 == 0){
                return "Error";
                }
                res = a1 / a3;
                break;
            case "%":
                if (a3 == 0){
                return "Error";
                }
                res = a1 % a3;
                break;
            default:
                return "Error";

        }
        return Integer.toString(res);
    }
}