public class Fornecedor {
    private String nomeEmpresa;
    private String CPFCnpj;
    private String endereço;
    private String email;
    private String telefone;
    private String mercadoria;

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getCPFCnpj() {
        return CPFCnpj;
    }

    public void setCPFCnpj(String CPFCnpj) {
        this.CPFCnpj = CPFCnpj;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getMercadoria() {
        return mercadoria;
    }

    public void setMercadoria(String mercadoria) {
        this.mercadoria = mercadoria;
    }

}
