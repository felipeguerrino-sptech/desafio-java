package school.sptech.model;

import java.time.LocalDateTime;

public abstract class Componente {
    private Integer id;
    private String tipo;
    private Double valor;
    private LocalDateTime dataHora;

    public Componente(Integer id, String tipo, Double valor, LocalDateTime dataHora) {
        this.id = id;
        this.tipo = tipo;
        this.valor = valor;
        this.dataHora = dataHora;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Componente{");
        sb.append("id=").append(id);
        sb.append(", tipo='").append(tipo).append('\'');
        sb.append(", valor=").append(valor);
        sb.append(", dataHora=").append(dataHora);
        sb.append('}');
        return sb.toString();
    }
}

