# springboot-component-scan
Overview of basic features of `@ComponentScan`

# project description
By default in spring boot applications scanned in search of beans
is a main package (package where the `@SpringBootApplication` is defined).

Sometimes we want to scan packages outside the main package. 

In this project:
* **main package**: 

we have two options:
* not type safe
    ```
    @ComponentScan(basePackages = {"com.example.springbootcomponentscan", "outsiders1"})
    ```
* type safe