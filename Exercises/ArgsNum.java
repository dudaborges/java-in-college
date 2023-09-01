public class ArgsNum{
    public static void main(String[] args){
        int len = args.length;

        if (len >= 2){
            System.out.println("Argumentos passados na linha de comando: ");
            for (int i = 0; i < len; i++){
                System.out.printf("%s%n", args[i]);
            }
        } else {
            System.out.println("Precisa passar pelo enos 2 argumentos!");
        }
    }
}