# ArquiSoftware
### Integrantes
  Valentina Rodríguez
  Santiago Carrillo
  Felipe Ballesteros


### Posibles problemas encontrados
- La interfaz EmployeeOperations es aparentemente innecesaria, pues la clase EmployeeManager tiene exactamente el mismo código. Viola el principio de Single Responsibility.
- En la clase EmployeePartTime, el método getName() genera una excepción.
- La clase ReportGenerator viola el principio Open/Closed. Crear interfaz Reporte.
- En la clase EmployeeManager, los métodos generateReport y calculateSalary podrían estar violando el principio de Single Responsibility.
- Los atributos de la clase Employee podrían incluir el salario. Revisar getters y setters.
- De ser necesario, podría usarse una interfaz Employee y dos clases EmployeeFullTime y EmployeePartTime para que la clase EmployeeManager vaya acorde al principio de Liskov.
- La clase SalaryCalculator no debería instanciar un objeto EmployeeManager dentro del método calculateSalary().
