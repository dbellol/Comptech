package com.unal.firebase.management.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Almacenamiento {

    public  String documentId;
    public  int id;
    public  int capacidad;
    public  String marca;
    public  String nombre;
    public  int precio;
    public  String tipo;
    public  int velEscritura;
    public  int velLectura;

    
}
