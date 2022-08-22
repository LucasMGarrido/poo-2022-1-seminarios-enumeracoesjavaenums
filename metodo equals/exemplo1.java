enum Etacao {
VERAO,
OUTONO,
IVERNO,
PRIMAVERA;
}

class Main {
public static void main(String[] args) {
Estacao estacao = Estacao.PRIMAVEIRA;

if(estacao.equals(Estacao.PRIMAVERA)){
System.out.println("Os valores sao iguais");
}
else{
System.out.println("Os valores são diferentes.");
  }
 }
}