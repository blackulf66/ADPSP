package com.salesianos.triana.Ejercicio6E2;

import com.salesianos.triana.Ejercicio6E2.model.CursoOnline;
import com.salesianos.triana.Ejercicio6E2.model.Profesor;
import com.salesianos.triana.Ejercicio6E2.model.Video;
import com.salesianos.triana.Ejercicio6E2.services.CursoOnlineService;
import com.salesianos.triana.Ejercicio6E2.services.ProfesorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class MainDePrueba {

    private final CursoOnlineService cursoOnlineService;
    private final ProfesorService profesorService;

    @PostConstruct
    public void prueba(){
        //profesores
        Profesor Loki = Profesor.builder()
                .nombre("Loki")
                .email("GODOFMISCHIEF@gmail.com")
                .puntuacion(10)
                .build();
        profesorService.save(Loki);

        Profesor Heimdall = Profesor.builder()
                .nombre("Heimdall")
                .email("theOneWhoSeesEverythingIn9Realm@gmail.com")
                .puntuacion(11)
                .build();
        profesorService.save(Heimdall);

        Profesor Thor = Profesor.builder()
                .nombre("Thor")
                .email("GodOfThunder@gmail.com")
                .puntuacion(4.9)
                .build();
        profesorService.save(Thor);


        //cursos
        CursoOnline ComoUsarElMjolnir = CursoOnline.builder()
                .nombre("ComoUsarElMjolnir")
                .puntuacion(6)
                .videos(new ArrayList<>())
                .build();
        cursoOnlineService.save(ComoUsarElMjolnir);

        CursoOnline ComoVerTodo = CursoOnline.builder()
                .nombre("ComoVerTodo")
                .puntuacion(9)
                .videos(new ArrayList<>())
                .build();
        cursoOnlineService.save(ComoVerTodo);

        CursoOnline ComoRobarElCollarAFreyja = CursoOnline.builder()
                .nombre("ComoRobarElCollarAFreyja")
                .puntuacion(8)
                .videos(new ArrayList<>())
                .build();
        cursoOnlineService.save(ComoRobarElCollarAFreyja);


        ComoUsarElMjolnir.addVideo(Video.builder()
                .orden(1)
                .titulo("que es el Mjolnir")
                .descripcion("vamos a reventar a los jotuns")
                .url("htps://FCKJotunheim.com")
                .build());
        cursoOnlineService.save(ComoUsarElMjolnir);

        ComoVerTodo.addVideo(Video.builder()
                .orden(2)
                .titulo("introduccion , hola soy heimdall")
                .descripcion("te veo")
                .url("htps://ISeeU.com")
                .build());
        cursoOnlineService.save(ComoUsarElMjolnir);

        ComoRobarElCollarAFreyja.addVideo(Video.builder()
                .orden(3)
                .titulo("A?")
                .descripcion("Quien se quedara sin collar?")
                .url("htps://GodOfMischiefInAction.com")
                .build());
        cursoOnlineService.save(ComoRobarElCollarAFreyja);



        ComoRobarElCollarAFreyja.addProfesor(Loki);
        ComoUsarElMjolnir.addProfesor(Thor);
        ComoVerTodo.addProfesor(Heimdall);

        cursoOnlineService.save(ComoRobarElCollarAFreyja);
        cursoOnlineService.save(ComoUsarElMjolnir);
        cursoOnlineService.save(ComoVerTodo);

        List<CursoOnline> r = cursoOnlineService.findAll();

        System.out.println("Profesor: " + Thor.getNombre());
        System.out.println("Cursos online: ");

        Thor.getCursosOnline().forEach(a -> {
            System.out.println(a.getNombre());
        });
        System.out.println("Videos: ");
        ComoUsarElMjolnir.getVideos().forEach(a -> {
            System.out.println(a.getTitulo());
        });

        System.out.println("Profesor: " + Loki.getNombre());
        System.out.println("Cursos online: ");
        Loki.getCursosOnline().forEach(c -> {
            System.out.println(c.getNombre());
        });
        System.out.println("Videos: ");
        ComoRobarElCollarAFreyja.getVideos().forEach(a -> {
            System.out.println(a.getTitulo());
        });

        System.out.println("Profesor: " + Heimdall.getNombre());
        System.out.println("Cursos online: ");

        Thor.getCursosOnline().forEach(a -> {
            System.out.println(a.getNombre());
        });
        System.out.println("Videos: ");
        ComoVerTodo.getVideos().forEach(a -> {
            System.out.println(a.getTitulo());
        });

    }
}
