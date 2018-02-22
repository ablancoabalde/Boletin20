/*
 * Nome do libro
Autor
Precio
unidades
 */
package com.alberto.libros;

public class Libros {

    private String nomLibro;
    private String Autor;
    private Float precio;
    private Integer unidades;

    public Libros(String nomLibro, String Autor, Float precio, Integer unidades) {
        this.nomLibro=nomLibro;
        this.Autor=Autor;
        this.precio=precio;
        this.unidades=unidades;
    }

    public String getNomLibro() {
        return nomLibro;
    }

    public void setNomLibro(String nomLibro) {
        this.nomLibro=nomLibro;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor=Autor;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio=precio;
    }

    public Integer getUnidades() {
        return unidades;
    }

    public void setUnidades(Integer unidades) {
        this.unidades=unidades;
    }

    @Override
    public String toString() {
        return nomLibro+", "+Autor+", "+precio+", "+unidades;
    }
    
    
           
    
    
}
