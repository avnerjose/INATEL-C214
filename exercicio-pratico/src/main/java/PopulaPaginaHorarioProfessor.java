import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class PopulaPaginaHorarioProfessor {
    HorarioProfessorService horarioService;

    public PopulaPaginaHorarioProfessor(HorarioProfessorService horarioService) {
        this.horarioService = horarioService;
    }

    public HorarioProfessor buscaHorarioProfessor(int id)
            throws HorarioProfessorIdInvalidoException, HorarioProfessorInexistenteException {
        if (id < 0)
            throw new HorarioProfessorIdInvalidoException("Id inválido");

        try {
            String horarioProfessorJSON = this.horarioService.busca(id);
            JsonObject jsonObject = JsonParser.parseString(horarioProfessorJSON).getAsJsonObject();
            String[] disciplinasJson = new Gson().fromJson(jsonObject.get("disciplinas").getAsJsonArray(),
                    String[].class);

            return new HorarioProfessor(
                    jsonObject.get("id").getAsInt(),
                    jsonObject.get("nomeDoProfessor").getAsString(),
                    jsonObject.get("periodo").getAsString(),
                    jsonObject.get("horarioDeAtendimento").getAsString(),
                    jsonObject.get("diaDaSemana").getAsString(),
                    disciplinasJson,
                    jsonObject.get("local").getAsString());

        } catch (HorarioProfessorInexistenteException e) {
            throw e;
        }

    }

}
