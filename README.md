# Arquitectura de Software: Trabajo SOLID
### Integrantes
- Valentina Rodríguez
- Santiago Carrillo
- Felipe Ballesteros

### Principios SOLID que fueron violados
- **Single Responsibility:** En la clase EmployeeManager se viola el Principio de responsabilidad única porque, esta se supone que una clase que se encarga de manejar a los empleados, pero aparece un método que se encarga de guardar a los empleados...y ahí es donde se encuentra el error: que deberia haber una clase que se encarge de manejar a los empleados y otra clase que se encargue de guardar alarchivo.  

- **Open/Closed:** La clase ReportGenerator contiene dos métodos, uno para la generación de un archivo de Excel y otro
para un archivo PDF, esto no permitiría que eventualmente se agregara un tercer tipo de archivo, por lo que la clase
está cerrada a extensión y abierta a modificación, yendo completamente en contra de este principio.

- **Liskov Substitution Principle:** La clase PartTimeEmployee genera una excepción cuando se llama al método getName(),
esto significa que, tal y como se esperaría cuando se cumple este principio, esta clase no podría ser intercambiada con
la clase que extiende (Employee) sin que se generara un error.

- **Interface Segregation:** La interface EmployeeOperations viola este principio ya que es una interface muy general, mientras que este principio nos dice que es mucho mejor tener interfaces más pequeñas pero más especificas. Entonces en este caso lo que hariamos seria hacer una interface para los empleados, una interface para el salario y una interface para guardar el archivo.

- **Dependency Inversion:** La clase de SalaryCalculator viola el principio de inversión de dependencias ya que en el codigo esta depende directamente de EmployeeManager en lugar de una abstracción.

### Diagrama
[Diagrama en LucidChart](https://lucid.app/lucidchart/15ced8b9-7eb4-4477-96e0-916c038699b8/edit?viewport_loc=-1466%2C-333%2C3940%2C2000%2CHWEp-vi-RSFO&invitationId=inv_2a28a5d9-fb67-48b2-a02d-6c95ae150419)
