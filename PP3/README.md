## Práctica Programada 3  

**Nombre:** Mariangel Barrios Muñoz  
**Carné:** FI24036629  
**IDE:** Visual Studio Code  

---

## Páginas web donde halló posibles soluciones o *snippets* de código  

Seguí la estructura vista en clase y utilicé diagramas para visualizar los cambios.  

---

## Preguntas y respuestas  

### 1. Si tuviera que implementar una estructura tipo Cola (*Queue*), ¿qué tipo de lista (simple, circular, doblemente enlazada o circular doblemente enlazada) utilizaría y por qué? ¿Y para una estructura tipo Pila (*Stack*)?  

Pienso que, para una estructura tipo cola, la mejor opción podría ser una **lista circular o circular doblemente enlazada**, ya que según lo visto es más sencillo mantener el control al contar con dos punteros. En este caso se tendría *head*, *tail*, *prev* y *next*.  

Por otro lado, para una pila, podría ser más apropiada una **lista doblemente enlazada**. Al ser una pila, hacerla circular no tiene mucho sentido, pero al igual que en el caso anterior, aunque una lista doblemente enlazada agrega cierta complejidad, también facilita recorrerla y encontrar valores dentro de la pila.  

---

### 2. ¿Cuál cree que podría ser una ventaja y una desventaja de utilizar una estructura de tipo lista creada por usted mismo, en vez de las opciones provistas directamente por los módulos estándar de Java (como por ejemplo `List`)?  

Una ventaja podría ser que uno tiene control de los métodos exactos que requiere, puede aplicarlo a cualquier tipo de dato y, si fuera el caso, agregar más funciones que sean muy específicas a los métodos.

Por otro lado, una desventaja puede ser que, si no se tiene el cuidado y la atención adecuada, el código no funcione como se debe. Se puede perder tiempo buscando el error y generar frustración si no se está acostumbrado.
