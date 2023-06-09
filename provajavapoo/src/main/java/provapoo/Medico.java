
package provapoo;

import java.time.LocalDate;

public class Medico extends Funcionario{
    private String crm;

    @Override
    public String toString() {
        return "\n\nMedico: " + super.toString()  
                + "\nCrm = " + crm;
    }

    
    
    
    public Medico(String crm, String cpf, String rg, String matricula, Setor setor, double salario, LocalDate dataNascimento, Genero genero, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, dataNascimento, genero, nome, telefone, email, endereco);
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
    
    
    
    
}
