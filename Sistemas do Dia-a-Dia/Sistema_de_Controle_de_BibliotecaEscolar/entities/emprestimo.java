package Sistema_de_Controle_de_BibliotecaEscolar.entities;

public class emprestimo {
    public class aluno {

        public String nomeAluno;
        public int matricula;
        public boolean possuiMulta;
        public int livrosEmprestados;

        public String tituloLivro;
        public int codigoLivro;
        public boolean livroDisponivel;

        public aluno(String nomeAluno, int matricula,
                     boolean possuiMulta, int livrosEmprestados,
                     String tituloLivro, int codigoLivro,
                     boolean livroDisponivel) {

            this.nomeAluno = nomeAluno;
            this.matricula = matricula;
            this.possuiMulta = possuiMulta;
            this.livrosEmprestados = livrosEmprestados;

            this.tituloLivro = tituloLivro;
            this.codigoLivro = codigoLivro;
            this.livroDisponivel = livroDisponivel;
        }

        public void realizarEmprestimo(int matriculaDigitada, int codigoDigitado) {

            if (matriculaDigitada != matricula) {

                System.out.println("Aluno não encontrado.");
                return;
            }
            if (possuiMulta) {

                System.out.println("Empréstimo bloqueado por multa.");
                return;
            }
            if (livrosEmprestados >= 3) {

                System.out.println("Limite de empréstimos atingido.");
                return;
            }
            if (codigoDigitado != codigoLivro || !livroDisponivel) {

                System.out.println("Livro indisponível.");
                return;
            }
            livrosEmprestados++;
            livroDisponivel = false;

            System.out.println("Empréstimo realizado com sucesso.");
            System.out.println("Aluno: " + nomeAluno);
            System.out.println("Livro: " + tituloLivro);
            System.out.println("Livros emprestados: " + livrosEmprestados);
        }
    }
}