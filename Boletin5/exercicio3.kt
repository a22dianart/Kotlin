fun main(){
    val notas =arrayOf(8.5,7.0,6.0,9.2)
    var size = notas.size
    var suma = 0.0
    while (size>0){
        suma= suma + notas[size-1]
        size=size-1
    }
    var novosize =notas.size
    print(suma/novosize)
}
