# ArquiSoftware
### Integrantes
- Valentina Rodríguez
- Santiago Carrillo
- Felipe Ballesteros


### Posibles problemas encontrados
1. La interfaz EmployeeOperations es aparentemente innecesaria, pues la clase EmployeeManager tiene exactamente el mismo código. Viola el principio de Single Responsibility.
2. En la clase EmployeePartTime, el método getName() genera una excepción.
3. La clase ReportGenerator viola el principio Open/Closed. Crear interfaz Reporte.
4. En la clase EmployeeManager, los métodos generateReport y calculateSalary podrían estar violando el principio de Single Responsibility.
5. Los atributos de la clase Employee podrían incluir el salario. Revisar getters y setters.
6. De ser necesario, podría usarse una interfaz Employee y dos clases EmployeeFullTime y EmployeePartTime para que la clase EmployeeManager vaya acorde al principio de Liskov.
7. La clase SalaryCalculator no debería instanciar un objeto EmployeeManager dentro del método calculateSalary().

### Descripción de las soluciones
1. .
2. .
3. .
4. .
5. .
6. .
7. .
