
fun main() {
    println(myDetails("mercy",60,"Tanzania"))
    println(getLength("HopperLab"))
    callMe("orishaba")
    callMe("Bridget")


}
//1. Write a function that takes in 3 parameters, name, age, and country,
// and returns a String with this structure “Hi, my name is x, I am y years
// old and I am from z.” Where x, y, and z are the provided name, age, and
// country respectively. (3 points)

fun myDetails(name:String, age:Int, country:String):String{
    return ("Hi,my name is $name,i am $age years old and i am from $country")

}




//2. Write a function that takes in a String and returns its length (2 points)
fun getLength(word:String):Int{
    var words=word.length
    return words

}
//3. Write a function that takes in a name and prints out “That’s me!”
// when your name is passed to it, otherwise, it prints out “I don’t know who that is” (3 points)
fun callMe(name: String){
    if (name===name) {
        println("that's me")
    }
    else{
        println("I don't know who that is")
    }

}
//4. Write a Kotlin function that takes in a string will all the
// vowels replaces by the character ‘*’. Use string interpolation to generate the output. (2 points)
fun replaceVowels(sentance:String){
    var vowels= arrayListOf("a","e","i","o","u")
    var word =for (char in sentance)
        if (char in vowels){

        }
}