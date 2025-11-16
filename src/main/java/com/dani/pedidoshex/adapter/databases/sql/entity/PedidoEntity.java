package com.dani.pedidoshex.adapter.databases.sql.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "pedidos")
public class PedidoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime fecha;
    private LocalDateTime fechaEnvio;
    private LocalDateTime fechaEntrega;
    private String cliente;
    private String proveedor;
    private Double valor;
    private String estado;
    private String pais;
    private String departamento;
    private String ciudad;
    private String nomenclaturaVivienda;
    private Double propina;

    // Getters y Setters (Puedes generarlos con Alt+Insert en IntelliJ)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public LocalDateTime getFecha() { return fecha; }
    public void setFecha(LocalDateTime fecha) { this.fecha = fecha; }
    public LocalDateTime getFechaEnvio() { return fechaEnvio; }
    public void setFechaEnvio(LocalDateTime fechaEnvio) { this.fechaEnvio = fechaEnvio; }
    public LocalDateTime getFechaEntrega() { return fechaEntrega; }
    public void setFechaEntrega(LocalDateTime fechaEntrega) { this.fechaEntrega = fechaEntrega; }
    public String getCliente() { return cliente; }
    public void setCliente(String cliente) { this.cliente = cliente; }
    public String getProveedor() { return proveedor; }
    public void setProveedor(String proveedor) { this.proveedor = proveedor; }
    public Double getValor() { return valor; }
    public void setValor(Double valor) { this.valor = valor; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
    public String getPais() { return pais; }
    public void setPais(String pais) { this.pais = pais; }
    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }
    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }
    public String getNomenclaturaVivienda() { return nomenclaturaVivienda; }
    public void setNomenclaturaVivienda(String nomenclaturaVivienda) { this.nomenclaturaVivienda = nomenclaturaVivienda; }
    public Double getPropina() { return propina; }
    public void setPropina(Double propina) { this.propina = propina; }
}