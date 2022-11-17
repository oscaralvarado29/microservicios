# Actividad semana 3:

Este es el desarrollo de la tarea 3 que hice en donde se despliequ un microservicio para realizar el registro del usuario y la consulta de este en la base de
datos, uno para realizar el login, uno para los barrios y otra para las rutas, paradas y viajes.

## Microservicio de registro de usuario

Se diseño el microservico de tal forma que el usuario debe ingresar los datos y apuntar al puerto de despliegue del microservcio, quien a travez de un cliente feing se comunicará con cognito para obtener el username y guardar toda la informacion en la base de datos.
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

![Postman signup](https://github.com/oscaralvarado29/microservicios/blob/main/images/postman.jpg)

![Workbench signup]()

## Microservicio de login

Se diseño el microservico de tal forma que el usuario debe ingresar el email y la contraseña y apuntar al puerto de despliegue del microservcio, quien a travez de un cliente feing se comunicará con el microservicio de registro para obtener el username, validará si la informacion suminstrada es correcta y se comunicará con cognito para obtener el token de autenticacion y envarlo al usuario.
Los datos se envian en el siguiete json:

```json
{
  "email": "manuel.perez@gmail.com",
  "password": "HolaMundo1234*"
}
```

![Postman login]()

## Microservicio de barrios

Se diseño el microservico de tal forma que el usuario debe ingresar los datos del barrio junto conel encabezado de autenticacion que contene el token y apuntar al puerto de despliegue del microservcion y este procesará la informacion de la base de datos de acuerdo a la petición.
Para realzar un post el json debe ser el siguiente:

```json
{
  "neighborhoodName": "Cali",
  "neighborhoodDescription": "La sucursal del cielo"
}
```

![Postman barrio]()

![Workbench barrio]()

Para consultar todos los barrios se crea un get de la siguiente manera:

![Postman barrio getAll]()

Para consultar un barrio en especifico se crea un get de la siguiente manera:

![Postman barrio get]()

Para actualizar un barrio se crea un put de la siguiente manera:

![Postman barrio put]()

![Workbench barrio put]()

Para eliminar un barrio se crea un delete de la siguiente manera:

![Postman barrio delete]()

![Workbench barrio delete]()

## Microservicio de rutas

Se diseño el microservico de tal forma que el usuario debe ingresar los datos de la ruta referenciando alos barrios enlasparadasporel nombre y al conductor conel email junto conel encabezado de autenticacion que contene el token y apuntar al puerto de despliegue del microservicion y este procesará la informacion en la base de datos de acuerdo a cada tabla y cada peticion.
Para realzar un post el json debe ser el siguiente:

```json
{
  "routeName": "RSB1",
  "description": "Ruta desde Sogamos hasta Bogota",
  "origin": {
    "neighborhoodName": "Sogamoso",
    "meetingPoint": "Terminal de Sogamoso"
  },
  "destination": {
    "neighborhoodName": "Bogotá",
    "meetingPoint": "Terminal de Bogotá"
  },
  "stops": [
    {
      "neighborhoodName": "Duitama",
      "meetingPoint": "Terminal de Duitama",
      "position": 2
    },
    {
      "neighborhoodName": "Tunja",
      "meetingPoint": "Terminal de Tunja",
      "position": 3
    }
  ],
  "travelDates": [
    {
      "date": "17/10/2022",
      "hour": "7:00 am"
    },
    {
      "date": "18/10/2022",
      "hour": "7:00 am"
    }
  ],
  "quota": 3,
  "conductorEmail": "cristian.alvares@gmail.com"
}
```

![Postman ruta]()

![Workbench ruta]()

![Workbench parada]()

![Workbench viaje]()

Para consultar todas las rutas se crea un get de la siguiente manera:

![Postman ruta getAll]()

Para consultar una ruta en especifico se crea un get de la siguiente manera:

![Postman ruta get]()

Para eliminar una ruta se crea un delete de la siguiente manera:

![Postman ruta delete]()
