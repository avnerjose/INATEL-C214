import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestePopulaPaginaHorarioProfessor {
    private HorarioProfessorService service;
    private PopulaPaginaHorarioProfessor populaPaginaHorarioProfessor;

    @Before
    public void setup() {
        this.service = new MockHorarioProfessorService();
        this.populaPaginaHorarioProfessor = new PopulaPaginaHorarioProfessor(service);
    }

    @Test
    public void testeBuscaHorarioProfessorChris()
            throws HorarioProfessorIdInvalidoException, HorarioProfessorInexistenteException {
        HorarioProfessor horario = this.populaPaginaHorarioProfessor.buscaHorarioProfessor(1);

        assertEquals(1, horario.getId());
        assertEquals("Christópher Tester Lima", horario.getNomeDoProfessor());
        assertEquals("Terça", horario.getDiaDaSemana());
        assertEquals("17:30 - 19:10", horario.getHorarioDeAtendimento());
        assertEquals("CDG Hub - Prédio 4", horario.getLocal());
        assertEquals("noturno", horario.getPeriodo());
        assertArrayEquals(new String[] { "C214", "S206", "S107" }, horario.getDisciplinas());

    }

    @Test
    public void testeBuscaHorarioProfessorMarcelo()
            throws HorarioProfessorIdInvalidoException, HorarioProfessorInexistenteException {

        HorarioProfessor horario = this.populaPaginaHorarioProfessor.buscaHorarioProfessor(2);

        assertEquals(2, horario.getId());
        assertEquals("Marcelinho Luanete Cysneiros", horario.getNomeDoProfessor());
        assertEquals("Quarta", horario.getDiaDaSemana());
        assertEquals("10:00 - 11:40", horario.getHorarioDeAtendimento());
        assertEquals("Prédio 1 - Sala 16", horario.getLocal());
        assertEquals("integral", horario.getPeriodo());
        assertArrayEquals(new String[] { "C209", "C210" }, horario.getDisciplinas());

    }

    @Test
    public void testeBuscaHorarioProfessorRenzo()
            throws HorarioProfessorIdInvalidoException, HorarioProfessorInexistenteException {

        HorarioProfessor horario = this.populaPaginaHorarioProfessor.buscaHorarioProfessor(3);

        assertEquals(3, horario.getId());
        assertEquals("Renzão BDzeiro Mesquita", horario.getNomeDoProfessor());
        assertEquals("Segunda", horario.getDiaDaSemana());
        assertEquals("15:30 - 17:10", horario.getHorarioDeAtendimento());
        assertEquals("Prédio 6 - Sala 1.4", horario.getLocal());
        assertEquals("integral", horario.getPeriodo());
        assertArrayEquals(new String[] { "C207", "C111" }, horario.getDisciplinas());

    }

    @Test
    public void testeBuscaHorarioProfessorYnoguti()
            throws HorarioProfessorIdInvalidoException, HorarioProfessorInexistenteException {

        HorarioProfessor horario = this.populaPaginaHorarioProfessor.buscaHorarioProfessor(4);

        assertEquals(4, horario.getId());
        assertEquals("Carlos Mestre das Artes Místicas Ynoguti", horario.getNomeDoProfessor());
        assertEquals("Sexta", horario.getDiaDaSemana());
        assertEquals("17:30 - 19:10", horario.getHorarioDeAtendimento());
        assertEquals("Prédio 1 - Sala 15", horario.getLocal());
        assertEquals("noturno", horario.getPeriodo());
        assertArrayEquals(new String[] { "C202", "C103", "C204" }, horario.getDisciplinas());

    }

    @Test(expected = HorarioProfessorIdInvalidoException.class)
    public void testeBuscaHorarioProfessorComIdInvalido()
            throws HorarioProfessorIdInvalidoException, HorarioProfessorInexistenteException {
        HorarioProfessor horario = this.populaPaginaHorarioProfessor.buscaHorarioProfessor(-20);
    }

    @Test(expected = HorarioProfessorInexistenteException.class)
    public void testeBuscaHorarioProfessorInexistente()
            throws HorarioProfessorIdInvalidoException, HorarioProfessorInexistenteException {
        HorarioProfessor horario = this.populaPaginaHorarioProfessor.buscaHorarioProfessor(10);
    }

    @Test(expected = HorarioProfessorInexistenteException.class)
    public void testeBuscaHorarioProfessorComIdZero()
            throws HorarioProfessorIdInvalidoException, HorarioProfessorInexistenteException {
        HorarioProfessor horario = this.populaPaginaHorarioProfessor.buscaHorarioProfessor(0);

    }
}
