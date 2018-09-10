package keams.keams.Interfaces;

import keams.keams.Models.StudentModel;

import java.util.List;

public interface StudentRepositoryInterface {
    String createStudent(StudentModel p);
    List<StudentModel> getStudentList();
    String createProduct(StudentModel p);
    void updateProduct(StudentModel p);
    void deleteProduct(String ean);
    StudentModel get(String ean);
    List<StudentModel> getList(String category);
}
