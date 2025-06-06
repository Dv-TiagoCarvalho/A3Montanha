
public class AlunoAcademia {

    private String nome;
    private String matricula;
    private String endereco;
    private String cidade;
    private String cpf;
    private String cep;
    private String telefone;
    private String rg;
    private String email;
    private String dataNascimento;
    private String sexo;
    private String planoAcademia;

    //construtor sem parametros
    public AlunoAcademia() {
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setPlanoAcademia(String planoAcademia) {
        this.planoAcademia = planoAcademia;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return nome + "," + matricula + "," + cpf + "," + endereco + "," + cidade + "," +
                cep + "," + telefone + "," + rg + "," + email + "," +
                dataNascimento + "," + sexo + "," + planoAcademia;
    }

}

