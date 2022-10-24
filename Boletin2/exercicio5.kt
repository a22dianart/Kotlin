fun main() {
print("Comida diaria: ")
var comidaDiaria = readln()!!.toDouble()
print("Numero animales: ")
var numAnimales = readln()!!.toInt()
print("Kilos por animal: ")
var kilosPorAnimal = readln()!!.toDouble()
var comida = numAnimales * kilosPorAnimal;
if(comidaDiaria >= comida)
println("Excedente = "+ (comidaDiaria-comida)+" Kg");
else
println("Racion = "+ (comidaDiaria/numAnimales)+" Kg");
}
