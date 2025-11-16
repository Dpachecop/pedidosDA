package com.dani.pedidoshex.adapter.databases.sql.mapper;

import com.dani.pedidoshex.core.domain.Pedido;
import com.dani.pedidoshex.adapter.databases.sql.entity.PedidoEntity;
import org.springframework.stereotype.Component;

@Component
public class PedidoDbMapper {

    public Pedido toDomain(PedidoEntity entity) {
        if (entity == null) return null;
        Pedido p = new Pedido();
        p.setId(entity.getId());
        p.setFecha(entity.getFecha());
        p.setFechaEnvio(entity.getFechaEnvio());
        p.setFechaEntrega(entity.getFechaEntrega());
        p.setCliente(entity.getCliente());
        p.setProveedor(entity.getProveedor());
        p.setValor(entity.getValor());
        p.setEstado(entity.getEstado());
        p.setPais(entity.getPais());
        p.setDepartamento(entity.getDepartamento());
        p.setCiudad(entity.getCiudad());
        p.setNomenclaturaVivienda(entity.getNomenclaturaVivienda());
        p.setPropina(entity.getPropina());
        return p;
    }

    public PedidoEntity toEntity(Pedido domain) {
        if (domain == null) return null;
        PedidoEntity e = new PedidoEntity();
        e.setId(domain.getId());
        e.setFecha(domain.getFecha());
        e.setFechaEnvio(domain.getFechaEnvio());
        e.setFechaEntrega(domain.getFechaEntrega());
        e.setCliente(domain.getCliente());
        e.setProveedor(domain.getProveedor());
        e.setValor(domain.getValor());
        e.setEstado(domain.getEstado());
        e.setPais(domain.getPais());
        e.setDepartamento(domain.getDepartamento());
        e.setCiudad(domain.getCiudad());
        e.setNomenclaturaVivienda(domain.getNomenclaturaVivienda());
        e.setPropina(domain.getPropina());
        return e;
    }
}