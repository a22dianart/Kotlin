fun main() {
val a= readln()!!.toInt()
val b=readln()!!.toInt()
val c=readln()!!.toInt()
var menor:Int
if(a==b && b==c){
println("los tres iguales")
}else{
menor=a
if (b < menor) {
menor = b
}
if (c < menor) {
menor = c
}
println("El menor: $menor")
}
}
