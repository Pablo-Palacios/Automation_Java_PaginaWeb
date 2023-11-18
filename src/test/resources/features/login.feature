
# language: es
Característica: Login

  Escenario: ingresar al login

    Dado que el usuario ingresa a la pagina opencart
    Cuando acciona la opcion my account-login
    Entonces ingresa a la pagina login



    Escenario: usuario ingresa datos correctos

      Dado  que el usuario ingresa a la pagina opencart
      Y que se encuentra en la pagina login
      Cuando escribe su email y password
      Y acciona la opcion Login
      Entonces ingresa a la pagina myAccount



   Escenario: usuario ingresa emial incorrecto o no existente
     Dado  que el usuario ingresa a la pagina opencart
     Y que se encuentra en la pagina login
     Cuando escribe email incorrecto o no existente
     Y acciona la opcion Login
     Entonces se muestra la alerta


   Escenario: usuario ingresa password incorrecto
     Dado  que el usuario ingresa a la pagina opencart
     Y que se encuentra en la pagina login
     Cuando escribe password incorrecto
     Y acciona la opcion Login
     Entonces se muestra la alerta


  Escenario: usuario acciona la opcion login sin cargar datos
    Dado  que el usuario ingresa a la pagina opencart
    Y que se encuentra en la pagina login
    Cuando acciona la opcion Login
    Entonces se muestra la alerta


