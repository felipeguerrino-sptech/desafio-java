package school.sptech.model;

import java.time.LocalDateTime;

public class Cpu extends Componente{

    public Cpu(Integer id, String tipo, Double valor, LocalDateTime dataHora) {
        super(id, tipo, valor, dataHora);
    }
}
