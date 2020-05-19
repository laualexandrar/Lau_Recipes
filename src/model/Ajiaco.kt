package model

class Ajiaco : AllRecipes ("Ajiaco"){
    override fun showRecipesList() {
        super.showRecipesList()
        println("""
            1. water
            2. potatoes
            3. onion
            4. garlic
            5. chicken
            
        1. In a large pot, add water, chicken and half of the gallant soldier weeds. Let simmer for approximately 40 minutes. Once chicken is cooked, place on plate, cut in small chunks, and cover with aluminum foil to keep the chicken warm. Do not toss the water.
        2. Then, in the same water you cooked the chicken, add the two kinds of potatoes, onion and garlic. Let cook for approximately 2 hours for potatoes to dissolve completely.
        3. Add the chicken chunks, ears of corn, chicken broth, green peas and salt to taste. Mix carefully with all the ingredients, and let simmer for another hour over low heat.
        4. Add the other half of the guascas and cook for 5 more minutes 

        """.trimIndent())
    }
}