package cadastrofornecedoresnovo;

//Definir a estrtura de dados que serao armazenados dentro do arquivo dentro
//do arquivo CSV, para que tenhamos persistencia de dados.
public class DadosFornecedores {
   
    //atributos da classe
    private String nomeFornecedor;
    private String tipoFornecedor;
    private String principalProduto;
    private String celular;
    private String telFixo;
    private String email;
    private String telComercial;
    private String telRecado;
    private String nomeContato;
    private String cep;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String dadosAdicionais;
    
    //metodos construtores

    public DadosFornecedores(String nomeFornecedor, String tipoFornecedor, String principalProduto, String celular, String telFixo, String email, String telComercial, String telRecado, String nomeContato, String cep, String rua, String numero, String bairro, String cidade, String estado, String dadosAdicionais) {
        this.nomeFornecedor = nomeFornecedor;
        this.tipoFornecedor = tipoFornecedor;
        this.principalProduto = principalProduto;
        this.celular = celular;
        this.telFixo = telFixo;
        this.email = email;
        this.telComercial = telComercial;
        this.telRecado = telRecado;
        this.nomeContato = nomeContato;
        this.cep = cep;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.dadosAdicionais = dadosAdicionais;
    }
    //getter e setters

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public String getTipoFornecedor() {
        return tipoFornecedor;
    }

    public void setTipoFornecedor(String tipoFornecedor) {
        this.tipoFornecedor = tipoFornecedor;
    }

    public String getPrincipalProduto() {
        return principalProduto;
    }

    public void setPrincipalProduto(String principalProduto) {
        this.principalProduto = principalProduto;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelFixo() {
        return telFixo;
    }

    public void setTelFixo(String telFixo) {
        this.telFixo = telFixo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelComercial() {
        return telComercial;
    }

    public void setTelComercial(String telComercial) {
        this.telComercial = telComercial;
    }

    public String getTelRecado() {
        return telRecado;
    }

    public void setTelRecado(String telRecado) {
        this.telRecado = telRecado;
    }

    public String getNomeContato() {
        return nomeContato;
    }

    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDadosAdicionais() {
        return dadosAdicionais;
    }

    public void setDadosAdicionais(String dadosAdicionais) {
        this.dadosAdicionais = dadosAdicionais;
    }
    
    


}
