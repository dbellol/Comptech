package com.unal.firebase.management.controller;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.cloud.FirestoreClient;
import com.unal.firebase.management.models.Almacenamiento;
import com.unal.firebase.management.models.Board;
import com.unal.firebase.management.models.Grafica;
import com.unal.firebase.management.models.Procesador;
import com.unal.firebase.management.models.Ram;

import java.util.concurrent.ExecutionException;
import org.springframework.stereotype.Service;

@Service
public class GetService {

  public Almacenamiento getCRUDAlmacenamiento(String documentId)
    throws InterruptedException, ExecutionException {
    Firestore dbFireStore = FirestoreClient.getFirestore();
    DocumentReference documentReference = dbFireStore
      .collection("almacenamiento")
      .document(documentId);
    ApiFuture<DocumentSnapshot> future = documentReference.get();
    DocumentSnapshot document = future.get();

    Almacenamiento almacenamiento;

    if (document.exists()) {
        
      almacenamiento = document.toObject(Almacenamiento.class);
      return almacenamiento;
    }

    return null;
  }


  public Board getCRUDBoard(String documentId)
    throws InterruptedException, ExecutionException {
    Firestore dbFireStore = FirestoreClient.getFirestore();
    DocumentReference documentReference = dbFireStore
      .collection("board")
      .document(documentId);
    ApiFuture<DocumentSnapshot> future = documentReference.get();
    DocumentSnapshot document = future.get();

    Board board;

    if (document.exists()) {
        
      board = document.toObject(Board.class);
      return board;
    }

    return null;
  }

  public Grafica getCRUDGrafica(String documentId)
  throws InterruptedException, ExecutionException {
  Firestore dbFireStore = FirestoreClient.getFirestore();
  DocumentReference documentReference = dbFireStore
    .collection("grafica")
    .document(documentId);
  ApiFuture<DocumentSnapshot> future = documentReference.get();
  DocumentSnapshot document = future.get();

  Grafica grafica;

  if (document.exists()) {
      
    grafica = document.toObject(Grafica.class);
    return grafica;
  }

  return null;
}

public Procesador getCRUDProcesador(String documentId)
throws InterruptedException, ExecutionException {
Firestore dbFireStore = FirestoreClient.getFirestore();
DocumentReference documentReference = dbFireStore
  .collection("procesador")
  .document(documentId);
ApiFuture<DocumentSnapshot> future = documentReference.get();
DocumentSnapshot document = future.get();

Procesador procesador;

if (document.exists()) {
    
  procesador = document.toObject(Procesador.class);
  return procesador;
}

return null;
}

public Ram getCRUDRam(String documentId)
throws InterruptedException, ExecutionException {
Firestore dbFireStore = FirestoreClient.getFirestore();
DocumentReference documentReference = dbFireStore
  .collection("ram")
  .document(documentId);
ApiFuture<DocumentSnapshot> future = documentReference.get();
DocumentSnapshot document = future.get();

Ram ram;

if (document.exists()) {
    
  ram = document.toObject(Ram.class);
  return ram;
}

return null;
}

}
