fun main (){
    var x= nameMessage("mercy ")
var y=remain(30,4)
    println(y)
var q=add(10,30,50,40)
    println(q)
    var z=funFact("an active listener")

}
fun nameMessage(name:String){
    println("hello $name")
}
fun remain(a:Int, b:Int):Int{
    var quotient= a%b
    return quotient
}
fun add(s:Int, t:Int, u:Int, v:Int):Int{
    var sum= s+t+u+v
    return sum
}
fun funFact(interest: String){
    println("I am $interest")
}
