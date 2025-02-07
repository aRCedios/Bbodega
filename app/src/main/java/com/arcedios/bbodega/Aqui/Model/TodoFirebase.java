package com.arcedios.bbodega.Aqui.Model;
import android.util.Log;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Stack;
import java.util.TreeMap;

import com.arcedios.bbodega.Aqui.ModelView.productos;
import com.google.firebase.database.ValueEventListener;

public class TodoFirebase {
    private boolean isCompleted;

    public TodoFirebase() {
    }

    public boolean isCompleted() {
        return isCompleted;
    }


    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public static boolean addUser(productos prod) {
        TodoFirebase firebase = new TodoFirebase();
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference();
        TreeMap<String, Object> map = new TreeMap<>();
        map.put("nombre", prod.getNombre());
        map.put("cantidad", prod.getCantidad());
        myRef.child("Productos").child(prod.getCodigo()).setValue(map).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                firebase.setCompleted(task.isSuccessful());
            }


        });
        return firebase.isCompleted;
    }

    public static boolean removeItem(String codigo) {
        TodoFirebase firebase = new TodoFirebase();
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference();
        myRef.child("Productos").child(codigo).setValue(null).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                firebase.setCompleted(task.isSuccessful());
            }
        });
        return firebase.isCompleted;
    }
    public static boolean updateItem(String codigo,String nombre,int cantidad) {
        TodoFirebase firebase = new TodoFirebase();
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference();
        TreeMap<String, Object> map = new TreeMap<>();
        map.put("nombre", nombre);
        map.put("cantidad", cantidad);
        myRef.child("Productos").child(codigo).setValue(map).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                firebase.setCompleted(task.isSuccessful());
            }


        });
        return firebase.isCompleted;


    }
    public static boolean remove(){
        TodoFirebase firebase = new TodoFirebase();
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference();
        myRef.child("Productos").setValue(null).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                firebase.setCompleted(task.isSuccessful());
            }
        });
        return firebase.isCompleted;
    }



}






