fun main(){
    val nums =listOf(7,10,3,34,13)
    var min: Int = nums[0]
    var max :Int = nums[0]
    var parar = nums.size
    while (parar>0){
        if (nums[parar-1]>= max){
            max=nums[parar-1]
        }
        if (nums[parar-1]<=min){
            min=nums[parar-1]
        }
        parar =parar -1
    }
    println("O maximo e: $max")
    print("O minimo e: $min")

}
