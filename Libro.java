public class Libro{
    
    private String ISBN;
    private String nombre;
    private String titulo;
    private int paginas;

    public Libro(String ISBN, String nombre, String titulo, int paginas){
        this.ISBN = ISBN;
        this.nombre = nombre;
        this.titulo = titulo;
        this.paginas = paginas;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    
}
