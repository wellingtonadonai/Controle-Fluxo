public class condicaoTernaria {
    
    public static void main(String[] args) {
        
        int nota = 4;

        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota <7 ? "Recperação" : "Reprovado";

        System.out.println(resultado);
    }
}
