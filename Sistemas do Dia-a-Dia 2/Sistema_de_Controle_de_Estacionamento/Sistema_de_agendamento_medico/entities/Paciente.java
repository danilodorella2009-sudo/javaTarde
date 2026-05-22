package Sistema_de_agendamento_medico.entities;

public class Paciente {

        private String CPF;
        private String nomePaciente;

        public Paciente(String CPF, String nomePaciente) {

            this.CPF = CPF;
            this.nomePaciente = nomePaciente;
        }

        public String getCPF() {
            return CPF;
        }

        public void setCPF(String CPF) {
            this.CPF = CPF;
        }

        public String getNomePaciente() {
            return nomePaciente;
        }

        public void setNomePaciente(String nomePaciente) {
            this.nomePaciente = nomePaciente;
        }
    }

