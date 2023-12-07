package school.sptech.model;

import java.time.LocalDateTime;

public class Registro {
    private Double valor;
    private LocalDateTime dataHora;

    public Registro(Double valor, LocalDateTime dataHora) {
        this.valor = valor;
        this.dataHora = dataHora;
    }
}
