import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ListaF
{


    public static class ExemplosMap {

        public static void main(String[] args) {
            List<Pessoa> lista = new Pessoa().popPessoas();

              Stream<Pessoa> steam = lista.stream()
                       .filter(pessoa -> pessoa.getSexo().equals("F"));


            lista.stream()
                    .filter(pessoa -> pessoa.getSexo().equals("F"))
                    .forEach(p -> System.out.println(p.getNome()));

        }
    }
}
