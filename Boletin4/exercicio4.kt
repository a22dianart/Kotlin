fun sumarr(x:Int,y:Int):Int{     //non lle podo chamar sumar() porque no exercicio3 xa teño unha funcion con ese nome
    var suma: Int = x+y
    return suma
}
fun main(){
    var primeirasuma =sumarr(2,3)
    println("La primera suma es: $primeirasuma")
    println("y la segunda es ${sumarr(4,5)}")
    println("otra suma que vale: "+ sumarr(9,8))
}

