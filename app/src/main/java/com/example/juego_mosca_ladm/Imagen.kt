package com.example.juego_mosca_ladm

import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Paint

class Imagen(punteroLienzo: Lienzo, posX:Float, posY:Float, nombreImagen: Int) {
    var x = posX
    var y = posY
    var imagen = BitmapFactory.decodeResource(punteroLienzo.resources, nombreImagen)
    var imagen2 = BitmapFactory.decodeResource(punteroLienzo.resources, nombreImagen)

    fun pintar(c: Canvas){
        c.drawBitmap(imagen,x,y, Paint())
    }
    fun cambiarlugar (toqueX: Float,toqueY: Float){
        x=toqueX
        y=toqueY
    }
    fun cambiarImagen(punteroLienzo:Lienzo,nombreImagen: Int){
        imagen = BitmapFactory.decodeResource(punteroLienzo.resources, nombreImagen)
    }
    fun estaEnArea(toqueX:Float,toqueY:Float):Boolean{
        var x2 = x + imagen.width
        var y2 = y + imagen.height

        if(toqueX >= x && toqueX <= x2){
            if(toqueY >= y && toqueY <= y2){
                return true
            }
        }
        return false
    }

    fun mover(toqueX: Float, toqueY: Float){
        x = toqueX+imagen.width/9
        y = toqueY+imagen.height/9
    }
    /*fun comprobarColision(toqueX: Float,toqueY: Float):Boolean{
        var x2 = x + imagen.width
        var y2 = y + imagen.height
        if(x+imagen.width > x2){
            return true
        }
        return false
    }*/
}