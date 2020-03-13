package innerclass;

import java.util.ArrayList;
import java.util.List;

class ClassC {
    String studentName;
    String stuId;
    String branch;



    public ClassC(String studentName, String stuId, String branch) {
        this.studentName = studentName;
        this.stuId = stuId;
        this.branch = branch;
    }

    public ClassC() {
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }


    @Override
    public String toString() {
        return "ClassC{" +
                "studentName='" + studentName + '\'' +
                ", stuId='" + stuId + '\'' +
                ", branch='" + branch + '\'' +
                '}'+"\n";
    }

}