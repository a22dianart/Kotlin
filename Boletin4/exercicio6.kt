fun aMayorqueb(a:Double, b:Double) :Boolean{
    var x: Boolean = true
    if (a<=b){
        x=false
    }
    else{
        x=true
    }
    return x
}
fun main(){
    println(aMayorqueb(1.2,0.9))
    println(aMayorqueb(2.0,9.3))
}
