package com.salesianos.triana.E06;

import com.salesianos.triana.E06.model.Categoria;
import com.salesianos.triana.E06.model.Producto;
import com.salesianos.triana.E06.services.CategoriaService;
import com.salesianos.triana.E06.services.ProductoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;

@Component
@RequiredArgsConstructor
public class FakeMain {

    private final ProductoService productoService;
    private final CategoriaService categoriaService;

    @PostConstruct
    public void prueba(){

        Categoria Bolleria = Categoria.builder()
                .nombre("Bolleria")
                .productos(new ArrayList<>())
                .build();
        categoriaService.save(Bolleria);

        Categoria Frutas = Categoria.builder()
                .nombre("Frutas")
                .build();
        categoriaService.save(Frutas);

                    Producto producto1 = Producto.builder()
                            .nombre("Bollicao")
                            .pvp(2.99)
                            .build();
                    productoService.save(producto1);
                    producto1.addCategoria(Bolleria);

                    Producto producto2 = Producto.builder()
                            .nombre("Phoskitos")
                            .pvp(1.00)
                            .build();
                    productoService.save(producto2);
                    producto2.addCategoria(Bolleria);

                    Producto producto3 = Producto.builder()
                            .nombre("Mandarina")
                            .pvp(4.99)
                            .build();
                    productoService.save(producto3);
                    producto3.addCategoria(Frutas);

                    Producto producto4 = Producto.builder()
                            .nombre("Naranja")
                            .pvp(2.00)
                            .build();
                    productoService.save(producto4);
                    producto4.addCategoria(Frutas);

        System.out.println("categoria: "+Bolleria.getNombre());
        System.out.println("En bolleria tenemos:");


        Bolleria.getProductos().forEach(p -> {
            System.out.println(p.getNombre() + " "+p.getPvp()+ " €");
        });


        System.out.println(" ");
        System.out.println("categoria: "+Frutas.getNombre());
        System.out.println("Productos disponibles:");

        Frutas.getProductos().forEach(p -> {
            System.out.println(p.getNombre() + " "+p.getPvp()+ " €");
        });

    }
}
