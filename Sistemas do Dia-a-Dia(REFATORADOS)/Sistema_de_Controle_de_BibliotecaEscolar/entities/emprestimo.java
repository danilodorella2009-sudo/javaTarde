package Sistema_de_Controle_de_BibliotecaEscolar.entities;

public class emprestimo {

    public class aluno {

        private String nomeAluno;
        private int matricula;
        private boolean possuiMulta;
        private int livrosEmprestados;

        private String tituloLivro;
        private int codigoLivro;
        private boolean livroDisponivel;

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

        // GETS E SETS

        public String getNomeAluno() {
            return nomeAluno;
        }

        public void setNomeAluno(String nomeAluno) {
            this.nomeAluno = nomeAluno;
        }

        public int getMatricula() {
            return matricula;
        }

        public void setMatricula(int matricula) {
            this.matricula = matricula;
        }

        public boolean isPossuiMulta() {
            return possuiMulta;
        }

        public void setPossuiMulta(boolean possuiMulta) {
            this.possuiMulta = possuiMulta;
        }

        public int getLivrosEmprestados() {
            return livrosEmprestados;
        }

        public void setLivrosEmprestados(int livrosEmprestados) {
            this.livrosEmprestados = livrosEmprestados;
        }

        public String getTituloLivro() {
            return tituloLivro;
        }

        public void setTituloLivro(String tituloLivro) {
            this.tituloLivro = tituloLivro;
        }

        public int getCodigoLivro() {
            return codigoLivro;
        }

        public void setCodigoLivro(int codigoLivro) {
            this.codigoLivro = codigoLivro;
        }

        public boolean isLivroDisponivel() {
            return livroDisponivel;
        }

        public void setLivroDisponivel(boolean livroDisponivel) {
            this.livroDisponivel = livroDisponivel;
        }

        public void realizarEmprestimo(int matriculaDigitada, int codigoDigitado) {

            if (matriculaDigitada != getMatricula()) {

                System.out.println("Aluno não encontrado.");
                return;
            }

            if (isPossuiMulta()) {

                System.out.println("Empréstimo bloqueado por multa.");
                return;
            }

            if (getLivrosEmprestados() >= 3) {

                System.out.println("Limite de empréstimos atingido.");
                return;
            }

            if (codigoDigitado != getCodigoLivro() || !isLivroDisponivel()) {

                System.out.println("Livro indisponível.");
                return;
            }

            setLivrosEmprestados(getLivrosEmprestados() + 1);
            setLivroDisponivel(false);

            System.out.println("Empréstimo realizado com sucesso.");
            System.out.println("Aluno: " + getNomeAluno());
            System.out.println("Livro: " + getTituloLivro());
            System.out.println("Livros emprestados: " + getLivrosEmprestados());
        }
    }
}