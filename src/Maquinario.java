public class Maquinario {
    private String NomedoEquipamento;
    private String Quantidade;
    private String DataManuteção;
    private String funcionamento;
    private String ModelodoEquipamnto;

    public String getNomedoEquipamento() {
        return NomedoEquipamento;
    }

    public void setNomedoEquipamento(String nomedoEquipamento) {
        NomedoEquipamento = nomedoEquipamento;
    }

    public String getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(String quantidade) {
        Quantidade = quantidade;
    }

    public String getDataManuteção() {
        return DataManuteção;
    }

    public void setDataManuteção(String dataManuteção) {
        DataManuteção = dataManuteção;
    }

    public String getFuncionamento() {
        return funcionamento;
    }

    public void setFuncionamento(String funcionamento) {
        this.funcionamento = funcionamento;
    }

    public String getModelodoEquipamnto() {
        return ModelodoEquipamnto;
    }

    public void setModelodoEquipamnto(String modelodoEquipamnto) {
        ModelodoEquipamnto = modelodoEquipamnto;
    }
}
