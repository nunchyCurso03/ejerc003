Ejercicio individual Bolígrafo Nunchy   ejerc003
    Desarrollar un API REST para la clase BOLIGRAFO, con las propiedades: COLOR, SIESCRIBE y NOMBRE
    Realizar operaciones CRUD.

    **********Crear un Bolígrafo (POST)************
    curl -X POST http://localhost:8080/api/boligrafo \
     -H "Content-Type: application/json" \
     -d '{"color": "AZUL", "siEscribe": false, "nombre": "Pilot"}'

curl -X POST http://localhost:8080/api/boligrafo \
     -H "Content-Type: application/json" \
     -d '{"color": "ROSA", "siEscribe": true, "nombre": "Staedtler"}'

curl -X POST http://localhost:8080/api/boligrafo \
     -H "Content-Type: application/json" \
     -d '{"color": "VERDE", "siEscribe": true, "nombre": "Faber Castell"}'


     **********Listar Todos los Bolígrafos (GET)************
     curl -X GET http://localhost:8080/api/boligrafo



     *********Obtener un Bolígrafo por ID (GET)************
     curl -X GET http://localhost:8080/api/boligrafo/1


     *********Actualizar un Bolígrafo (PUT)************
     curl -X PUT http://localhost:8080/api/boligrafo \
     -H "Content-Type: application/json" \
     -d '{"id": 1, "color": "ROJO", "siEscribe": false, "nombre": "BIC"}'

     *********Eliminar un Bolígrafo (DELETE)************
     curl -X DELETE http://localhost:8080/api/boligrafo/1





***************************************************************************

**************************Crear un Ordenador (POST)
 
curl -X POST http://localhost:8080/api/ordenador \
    -H "Content-Type: application/json" \
    -d '{"color": "AZUL", "siIntel": true, "teclas": 104, "peso": 1.5}'
 
curl -X POST http://localhost:8080/api/ordenador \
    -H "Content-Type: application/json" \
    -d '{"color": "ROJO", "siIntel": false, "teclas": 108, "peso": 1.8}'
 
curl -X POST http://localhost:8080/api/ordenador \
    -H "Content-Type: application/json" \
    -d '{"color": "NEGRO", "siIntel": true, "teclas": 107, "peso": 2.0}'




***********************Listar Todos los Ordenadores (GET)
 
curl -X GET http://localhost:8080/api/ordenador
Obtener un Ordenador por ID (GET)
 
curl -X GET http://localhost:8080/api/ordenador/1


*******************Actualizar un Ordenador (PUT)
 
curl -X PUT http://localhost:8080/api/ordenador \
    -H "Content-Type: application/json" \
    -d '{"id": 1, "color": "BLANCO", "siIntel": false, "teclas": 110, "peso": 2.2}'



**********************Eliminar un Ordenador (DELETE)
 
curl -X DELETE http://localhost:8080/api/ordenador/1



