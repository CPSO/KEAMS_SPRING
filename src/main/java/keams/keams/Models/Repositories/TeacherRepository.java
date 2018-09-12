package keams.keams.Models.Repositories;

import keams.keams.ConnectionCreator;
import keams.keams.Interfaces.TeacherRepositoryInterface;
import keams.keams.Models.StudentModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TeacherRepository implements TeacherRepositoryInterface {

    // AUTHOR(S): AP, LKB
    private ConnectionCreator connectionCreator = new ConnectionCreator();


    @Override
    public String createTeacher(StudentModel p) {
        PreparedStatement preparedStatement = null;

        System.out.println("creating statement for TEACHER=" + p.getName());
        String createString = "INSERT INTO teachers VALUES(?, ?, ?, ?, ?, ?, ?)";

        try {
            System.out.println("getting connection...");
            preparedStatement = connectionCreator.getConnection().prepareStatement(createString);

            System.out.println("creating product with CPR=" + p.getCpr());
            preparedStatement.setString(1, p.getCpr());
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
    public List<StudentModel> getTeacherList() {
        List<StudentModel> teachers = new ArrayList<>();
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;

        System.out.println("creating select statement for all teachers");
        String getAllTeachersString = "SELECT * FROM teachers";

        try {
            System.out.println("getting connection...");
            preparedStatement = connectionCreator.getConnection().prepareStatement(getAllTeachersString);

            System.out.println("selecting all teachers");
            rs = preparedStatement.executeQuery();

            while (rs.next()) {
                teachers.add(new StudentModel(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getInt(4)));
            }

            System.out.println("closing resultset...");
            rs.close();

            System.out.println("closing connection...");
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return teachers;
    }
}
