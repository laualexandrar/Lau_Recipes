package model

class Salmon: AllRecipes("salmon"){
    override fun showRecipesList() {
        super.showRecipesList()
        println("""
            1. Salmon
            2. Garlic
            3. Sugar
            4. Soy Sauce
            5. salt
            6. pepper
            
            1. Place salmon fillet, skin side down, in ungreased 13x9-inch baking dish. In small bowl, mix soy sauce, sesame oil, gingerroot, pepper and garlic; pour over salmon. Cover; refrigerate at least 2 hours to blend flavors.
            2. Heat oven to 325°F. Sprinkle top of salmon with brown sugar and sesame seed.
            3. Bake 20 to 25 minutes or until salmon flakes easily with fork. Let stand 5 minutes before slicing. Garnish with chives.
        """.trimIndent())
    }
}