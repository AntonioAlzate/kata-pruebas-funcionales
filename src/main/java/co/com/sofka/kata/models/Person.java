package co.com.sofka.kata.models;

public class Person {

    private String id;
    private String nombre;
    private String telefono;

    public Person(){

    }

    public Person(String nombre){
        this.nombre=nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
