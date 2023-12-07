package school.sptech.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import school.sptech.database.Conexao;
import school.sptech.model.Componente;

public class ComponenteDAO {
    private static final Conexao conexao = new Conexao();
    private static final JdbcTemplate db = conexao.getConexaoDoBanco();

}
