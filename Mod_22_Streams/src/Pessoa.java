
import java.util.List;
import java.util.Objects;


public class Pessoa {

        private String nome;

        private String sexo;


        public Pessoa() {

            this.nome = nome;
            this.sexo = sexo;

        }

        public Pessoa(Pessoa pessoa) {
            this.sexo = sexo;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getSexo() {
            return sexo;
        }

        public void setSexo(String sexo) {
            this.sexo = sexo;
        }


        public List<Pessoa> popPessoas() {
            Pessoa pessoa1 = new Pessoa();
            Pessoa pessoa2 = new Pessoa();
            Pessoa pessoa3 = new Pessoa();
            Pessoa pessoa4 = new Pessoa();
            Pessoa pessoa5 = new Pessoa();
            Pessoa pessoa6 = new Pessoa();



            return List.of(pessoa1,pessoa2,pessoa3,pessoa4,pessoa5,pessoa6);
        }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa)) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(nome, pessoa.nome) && Objects.equals(sexo, pessoa.sexo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, sexo);
    }
}
