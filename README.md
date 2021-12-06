# spring-boot-user-management
Esta solución consta de un microservicio que sirve un APIREST para la administración de usuarios, incialmente con el caso de uso de **crear usuario**

##Pre-Requisitos de software
* Java SDK 1.8 o Java 1.8
* Maven

##Pasos para la ejecución del microservicio
1. Ejecute el archivo **start_microservice.bat** el cual ejecutará los comandos de maven para instalar las dependencias de la solución e inicializar el microservicio.
2. Abra un explorador web o postman y navegue a la url **http://localhost:8081/** la cual retornará el mensaje *"Hola, microservicio de UserManagement funcionando ;)"*
3. Navegue a la url **http://localhost:8081/users**, la cual retornará el mensaje *"UserController ready ;)"*
4. Para crear un usuario. Use el método POST co la Url *http://localhost:8081/users* y envie en el bod la siguiente estructura json
```json
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