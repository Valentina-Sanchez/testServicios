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
public class Trabajador {
    String nombre, tipoContrato;
    Double salario;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Trabajador(String nombre, String tipoContrato, Double salario) {
        this.nombre = nombre;
        this.tipoContrato = tipoContrato;
        this.salario = salario;
    }

    public Trabajador() {
    }
    
    
}
