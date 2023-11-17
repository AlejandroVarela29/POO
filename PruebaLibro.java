public class PruebaLibro{

    public static void main(String args[]){
        
        Libro l1 = new Libro("Nose", "Robert Louis Stevenson", "La isla del tesoro",20);
        Libro l2 = new Libro("Nose","Varela","Varela y sus desventuras", 25);

        System.out.println("El ISBN es : " + l1.getISBN() +" ,El nombre es : " + l1.getNombre() + " ,El titulo es : " + l1.getTitulo() + " ,Las paginas son : " + l1.getPaginas());
        System.out.println("El ISBN es : " + l2.getISBN() + " ,El nombre es : " + l2.getNombre() + " ,El titulo es : " + l2.getTitulo() + " ,Las paginas son : " + l2.getPaginas());
        System.out.println("\n el libro " + l1.getTitulo()+ "tiene " + l1.getPaginas() + " paginas y el libro " + l2.getTitulo() + " tiene " + l2.getPaginas()+ " paginas");
        System.out.println("El libro " + l2.getTitulo() + " tiene mas paginas que " + l1.getTitulo());
        



        
    }
}