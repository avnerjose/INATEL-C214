public class MockHorarioProfessorService implements HorarioProfessorService {

    @Override
    public String busca(int id) throws HorarioProfessorInexistenteException {
        switch (id) {
            case 1:
                return HorarioProfessorConst.CHRIS;
            case 2:
                return HorarioProfessorConst.MARCELO;
            case 3:
                return HorarioProfessorConst.RENZO;
            case 4:
                return HorarioProfessorConst.YNOGUTI;
            default:
                throw new HorarioProfessorInexistenteException("Horário Inexistente");
        }
    }

}
