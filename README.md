# Actividad semana 3:

Este es el desarrollo de la tarea 3 que hice en donde se despliequ un microservicio para realizar el registro del usuario y la consulta de este en la base de
datos, uno para realizar el login, uno para los barrios y otra para las rutas, paradas y viajes.

## Microservicio de registro de usuario

Se diseño el microservico de talfora que el usuaro debe ingresar los datos de y apuntar alpuerto de despliegue del croservcio, quien a travez de unclente feng se councara con cognito para obtener el username y guardar toda la informacion en la base de datos.
Los datos se envian en el siguiete json:

```json
{
  "name": "Manuel",
  "email": "manuel.perez@gmail.com",
  "familyName": "Perez",
  "address": "Calle falsa #1234",
  "phoneNumber": "+573007698329",
  "password": "HolaMundo1234*"
}
```

![Image text](images\postman.jpg)
