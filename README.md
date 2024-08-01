# ArquiSoftware
### Integrantes
- Valentina Rodríguez
- Santiago Carrillo
- Felipe Ballesteros


### Posibles problemas encontrados
1. La interfaz EmployeeOperations es aparentemente innecesaria, pues la clase EmployeeManager tiene exactamente el mismo
código. Viola el principio de Single Responsibility.
2. En la clase EmployeePartTime, el método getName() genera una excepción.
3. La clase ReportGenerator viola el principio Open/Closed. Crear interfaz Reporte.
4. En la clase EmployeeManager, los métodos generateReport() y calculateSalary() podrían estar violando el principio de
Single Responsibility.
5. Los atributos de la clase Employee podrían incluir el salario. ~~Revisar getters y setters.~~
6. La clase SalaryCalculator no debería instanciar un objeto EmployeeManager dentro del método calculateSalary().
7. De acuerdo con los métodos en EmployeeManager, podría ser innecesaria la diferenciación entre Employee y PartTimeEmployee.

### Principios SOLID violados
- **Single Responsibility:** Al existir una interfaz EmployeeOperations y una única clase EmployeeManager que lo 
implementa, resulta en un code-smell de código duplicado, y las dos clases compartiendo una sola responsabilidad.
- **Open/Closed:** La clase ReportGenerator contiene dos métodos, uno para la generación de un archivo de Excel y otro
para un archivo PDF, esto no permitiría que eventualmente se agregara un tercer tipo de archivo, por lo que la clase
está cerrada a extensión y abierta a modificación, yendo completamente en contra de este principio.
- **Dependency Inversion:** La clase SalaryCalculator depende de una clase (EmployeeManager) que implementa una interfaz
(EmployeeOperations), además en el método calculateSalary() se crea una instancia del objeto EmployeeManager, que no es
idóneo, pues en cambio podría utilizarse el patrón de inyección de dependencias.

### Descripción de las soluciones
1. .
2. .
3. .
4. .
5. .
6. .
7. .

### Diagrama
https://lucid.app/lucidchart/15ced8b9-7eb4-4477-96e0-916c038699b8/edit?viewport_loc=-1466%2C-333%2C3940%2C2000%2CHWEp-vi-RSFO&invitationId=inv_2a28a5d9-fb67-48b2-a02d-6c95ae150419
