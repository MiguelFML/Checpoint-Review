public class Banco{

    String nomeDoBanco, enderecoBanco, nomeCompleto, endereco, dataDeNascimento;

    double saldo, deposito, retirada, valorEmprestimo, valorParcelaEmprestimo;

    boolean temEmprestimoAtivo;

    long cpf;

    int quantidadeParcelaEmprestimo;
    

    public Banco(String nomeBanco, String eBanco, String nCompleto, String enderecoDoC, boolean sim, long cpfP, String nascimento, double saldoConta, double depositoC, double valorRetirada, double valorE, int qtdParcela, double valorParcela)

    {
        
    nomeDoBanco = nomeBanco;

    enderecoBanco = eBanco;

    nomeCompleto = nCompleto;

    endereco = enderecoDoC;

    temEmprestimoAtivo = sim;

    cpf = cpfP;

    dataDeNascimento = nascimento;

    saldo= saldoConta;

    deposito = depositoC;

    retirada = valorRetirada;

    valorEmprestimo = valorE;

    quantidadeParcelaEmprestimo = qtdParcela;

    valorParcelaEmprestimo = valorParcela;
        }


    public static void main(String [] args){
        

      Banco pessoa1 = new Banco("itau", "alphavile", "migue ferreira", "rochdale", true, 435990053, "15/10/1980" , 5000, 500, 1250, 4000, 12, 450);

      
   //Mensagem 1
    System.out.println("\n O Banco " +pessoa1.nomeDoBanco+ " , com sede em " +pessoa1.enderecoBanco+ ", permitiu ao cliente " +pessoa1.nomeCompleto+ 

    ",\n residente em " +pessoa1.endereco+ ", nascido em " +pessoa1.dataDeNascimento+ " e com cpf " +pessoa1.cpf+ 

    " \n um emprestimo no valor de " +pessoa1.valorEmprestimo+ ", parcelado em " +pessoa1.quantidadeParcelaEmprestimo+ " vezes no valor de " +pessoa1.valorParcelaEmprestimo+ 

    ".\n O saldo do usuário era de " +pessoa1.saldo+ ", valor esse alterado na manhã de segunda-feira  \n por conta de uma retirada no valor de " +pessoa1.retirada+ " e um depósito no valor de " +pessoa1.deposito+ " , o que totaliza 4.250 no banco com dívida ainda em " +pessoa1.temEmprestimoAtivo+ ".");     

      
      Banco pessoa2 = new Banco ("nubank", "iguape", "andrei corleone", "ibitinga", true, 43599503, "22/12/2002", 6000, 700, 4000, 2500, 10, 300);

    //Mensagem 2
     System.out.println("\n O Banco " +pessoa2.nomeDoBanco+ " , com sede em " +pessoa2.enderecoBanco+ ", permitiu ao cliente " +pessoa2.nomeCompleto+ 

    ",\n residente em " +pessoa2.endereco+ ", nascida em " +pessoa2.dataDeNascimento+ " e com cpf " +pessoa2.cpf+ 

    " \n um emprestimo no valor de " +pessoa2.valorEmprestimo+ ", parcelado em " +pessoa2.quantidadeParcelaEmprestimo+ " vezes no valor de " +pessoa2.valorParcelaEmprestimo+ 

".\n O saldo do usuário era de " +pessoa2.saldo+ ", valor esse alterado na manhã de segunda-feira  \n por conta de uma retirada no valor de " +pessoa2.retirada+ " e um depósito no valor de " +pessoa2.deposito+ ", restando na conta um valor de 2700 reais que deve ser manuseado para pagar \n as dividas do empréstimo que está em estado de " +pessoa2.temEmprestimoAtivo+ ".");     
    }
    

}