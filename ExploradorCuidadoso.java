public class ExploradorCuidadoso extends Explorador {

    public ExploradorCuidadoso(String nome, int prioridade, String tarefa) {
        super(nome, "Cuidadoso", prioridade, tarefa);
    }

    @Override
    public void executarTarefa() throws TarefaInvalidaException {

        if (tarefa == null || tarefa.isEmpty()) {
            throw new TarefaInvalidaException("Tarefa inválida para " + nome);
        }

        System.out.println(
                "Explorador: " + nome +
                " | Tipo: " + tipo +
                " | Status: Mapeando " + tarefa + " com cautela."
        );
    }
}
