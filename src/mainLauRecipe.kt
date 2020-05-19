import model.*

fun main() {

    var number : String?
    println("Welcome to Laura's Recipes")

    do{
        val options: String = """
            Choose one:
            1. make a recipe
            2. View my recipes
            3. Exit
        """.trimIndent()

        println("\n $options")

        number = readLine()

        when(number){
            "1" -> makeRecipe()
            "2" -> viewRecipe()
            "3" -> println("Exit")
            else -> println("Select the correct option")
        }
    } while(number != "3")

}

fun makeRecipe(){
    println("Which recipe do you want to cook today:")
    val recipesNames : String = """
        
        Recipes:
        1. rice with chicken
        2. Ajiaco
        3. Salmon
        4. Parmesan chicken
    """.trimIndent()
    println("\n $recipesNames")

    val parmesanChicken = ParmesanChicken()
    val salmon = Salmon()
    val riceWChicken = RiceWChicken()
    val ajiaco = Ajiaco()


    println("Please write the corresponding number to the recipe that you want to make:")

    when (readLine()) {
        "1" -> riceWChicken.showRecipesList()
        "2" -> ajiaco.showRecipesList()
        "3" -> salmon.showRecipesList()
        "4" -> parmesanChicken.showRecipesList()
        else -> println("Select the correct option")
    }

}

fun viewRecipe() {
    println("see my recipes")
}