/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author estra
 */
public class Atributos {
    private int Id;
    private String Name;
    private String Descrip;
    private String Marca;
    private String Categoria;
    private double Price;
    private int Unidades;

    public Atributos() {
    }

    public Atributos(int Id, String Name, String Descrip, String Marca, String Categoria, double Price, int Unidades) {
        this.Id = Id;
        this.Name = Name;
        this.Descrip = Descrip;
        this.Marca = Marca;
        this.Categoria = Categoria;
        this.Price = Price;
        this.Unidades = Unidades;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDescrip() {
        return Descrip;
    }

    public void setDescrip(String Descrip) {
        this.Descrip = Descrip;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public int getUnidades() {
        return Unidades;
    }

    public void setUnidades(int Unidades) {
        this.Unidades = Unidades;
    }

    @Override
    public String toString() {
        return "Atributos{" + "Id=" + Id + ", Name=" + Name + ", Descrip=" + Descrip + ", Marca=" + Marca + ", Categoria=" + Categoria + ", Price=" + Price + ", Unidades=" + Unidades + '}';
    }
    
    
}
