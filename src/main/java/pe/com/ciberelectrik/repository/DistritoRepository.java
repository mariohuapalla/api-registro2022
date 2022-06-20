package pe.com.ciberelectrik.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.com.ciberelectrik.entity.Distrito;

public interface DistritoRepository extends JpaRepository<Distrito, Long> {

    @Query("select d from Distrito d where d.estado='1'")
    List<Distrito> findAllCustom();

    //@Query("select c from Categoria c where upper(c.nombre) like upper(:nombre) and c.estado='1'")
    //List<Distrito> findByName(@Param("nombre") String nombre);
}
