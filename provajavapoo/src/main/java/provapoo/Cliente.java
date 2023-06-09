
package provapoo;

import java.time.LocalDate;

public class Cliente extends Fisica{
    private int protocoloAtendimento;

    @Override
    public String toString() {
        return "\n\nCliente:"+ super.toString() + "\nProtocolo do Atendimento = " + protocoloAtendimento;
    }

    
    
    public Cliente(int protocoloAtendimento, LocalDate dataNascimento, Genero genero, String nome, String telefone, String email, Endereco endereco) {
        super(dataNascimento, genero, nome, telefone, email, endereco);
        this.protocoloAtendimento = protocoloAtendimento;
    }

    public int getProtocoloAtendimento() {
        return protocoloAtendimento;
    }

    public void setProtocoloAtendimento(int protocoloAtendimento) {
        this.protocoloAtendimento = protocoloAtendimento;
    }
    
    
}
