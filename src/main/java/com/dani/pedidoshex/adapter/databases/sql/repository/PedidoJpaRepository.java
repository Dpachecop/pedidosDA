package com.dani.pedidoshex.adapter.databases.sql.repository;

import com.dani.pedidoshex.adapter.databases.sql.entity.PedidoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoJpaRepository extends JpaRepository<PedidoEntity, Long> {
}