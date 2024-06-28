package tarea2entornos.maestre;
public class  BiciMTB {
   //Atributos
    private String marca;
    private String modelo;
    private int suspensiones;
    private int platos;
    private String nueva2mano;
    private double precio;
    //Constructor vacio
    public BiciMTB() {
    }
    //Constructor recibe atributos
    public BiciMTB(String marca, String modelo, int suspensiones, int platos, String nueva2mano, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.suspensiones = suspensiones;
        this.platos = platos;
        this.nueva2mano = nueva2mano;
        this.precio = precio;
    }
    //Metodo toString()
    @Override
    public String toString() {
        return "BiciMTB{ " + "marca= " + marca + ", modelo= " + modelo + ", suspensiones= " 
       + suspensiones + ", platos= " + platos + ", nueva2mano= " + nueva2mano + ", precio= " + precio + '}';
    }
    //Mostrar datos con metodo toString()
    public static void main(String[] args) {
        BiciMTB BiciMTB1= new BiciMTB("SCOTT", "Scale 20", 2, 3,
                "Nueva", 575.25);    
        System.out.println(BiciMTB1.toString());
    }
    
//    //Metodo GET
//    public String getMarca() {
//        return marca;
//    }
//
//    public String getModelo() {
//        return modelo;
//    }
//
//    public int getSuspensiones() {
//        return suspensiones;
//    }
//
//    public int getPlatos() {
//        return platos;
//    }
//
//    public String getNueva2mano() {
//        return nueva2mano;
//    }
//
//    public double getPrecio() {
//        return precio;
//    }
//    //Metdo SET
//    public void setMarca(String marca) {
//        this.marca = marca;
//    }
//
//    public void setModelo(String modelo) {
//        this.modelo = modelo;
//    }
//
//    public void setSuspensiones(int suspensiones) {
//        this.suspensiones = suspensiones;
//    }
//
//    public void setPlatos(int platos) {
//        this.platos = platos;
//    }
//
//    public void setNueva2mano(String nueva2mano) {
//        this.nueva2mano = nueva2mano;
//    }
//
//    public void setPrecio(double precio) {
//        this.precio = precio;
//    }
//    
//      //Metodo Main
        //Mostrar datos con metodo toString() con GET y SET

//   public static void main(String[] args) {
//        BiciMTB BiciMTB1= new BiciMTB();
//    //SET
//    BiciMTB1.setMarca("SCOTT");
//    BiciMTB1.setModelo("Scale 20");
//    BiciMTB1.setSuspensiones(2);
//    BiciMTB1.setPlatos(3);
//    BiciMTB1.setNueva2mano("nueva");
//    BiciMTB1.setPrecio(575.25);
//    
//    //GET
//    System.out.println(BiciMTB1.getMarca());
//    System.out.println(BiciMTB1.getModelo());
//    System.out.println(BiciMTB1.getSuspensiones());
//    System.out.println(BiciMTB1.getPlatos());
//    System.out.println(BiciMTB1.getNueva2mano());
//    System.out.println(BiciMTB1.getPrecio());
//    }

}

    