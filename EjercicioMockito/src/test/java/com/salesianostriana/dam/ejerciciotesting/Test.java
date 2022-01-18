package com.salesianostriana.dam.ejerciciotesting;


import com.salesianostriana.dam.ejerciciotesting.repos.ProductoRepositorio;
import com.salesianostriana.dam.ejerciciotesting.repos.VentaRepositorio;
import com.salesianostriana.dam.ejerciciotesting.services.VentaServicio;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class Test {

    @Mock
    VentaRepositorio ventaRepositorio;
    ProductoRepositorio productoRepositorio;

    @InjectMocks
    VentaServicio ventaServicio;

    @Test
    void test() {

        try {

            Mockito.when(ventaServicio.addProductoToVenta());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
