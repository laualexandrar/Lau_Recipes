package model

class RiceWChicken: AllRecipes("Rice With Chicken") {

    override fun showRecipesList() {
        super.showRecipesList()
        println("""
            The ingredients are: 
            1. Peas
            2. Rice
            3. Chicken
            4. Onions
            5. Tomato
            
            1. Heat oil in a large pot over low heat. Stir-fry the chopped peppers, garlic and onion, and stir until they’re golden brown.
            2. Add 3 cups of rice; remember to stir everything well.
            3. Add 5 cups of water, the chopped veggies, chicken breast, bouillon, seasoning and salt. Stir and let cook at medium heat for approximately 15 minutes or until the rice dries.
            4. Once rice has absorbed all the water, cover the pot and cook at low heat for 10 to 15 minutes until the rice is soft.
            
        """.trimIndent())
    }

}