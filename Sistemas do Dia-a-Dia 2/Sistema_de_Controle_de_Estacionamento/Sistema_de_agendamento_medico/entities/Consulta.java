package Sistema_de_agendamento_medico.entities;

public class Consulta {

    private String especialidade;
    private String horario;

    public Consulta(String especialidade, String horario) {

        this.especialidade = especialidade;
        this.horario = horario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}

