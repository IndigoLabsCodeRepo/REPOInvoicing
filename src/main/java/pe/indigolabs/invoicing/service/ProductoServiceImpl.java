package pe.indigolabs.invoicing.service;

import org.springframework.stereotype.Service;
import pe.indigolabs.invoicing.entity.Producto;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Override
    public Producto getProducto() {
        return Producto
                .builder()
                .id(100L)
                .nombre("Yo2xxxx tal vez no")
                .precio(123.4)
                .cantidad(3)
                .build();
    }
}
