fun main(){
compose()
    var results=compile("Constant", 18)
    println(results)
    var result=girl("Juliet")
    println(result)
    name()
}
fun compose(){
    val school="akirachix"
    var a=school[0]
    var i=school[2]
    var r=school[3]
    print(a)
    print(i)
    println(r)


}
fun compile(name:String, age:Int): String{
return "My name is $name and my age is $age"


}
fun girl(aGirl:String): Int{
  return aGirl.length
}
fun name(){
    var name="constance"
    if(name=="constance") {
        println("my name!")
    }else{
        println("I do not know who that is")
    }
}