package model;

public class FuncionariosDAO {
    
    public void insertFuncionario(FuncionariosBEAN func){
        String query = "INSERT INTO funcionarios (nomefuncionario, loginfuncionario, senhafuncionario, cargofuncionario) VALUES (?,?,?,?)";
        MySQLDAO.executeQuery(query, func.getNomeFuncionario(), func.getLoginFuncionario(), func.getSenhaFuncionario(), func.getCargoFuncionario());
    }
    
    public void updateFuncionario(FuncionariosBEAN func){
        String query = "UPDATE funcionarios SET nomefuncionario=?, loginfuncionario=?, senhafuncionario=?, cargofuncionario=? WHERE idfuncionario=?";
        MySQLDAO.executeQuery(query, func.getNomeFuncionario(), func.getLoginFuncionario(), func.getSenhaFuncionario(), func.getCargoFuncionario(), func.getIdFuncionario());
    }
    
}
