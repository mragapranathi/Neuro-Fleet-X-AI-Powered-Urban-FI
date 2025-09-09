-- Create Courses table
CREATE TABLE courses (
    id INT AUTO_INCREMENT PRIMARY KEY,
    student_id INT,
    course_name VARCHAR(50),
    FOREIGN KEY (student_id) REFERENCES students(id)
);

-- Insert course data
INSERT INTO courses (student_id, course_name) VALUES
(1, 'Mathematics'),
(1, 'Science'),
(2, 'History');

-- Inner Join: Students + Courses
SELECT s.name, c.course_name
FROM students s
JOIN courses c ON s.id = c.student_id;
