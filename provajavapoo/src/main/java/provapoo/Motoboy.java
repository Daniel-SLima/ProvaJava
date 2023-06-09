package provapoo;

import java.time.LocalDate;

public class Motoboy extends Funcionario{
    private String cnh;

    @Override
    public String toString() {
        return "\n\nMotoboy:" + super.toString()
                + "\nCnh = " + cnh;
    }

    
    
    public Motoboy(String cnh, String cpf, String rg, String matricula, Setor setor, double salario, LocalDate dataNascimento, Genero genero, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, dataNascimento, genero, nome, telefone, email, endereco);
        this.cnh = cnh;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
    
    

    
}
