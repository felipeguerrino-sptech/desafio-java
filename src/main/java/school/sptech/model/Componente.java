package school.sptech.model;

import java.time.LocalDateTime;
import java.util.List;

public abstract class Componente {
    private Integer id;
    private String tipo;
    private List<Registro> registros;

    public Componente(Integer id, String tipo, List<Registro> registros) {
        this.id = id;
        this.tipo = tipo;
        this.registros = registros;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Componente{");
        sb.append("id=").append(id);
        sb.append(", tipo='").append(tipo).append('\'');
        sb.append(", registros=").append(registros);
        sb.append('}');
        return sb.toString();
    }
}

