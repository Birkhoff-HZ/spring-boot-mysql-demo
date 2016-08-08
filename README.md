# spring-boot-mysql-demo
Demo for web application using Spring boot and Spring data JPA with Mysql

## Steps before running this demo application:

1. Use the `create_test.sql` in the sql folder to create the test database and insert some dummy data.
2. Run `App` class to start `embedded server`, you may visit `http://localhost:5000` to check whether the server starts properly. If starts properly, it will display the dummy data in the database.

## Project structure

This demo application uses `thymeleaf` as `template engine`.

In the `resources` folder, `templates` stores the view templates of the application.
The `static` stores the static resources such as css and javascript files of the application.

This demo application also manipulate `spring-test` to test the `dao` and `service` layer.
You may find the corresponding code under `test` folder. 
