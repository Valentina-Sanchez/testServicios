/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author USUARIO
 */
@WebService(serviceName = "testws")
public class testws {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    @WebMethod(operationName = "informacion")
    public DatoSalida informacion(@WebParam(name = "persona") Trabajador trabajador) {
        DatoSalida datoSalida = new DatoSalida();

        datoSalida.setMensaje1("Hola!" + trabajador.getNombre());

        if (trabajador.getTipoContrato().equalsIgnoreCase("i")) {
            if (trabajador.getSalario() >= 828116 && trabajador.getSalario() <= 3000000) {
                Double totalSalud = (trabajador.getSalario() * 3) / 100;
                datoSalida.setTotalSalud(totalSalud);

                Double totalPension = (trabajador.getSalario() * 4) / 100;
                datoSalida.setTotalPension(totalPension);

                Double totalRestante = trabajador.getSalario() - (totalSalud - totalPension);

                Double totalFondo = (totalRestante * 1.2) / 100;

                totalRestante = -trabajador.getSalario();

                datoSalida.setSalarioRestante(totalRestante);

                datoSalida.setTotalFondo(totalFondo);

                datoSalida.setMensaje2("Para tu contrato de tipo independiente, tu salario es: " + trabajador.getSalario());

                return datoSalida;
                
            } else if (trabajador.getSalario() > 3000000) {
                Double totalSalud = (trabajador.getSalario() * 5) / 100;
                datoSalida.setTotalSalud(totalSalud);

                Double totalPension = (trabajador.getSalario() * 6) / 100;
                datoSalida.setTotalPension(totalPension);

                Double totalRestante = trabajador.getSalario() - (totalSalud - totalPension);

                Double totalFondo = (totalRestante * 1.2) / 100;
                datoSalida.setTotalFondo(totalFondo);
                totalRestante = -trabajador.getSalario();

                datoSalida.setSalarioRestante(totalRestante);
                datoSalida.setMensaje2("Para tu contrato de tipo independiente, tu salario es: " + trabajador.getSalario());

                return datoSalida;
            }
        }else if (trabajador.getTipoContrato().equalsIgnoreCase("p")) {
            if (trabajador.getSalario() >= 828116 && trabajador.getSalario() <= 3000000) {
                Double totalSalud = (trabajador.getSalario() * 14) / 100;
                datoSalida.setTotalSalud(totalSalud);

                Double totalPension = (trabajador.getSalario() * 16) / 100;
                datoSalida.setTotalPension(totalPension);

                Double totalRestante =  (totalSalud - totalPension) - trabajador.getSalario();
              
                double total = totalRestante-trabajador.getSalario();

                datoSalida.setSalarioRestante(total);

                datoSalida.setMensaje2("Para tu contrato de tipo prestación , tu salario es: " + trabajador.getSalario());

                return datoSalida;

            } else if (trabajador.getSalario() > 3000000) {
                Double totalSalud = (trabajador.getSalario() * 14) / 100;
                datoSalida.setTotalSalud(totalSalud);

                Double totalPension = (trabajador.getSalario() * 16) / 100;
                datoSalida.setTotalPension(totalPension);

                Double totalRestante = trabajador.getSalario() - (totalSalud - totalPension);

                Double totalFondo = (totalRestante * 1.2) / 100;
                datoSalida.setTotalFondo(totalFondo);
                totalRestante = -trabajador.getSalario();

                datoSalida.setSalarioRestante(totalRestante);
                datoSalida.setMensaje2("Para tu contrato de tipo prestación, tu salario es: " + trabajador.getSalario());

                return datoSalida;
            }
        }else if (!trabajador.getTipoContrato().equalsIgnoreCase("i") || !trabajador.getTipoContrato().equalsIgnoreCase("p")) {

                datoSalida.setMensaje2("Solo se permite tipo de contrato i para 'independiente' o p para 'Prestacion' ");

                return datoSalida;
    }
        return datoSalida;
    }

}

