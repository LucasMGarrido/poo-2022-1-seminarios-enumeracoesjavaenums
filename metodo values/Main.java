public class Main {

    enum DiaDaSemana {

        DOMINGO,
        SEGUNDA,
        TERCA,
        QUARTA,
        QUINTA,
        SEXTA,
        SABADO

    }

    public static void main(String[] args) {
        DiaDaSemana[] diasDaSemana = DiaDaSemana.values();

        for(DiaDaSemana diaDaSemana : diasDaSemana) {
            System.out.println(diaDaSemana);
        }
    }

}

/* Saída:
DOMINGO
SEGUNDA
TERCA
QUARTA
QUINTA
SEXTA
SABADO
*/