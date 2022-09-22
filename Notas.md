# Notas

## Git

para crear el archivo .gitignore

> touch .gitignore

The touch command is mainly used for creating an empty file or to modify/change the timestamp of a file.

## STIN - STOUT

Standar-input and Standar-output.

## Scanner

Create the scanner with a name.

> Scanner inputByUser = new Scanner(System.in);

Use inside a variable to STIN

> String name = inputByUser.nextline();

See the STOUT

> System.out.println(name);

## Crear un archivo

Para crear puede sser así o directamente con el FileWriter.

> File file1 = new File("ruta.txt")

## Escribir en los archivos

Puede funcionar con un solo parametro o con el parametro append(boolen) que significa añadir;

> FileWriter writerFile = new FileWriter(demo.txt);

Escribir dentro de un archivo creado

> writerFile.write("Se puede añadir String u otro datos")

Para hacer saltos de linea es --- \n ---

Este es un buffer de datos que una vez creado ha que cerrarlo

> Writer.close();

Para leerlo
Lo qeu va entre parentesis es la ruta del archivo

> File file = new File("demo.txt)
> Scanner filerreader = new Scanner(file);

## Interfaces

En las interfaces solo escribiremos la huella de los metodos
ejemplo:

```
void play();
void subirVolumen(int volumen);
void bajarVolumen(int volumen);
void pause();
```

Collection

-   Set
-

## Abastrac Class

puede contener variables, constructor, getters, setter y metodos.
Los metodos pueden ser similares a lo de la intereface que solo contienen metodos
pero el metodo tiene que ser absract y se puede hacer toda la lógica en los hijos.

> abstract void nombreMetodo(Parametro param);

El metodo hijo debería extends del padre y este ya puede llamar al metodo del padre para implementar la lógica.

En el main no se podra llamar nunca a la clase abstracta solo a las clases hijas que vienen, heredan o implementan de ella.
