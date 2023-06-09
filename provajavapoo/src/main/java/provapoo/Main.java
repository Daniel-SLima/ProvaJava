
package provapoo;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Juridica pessoaJuridica = new Juridica("32154800001654",
                "BA321564894", "Fernando",
                "71951698753", "FernandoJuriridico@hotmail.com", 
                new Endereco("Rua", "123", "Ao lado do Mercado"
                        , "41654822", "Salvador", UnidadeFederativa.BAHIA));
        Cliente cliente = new Cliente(2023454, 
                LocalDate.of(2000, 8, 20), 
                Genero.FEMININO, "Agatha Dias", 
                "71987562154", "AgathaCliente@gmail.com", 
                new Endereco("Rua", "4002", "Lar do Gas"
                        , "11542685", "São Paulo"
                        , UnidadeFederativa.SAO_PAULO));
        Advogado funcionarioAdvogado = new Advogado("RJ6542184", "45123546871", 
                "6522899137", "RJ154A21357", 
                Setor.JURIDICO, 4200,
                LocalDate.of(1992, 2, 20), 
                Genero.FEMININO, 
                "Lorena Lima", "1165432198", "LorenaAdvocacia@gmail.com", 
                new Endereco("Alameda", "23", "Predio Luz", 
                        "21547856","Rio de janeiro",
                        UnidadeFederativa.RIO_DE_JANEIRO));
        Medico funcionarioMedico = new Medico("BA1654896",
                "987453135425", "6487845120",
                "BA165468531", Setor.SAUDE, 9400,
                LocalDate.of(1994, 5, 23), 
                Genero.MASCULINO, "Daniel Lima", 
                "71654784521", "MedicoDaniel@gmail.com", 
                new Endereco("Rua", "6154",
                        "Edificio WN", "40654285",
                        "Salvador", UnidadeFederativa.BAHIA));
        Motoboy funcionarioMotoboy = new Motoboy("16516465165", 
                "156165165165", "1321245", 
                "165456123", Setor.OPERACOES, 
                2000, 
                LocalDate.of(1998, 5, 20), 
                Genero.MASCULINO, "Carlos Rocha", 
                "7135456124", "MotoCarlos@gmail.com", new Endereco("Rua",
                        "1354", "Portão Verde", "156432135",
                        "Salvador", UnidadeFederativa.BAHIA));
        
        
        System.out.println("Relação do Banco de dados\n"
                + pessoaJuridica.toString() + cliente.toString() 
                + funcionarioAdvogado.toString() + funcionarioMedico.toString() 
                + funcionarioMotoboy.toString());
        }
    
}
