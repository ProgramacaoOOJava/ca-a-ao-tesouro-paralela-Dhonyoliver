public class ExploradorRapido extends Explorador {

    public ExploradorRapido(String nome, int prioridade, String tarefa) {
        super(nome, "Rápido", prioridade, tarefa);
    }

    @Override
    public void executarTarefa() throws TarefaInvalidaException {

        if (tarefa == null || tarefa.isEmpty()) {
            throw new TarefaInvalidaException("Tarefa inválida para " + nome);
        }

        System.out.println(
                "Explorador: " + nome +
                " | Tipo: " + tipo +
                " | Status: Vasculhando " + tarefa + "!"
        );
    }
}
