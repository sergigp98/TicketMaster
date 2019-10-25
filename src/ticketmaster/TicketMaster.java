/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketmaster;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Usuario DAM 2
 */
public class TicketMaster {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Artista artista;
        Localidad localidad;
        Recinto recinto;
        TipoEvento tipoEvento;
        Evento evento;
        int opcion;
        System.out.println("MENÚ:");
        System.out.println("1. Artistas");
        System.out.println("2. Localidades");
        System.out.println("3. Recintos");
        System.out.println("4. Tipos de evento");
        System.out.println("5. Eventos");
        System.out.println("6. Añadir registro");

        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                //ARTISTAS
                
                File fichero = new File("src/documentos/artistas.txt");
                FileWriter dataOS = new FileWriter(fichero);

                String nombres[] = {"Ana", "Luis", "Alicia", "Pedro", "Sergio", "Daniel", "Roman", "Mario", "Javier", "Antonio", "Juan", "Alejandro", "Alfredo", "Arturo", "Felipe", "Manuel", "DADDY", "BAD", "Karol", "Ferran"};

                String apellidos[] = {"Gutierrez", "Lopez", "Olmo", "Garcia", "Lopez", "Martin", "Martinez", "Gaspar", "Mansilla", "Lopez", "Franscisco", "Sanz", "Di Stefano", "Grao", "Augusto", "Carrasco", "YANKEE", "BUNNY", "G", "Adria"};

                int numero = 0;
                System.out.println("ARTISTAS");
                System.out.println("-----------------------");
                for (int i = 0; i < apellidos.length; i++) {
                    numero++;
                    System.out.print("ID: " + numero + "\n" + "NOMBRE: " + nombres[i]);
                    dataOS.write(numero);
                    dataOS.write(nombres[i]);
                    System.out.println(" APELLIDO: " + apellidos[i] + "\n");
                    dataOS.write(apellidos[i]);

                }

                dataOS.close();

                //
                try {
                    BufferedReader dataIS = new BufferedReader(new FileReader(fichero));
                    String linea;
                    while ((linea = dataIS.readLine()) != null) {
                        System.out.println(linea);

                    }
                    dataIS.close();
                } catch (FileNotFoundException ex) {
                    System.out.println("No se encuentra el fichero");
                } catch (IOException ex) {
                    ex.printStackTrace();
                    System.out.println("Error E/S");
                }
                System.out.println("");
                System.out.println("");

                /*
        Con el inputStream solo me saca el primer valor del array
        FileInputStream input = new FileInputStream(fichero);
        DataInputStream dataIS = new DataInputStream(input);

        String nombre, apellido;
        int n;

        try {
            while (true) {
                n = dataIS.readInt();
                System.out.println(n);
                
                for (int i = 0; i < nombres.length; i++) {
                    nombre = nombres[i];
                    nombre = dataIS.readUTF();

                    System.out.println(nombre+" ");
                }
                for (int i = 0; i < apellidos.length; i++) {
                    apellido = apellidos[i];
                    apellido = dataIS.readUTF();
                    System.out.println(" "+apellido);
                }

            }
        } catch (EOFException ec) {
        }

        dataIS.close();
                */
                break;

            case 2:

                //LOCALIDAD
                File fichero1 = new File("src/documentos/localidades.txt");
                FileWriter output1 = new FileWriter(fichero1);

                String localidad1[] = {"Madrid", "Alcorcon", "Mostoles", "Leganes", "Fuenlabrada", "Navalcarnero", "Boadilla", "Pozuelo", "Villa", "Aluche", "Murcia", "Albacete", "Valladolid", "Soria", "Asturias", "Avila", "Salamanca", "Leon", "Barcelona", "Sevilla"};

                int numero1 = 0;
                System.out.println("LOCALIDADES");
                System.out.println("-----------------------");

                for (int i = 0; i < localidad1.length; i++) {
                    numero1++;
                    System.out.print("ID_Localidad: " + numero1 + "   " + "NOMBRE: " + localidad1[i] + "\n");
                    output1.write(numero1);
                    output1.write(localidad1[i]);

                }

                output1.close();

                try {
                    BufferedReader dataIS1 = new BufferedReader(new FileReader(fichero1));
                    String linea;
                    while ((linea = dataIS1.readLine()) != null) {
                        System.out.println(linea);

                    }
                    dataIS1.close();
                } catch (FileNotFoundException ex) {
                    System.out.println("No se encuentra el fichero");
                } catch (IOException ex) {
                    ex.printStackTrace();
                    System.out.println("Error E/S");
                }

                System.out.println("");
                System.out.println("");
                break;

            case 3:

                //RECINTO
                File fichero2 = new File("src/documentos/recintos.txt");
                FileWriter output2 = new FileWriter(fichero2);

                String recintos[] = {"Fabrik", "Wanda", "Beranbeu", "Municipal de Leganés", "Mariano Gonzalez Arena", "Camp Nou", "Jose Zorrilla", "Goya", "La Riviera", "El Bakkali", "El Odragau", "San Siro", "Allianza Arena", "Signal Iduna Park", "Etihad Stadium", "Stamford bridge", "El Alamo", "El Yukusima", "El monumental", "La Bombonera"};

                int numero2 = 0;

                System.out.println("RECINTOS");
                System.out.println("-----------------------");

                for (int i = 0; i < recintos.length; i++) {
                    numero2++;
                    System.out.print("ID_Recinto_Localidad: " + numero2 + "   " + "NOMBRE: " + recintos[i] + "\n");
                    output2.write(numero2);
                    output2.write(recintos[i]);

                }

                output2.close();

                try {
                    BufferedReader dataIS2 = new BufferedReader(new FileReader(fichero2));
                    String linea;
                    while ((linea = dataIS2.readLine()) != null) {
                        System.out.println(linea);

                    }
                    dataIS2.close();
                } catch (FileNotFoundException ex) {
                    System.out.println("No se encuentra el fichero");
                } catch (IOException ex) {
                    ex.printStackTrace();
                    System.out.println("Error E/S");
                }

                System.out.println("");
                System.out.println("");

                break;
            case 4:

                //TIPOEVENTO
                File fichero3 = new File("src/documentos/tipoevento.txt");
                FileWriter output3 = new FileWriter(fichero3);

                String tipoeventos[] = {"Concierto", "Teatro", "musical", "Concierto", "musical", "Concierto", "Teatro", "Concierto", "musical", "Concierto", "musical", "Concierto", "Teatro", "Concierto", "musical", "Teatro", "musical", "Concierto", "Teatro", "musical"};

                int numero3 = 0;

                System.out.println("TIPOS DE EVENTO");
                System.out.println("-----------------------");

                for (int i = 0; i < tipoeventos.length; i++) {
                    numero3++;
                    System.out.print("ID_TipoEvento: " + numero3 + "   " + "NOMBRE: " + tipoeventos[i] + "\n");
                    output3.write(numero3);
                    output3.write(tipoeventos[i]);

                }

                output3.close();

                try {
                    BufferedReader dataIS3 = new BufferedReader(new FileReader(fichero3));
                    String linea;
                    while ((linea = dataIS3.readLine()) != null) {
                        System.out.println(linea);

                    }
                    dataIS3.close();
                } catch (FileNotFoundException ex) {
                    System.out.println("No se encuentra el fichero");
                } catch (IOException ex) {
                    ex.printStackTrace();
                    System.out.println("Error E/S");
                }

                System.out.println("");
                System.out.println("");

                break;

            case 5:

                //EVENTOS
                File fichero4 = new File("src/documentos/Evento.txt");
                FileWriter output4 = new FileWriter(fichero4);

                String eventos[] = {"24/12/2013", "14/8/2025", "31/12/2020", "25/3/2019", "3/6/2020", "6/8/2020", "3/7/2020", "8/1/2020", "9/9/2020", "1/1/2020", "8/6/2020", "8/6/2020", "9/9/2020", "3/3/2020", "8/1/2020", "1/1/2020", "4/4/2021", "6/3/2020", "9/10/2020", "28/2/2020"};

                int numero4 = 0;
                System.out.println("EVENTOS");
                System.out.println("-----------------------");

                for (int i = 0; i < eventos.length; i++) {
                    numero4++;
                    System.out.print("ID_Evento: " + numero4 + "   " + "NOMBRE: " + eventos[i] + "\n");
                    output4.write(numero4);
                    output4.write(eventos[i]);

                }

                output4.close();

                try {
                    BufferedReader dataIS4 = new BufferedReader(new FileReader(fichero4));
                    String linea;
                    while ((linea = dataIS4.readLine()) != null) {
                        System.out.println(linea);

                    }
                    dataIS4.close();
                } catch (FileNotFoundException ex) {
                    System.out.println("No se encuentra el fichero");
                } catch (IOException ex) {
                    ex.printStackTrace();
                    System.out.println("Error E/S");
                }

                break;
        }
    }
}
