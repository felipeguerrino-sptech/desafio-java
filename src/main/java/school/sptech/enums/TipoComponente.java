package school.sptech.enums;

public enum TipoComponente {
    CPU(1),
    RAM(2),
    DISCO(3)
    ;


    private Integer id;

    TipoComponente(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
