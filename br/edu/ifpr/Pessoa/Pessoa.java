public class Pessoa {
    private Long id;
    private String nome;
    private String cpf;
    private Documento docID;
    private String endereco;
    private Documento comprovanteEnd;
    private String telefone;
}
    //Construtor
    public Pessoa(Long id, String nome, String cpf, Documento docID, String endereco, Documento comprovanteEnd, String telefone) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.docID = docID;
        this.endereco = endereco;
        this.comprovanteEnd = comprovanteEnd;
        this.telefone = telefone;
    }
    //Getters e Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public Documento getDocID() {
        return docID;
    }
    public void setDocID(Documento docID) {
        this.docID = docID;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public Documento getComprovanteEnd() {
        return comprovanteEnd;
    }
    public void setComprovanteEnd(Documento comprovanteEnd) {
        this.comprovanteEnd = comprovanteEnd;
    }
    