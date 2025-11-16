package com.dani.pedidoshex.adapter.databases.sql.repository;

import com.dani.pedidoshex.adapter.databases.sql.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UsuarioJpaRepository extends JpaRepository<UsuarioEntity, Long> {
    Optional<UsuarioEntity> findByCorreo(String correo);
}