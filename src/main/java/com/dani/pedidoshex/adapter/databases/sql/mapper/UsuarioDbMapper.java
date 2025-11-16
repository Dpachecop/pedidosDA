package com.dani.pedidoshex.adapter.databases.sql.mapper;

import com.dani.pedidoshex.core.domain.Usuario;
import com.dani.pedidoshex.adapter.databases.sql.entity.UsuarioEntity;
import org.springframework.stereotype.Component;


@Component
public class UsuarioDbMapper {

    public Usuario toDomain(UsuarioEntity entity) {
        if (entity == null) return null;
        return new Usuario(entity.getId(), entity.getNombre(), entity.getApellido(), entity.getCorreo(), entity.getPassword(), entity.getRol());
    }

    public UsuarioEntity toEntity(Usuario domain) {
        if (domain == null) return null;
        return new UsuarioEntity(domain.getId(), domain.getNombre(), domain.getApellido(), domain.getCorreo(), domain.getPassword(), domain.getRol());
    }
}