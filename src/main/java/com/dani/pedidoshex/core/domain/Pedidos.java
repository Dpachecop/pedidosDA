package com.dani.pedidoshex.core.domain;

import java.time.LocalDateTime;

public class Pedido {

    private Long id;
    private LocalDateTime fecha;
    private LocalDateTime fechaEnvio;
    private LocalDateTime fechaEntrega;
    private String cliente;
    private String proveedor;
    private Double valor;
    private String estado;

    // Ubicación
    private String pais;
    private String departamento;
    private String ciudad;
    private String nomenclaturaVivienda;
    private Double propina;

    public Pedido() {}

    public Pedido(Long id, LocalDateTime fecha, LocalDateTime fechaEnvio, LocalDateTime fechaEntrega, String cliente, String proveedor, Double valor, String estado, String pais, String departamento, String ciudad, String nomenclaturaVivienda, Double propina) {
        this.id = id;
        this.fecha = fecha;
        this.fechaEnvio = fechaEnvio;
        this.fechaEntrega = fechaEntrega;
        this.cliente = cliente;
        this.proveedor = proveedor;
        this.valor = valor;
        this.estado = estado;
        this.pais = pais;
        this.departamento = departamento;
        this.ciudad = ciudad;
        this.nomenclaturaVivienda = nomenclaturaVivienda;
        this.propina = propina;
    }

    // Getters y Setters
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