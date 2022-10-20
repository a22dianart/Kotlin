fun main(){
    var seg = 500000.0
    var segint = seg.toInt()
    var x = seg/(60*60*24) // pasamos todo a días con decimais
    var xent = segint/(60*60*24) //pasamos todo a dias sin decimais (o valor en dias)
    var xtotal = x - xent //o que hai que pasar a horas, minutos e segundos
    var y = xtotal * 24 //pasamos a horas, dame en decimais
    var yint = y.toInt() //(o valor en horas)
    var ytotal= y - yint //o que hai que pasar a minutos
    var z = ytotal*60 // dme en decimais
    var zint= z.toInt() //o valor en minutos
    var ztotal= z - zint // o que hai que pasar a segundos
    var p = ztotal * 60
    var pint = p.toInt()
    print( "500000 segundos = $xent dias, $yint horas, $zint minutos, $pint segundos")
}
