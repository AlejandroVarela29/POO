public class Raices{

    private double a,b,c;

    public Raices(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private double mostrarDiscriminante(){

        double discriminante = Math.pow(b,2) - 4 * a * c;
        System.out.println("El discriminante es :" + discriminante);
        return discriminante;
    }

    public boolean tieneRaices(){

        return mostrarDiscriminante() > 0;
    }

    public boolean tieneRaiz(){

        return mostrarDiscriminante() == 0 ;
    }

    public void obtenerRaices(){
        double discriminante = mostrarDiscriminante();
        if(tieneRaices()){

            double raiz1 = (-b+Math.sqrt(discriminante))/ (2*a);
            double raiz2 = (-b-Math.sqrt(discriminante)) / (2*a);
            System.out.println("Las raices son : " +raiz1+" y "+raiz2 );
        }else{
            System.out.println("No hay raices reales");
        }
    }

        public void obtenerRaiz(){
            
            if(tieneRaiz()){
                double raizUnica = (-b)/ (2*a);
                System.out.println("La raiz unica es :" + raizUnica);
            }else{
                System.out.println("No hay una sola raiz");
            }
        }

            public void calcular(){
                if(tieneRaices()){
                    obtenerRaices();
                }else if(tieneRaiz()){
                    obtenerRaiz();
                }else{
                    System.out.println("No hay raices ni una sola");
                }
            }
        
    }
