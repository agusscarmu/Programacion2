Programación 2 - Olavarría
Tecnicatura Universitaria en Desarrollo de Aplicaciones Informáticas Parcial 04/06/2022
Defina las clases para implementar una solución orientada a objetos para el siguiente problema e implemente en Java.
Una juguetería se especializa en la venta de juegos de ladrillos (LEGO, RASTI, Mis ladrillos, etc) y requiere de un sistema que le permita administrar piezas, combos y paquetes de ladrillos. De cada pieza se guarda la marca, peso, costo, color y cantidad de encastres. Por ejemplo:
Ladrillo Lego 9 gramos, $10, rojo, 6 encastres
Ladrillo Rasti, 3 gramos, $2, azul, 2 encastres

Un combo agrupa piezas o conjuntos de piezas (pueden ser piezas, Combos o Paquetes). Cada Combo/Paquete guarda su marca; el peso del mismo es la suma de los pesos de sus elementos; y el color se determina como el color del último de sus elementos. La cantidad de encastres es el promedio de todos los encastres de sus elementos. En el combo, el costo es la suma de los costos menos un 10% de descuento, mientras que en los paquetes el costo es la suma de los costos menos un 15% de descuento.

La juguetería mantiene un listado de todos los productos que comercializa (tanto piezas como Combo o Paquetes). Para facilitar la búsqueda de los productos, necesita brindar listados en los cuales se incluyan todas las piezas, combos o paquetes que cumplen con una determinada condición. A continuación, se listan algunos ejemplos de listados:
● Listar todos los elementos de color rojo
● Listar todos los elementos de color rojo y de peso menor a 4 gramos.
● Listar todos los elementos de color rojo o azul y con menos de 100 encastres.
● Se pueden agregar nuevos tipos de búsquedas así como también combinaciones lógicas de las mismas.
NOTA: Los listados se retornan ordenados por marca, en el caso de ser de la misma marca por costo, luego por cantidad de encastres y por último por color.
La juguetería desea incorporar combos temáticos por ejemplo:
● Combo Star Wars: solo permite que se le incorporen elementos de color negro, blanco o gris.
● Paquete Liviano: solo permite que el peso de los elementos que se le incorporen no supere los 3 gramos.
● Combo Lego: solo permite que los elementos que se le incorporen sean de la marca Lego.
Los anteriores son algunos ejemplos de combos especiales que desea agregar la jugetería pero a futuro puede ser que se combinen estos combos o incluso se cambien la forma de aceptación, por ejemplo un Combo Star Wars de Lego que solo acepta de color negro, blanco o gris y que sean de la marca LEGO. NOTA: en caso de cambiar el criterio por el que se forma un Combo, los elementos existentes no se revisan, y solo aplica para nuevos elementos que se agreguen al mismo.
Tener en cuenta todos los mecanismos de la Programación Orientada a Objetos que se fueron viendo a lo largo de la materia