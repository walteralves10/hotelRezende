package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FuncionariosDAO {

    /* INSERT INTO funcionarios (nomefuncionario, loginfuncionario, senhafuncionario, cargofuncionario) 
VALUES ('walter batista rezende','walter','123','lider') */
    public void insertFuncionario(FuncionariosBEAN func) {
        //System.out.println(func.getNomeFuncionario() + func.getLoginFuncionario() + func.getSenhaFuncionario() + func.getCargoFuncionario());

        String query = "INSERT INTO funcionarios(nomefuncionario, loginfuncionario, senhafuncionario, cargofuncionario) VALUES(?,?,?,?)";
        MySQLDAO.executeQuery(query, func.getNomeFuncionario(), func.getLoginFuncionario(), func.getSenhaFuncionario(), func.getCargoFuncionario());
    }

    public void updateFuncionario(FuncionariosBEAN func) {
        System.out.println(func.getNomeFuncionario() + func.getLoginFuncionario() + func.getSenhaFuncionario() + func.getCargoFuncionario() + func.getIdFuncionario());
        String query = "UPDATE funcionarios SET nomefuncionario=?, loginfuncionario=?, senhafuncionario=?, cargofuncionario=? WHERE idfuncionario=?";
        MySQLDAO.executeQuery(query, func.getNomeFuncionario(), func.getLoginFuncionario(), func.getSenhaFuncionario(), func.getCargoFuncionario(), func.getIdFuncionario());
    }

    public ArrayList<FuncionariosBEAN> findAllFuncionarios(FuncionariosBEAN func) {
        return listaFuncionarios("SELECT * FROM funcionarios WHERE idfuncionario=?", func);
    }

    public ArrayList<FuncionariosBEAN> listaFuncionarios(String query, FuncionariosBEAN func) {
        ArrayList<FuncionariosBEAN> lista = new ArrayList<FuncionariosBEAN>();

        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(query, func.getIdFuncionario());
        try {
            while (rs.next()) {
                lista.add(new FuncionariosBEAN(rs.getString("nomefuncionario"), rs.getString("loginfuncionario"), rs.getString("cargofuncionario"), rs.getString("senhafuncionario")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }

    public Boolean isExistFuncionario(FuncionariosBEAN func) {
        Boolean result = false;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT * FROM funcionarios WHERE senhafuncionario= ? AND loginfuncionario=?", func.getSenhaFuncionario(), func.getLoginFuncionario());
        try {
            if (rs.next()) {
                result = true;
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

}
