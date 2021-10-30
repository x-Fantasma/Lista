package main.java.co.list;

public class Estudiante {

    private Long nroCarnet;
    private int nroCreditos;
    private float valorCredito;
    private float porcentajeAPagar;

    public Estudiante() { }

    public Estudiante(Long nroCarnet, int nroCreditos, float valorCredito, float porcentajeDescuento) {
        this.nroCarnet = nroCarnet;
        this.nroCreditos = nroCreditos;
        setPorcentajeAPagar(porcentajeDescuento);
        setValorCredito(valorCredito);
    }

    public Long getNroCarnet() {
        return nroCarnet;
    }

    public void setNroCarnet(Long nroCarnet) {
        this.nroCarnet = nroCarnet;
    }

    public int getNroCreditos() {
        return nroCreditos;
    }

    public void setNroCreditos(int nroCreditos) {
        this.nroCreditos = nroCreditos;
    }

    public float getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(float valorCredito) {
        this.valorCredito = (valorCredito * porcentajeAPagar)/100;
    }

    public float getPorcentajeAPagar() {
        return porcentajeAPagar;
    }

    public void setPorcentajeAPagar(float porcentajeDescuento) {
        this.porcentajeAPagar = 100 - porcentajeDescuento;
    }
}
