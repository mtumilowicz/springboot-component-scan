# springboot-component-scan
Overview of basic features of `@ComponentScan`

# preface
By default in spring boot applications the main package 
(package where the `@SpringBootApplication` is defined)
is scanned in search of beans.

Sometimes we want to scan packages outside the main package. 
# project description
In this project:
* **main package**: `com.example.springbootcomponentscan`
    * **inner package**: `com.example.springbootcomponentscan.insiders1`
        * `@Component`: `Insider` class
* **outside main package**: `outsiders1`
    * `@Component`: `Outsider` class
    
we have two options:

* not type safe
    ```
    @ComponentScan(basePackages = {"com.example.springbootcomponentscan", 
            "outsiders1"})
    ```
    documentation:
    > Base packages to scan for annotated components.
    ```
    @AliasFor("value")
    String[] basePackages() default {};
    ```
* type safe
    ```
    @ComponentScan(basePackageClasses = {ScanOutsiders1.class,
            SpringbootComponentScanApplication.class})
    ```
    where `ScanOutsiders1.class` is a special no-op marker class recommended 
    in documentation:

    > Type-safe alternative to basePackages for specifying the packages
    to scan for annotated components. The package of each class specified will be scanned.
    Consider creating a special no-op marker class or interface in each package
    that serves no purpose other than being referenced by this attribute.
    ```	
    Class<?>[] basePackageClasses() default {};   
    ``` 