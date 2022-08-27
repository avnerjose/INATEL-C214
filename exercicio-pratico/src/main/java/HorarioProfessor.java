public class HorarioProfessor {
    private int id;
    private String nomeDoProfessor;
    private String periodo;
    private String horarioDeAtendimento;
    private String diaDaSemana;
    private String[] disciplinas;
    private String local;

    public HorarioProfessor(int id, String nomeDoProfessor, String periodo, String horarioDeAtendimento,
            String diaDaSemana, String[] disciplinas, String local) {
        this.id = id;
        this.nomeDoProfessor = nomeDoProfessor;
        this.periodo = periodo;
        this.horarioDeAtendimento = horarioDeAtendimento;
        this.diaDaSemana = diaDaSemana;
        this.disciplinas = disciplinas;
        this.local = local;
    }

    public void exibirDados() {
        System.out.println("Horário de atendimento - " + this.id);
        System.out.println("Nome do professor: " + this.nomeDoProfessor);
        System.out.println("Dia da semana: " + this.diaDaSemana);
        System.out.println("Horário de atendimento: " + this.horarioDeAtendimento);
        System.out.println("Local: " + this.local);
        System.out.println("Período: " + this.periodo);
        System.out.println("Disciplinas: ");

        for (String disciplina : this.disciplinas) {
            System.out.println(" - " + disciplina);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeDoProfessor() {
        return nomeDoProfessor;
    }

    public void setNomeDoProfessor(String nomeDoProfessor) {
        this.nomeDoProfessor = nomeDoProfessor;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getHorarioDeAtendimento() {
        return horarioDeAtendimento;
    }

    public void setHorarioDeAtendimento(String horarioDeAtendimento) {
        this.horarioDeAtendimento = horarioDeAtendimento;
    }

    public String getDiaDaSemana() {
        return diaDaSemana;
    }

    public void setDiaDaSemana(String diaDaSemana) {
        this.diaDaSemana = diaDaSemana;
    }

    public String[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
}
