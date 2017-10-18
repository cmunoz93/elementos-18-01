package org.unitec.elementos1801;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Elementos1801Application implements CommandLineRunner {
@Autowired RepositorioMensajito repoMensa;
	public static void main(String[] args) {
		SpringApplication.run(Elementos1801Application.class, args);
        }

    @Override
    public void run(String... strings) throws Exception {
       //repoMensa.save(new Mensajito("17 de octubre","temblo"));
        //Mensajito m= repoMensa.findOne (1);
        System.out.println("vamos abuscar todos");

       for( Mensajito mensa:repoMensa.findAll()){
           System.out.println(mensa);
       }
       
        System.out.println("vamos a buscar port id");
        System.out.println(repoMensa.findOne(1));
        
          //Actualizar
          repoMensa.save(new Mensajito(1,"nuevo titulo","nuevo cuerpo"));
          System.out.println(repoMensa.findOne(1));
          //busqueda personalizada
          
          for(Mensajito mensa:repoMensa.findByTitulo("nuevo titulo"));
              System.out.println(Mensa);
    }
    
    
}

