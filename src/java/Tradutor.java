
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Guilherme Gomes
 */
public class Tradutor {

    private String palavra;

    public Tradutor(String palavra) {
        this.palavra = palavra;
    }

    public String getPalavraTraduzida() {
        String palavraTraduzida = "";

        Path path = Paths.get("C:/Users/Guilherme Gomes/Documents/NetBeansProjects/tradutor/dicionario.txt");

        try {
            List<String> linhasArquivo = Files.readAllLines(path);

            String proper[] = new String[linhasArquivo.size()];
            Map<String, String> mapa = new HashMap<>();

            for (String palavraEmIngles : linhasArquivo) {
                proper = palavraEmIngles.trim().split("=");

                mapa.put(proper[0].trim(), proper[1].trim());
            }

            palavraTraduzida = mapa.get(palavra);

            if (palavraTraduzida == null) {
                palavraTraduzida = palavra;
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return palavraTraduzida;
    }
}
