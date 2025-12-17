#language: es

@regression
Característica: Crear cuenta

  @TEST-4
  Escenario: Crear cuenta
    Dado que el usuario ingresa a la home
    Y el usuario ingresa a registrar una cuenta
    Cuando el usuario crea la cuenta
    Entonces se verifica que la cuenta se creo correctamente


  @TEST-5
  Escenario: Crear cuenta incorrecto
    Dado que el usuario ingresa a la home
    Y el usuario ingresa a registrar una cuenta
    Cuando el usuario crea la cuenta con datos vacios
    Entonces se muestra mensaje de error de crear cuenta