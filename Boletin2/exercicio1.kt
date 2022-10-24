fun main(){
    print("teclea un enteiro: ")
    var x=readLine()!!.toInt()
    var y=x%2
    if (y==0){
        print("O numero $x e par")
    } else{
        print("O numero $x e impar")
    }
}
