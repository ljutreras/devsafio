import java.util.Calendar;

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
                int contadorHabil = 0;
                int contadorFinde = 0;
                boolean diaHabil = false;

                while (fechaInicial.before(fechaFinal) || fechaInicial.equals(fechaFinal)){                      
                        contadorDias++;
                        if(fechaInicial.get(Calendar.DAY_OF_WEEK)!= Calendar.SATURDAY && fechaInicial.get(Calendar.DAY_OF_WEEK)!= Calendar.SUNDAY) {
                                diaHabil = true;
                                
                        }else{
                                diaHabil=false;
                                contadorFinde++;
                        }

                        if(diaHabil == true){
                                contadorHabil++;
                        }
                        fechaInicial.add(Calendar.DATE, 1);

                        
                }
                System.out.println(contadorDias);
                System.out.println(contadorHabil);
                System.out.println(contadorFinde);

                System.out.println("****************");

        }

}

