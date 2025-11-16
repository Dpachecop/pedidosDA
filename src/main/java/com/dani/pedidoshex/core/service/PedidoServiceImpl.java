package com.dani.pedidoshex.core.service;

import com.dani.pedidoshex.core.domain.Pedido;
import com.dani.pedidoshex.core.port.PedidoRepositoryPort;
import com.dani.pedidoshex.core.port.PedidoServicePort;

import java.time.LocalDateTime;
import java.util.List;

public class PedidoServiceImpl implements PedidoServicePort {

    private final PedidoRepositoryPort pedidoRepository;

    public PedidoServiceImpl(PedidoRepositoryPort pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    @Override
    public Pedido crearPedido(Pedido pedido) {
        // Reglas de negocio
        if (pedido.getFecha() == null) {
            pedido.setFecha(LocalDateTime.now()); // Asigna fecha actual si no viene
        }
        if (pedido.getEstado() == null) {
            pedido.setEstado("PENDIENTE"); // Estado por defecto
        }
        return pedidoRepository.save(pedido);
    }

    @Override
    public Pedido obtenerPedido(Long id) {
        Pedido pedido = pedidoRepository.findById(id);
        if (pedido == null) {
            throw new RuntimeException("Pedido no encontrado con ID: " + id);
        }
        return pedido;
    }

    @Override
    public List<Pedido> listarPedidos() {
        return pedidoRepository.findAll();
    }

    @Override
    public Pedido actualizarPedido(Long id, Pedido pedido) {
        Pedido existente = obtenerPedido(id);

        // Actualizamos campos permitidos
        existente.setEstado(pedido.getEstado());
        existente.setFechaEntrega(pedido.getFechaEntrega());
        existente.setFechaEnvio(pedido.getFechaEnvio());
        // ... actualizar otros campos si es necesario

        return pedidoRepository.update(existente);
    }

    @Override
    public void eliminarPedido(Long id) {
        pedidoRepository.deleteById(id);
    }
}