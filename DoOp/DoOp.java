public class DoOp {
    public static String operate(String[] args) {
        if (args.length == 0){
            return "it depend on the input.";
        }

        int res = 0;
        int a1 = Integer.parseInt(args[0]);
        int a3 = Integer.parseInt(args[2]);
        if (args[1] == "+"){
            res = a1 + a3;
        }else if (args[1] == "-") {
            res = a1 - a3;
        }else if (args[1] == "*"){
            res = a1 * a3;
        }else if (args[1] == "/"){
            if (a3 == 0){
                return "Error";
            }
            res = a1 / a3;
        }else if (args[1] == "%"){
            if (a3 == 0){
                return "Error";
            }
            res = a1 % a3;
        }else{
            return Integer.toString(res);
        }
        return Integer.toString(res);
    }
}