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

        Artista artista;
        Localidad localidad;
        Recinto recinto;
        TipoEvento tipoEvento;
        Evento evento;

        //ARTISTAS
        File fichero = new File("src/documentos/artistas.txt");
        FileWriter dataOS = new FileWriter(fichero);

        String nombres[] = {"Ana", "Luis", "Alicia", "Pedro", "Sergio", "Daniel", "Roman", "Mario", "Javier", "Antonio", "Juan", "Alejandro", "Alfredo", "Arturo", "Felipe", "Manuel", "DADDY", "BAD", "Karol", "Ferran"};

        String apellidos[] = {"Gutierrez", "Lopez", "Olmo", "Garcia", "Lopez", "Martin", "Martinez", "Gaspar", "Mansilla", "Lopez", "Franscisco", "Sanz", "Di Stefano", "Grao", "Augusto", "Carrasco", "YANKEE", "BUNNY", "G", "Adria"};

        int numero = 0;
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
        try{
        BufferedReader dataIS = new BufferedReader(new FileReader(fichero));
        String linea;
        while((linea=dataIS.readLine())!=null){
            System.out.println(linea);
            
        }
        dataIS.close();
        }catch(FileNotFoundException ex){
            System.out.println("No se encuentra el fichero");
        }catch(IOException ex){
            ex.printStackTrace();
            System.out.println("Error E/S");
        }
        
        
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

        dataIS.close();*/
        
        

        /*
        //LOCALIDAD
        File fichero1 = new File("src/documentos/localidades.txt");
        FileOutputStream output1 = new FileOutputStream(fichero1);
        DataOutputStream dataOS1 = new DataOutputStream(output1);

        String localidad1[] = {"Madrid", "Alcorcon", "Mostoles", "Leganes", "Fuenlabrada", "Navalcarnero", "Boadilla", "Pozuelo", "Villa", "Aluche", "Murcia", "Albacete", "Valladolid", "Soria", "Asturias", "Avila", "Salamanca", "Leon", "Barcelona", "Sevilla"};

        int numero1 = 0;

        for (int i = 0; i < localidad1.length; i++) {
            numero1++;
            System.out.print("ID_Localidad: " + numero1 + "   " + "NOMBRE: " + localidad1[i] + "\n");
            dataOS1.writeInt(numero1);
            dataOS1.writeUTF(localidad1[i]);

        }

        dataOS1.close();

        //RECINTO
        File fichero2 = new File("src/documentos/recintos.txt");
        FileOutputStream output2 = new FileOutputStream(fichero2);
        DataOutputStream dataOS2 = new DataOutputStream(output2);

        String recintos[] = {"Fabrik", "Wanda", "Beranbeu", "Municipal de Leganés", "Mariano Gonzalez Arena", "Camp Nou", "Jose Zorrilla", "Goya", "La Riviera", "El Bakkali", "El Odragau", "San Siro", "Allianza Arena", "Signal Iduna Park", "Etihad Stadium", "Stamford bridge", "El Alamo", "El Yukusima", "El monumental", "La Bombonera"};

        int numero2 = 0;

        for (int i = 0; i < recintos.length; i++) {
            numero2++;
            System.out.print("ID_Recinto_Localidad: " + numero2 + "   " + "NOMBRE: " + recintos[i] + "\n");
            dataOS2.writeInt(numero2);
            dataOS2.writeUTF(recintos[i]);

        }

        dataOS2.close();

        //TIPOEVENTO
        File fichero3 = new File("src/documentos/tipoevento.txt");
        FileOutputStream output3 = new FileOutputStream(fichero3);
        DataOutputStream dataOS3 = new DataOutputStream(output3);

        String tipoeventos[] = {"Concierto", "Teatro", "musical", "Concierto", "musical", "Concierto", "Teatro", "Concierto", "musical", "Concierto", "musical", "Concierto", "Teatro", "Concierto", "musical", "Teatro", "musical", "Concierto", "Teatro", "musical"};

        int numero3 = 0;

        for (int i = 0; i < tipoeventos.length; i++) {
            numero3++;
            System.out.print("ID_TipoEvento: " + numero3 + "   " + "NOMBRE: " + tipoeventos[i] + "\n");
            dataOS3.writeInt(numero3);
            dataOS3.writeUTF(tipoeventos[i]);

        }

        dataOS3.close();

        //EVENTOS
        File fichero4 = new File("src/documentos/Evento.txt");
        FileOutputStream output4 = new FileOutputStream(fichero4);
        DataOutputStream dataOS4 = new DataOutputStream(output4);

        String eventos[] = {"24/12/2013", "14/8/2025", "31/12/2020", "25/3/2019", "3/6/2020", "6/8/2020", "3/7/2020", "8/1/2020", "9/9/2020", "1/1/2020", "8/6/2020", "8/6/2020", "9/9/2020", "3/3/2020", "8/1/2020", "1/1/2020", "4/4/2021", "6/3/2020", "9/10/2020", "28/2/2020"};

        int numero4 = 0;

        for (int i = 0; i < eventos.length; i++) {
            numero4++;
            System.out.print("ID_Evento: " + numero4 + "   " + "NOMBRE: " + eventos[i] + "\n");
            dataOS4.writeInt(numero4);
            dataOS4.writeUTF(eventos[i]);

        }

        dataOS4.close();
         */
    }
}
