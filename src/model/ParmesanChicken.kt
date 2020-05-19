package model

class ParmesanChicken : AllRecipes("Parmesan Chicken") {
    override fun showRecipesList() {
        super.showRecipesList()
        println("""
            1. Onion
            2. Chicken
            3. Garlic
            4. Parmesan cheese 

            1. Heat oven to 400°F. Spray large cookie sheet with cooking spray.
            2. In shallow bowl, mix mayonnaise, herbs and garlic powder. In large resealable food-storage plastic bag, place bread crumbs and cheese. Coat chicken with mayonnaise mixture. Place in bread crumb bag; seal and shake to coat. Place chicken on cookie sheet.
            3. Bake 15 to 20 minutes, turning once, until chicken is no longer pink in center and bread crumbs are golden brown. Serve with tomato pasta sauce.
        """.trimIndent())
    }
}