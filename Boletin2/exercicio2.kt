fun main(){
    print("Altura: ")
    var x=readLine()!!.toFloat()
    print("Peso: ")
    var y=readLine()!!.toFloat()
    var imc = y/(x*x)
    var resul= "OLA" //teño que poñer algo aqui que sea un string para que funciobne
    if (imc<18.5){
        resul = "Delgado"}
    if (imc>=18.5 && imc<=24.9){
        resul="Normal"}
    if (imc>24.9 && imc<=29.9){
        resul= "Sobrepeso"}
    if(imc>29.9){
        resul = "Obeso"}
print("O seu IMC e $imc polo tanto o seu estado e ")
println(resul)

}
