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
        DiaDaSemana domingo = Enum.valueOf(DiaDaSemana.class, "DOMINGO");
        
        System.out.println(domingo);
    }

}

/* Saída:
DOMINGO
*/