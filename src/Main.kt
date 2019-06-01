fun main(){
    print(predictAge(65, 60, 75, 55, 60, 63, 64, 45))
}

fun predictAge(vararg ages: Int): Int{
    var i = 0
        ages.forEach {
        i+= it*it
    }
    return Math.floor(Math.sqrt(i.toDouble())/2).toInt()
}