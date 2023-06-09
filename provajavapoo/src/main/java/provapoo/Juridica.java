
package provapoo;

public class Juridica extends Pessoa {
    
    private String cnpj;
    private String inscricaoEstadual;

    @Override
    public String toString() {
        return  "\nPessoa Juridica: " 
                + super.toString()
                + "\nCnpj = " + cnpj 
                + "\nInscricao Estadual = " + inscricaoEstadual;
    }

    
    
    
    public Juridica(String cnpj, String inscricaoEstadual, String nome, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }
    
    
}
