#language: es


  Característica: Cart
    @regression
    @TEST-7
  Escenario: Agregar un producto al carrito
  Dado que el usuario ingresa a la home
  Y el usuario ingresa al login
  Cuando agrega producto al carrito
  Entonces producto se encuentra en el carrito
