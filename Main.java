
import java.util.Calendar;

/**
 * Ejercicio 430: Usar la clase Calendar para obtener la diferencia entre
 * dos fechas distintas.
 *
 * @author John Ortiz Ordoñez
 */
public class Main {

        public static void main(String[] args) {

                System.out.println("*********************");

                /** 
                 * Bloque de codigo que indica la logica desde-hasta
                 */

                Calendar fechaInicial = Calendar.getInstance();
                Calendar fechaFinal = Calendar.getInstance();

                fechaInicial.set(2022, 8, 01);
                fechaFinal.set(2022, 8, 30);

                int contadorDias = 0;

                while (fechaInicial.before(fechaFinal) || fechaInicial.equals(fechaFinal)){
                        contadorDias++;
                        fechaInicial.add(Calendar.DATE, 1);
                        
                }
                System.out.println(contadorDias);

                /**
                 * Bloque de codigo que indica los dias habiles
                 **/

                /* int contadorDiaHabil = 0;
                int contadorFinde = 0;
                // mientras la fecha inicial sea menor o igual que la fecha final se cuentan los dias
                while (fechaInicial.before(fechaFinal) || fechaInicial.equals(fechaFinal)) {
                        if (fechaInicial.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY && fechaInicial.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY) {
                                // se aumentan los dias de diferencia entre min y max
                                contadorDiaHabil++;
                        } else if(fechaInicial.get(Calendar.SATURDAY) != Calendar.DAY_OF_WEEK){
                                contadorFinde++;
                        } else if(fechaFinal.get(Calendar.SUNDAY) !=Calendar.DAY_OF_WEEK){
                                contadorFinde++;
                        }
                        // se suma 1 dia para hacer la validacion del siguiente dia.
                        fechaInicial.add(Calendar.DATE, 1);
                }
                System.out.println(contadorDiaHabil);
                System.out.println(contadorFinde); */

                System.out.println("****************");

        }

}
