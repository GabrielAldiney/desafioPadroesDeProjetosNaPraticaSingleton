public class Main {
    public static void main(String[] args) {
        RegistroFuncionarios registro = RegistroFuncionarios.getInstancia();

        registro.adicionarFuncionario(new Funcionario("Gabriel Aldiney", "Desenvolvedor Java"));
        registro.adicionarFuncionario(new Funcionario("João", "Gerente de projetos"));
        registro.adicionarFuncionario(new Funcionario("Mateus", "Designer"));
        registro.adicionarFuncionario(new Funcionario("Isabela", "Analista de Qualidade"));
        registro.adicionarFuncionario(new Funcionario("Eduardo", "Suporte Técnico"));


        System.out.println("Funcionários na empresa:");
        registro.listarFuncionarios();
    }
}
