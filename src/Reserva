public class Reserva {
    private int quantidadeDiaria;
    private int quantidadePessoas;
    private Suite suite;
    private Hospede hospedeResponsavel;

    public Reserva() {
    }
    
    public void  Cadastrar(int qtdDias, int qtdPessoas, Suite suite, Hospede responsavel){
        this.setQuantidadeDiaria(qtdDias);
        this.setQuantidadePessoas(qtdPessoas);
        this.setSuite(suite);
        this.setHospedeResponsavel(responsavel);
        double valor = 0;
        if(qtdPessoas <= suite.getCapacidade()){
            valor = suite.getDiaria() * getQuantidadeDiaria();
            if(qtdDias >= 7){
                valor = (valor /100) * 90;
            }
            System.out.println("Cadastro Realizado com Sucesso");
            System.out.println("Valor da Reserva: R$ "+valor);
            System.out.println("Quantidade de Pessoas: "+getQuantidadePessoas());
            System.out.println("Quantidade de Dias: "+getQuantidadeDiaria());
            System.out.println("Suite: "+suite.getTipo());
            System.out.println("Hospede Responsavel: "+responsavel.getNome());
        }else{
            System.out.println("Suite não suporta essa capacidade de Pessoas");
        }
    }

    public int getQuantidadeDiaria() {
        return quantidadeDiaria;
    }

    public void setQuantidadeDiaria(int quantidadeDiaria) {
        this.quantidadeDiaria = quantidadeDiaria;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

    public Suite getSuite() {
        return suite;
    }

    public void setSuite(Suite suite) {
        this.suite = suite;
    }

    public Hospede getHospedeResponsavel() {
        return hospedeResponsavel;
    }

    public void setHospedeResponsavel(Hospede hospedeResponsavel) {
        this.hospedeResponsavel = hospedeResponsavel;
    }
    
    
}
