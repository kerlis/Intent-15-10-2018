package com.kotlin.order.coffee.intent
import java.io.Serializable

public class dato:Serializable {
    var nombre: String?=null
    var apellidos: String?=null

    constructor(nombre: String, apellidos: String){
        this.nombre = nombre
        this.apellidos = apellidos
    }

}
