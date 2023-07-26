package Aula07;

public enum A07EX01 {
    DOMINGO (new String[]{"domingo", "d", "dom"}, 1),
    SEGUNDA_FEIRA (new String[]{"segunda", "s", "seg"}, 2),
    TERCA_FEIRA (new String[]{"terça", "t", "ter"}, 3),
    QUARTA_FEIRA (new String[]{"quarta", "qua", "cuarta"}, 4),
    QUINTA_FEIRA (new String[]{"quinta", "qui", "kinta"}, 5),
    SEXTA_FEIRA (new String[]{"sexta", "se", "sex"}, 6),
    SABADO (new String[]{"sabado", "sábado", "sa", "sab", "sáb"}, 7);

    final String[] keywords;
    final int dia;

    A07EX01(String[] keywords, int dia) {
        this.keywords = keywords;
        this.dia = dia;
    }

    public String[] getKeywords() {
        return keywords;
    }

    public int getDia(){
        return dia;
    }

    public static A07EX01 fromNomeVerdadeiro(String nome){
        for (A07EX01 dia : A07EX01.values()){
            if (dia.getKeywords().equals(nome)){
                return dia;
            }
        }
        throw new IllegalArgumentException("Dia da semana inválido: " + nome);
    }

    public static void main(String[] args) {
        String nome = "domingo";
        A07EX01 dia = A07EX01.fromNomeVerdadeiro(nome);
        System.out.println("O dia da semana é " + dia);
    }
}
