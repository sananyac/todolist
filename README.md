# todolist
To do list RESTful API for manage a list of tasks using Java, Spring Boot and PostgreSQL.

# Method
  Add a task: POST : http://localhost:8080/api/v1/todos
                parameters: { id, subject, content, status}<br>
  Get a task: GET  : http://localhost:8080/api/v1/todos/{id}<br>
  Get all tasks: GET : http://localhost:8080/api/v1/todos<br>
  Edit a task: PUT : http://localhost:8080/api/v1/todos/{id}
                 parameters: { id, subject, content, status}<br>
  Delete a task: DELETE : http://localhost:8080/api/v1/todos/{id}
  
  **Return with Json**
