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
        DiaDaSemana domingo = DiaDaSemana.valueOf("DOMINGO");
        
        System.out.println(domingo);
    }

}

/* Saída:
DOMINGO
*/