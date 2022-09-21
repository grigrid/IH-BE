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

## Crear Archivos

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
