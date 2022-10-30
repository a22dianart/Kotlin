fun main() {
    var lista =mutableListOf(1)
    var x=1
    var z=1
    while (x<1024) {
        x = x * 2
        z = z + 1
        lista.add(x)
    }
    print(lista)


}
