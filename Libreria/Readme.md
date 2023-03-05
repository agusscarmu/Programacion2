La librería el Lapiz Saltarin decidió organizar la cartera de productos. De cada producto se guarda su nombre, su marca, precio, y su volumen (en centímetros cúbicos). Por ejemplo, el producto “Fibra 710”, marca Pelikan, $181, peso 60 gramos, volumen 95 cm3.
Para agilizar las ventas, el sitio posee Kits y Paquetes, los cuales pueden estar compuestos de diferentes productos e incluso sub Kits o sub paquetes. En el caso de un kit o paquete, el mismo posee un nombre, el volumen corresponde al mayor volumen de sus elementos, la marca del kit o paquete es la marca del primero de sus elementos, y el precio queda determinado por la suma de los precios de los elementos contenidos.
La librería posee diferentes políticas para determinar si un producto, kit o paquete se publicita en el diario. Además dicha política puede cambiar dinámicamente (por ejemplo, un día se usa una política y otro día se usa otra). Alguna políticas que deben considerarse son las siguientes:
● El producto/kit/paquete se publicita en el diario si el precio es mayor a 3800 pesos
● El producto/kit/paquete se publicita en el diario si el precio a 2500 y el volumen menor a
1000 cmt3
● El producto/kit/paquete se publicita en el diario si la marca es “Stadler”
● Los anteriores son solo algunos ejemplos de políticas, las mismas pueden combinarse
lógicamente o incluso agregarse nuevas Implementar los siguientes servicios:
1. Implementar todos los servicios para acceder al precio, volumen, marca, nombre de un producto, kit o paquete
2. Obtener la cantidad de productos de un kit/paquete
3. Implementar un servicio para que, dado un producto/kit/paquete, determine si se puede
publicitar en el diario
4. Buscar en la librería los productos/kits/paquetes que cumplan con ciertas características:
● Todos los de la marca Stanley
● Todos los de precio entre 100 y 2500
● Todos los de precio mayor a 4250
● Cualquier combinación lógica de los anteriores.
NOTA: Si un producto cumple con lo solicitado, se incluye él mismo en la lista, en el caso de los kits/paquetes si ellos cumplen se agregan al resultado y además también se incluyen todos los elementos contenidos que cumplan con lo buscado.