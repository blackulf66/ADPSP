package com.salesianos.triana.ejercicioE08;

import com.salesianos.triana.ejercicioE08.models.*;
import com.salesianos.triana.ejercicioE08.repository.ClienteRepository;
import com.salesianos.triana.ejercicioE08.repository.PedidoRepository;
import com.salesianos.triana.ejercicioE08.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.beans.PropertyEditor;

@Component
@RequiredArgsConstructor
public class FakeMain {

    private final ClienteService clienteService;
    private final ClienteCorporativoService clienteCorporativoService;
    private final ClienteIndividualService clienteIndividualService;
    private final EmpleadoService empleadoService;
    private final PedidoService pedidoService;

    @PostConstruct
    public void init(){
        Pedido pedido1 = Pedido.builder()
                .numeroPedido(2)
                .estadoDeEnvio(true)
                .descripcionProducto("es muy bonito")
                .build();
        pedidoService.save(pedido1);

        Pedido pedido2 = Pedido.builder()
                .numeroPedido(54)
                .estadoDeEnvio(true)
                .descripcionProducto("es mas bonito")
                .build();
        pedidoService.save(pedido2);


        Cliente clientec1 = ClienteCorporativo.builder()
                .nombreEmpresa("google")
                .beneficios(1000000)
                .nombre("jeff bezos2").build();
        clienteService.save(clientec1);




        Cliente clientei1 = ClienteIndividual.builder()
                .codigoPostal(41017)
                .nombre("Jeff")
                .apellidos("SVENSSON")
                .cupon("DFGSFGD")
                .nombreUsuario("JEFFFUCKER")
                .build();
        clienteService.save(clientei1);


        Cliente clientei2 = ClienteIndividual.builder()
                .codigoPostal(41017)
                .nombre("Jeff2")
                .apellidos("SVENSSON2")
                .cupon("DFGSFGD2")
                .nombreUsuario("JEFFFUCKER2")
                .build();
        clienteService.save(clientei2);

        Empleado empleado1 = Empleado.builder()
                .nombre("keanu")
                .apellidos("reeves")
                .cargo("gerente")
                .sueldo(2098)
                .build();
        empleadoService.save(empleado1);

        pedido1.addCliente(clientec1);
        pedido2.addCliente(clientei1);
pedidoService.save(pedido1);
        clienteService.save(clientec1);
        clienteService.save(clientei1);





    }

}
