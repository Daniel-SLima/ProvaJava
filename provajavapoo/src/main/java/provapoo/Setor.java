
package provapoo;

public enum Setor {
    ENGENHARIA("Engenharia"),
    SAUDE("Saude"),
    JURIDICO("Juridico"),
    OPERACOES("Operações");
    
    private final String texto;

    private Setor(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
    
    
}
