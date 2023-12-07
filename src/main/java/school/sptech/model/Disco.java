package school.sptech.model;

import java.time.LocalDateTime;

public class Disco extends Componente{
    public Disco(Integer id, String tipo, Double valor, LocalDateTime dataHora) {
        super(id, tipo, valor, dataHora);
    }
}
