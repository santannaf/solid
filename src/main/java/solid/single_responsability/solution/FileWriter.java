package solid.single_responsability.solution;

import java.io.PrintWriter;

// 2) Persistência (I/O)
public class FileWriter {
    public void save(String caminho, String conteudo) {
        try (PrintWriter pw = new PrintWriter(caminho)) {
            pw.println(conteudo);
        } catch (Exception e) { //noinspection CallToPrintStackTrace
            e.printStackTrace(); }
    }
}
