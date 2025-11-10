package com.lephantrunghieu.lpth_lesson01_spring_boot.service;

import com.lephantrunghieu.lpth_lesson01_spring_boot.entity.lpthStudent;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Service class: lpthStudentService
 * <p>Lớp dịch vụ thực hiện các chức năng thao tác với danh sách đối tượng lpthStudent</p>
 *
 * @author Le
 * @version 1.0
 */
@Service
public class lpthStudentService {

    private List<lpthStudent> students = new ArrayList<>();

    public lpthStudentService() {
        students.addAll(Arrays.asList(
                new lpthStudent(1L, "Devmaster1", 20, "Nam", "Số 25 VNP", "0123456789", "lephantrunghieu@gmail.com"),
                new lpthStudent(2L, "Devmaster2", 25, "Nữ", "Số 25 VNP", "0926781781", "contact@devmaster.edu.vn"),
                new lpthStudent(3L, "Devmaster3", 22, "Nam", "Số 25 VNP", "0925222830", "student3@devmaster.edu.vn")
        ));
    }

    // Lấy toàn bộ danh sách sinh viên
    public List<lpthStudent> getStudent() {
        return students;
    }

    // Lấy sinh viên theo ID
    public lpthStudent getStudent(Long id) {
        return students.stream()
                .filter(student -> student.getLpthId().equals(id))
                .findFirst()
                .orElse(null);
    }

    // Thêm mới một sinh viên
    public lpthStudent addStudent(lpthStudent student) {
        Long maxId = students.stream()
                .mapToLong(l -> l.getLpthId() != null ? l.getLpthId() : 0)
                .max().orElse(0L);
        student.setLpthId(maxId + 1);
        students.add(student);
        return student;
    }

    // Cập nhật thông tin sinh viên
    public lpthStudent updateStudent(Long id, lpthStudent student) {
        lpthStudent check = getStudent(id);
        if (check == null) {
            return null;
        }

        students.forEach(item -> {
            if (item.getLpthId().equals(id)) {
                item.setLpthName(student.getLpthName());
                item.setLpthAddress(student.getLpthAddress());
                item.setLpthEmail(student.getLpthEmail());
                item.setLpthPhone(student.getLpthPhone());
                item.setLpthAge(student.getLpthAge());
                item.setLpthGender(student.getLpthGender());
            }
        });
        return student;
    }

    // Xóa thông tin sinh viên
    public boolean deleteStudent(Long id) {
        lpthStudent check = getStudent(id);
        return students.remove(check);
    }
}
