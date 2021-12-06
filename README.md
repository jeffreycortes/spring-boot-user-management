# spring-boot-user-management
Esta solución consta de un microservicio que sirve un APIREST para la administración de usuarios, inicialmente con el caso de uso **crear usuario**.

El proyecto se encuentra estructurado con arquitectura hexagonal y DDD, teniendo como capas las siguientes:
1. Infrastructure: Alverga los controladores y el manejador de excepciones global del API.
2. Aplication: Contiene los servicios que encapsulan los casos de uso y los DTOS tanto de entrada como de salida.
3. Domain: Es la capa principal de la solución y es en dónde están:
   1. Entidades
   2. Value objects
   3. Validadores
   4. servicios de dominio
   5. Convertidores de atributos
   6. Contratos de repositorios
   7. Excepciones de dominio
   8. Dto de excepcion de respuesta
## Recursos extras
   El proyecto contiene 2 carpetas extras: 
   1. *postman_collection*: Contiene una colección de postman con los endpoints del API de users y ejemplos del body para el caso de uso de *Crear Usuario*
   3. *diagrama_solucion*: Contiene el diagrama de flujo de la petición, la relación de las capas y el manejo de excepciones.
## Pre-Requisitos de software
* Java SDK 1.8 o Java 1.8
* Maven

## Pasos para la ejecución del microservicio
1. Ejecute el archivo **start_microservice.bat** el cual ejecutará los comandos de maven para instalar las dependencias de la solución e inicializar el microservicio.
2. Abra un explorador web o postman y navegue a la url **http://localhost:8081/** la cual retornará el mensaje *"Hola, microservicio de UserManagement funcionando ;)"*
3. Navegue a la url **http://localhost:8081/users**, la cual retornará el mensaje *"UserController ready ;)"*
4. Para crear un usuario. Use el método POST co la Url *http://localhost:8081/users* y envie en el bod la siguiente estructura json
````json
{
    "name": "nombre usuario (Ej: Jeff Buckley)",
    "email": "correo electronico (Ej: lop@po.co)",
    "password": "contraseña (Ej: Blki&eff0",
    "phones": [
        {
            "number": número teléfono (Ej: 7218979),
            "citycode": código ciudad (Ej: 1),
            "countrycode": código país (Ej: 57)
        }
    ]
}
````
5. Como resultado de la petición anterior, deberá obtener el siguiente resultado:
````json
{
    "id": "1a8d77f6-eb42-4343-accb-03073e52b9b5",
    "token": "eyJhbGciOiJIUzUxMiJ9.eyJqdGkiOiJiZWRiMjIzMjNkM2Y0ZTVkYWExZThhNTI5N2ZmODZkNCIsImlhdCI6MTYzODc2NjkxNCwibmJmIjoxNjM4NzY2OTE0LCJleHAiOjE2Mzg3NjY5NzQsInN1YiI6IkplZmZyZXkgQ29ydGVzIiwiYXV0aG9yaXRpZXMiOlsiUk9MRV9VU0VSIl19.dPG7bnxm74eWxdL3tNj95G4C1vqwEWDyXZMjxq66_-4irgshr_NXr1TnaiBaLoEcpIcXRDMKEb3Wn8VTY2b8AQ",
    "created": "2021-12-06T05:01:55.154Z",
    "modified": "2021-12-06T05:01:55.211Z",
    "last_login": "2021-12-06T05:01:55.154Z",
    "isactive": true
}
````
