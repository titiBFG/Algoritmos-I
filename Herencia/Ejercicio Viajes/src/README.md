### TIPOS DE POLIMORFISMO
##### Polimorfismos encontrados en el código:
Existe un polimorfismo de subtipo con la clase abstracta "TipoDeViaje" y las clases concretas "TipoAltaVelocidad", "TipoDiesel" y "TipoElectrico" con su método abstracto de "CalcularDemora", el cúal es sobrescrito por cada clase concreta y utilizado como referencia en la clase "Viaje".
De esta manera "CalcularDemora" se comporta de manera distinta según la clase real del objeto al que apunta la referencia (tipo).
