public class SortArgs {
    public static void sort(String[] args) {
        for (int i = 0; i < args.length; i++) {
            for (int j = i + 1; j < args.length; j++) {
                if (Integer.parseInt(args[j]) < Integer.parseInt(args[i])) {
                    String tmp = args[i];
                    args[i] = args[j];
                    args[j] = tmp;
                }
            }
        }
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i]);
            if (i < args.length - 1) { 
                System.out.print(" ");
            }
        }
        System.out.println(); 
    }
}