fun main(){
    var linea=readln()
    while(linea!="0") {
        val lista = linea.split(' ')
        var suma = 0
        for (numero in lista) {
            suma = suma + numero.toInt()
        }
        println(suma)
        linea = readln()
    }
}
