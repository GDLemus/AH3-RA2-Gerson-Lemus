package Sistema;

import java.util.LinkedList;

public class Vendedores {
    static LinkedList <Vendedores> Lista;

    static void Lista(Vendedores vendedores) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private int codigo;
    private String name;
    private int caja;
    private int ventas;
    private String genero;
    private String pass;

    public Vendedores(int codigo, String name, int caja, int ventas, String genero, String pass) {
        this.codigo = codigo;
        this.name = name;
        this.caja = caja;
        this.ventas = ventas;
        this.genero = genero;
        this.pass = pass;
    }

    Vendedores(int parseInt, String text, int parseInt0, int parseInt1, String text0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCaja() {
        return caja;
    }

    public void setCaja(int caja) {
        this.caja = caja;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

}

