//Alumno: Jose de Jesus Carrizales Guzman

package publicacion;
import java.util.*;

public class Principal {

    public static void main(String[] args) {
        
      //Se podrá realizar un ArrayList de tipo Object?
      //Pregunta de reflexión y de calificación
      /*Aparentemente, es posible utilizar un ArrayList segun la investigacion que he realizado, al igual que es posible 
      declarla de tipo "OBJECT". Sin embargo, por motivos de comodidad, asi como para evitar conflictos con el codigo ya
      existente, he optado por usar la opcion actual.*/
      
      //Fuente: https://doc.4d.com/4Dv16/4D/16.6/ARRAY-OBJECT.301-4445665.es.html  
        
        int ctrlpub = 0;
        int opc = 0;
        int sel = 0;
        String issn = "";
        String isbn = "";
        String titulo = "";
        String edicion = "";
        String autor = "";
        double precio = 0;
        int numero = 0;
        int year = 0;
        int numpag = 0;
        Scanner leer = new Scanner(System.in);
        Object publicaciones [] = new Object[10]; //reservamos espacio
        //Damos de alta constante, para ejemplificar
        //Revista
        
        do{
            System.out.println("MENU");
            System.out.println("1) Dar de alta");
            System.out.println("2) Mostrar registros");
            System.out.println("3) Salir");
            System.out.print("Elija una opcion [1 - 3]: ");
            opc = leer.nextInt();
            switch(opc){
               case 1:
                  System.out.println("1) Revista");
                  System.out.println("2) Libro");
                  System.out.println("3) Periodico");
                  System.out.print("Elija la publicacion a añadir [1 - 3]: ");
                  sel = leer.nextInt();
                  switch(sel){
                     case 1:
                        leer.nextLine();
                        Revista revista = new Revista();
                        System.out.print("Introduzca el ISSN de la revista: ");
                        issn = leer.nextLine();
                        revista.setISSN(issn);
                        System.out.print("Introduzca el titulo de la revista: ");
                        titulo = leer.nextLine();
                        revista.setTitulo(titulo);
                        System.out.print("Introduzca el precio de la revista: ");
                        precio = leer.nextDouble();
                        revista.setPrecio(precio);
                        System.out.print("Introduzca el numero de la revista: ");
                        numero = leer.nextInt();
                        revista.setNumero(numero);
                        System.out.print("Introduzca el año de la revista: ");
                        year = leer.nextInt();
                        revista.setAnio(year);
                        System.out.print("Introduzca el numero de paginas de la revista: ");
                        numpag = leer.nextInt();
                        revista.setNumpag(numpag);
                        publicaciones[ctrlpub] = revista;
                        ctrlpub++;
                        System.out.println("Registro completado.");
                        break;
                     case 2:
                        leer.nextLine();
                        Libro libro = new Libro();
                        System.out.print("Ingrese el ISBN del libro: ");
                        isbn = leer.nextLine();
                        libro.setISBN(isbn);
                        System.out.print("Ingrese el titulo del libro: ");
                        titulo = leer.nextLine();
                        libro.setTitulo(titulo);
                        System.out.print("Ingrese el autor del libro: ");
                        autor = leer.nextLine();
                        libro.setAutor(autor);
                        System.out.print("Ingrese la edicion del libro: ");
                        edicion = leer.nextLine();
                        libro.setEdicion(edicion);
                        System.out.print("Ingrese el precio del libro: ");
                        precio = leer.nextDouble();
                        libro.setPrecio(precio);
                        System.out.print("Ingrese el numero de paginas: ");
                        numpag = leer.nextInt();
                        libro.setNumpag(numpag);
                        publicaciones [ctrlpub] = libro; //guarda el objeto en el arreglo
                        ctrlpub++;
                        System.out.println("Registro completado.");
                        break;
                     case 3:
                        leer.nextLine();
                        Periodico periodico = new Periodico();
                        System.out.print("Ingrese el ISSN del periodico: ");
                        issn = leer.nextLine();
                        periodico.setISSN(issn);
                        System.out.print("Ingrese el titulo del periodico: ");
                        titulo = leer.nextLine();
                        periodico.setTitulo(titulo);
                        System.out.print("Ingrese el precio del periodico: ");
                        precio = leer.nextDouble();
                        periodico.setPrecio(precio);
                        System.out.print("Ingrese el numero del periodico: ");
                        numero = leer.nextInt();
                        periodico.setNumero(numero);
                        System.out.print("Ingrese el año del periodico: ");
                        year = leer.nextInt();
                        periodico.setAnio(year);
                        System.out.print("Ingrese el numero de paginas del periodico: ");
                        numpag = leer.nextInt();
                        periodico.setNumpag(numpag);
                        publicaciones[ctrlpub] = periodico;
                        ctrlpub++;
                        System.out.println("Registro completado.");
                        break;
                     default:
                        System.out.println("Opcion no valida.");
                        break;
                  }
                  break;
               case 2:
                  for(int i = 0; i < ctrlpub; i ++ ){
                     System.out.println("  " + publicaciones [i].getClass());
                     if(publicaciones[i] instanceof Revista){
                        Revista rev1 = new Revista();
                        rev1 = (Revista)publicaciones[i];
                        System.out.println("----REVISTA----");
                        System.out.println("ISSN " + rev1.getISSN());
                        System.out.println("Titulo: " + rev1.getTitulo());
                        System.out.println("Numero de paginas: " + rev1.getNumpag());
                        System.out.println("Precio: " + rev1.getPrecio());
                
                     }
                     else
                        if(publicaciones [i] instanceof Libro ){
                            Libro lib = new Libro();
                            lib = (Libro)publicaciones[i];
                            System.out.println("---LIBRO---");
                            System.out.println("ISBN " + lib.getISBN());
                            System.out.println("Titulo: " + lib.getTitulo());
                            System.out.println("Numero de paginas: " + lib.getNumpag());
                            System.out.println("Precio: " + lib.getPrecio());
                        }
                        else
                           if(publicaciones [i] instanceof Periodico){
                              Periodico per = new Periodico();
                              per = (Periodico)publicaciones[i];
                              System.out.println("----PERIODICO----");
                              System.out.println("ISSN " + per.getISSN());
                              System.out.println("Titulo: " + per.getTitulo());
                              System.out.println("Numero de paginas: " + per.getNumpag());
                              System.out.println("Precio " + per.getPrecio());
                           }
                  }
                  break;
               case 3:
                  System.exit(0);
                  break;
               default:
                  System.out.println("Opcion no valida.");
                  break;
            }
        }while(opc != 3);
   }
}