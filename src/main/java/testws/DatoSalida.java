/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testws;

/**
 *
 * @author USUARIO
 */
public class DatoSalida {
    String mensaje1, mensaje2;
    Double totalSalud, totalPension, totalFondo, salarioRestante;

    public DatoSalida(String mensaje1, String mensaje2, Double totalSalud, Double totalPension, Double totalFondo, Double salarioRestante) {
        this.mensaje1 = mensaje1;
        this.mensaje2 = mensaje2;
        this.totalSalud = totalSalud;
        this.totalPension = totalPension;
        this.totalFondo = totalFondo;
        this.salarioRestante = salarioRestante;
    }

    public DatoSalida() {
    }

    public String getMensaje1() {
        return mensaje1;
    }

    public void setMensaje1(String mensaje1) {
        this.mensaje1 = mensaje1;
    }

    public String getMensaje2() {
        return mensaje2;
    }

    public void setMensaje2(String mensaje2) {
        this.mensaje2 = mensaje2;
    }

    public Double getTotalSalud() {
        return totalSalud;
    }

    public void setTotalSalud(Double totalSalud) {
        this.totalSalud = totalSalud;
    }

    public Double getTotalPension() {
        return totalPension;
    }

    public void setTotalPension(Double totalPension) {
        this.totalPension = totalPension;
    }

    public Double getTotalFondo() {
        return totalFondo;
    }

    public void setTotalFondo(Double totalFondo) {
        this.totalFondo = totalFondo;
    }

    public Double getSalarioRestante() {
        return salarioRestante;
    }

    public void setSalarioRestante(Double salarioRestante) {
        this.salarioRestante = salarioRestante;
    }
    
    
}
