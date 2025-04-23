package introduccion;

public class HolaMundo{
    public static void main(String[] args){
        System.out.println("hola mundo!");
        //System.out.println("Numero de argumentos: " + args.length);

        if (args.length >= 1){
            System.out.println("hola, " + args[0]);
        
        }
    
        for (int i = 0; i < args.length; ++i){
            System.out.println(args[i]);
        }
    }
}    
