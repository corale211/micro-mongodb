package com.example.demo.respository;

import com.example.demo.modelo.Usuario;
import org.springframework.core.metrics.jfr.FlightRecorderApplicationStartup;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

@Repository
@CrossOrigin( value = {})
public interface UsuariosRepoditory extends MongoRepository<Usuario, Serializable> {

    @RestResource(path = "apellido",rel = "apellido")
    public List<Usuario> findByApellidoOrderByNombre(@Param("apellido")String apellido, Pageable pageable);

    @RestResource(path = "borrarpornombre",rel = "apellido")
    public long deleteByNombre(@Param("apellido") String apellido);

}
