package com.example.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name = "studentServlet", value = "/student")
public class StudentServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "Dân", "https://s480-ava-grp-talk.zadn.vn/8/5/9/5/2/480/5bf44f39c4d8abfd2dbc9092074e731e.jpg"));
        students.add(new Student(2, "Linh", "https://s480-ava-grp-talk.zadn.vn/8/5/9/5/2/480/5bf44f39c4d8abfd2dbc9092074e731e.jpg"));
        students.add(new Student(3, "Đức", "https://s480-ava-grp-talk.zadn.vn/8/5/9/5/2/480/5bf44f39c4d8abfd2dbc9092074e731e.jpg"));
        students.add(new Student(4, "Đề", "https://s480-ava-grp-talk.zadn.vn/8/5/9/5/2/480/5bf44f39c4d8abfd2dbc9092074e731e.jpg"));
        response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();
        String str = "";
        for (Student student : students) {
            str += student.getId() + ", " + student.getName() + ", " + "<img src= '" + student.getImage() + "'>";
        }
        printWriter.write(str);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}

