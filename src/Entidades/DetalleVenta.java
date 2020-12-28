package Entidades;

public class DetalleVenta {
    
    private int Id;
    private Venta Venta;
    private Calzado Calzado;
    private int Cantidad;
    private double PrecioUnit;
    private double Total;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public Venta getVenta() {
        return Venta;
    }

    public void setVenta(Venta Venta) {
        this.Venta = Venta;
    }

    public Calzado getCalzado() {
        return Calzado;
    }

    public void setCalzado(Calzado Calzado) {
        this.Calzado = Calzado;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public double getPrecioUnit() {
        return PrecioUnit;
    }

    public void setPrecioUnit(double PrecioUnit) {
        this.PrecioUnit = PrecioUnit;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }
}
