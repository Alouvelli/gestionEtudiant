package com.mycompany.app.repository.jdbc;

import com.mycompany.app.domain.Etudiant;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcEtudiantRepository implements  EtudiantRepository{
    private final DataSource dataSource;

    public JdbcEtudiantRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public int add(Etudiant etudiant) {
        int ok = 0;
        String query = "INSERT INTO etudiant (matricule, nom, prenom,datenais, tel, classe) VALUES(?,?,?,?,?,?)";
        try {

            Connection connection = dataSource.createConnection();
            PreparedStatement statement = connection.prepareStatement(query);

            statement.setString(1, etudiant.getMatricule());
            statement.setString(2, etudiant.getNom());
            statement.setString(3, etudiant.getPrenom());
            statement.setString(4, etudiant.getDatenais());
            statement.setString(5, etudiant.getTel());
            statement.setString(6, etudiant.getClasse());
            ok = statement.executeUpdate();

            if (ok > 0) {
                System.out.println("etudiant créé avec succés!");
            }
            return ok;
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return 0;
    }

    @Override
    public int update(Etudiant etudiant ) {
        String query = "UPDATE  user SET matricule=?, nom=?, prenom=?, datenais=?, tel=?, classe=?   where id=?";
        int ok = 0;
        try {

            Connection connection = dataSource.createConnection();
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1,etudiant.getMatricule());
            statement.setString(2, etudiant.getNom());
            statement.setString(3, etudiant.getPrenom());
            statement.setString(4, etudiant.getDatenais());
            statement.setString(5, etudiant.getTel());
            statement.setString(6, etudiant.getClasse());
            ok = statement.executeUpdate();

            System.out.println(statement);
            ok = statement.executeUpdate();
            if (ok > 0) {
                System.out.println("étudiant modifié avec succés!");
            }
            return ok;
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return 0;
    }



    @Override
    public int delete(int id) {
        String query = "DELETE FROM etudiant where id=?";
        int ok =0;
        try {
            Connection connection = dataSource.createConnection();
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, id);
            ok = statement.executeUpdate();
            if (ok > 0) {
                System.out.println("etudiant supprimé avec succés!");
            }
            return ok;
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return 0;
    }

    @Override
    public Etudiant[] getAll() {
        //requête sql pour récupèrer les infos
        String query = "SELECT * FROM etudiant e";
        //mapper le résultat
        List<Etudiant> etudiants = new ArrayList<Etudiant>();


       try {
            Connection connection = dataSource.createConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query) ;

            while (rs.next()) {

                String matricule = rs.getString("matricule");
                String nom = rs.getString("nom");
                String prenom = rs.getString("prenom");
                String datenais = rs.getString("datenais");
                String tel = rs.getString("tel");
                String classe = rs.getString("classe");
                Etudiant etudiant = new Etudiant(   matricule, nom, prenom,datenais, tel,classe);
                etudiants.add(etudiant);
            }
            return etudiants.toArray(new Etudiant[0]);

        }

        catch (SQLException e){
            return new Etudiant[0];
        }
       catch (Exception ex){
           return new Etudiant[0];
       }
    }
}
