package com.dani.pedidoshex.core.port;

import com.dani.pedidoshex.core.domain.Pedido;
import java.util.List;

public interface     {
Pedido save(Pedido pedido);
Pedido findById(Long id);
List<Pedido> findAll();
Pedido update(Pedido pedido);
void deleteById(Long id);
}