package model

abstract class AllRecipes (val category: String) {
    open fun showRecipesList() {
        println("This is the recipe \"${category}\", enjoy! : \n")
    }
}