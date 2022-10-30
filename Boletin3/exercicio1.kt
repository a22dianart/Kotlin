fun main(){
    var x = arrayOf(0,1,2,3,4,5,6,7,8,9,10)
    print("Con for: ")
    for (item in x){
        print("$item  " )
    }
    var i = 0
    println("")
    print("Con while: ")
    while(i<=10){
        print("$i ")
        i=i+1
    }
    var j = 0
    println("")
    print("Con do while: ")
    do{
        print("$j ")
        j = j+ 1
    } while(j<=10)


}
