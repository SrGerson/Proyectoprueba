package UPC_ciclo1.Ejercicio3;

public class Vendedores {


    private String codigo;
    private int bono;
    private double MaxVenta;

    public double getMaxVenta() {
        return MaxVenta;
    }

    public void setMaxVenta(double maxVenta) {
        MaxVenta = maxVenta;
    }

    private double venta1;
    private double venta2;
    private double venta3;
    private double totalVentas;
    private double Promedioventas;
    private String vendedorPremium;

    public String getVendedorPremium() {
        return vendedorPremium;
    }

    public void setVendedorPremium(String vendedorPremium) {
        this.vendedorPremium = vendedorPremium;
    }

    public double getVenta1() {
        return venta1;
    }

    public double getVenta2() {
        return venta2;
    }

    public double getVenta3() {
        return venta3;
    }

    public void setTotalVentas(double totalVentas) {
        this.totalVentas = totalVentas;
    }

    public void setPromedioventas(double promedioventas) {
        Promedioventas = promedioventas;
    }

    public Vendedores(String codigo) {
        this.codigo = codigo;
    }

    public Vendedores(String codigo,double venta1, double venta2, double venta3) {

        this.venta1 = venta1;
        this.venta2 = venta2;
        this.venta3 = venta3;
        this.codigo =codigo;
    }

    public Vendedores() {
    }

    public String getCodigo() {
        return codigo;
    }

    public int getBono() {
        return bono;
    }

    public void setBono(int bono) {
        this.bono = bono;
    }

    public double getTotalVentas() {
        return totalVentas;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setVenta1(double venta1) {
        this.venta1 = venta1;
    }

    public void setVenta2(double venta2) {
        this.venta2 = venta2;
    }

    public void setVenta3(double venta3) {
        this.venta3 = venta3;
    }

    public double getPromedioventas() {
        return Promedioventas;
    }





}

