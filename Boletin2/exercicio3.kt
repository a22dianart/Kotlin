fun main(){
    print("") //para que funcione
    var num1: Int = readLine()!!.toInt()
    print("") //para que funcione
    var num2:Int = readLine()!!.toInt()
    var x= num1%num2
    if (x==0){
        print("$num1 e multiplo de $num2")
    }
    else{

        print("$num1 non e multiplo de $num2")
    }
}
