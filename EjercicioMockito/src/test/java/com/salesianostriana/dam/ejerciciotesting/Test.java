package com.salesianostriana.dam.ejerciciotesting;


import com.salesianostriana.dam.ejerciciotesting.model.Cliente;
import com.salesianostriana.dam.ejerciciotesting.model.LineaDeVenta;
import com.salesianostriana.dam.ejerciciotesting.model.Producto;
import com.salesianostriana.dam.ejerciciotesting.model.Venta;
import com.salesianostriana.dam.ejerciciotesting.repos.ProductoRepositorio;
import com.salesianostriana.dam.ejerciciotesting.repos.VentaRepositorio;
import com.salesianostriana.dam.ejerciciotesting.services.VentaServicio;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.lenient;

@ExtendWith(MockitoExtension.class)
public class Test {
    @Mock
    VentaRepositorio ventaRepositorio;
    @Mock
    ProductoRepositorio productoRepositorio;
    @InjectMocks
    VentaServicio ventaServicio;

    @org.junit.jupiter.api.Test
    void test1nuevaVenta() {
        //caja negra
        Cliente cli = new Cliente();
        LineaDeVenta linea = new LineaDeVenta(new Producto("3","Teclado mecánico retroiluminado",59.99) ,1 , 59.99);
        List<LineaDeVenta> lista = new ArrayList<>(); lista.add(linea);
        Venta venta = new Venta(1L, LocalDate.of(2022,01,01), lista , cli);
        lenient().when(productoRepositorio.findOne("3")).thenReturn(new Producto("3", "Teclado mecánico retroiluminado",59.99));
        lenient().when(ventaRepositorio.save(venta)).thenReturn(venta);
        Venta venta2 = ventaServicio.nuevaVenta(Map.of("3", 4),cli);
        assertEquals(venta.getId() , venta2.getId());
    }


    @org.junit.jupiter.api.Test
    void test2addProductoToVenta(){
        //caja blanca
        Cliente cli= new Cliente();
        LineaDeVenta linea = new LineaDeVenta(new Producto("3","Teclado mecánico retroiluminado",59.99) ,1 , 59.99);
        LineaDeVenta linea2 = new LineaDeVenta(new Producto("2","Ordenador de sobremesa",499.0) ,1 , 499.0);
        List<LineaDeVenta> lista = new ArrayList<>(); lista.add(linea);
        Optional<Venta> opVenta= Optional.of(new Venta(1L , LocalDate.of(2022,01,01),lista,cli));
        lista.add(linea2);
        Venta venta = new Venta(1L,LocalDate.of(2022,01,01),lista,cli);
        lenient().when(productoRepositorio.findOne("3")).thenReturn(new Producto("3", "Teclado mecánico retroiluminado",59.99));
        lenient().when(productoRepositorio.findOne("2")).thenReturn(new Producto("2", "Ordenador de sobremesa",499.0));
        lenient().when(ventaRepositorio.findOneOptional(1L)).thenReturn(opVenta);
        lenient().when(ventaRepositorio.edit(opVenta.get())).thenReturn(venta);
        Venta vent = ventaServicio.addProductoToVenta(1L , "3",2);
        Venta vent2 = ventaServicio.addProductoToVenta(1L , "2",1);
        assertEquals(venta,vent);
        assertEquals(venta,vent2);
    }


    @org.junit.jupiter.api.Test
    void test3removeLineaVenta(){
        //caja blanca
        Cliente cli= new Cliente();
        LineaDeVenta linea = new LineaDeVenta(new Producto("3","Teclado mecánico retroiluminado",59.99) ,1 , 59.99);
        LineaDeVenta linea2 = new LineaDeVenta(new Producto("3","Teclado mecánico retroiluminado",59.99) ,1 , 59.99);
        List<LineaDeVenta> lista = new ArrayList<>();
        lista.add(linea);
        lista.add(linea2);
        Optional<Venta> opVenta= Optional.of(new Venta(1L , LocalDate.of(2022,01,01),lista,cli));
        lista.remove(linea);
        Venta venta = new Venta(1L,LocalDate.of(2022,01,01),lista,cli);
        lenient().when(ventaRepositorio.findOneOptional(1L)).thenReturn(opVenta);
        lenient().when(ventaRepositorio.edit(opVenta.get())).thenReturn(venta);
        Venta vent2 = ventaServicio.removeLineaVenta(1L,"3");
        assertEquals(venta,vent2);

    }


}
