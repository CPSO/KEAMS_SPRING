package keams.keams.Models.Repositories;

import keams.keams.ConnectionCreator;
import keams.keams.Interfaces.StudentRepositoryInterface;
import keams.keams.Models.StudentModel;
import org.springframework.stereotype.Repository;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements StudentRepositoryInterface {

    // AUTHOR(S): AP, LKB
    private ConnectionCreator connectionCreator = new ConnectionCreator();


    @Override
    public String createStudent(StudentModel p) {
        PreparedStatement preparedStatement = null;

        System.out.println("creating statement for EAN=" + p.getName());
        String createString = "INSERT INTO products VALUES(?, ?, ?, ?, ?, ?, ?)";

        try {
            System.out.println("getting connection...");
            preparedStatement = connectionCreator.getConnection().prepareStatement(createString);

            System.out.println("creating product with CPR=" + p.getCpr());
            preparedStatement.setInt(1, p.getCpr());
            preparedStatement.setString(2, p.getName());
            preparedStatement.setInt(3, p.getAge());

        } catch (SQLException e) {
            e.printStackTrace();
        }

        String msg;

        try {
            System.out.println("executing...");
            preparedStatement.executeUpdate();
            msg = "Studenten Navn: " + p.getName() + ", CPR nr.: " + p.getCpr();
        } catch (SQLException e) {
            msg = "Student med CPR: " + p.getCpr() + " eksisterer allerede og kan derfor ikke oprettes.";
            e.printStackTrace();
        }

        try {
            System.out.println("closing connection...");
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return msg;
    }
    @Override
    public List<StudentModel> getStudentList() {
        List<StudentModel> products = new ArrayList<>();
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;

        System.out.println("creating select statement for all products");
        String getAdminProductsString = "SELECT * FROM students";

        try {
            System.out.println("getting connection...");
            preparedStatement = connectionCreator.getConnection().prepareStatement(getAdminProductsString);

            System.out.println("selecting all products");
            rs = preparedStatement.executeQuery();

            while (rs.next()) {
                products.add(new StudentModel(rs.getString(1), rs.getInt(2), rs.getInt(3)));
            }

            System.out.println("closing resultset...");
            rs.close();

            System.out.println("closing connection...");
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return products;
    }
}
