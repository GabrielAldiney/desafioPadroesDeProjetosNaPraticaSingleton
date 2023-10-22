import java.util.List;
import java.util.ArrayList;


public class RegistroFuncionarios {
    private static RegistroFuncionarios instancia = null;

    private List<Funcionario> funcionarios = new ArrayList<>();

    private RegistroFuncionarios() {
    }

    public static RegistroFuncionarios getInstancia() {
        if (instancia == null) {
            instancia = new RegistroFuncionarios();
        }
        return instancia;
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void listarFuncionarios() {
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome() + ", Cargo: " + funcionario.getCargo());
        }
    }
}
