package model;

public class FuncionariosDAO {
    
    public void insertFuncionario(FuncionariosBEAN func){
        String query = "INSERT INTO funcionarios (nomefuncionario, loginfuncionario, senhafuncionario, cargofuncionario) VALUES (?,?,?,?)";
        MySQLDAO.executeQuery(query, func.getNomeFuncionario(), func.getLoginFuncionario(), func.getSenhaFuncionario(), func.getCargoFuncionario());
    }
    
}
