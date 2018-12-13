package model;

import java.util.Date;

public class ComprovantesBEAN {
    
    private int idComprovante;
    private Date dataComprovante;
    private int idClienteComprovante;
    private int idFuncionarioComprovante;

    public int getIdComprovante() {
        return idComprovante;
    }

    public void setIdComprovante(int idComprovante) {
        this.idComprovante = idComprovante;
    }

    public Date getDataComprovante() {
        return dataComprovante;
    }

    public void setDataComprovante(Date dataComprovante) {
        this.dataComprovante = dataComprovante;
    }

    public int getIdClienteComprovante() {
        return idClienteComprovante;
    }

    public void setIdClienteComprovante(int idClienteComprovante) {
        this.idClienteComprovante = idClienteComprovante;
    }

    public int getIdFuncionarioComprovante() {
        return idFuncionarioComprovante;
    }

    public void setIdFuncionarioComprovante(int idFuncionarioComprovante) {
        this.idFuncionarioComprovante = idFuncionarioComprovante;
    }
    
    
    
}
