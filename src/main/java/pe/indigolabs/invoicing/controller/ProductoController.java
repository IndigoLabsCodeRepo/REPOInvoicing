package pe.indigolabs.invoicing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.indigolabs.invoicing.service.ProductoService;
import pe.indigolabs.invoicing.entity.Producto;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping
    public ResponseEntity<Producto> getProducto() {

        return ResponseEntity.ok (productoService.getProducto());
    }

}
