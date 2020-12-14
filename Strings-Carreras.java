/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocarreras;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author asthertm
 */
public class ProyectoCarreras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String cadena = "====";
        int contCadena = 0;

        ArrayList<String> listaParticipantes = new ArrayList<>();
        ArrayList<String> listaApellidos = new ArrayList<>();
        ArrayList<String> listaHermanos = new ArrayList<>();
        int numHermanos = 0;

        int nCasos = teclado.nextInt();
        teclado.nextLine();

        for (int i = 0; i < nCasos; i++) {
            boolean casoPruebaTerminado = false;

            while (!casoPruebaTerminado) {
                while (contCadena != nCasos) {
                    String datosParticipante = teclado.nextLine();

                    if (!datosParticipante.equals(cadena)) {
                        listaParticipantes.add(datosParticipante);
                    } else {
                        contCadena++;

                        for (int j = 0; j < listaParticipantes.size(); j++) {
                            String apellidos = listaParticipantes.get(j).substring(0, listaParticipantes.get(j).indexOf(","));
                            listaApellidos.add(apellidos);
                        }

                        for (int k = 0; k < listaApellidos.size() - 1; k++) {

                            if (listaApellidos.get(k).equalsIgnoreCase(listaApellidos.get(k + 1))) {
                                listaHermanos.add(listaParticipantes.get(k));
                                numHermanos++;
                                listaHermanos.add(listaParticipantes.get(k + 1));
                                numHermanos++;
                            }
                        }

                        System.out.println(listaParticipantes.size() + " " + numHermanos);
                        for (int l = 0; l < listaHermanos.size(); l++) {
                            System.out.println(listaHermanos.get(l));
                        }
                        listaParticipantes.clear();
                        listaHermanos.clear();
                        listaApellidos.clear();
                        numHermanos = 0;
                    }
                }
                casoPruebaTerminado = true;

            }
        }
    }

}
