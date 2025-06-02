import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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

    private LocalDate dataNascimento;

    private String sexo;
    private String planoAcademia;

    //construtor sem parametros
    public AlunoAcademia() {

    }

    public String getNome() {
        return nome;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getPlanoAcademia() {
        return planoAcademia;
    }

    public void setPlanoAcademia(String planoAcademia) {
        this.planoAcademia = planoAcademia;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    //metodo 'toString' criado para imprimir a classe AlunoAcademia no Main em forma de texto

    public String toString() {
        return "Aluno: " +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", cpf='" + cpf + '\'' +
                ", endereço='" + endereco + '\'' +
                ", cidade='" + cidade + '\'' +
                ", cep='" + cep + '\'' +
                ", telefone='" + telefone + '\'' +
                ", rg='" + rg + '\'' +
                ", email='" + email + '\'' +
                ", dataNascimento='" + getDataNascimentoFormatada() + '\'' +
                ", sexo='" + sexo + '\'' +
                ", planoAcademia='" + planoAcademia + '\'';
    }

    // Metodo para formatar a data de nascimento do aluno
    public String getDataNascimentoFormatada() {
        if (dataNascimento == null) {
            return "não informado";
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return dataNascimento.format(formatter);
    }

}

