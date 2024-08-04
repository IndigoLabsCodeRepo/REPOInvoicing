package pe.indigolabs.invoicing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.indigolabs.invoicing.entity.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto,Long> {

}
