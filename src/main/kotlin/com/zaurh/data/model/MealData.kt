package com.zaurh.data.model

import com.zaurh.util.Contants.BASE_URL
import kotlinx.serialization.Serializable

@Serializable
data class MealData(
    val mealId: Int,
    val name: String,
    val description: String,
    val dietary: Dietary,
    val origin: String,
    val ingredients: List<Ingredients>,
    val instructions: List<Instructions>,
    val imageUrl: String,
    val prepTimeMinutes: Int = 0,
    val cookTimeMinutes: Int = 0,
    val difficulty: DifficultyLevel = DifficultyLevel.MODERATE,
    val tags: List<String> = emptyList()
)

val meals = listOf(
    MealData(
        mealId = 1,
        name = "Pierogi",
        description = "Pierogies are filled dumplings, made by wrapping unleavened " +
                "dough around a filling, and occasionally flavored with a savory or " +
                "sweet garnish and cooked in boiling water.\n",
        dietary = Dietary.MEAT_BASED,
        ingredients =
        listOf(
            Ingredients(
                name = "Sauerkraut Filling",
                imageUrl = "$BASE_URL/static/meals/sauerkraut.png",
                recipe =
                listOf(
                    IngredientRecipe(
                        name = "Butter",
                        imageUrl = "$BASE_URL/static/meals/butter.png",
                        quantity = "2",
                        unit = IngredientUnit.TABLESPOONS
                    ),
                    IngredientRecipe(
                        name = "Onion",
                        imageUrl = "$BASE_URL/static/meals/onion.png",
                        quantity = "1/3",
                        unit = IngredientUnit.CUPS,
                        optional = "Chopped"
                    ),
                    IngredientRecipe(
                        name = "Sauerkraut",
                        imageUrl = "$BASE_URL/static/meals/sauerkraut.png",
                        quantity = "1/2",
                        unit = IngredientUnit.CUPS,
                        optional = "Drained and minced"
                    )
                ),
                optional = "Salt and pepper to taste"
            ),
            Ingredients(
                name = "Potato Filling",
                imageUrl = "$BASE_URL/static/meals/potato_filling.png",
                recipe =
                listOf(
                    IngredientRecipe(
                        name = "Butter",
                        imageUrl = "$BASE_URL/static/meals/butter.png",
                        quantity = "3",
                        unit = IngredientUnit.TABLESPOONS
                    ),
                    IngredientRecipe(
                        name = "Onion",
                        imageUrl = "$BASE_URL/static/meals/onion.png",
                        quantity = "1/2",
                        unit = IngredientUnit.CUPS,
                        optional = "Chopped"
                    ),
                    IngredientRecipe(
                        name = "Potato",
                        imageUrl = "$BASE_URL/static/meals/potato.png",
                        quantity = "2",
                        unit = IngredientUnit.CUPS,
                        optional = "Cold mashed"
                    ),
                    IngredientRecipe(
                        name = "Salt",
                        imageUrl = "$BASE_URL/static/meals/salt.png",
                        quantity = "1",
                        unit = IngredientUnit.TEASPOONS
                    ),
                    IngredientRecipe(
                        name = "White pepper",
                        imageUrl = "$BASE_URL/static/meals/white_pepper.png",
                        quantity = "1",
                        unit = IngredientUnit.TEASPOONS
                    )
                )
            ),
            Ingredients(
                name = "Dough",
                imageUrl = "$BASE_URL/static/meals/dough.png",
                recipe =
                listOf(
                    IngredientRecipe(
                        name = "Sour cream",
                        imageUrl = "$BASE_URL/static/meals/sour_cream.png",
                        quantity = "200",
                        unit = IngredientUnit.GRAMS
                    ),
                    IngredientRecipe(
                        name = "Egg",
                        imageUrl = "$BASE_URL/static/meals/egg.png",
                        quantity = "3",
                        unit = IngredientUnit.PIECES,
                        optional = "Large"
                    ),
                    IngredientRecipe(
                        name = "Flour",
                        imageUrl = "$BASE_URL/static/meals/flour.png",
                        quantity = "3",
                        unit = IngredientUnit.CUPS
                    ),
                    IngredientRecipe(
                        name = "Baking powder",
                        imageUrl = "$BASE_URL/static/meals/baking_powder.png",
                        quantity = "1",
                        unit = IngredientUnit.TABLESPOONS
                    ),
                    IngredientRecipe(
                        name = "Salt",
                        imageUrl = "$BASE_URL/static/meals/salt.png",
                        quantity = "1/4",
                        unit = IngredientUnit.TEASPOONS
                    )
                )
            ),
        ),
        instructions = listOf(
            Instructions(
                number = 1,
                step = "Gather all ingredients. Make sauerkraut filling: Melt butter in a skillet over medium heat. Cook and stir onion in hot butter until translucent, about 5 minutes."
            ),
            Instructions(
                number = 2,
                step = "Add sauerkraut and cook, stirring occasionally, for 5 more minutes. Season with salt and pepper, then remove to a plate to cool."
            ),
            Instructions(
                number = 3,
                step = "Make potato filling: Melt butter in the same skillet over medium heat. Cook and stir onion in hot butter until translucent, about 5 minutes. Stir in mashed potatoes, salt, and white pepper. Remove from heat.",
            ),
            Instructions(
                number = 4,
                step = "Make dough: Beat together sour cream and eggs in a large bowl until smooth. Sift flour, baking powder, and salt into a separate bowl; stir into sour cream mixture until dough comes together. Knead dough on a lightly floured surface until firm and smooth. Divide dough in half, then roll out one half to 1/8-inch thickness. Cut into 3-inch rounds using a biscuit cutter."
            ),
            Instructions(
                number = 5,
                step = "Place a small spoonful of potato filling into the center of each round. Moisten edges with water, fold over, and press with a fork to seal. Roll and fill remaining dough half with sauerkraut filling. Bring a large pot of lightly salted water to a boil."
            ),
            Instructions(
                number = 6,
                step = "Add pierogies in batches to boiling water and cook until they float to the top, 3 to 5 minutes. Remove with a slotted spoon. Enjoy!"
            )
        ),
        origin = "Poland",
        imageUrl = "$BASE_URL/static/meals/pierogi.png",
        prepTimeMinutes = 45,
        cookTimeMinutes = 15,
        difficulty = DifficultyLevel.MODERATE,
        tags = listOf("pierogi")
    ),
    MealData(
        mealId = 2,
        name = "Gołąbki",
        description = "Gołąbki is the Polish name of a dish popular in cuisines of Central Europe," +
                " made from boiled cabbage leaves wrapped around a filling of minced pork or beef," +
                " chopped onions, and rice and/or kasza. Gołąbki are often served during on festive" +
                " occasions such as weddings.",
        dietary = Dietary.MEAT_BASED,
        ingredients = listOf(
            Ingredients(
                name = "Stuffed cabbage rolls",
                imageUrl = "$BASE_URL/static/meals/stuffed_cabbage_rolls.png",
                recipe = listOf(
                    IngredientRecipe(
                        name = "Cabbage",
                        imageUrl = "$BASE_URL/static/meals/cabbage.png",
                        unit = IngredientUnit.PIECES,
                        quantity = "1",
                        optional = "Or Savoy Cabbage"
                    ),
                    IngredientRecipe(
                        name = "Ground pork",
                        imageUrl = "$BASE_URL/static/meals/ground_pork.png",
                        unit = IngredientUnit.GRAMS,
                        quantity = "800",
                    ),
                    IngredientRecipe(
                        name = "Onion",
                        imageUrl = "$BASE_URL/static/meals/onion.png",
                        unit = IngredientUnit.PIECES,
                        quantity = "1",
                        optional = "Yellow or white"
                    ),
                    IngredientRecipe(
                        name = "Neutral oil",
                        imageUrl = "$BASE_URL/static/meals/neutral_oil.png",
                        unit = IngredientUnit.TABLESPOONS,
                        quantity = "2",
                        optional = "e.g: Canola"
                    ),
                    IngredientRecipe(
                        name = "Garlic",
                        imageUrl = "$BASE_URL/static/meals/garlic.png",
                        unit = IngredientUnit.PIECES,
                        quantity = "3",
                    ),
                    IngredientRecipe(
                        name = "Rice",
                        imageUrl = "$BASE_URL/static/meals/rice.png",
                        unit = IngredientUnit.GRAMS,
                        quantity = "100",
                        optional = "Cooked"
                    ),
                    IngredientRecipe(
                        name = "Chicken stock",
                        imageUrl = "$BASE_URL/static/meals/chicken_stock.png",
                        unit = IngredientUnit.LITERS,
                        quantity = "1",
                    ),
                    IngredientRecipe(
                        name = "Ground black pepper",
                        imageUrl = "$BASE_URL/static/meals/ground_black_pepper.png",
                        unit = IngredientUnit.TEASPOONS,
                        quantity = "1",
                        optional = "Add it how much you like it."
                    )
                )
            ),
            Ingredients(
                name = "Tomato sauce",
                imageUrl = "$BASE_URL/static/meals/tomato_sauce.png",
                recipe = listOf(
                    IngredientRecipe(
                        name = "Butter",
                        imageUrl = "$BASE_URL/static/meals/butter.png",
                        unit = IngredientUnit.GRAMS,
                        quantity = "30"
                    ),
                    IngredientRecipe(
                        name = "Flour",
                        imageUrl = "$BASE_URL/static/meals/flour.png",
                        unit = IngredientUnit.TABLESPOONS,
                        quantity = "1"
                    ),
                    IngredientRecipe(
                        name = "Gołąbki juices",
                        imageUrl = "$BASE_URL/static/meals/golabki.png",
                        unit = IngredientUnit.CUPS,
                        quantity = "1",
                        optional = "Remaining from cooking Gołąbki"
                    ),
                    IngredientRecipe(
                        name = "Tomato passata",
                        imageUrl = "$BASE_URL/static/meals/tomato_passata.png",
                        unit = IngredientUnit.CUPS,
                        quantity = "2"
                    ),
                    IngredientRecipe(
                        name = "Tomato paste",
                        imageUrl = "$BASE_URL/static/meals/tomato_paste.png",
                        unit = IngredientUnit.TABLESPOONS,
                        quantity = "1"
                    )
                ),
                optional = "Add a pinch of sugar, salt and black pepper."
            )
        ),
        origin = "Poland",
        instructions = listOf(
            Instructions(
                number = 1,
                step = "For stuffed cabbage rolls: Wash the cabbage under running water. Even though the inside is usually clean (the outer leaves protect the inside), you might want to clean it anyway. Remove the tough outer leaves and discard them. Separate the inner leaves and wash them under running water. Cut out the stalk from the head.",
            ),
            Instructions(
                number = 2,
                step = "Grab a large cooking pot, large enough for the whole cabbage head to fit. Pour water in and bring it to boil. Add a solid pinch of salt and sugar and stir.",
            ),
            Instructions(
                number = 3,
                step = "Blanch the cabbage head in the boiling water, core side down. After a few minutes (2-3), the leaves should peel off easily. If not - cook it for a few more minutes.",
            ),
            Instructions(
                number = 4,
                step = "Remove cabbage to a baking tray, but keep the water in the pot. (Optional) To keep a more vibrant colour, you can place the leaves into ice water - that will slow down the cooking process. Set ten best leaves (largest, unbroken) aside. Using a paring knife, cut the main ‘vein’ out from each cabbage leaf and trim from the bottom with a knife.",
            ),
            Instructions(
                number = 5,
                step = "Peel an onion and dice it finely. Finely chop the garlic with a knife. Heat up a tablespoon or two of oil, add in chopped onion. When it turns golden, add chopped garlic and fry for another 1-2 minutes. Set aside to cool.",
            ),
            Instructions(
                number = 6,
                step = "In a large bowl, combine the ground meat, cooked rice, a tablespoon marjoram, and cooled down onion/garlic. Season with salt and pepper, mix thoroughly - no special tools are necessary, you can use your hands. This mass will be our stuffing. Lay the cabbage leaf flat. Place about ¼-⅓  cup of meat mixture in the centre of a cabbage leaf. Gather the edges of the cabbage inwards and roll it tightly. Continue until you have 10 decent-sized rolls.",
            ),
            Instructions(
                number = 7,
                step = "Line the bottom of the large cooking pot with some of the remaining pre-cooked leaves - this prevents the dish from burning. Place the cabbage rolls in the pot, in layers, one on top of another. Cover with a layer of remaining leaves. Pour the stock in. Cook on a medium heat, covered for about 40-50 minutes until the cabbage is tender. Not every cabbage is the same, you’ll have to check how soft it is as you go.",
            ),
            Instructions(
                number = 8,
                step = "When the cabbage rolls are nearly done, let’s make the tomato sauce. For tomato sauce: Melt the butter in a saucepan. When melted, add in the flour. Whisk together and cook for a bit until it gains some colour. Pour in around a cup (250 ml) of the stock that got made from cooking the cabbage rolls. Bring to a boil, then reduce the heat.",
            ),
            Instructions(
                number = 9,
                step = "Pour in 2 cups of tomato passata/purée and add a tablespoon of tomato paste. Bring to a boil yet again, then reduce the heat to a minimum. Season with salt and ground pepper. If the tomatoes are too acidic, add a pinch of sugar to balance the flavours. Continue cooking until you reach a desired thickness."
            ),
        ),
        imageUrl = "$BASE_URL/static/meals/golabki.png",
        prepTimeMinutes = 15,
        cookTimeMinutes = 60,
        difficulty = DifficultyLevel.HARD,
        tags = listOf("golabki", "polish")
    ),
    MealData(
        mealId = 3,
        name = "Bigos",
        description = "Bigos is a Polish dish of chopped meat of various kinds stewed with sauerkraut," +
                " shredded fresh cabbage and spices. It is served hot and can be enriched with additional" +
                " vegetables and wine. Originally from Poland, the dish also became traditional in the" +
                " areas of the vast Polish–Lithuanian Commonwealth.",
        dietary = Dietary.MEAT_BASED,
        ingredients = listOf(
            Ingredients(
                name = "Sauerkraut",
                unit = IngredientUnit.GRAMS,
                imageUrl = "$BASE_URL/static/meals/sauerkraut.png",
                quantity = "500"
            ),
            Ingredients(
                name = "Cabbage",
                unit = IngredientUnit.GRAMS,
                imageUrl = "$BASE_URL/static/meals/cabbage.png",
                quantity = "300",
                optional = "White"
            ),
            Ingredients(
                name = "Chicken thigh",
                unit = IngredientUnit.PIECES,
                imageUrl = "$BASE_URL/static/meals/chicken_thigh.png",
                quantity = "4",
                optional = "Or other meat."
            ),
            Ingredients(
                name = "Kielbasa",
                imageUrl = "$BASE_URL/static/meals/kielbasa.png",
                unit = IngredientUnit.GRAMS,
                quantity = "400"
            ),
            Ingredients(
                name = "Mushroom",
                imageUrl = "$BASE_URL/static/meals/dried_porcini_mushroom.png",
                unit = IngredientUnit.GRAMS,
                quantity = "7",
                optional = "Dried porcini"
            ),
            Ingredients(
                name = "Prunes",
                imageUrl = "$BASE_URL/static/meals/prunes.png",
                unit = IngredientUnit.PIECES,
                quantity = "8",
                optional = "You can add more."
            ),
            Ingredients(
                name = "Onion",
                imageUrl = "$BASE_URL/static/meals/onion.png",
                unit = IngredientUnit.PIECES,
                quantity = "1",
                optional = "Large"
            ),
            Ingredients(
                name = "Caraway seeds",
                imageUrl = "$BASE_URL/static/meals/caraway_seeds.png",
                unit = IngredientUnit.TABLESPOONS,
                quantity = "1/3"
            ),
            Ingredients(
                name = "Dried marjoram",
                imageUrl = "$BASE_URL/static/meals/dried_marjoram.png",
                unit = IngredientUnit.TABLESPOONS,
                quantity = "1/3"
            ),
            Ingredients(
                name = "Paprika",
                imageUrl = "$BASE_URL/static/meals/paprika.png",
                unit = IngredientUnit.TABLESPOONS,
                quantity = "1/3"
            ),
            Ingredients(
                name = "Bay leaf",
                imageUrl = "$BASE_URL/static/meals/bay_leaf.png",
                unit = IngredientUnit.PIECES,
                quantity = "1"
            ),
            Ingredients(
                name = "Tomato puree",
                imageUrl = "$BASE_URL/static/meals/tomato_sauce.png",
                unit = IngredientUnit.TABLESPOONS,
                quantity = "1/2"
            ),
            Ingredients(
                name = "Olive oil",
                imageUrl = "$BASE_URL/static/meals/olive_oil.png",
                unit = IngredientUnit.TABLESPOONS,
                quantity = "5",
                optional = "Or vegetable oil"
            ),
            Ingredients(
                name = "Water",
                imageUrl = "$BASE_URL/static/meals/water.png",
                unit = IngredientUnit.MILLILITERS,
                quantity = "400",
                optional = "300-500ml water."
            ),
        ),
        origin = "Poland",
        instructions = listOf(
            Instructions(
                number = 1,
                step = "In a large pot heat 3 tablespoons of the oil, add the caraway seeds, juniper and allspice berries, bay leaf and onion and gently fry for 3 minutes stirring often.",
            ),
            Instructions(
                number = 2,
                step = "Push the onion mixture to the side and add the chicken thighs. Cook for 2 minutes on each side.",
            ),
            Instructions(
                number = 3,
                step = "Add the sauerkraut, cabbage, prunes, tomato puree, mushrooms, marjoram, paprika, pepper to taste and half of the water and stir to combine. Cover, bring to the boil then simmer for 1 hour stirring occasionally. Top up with more water as needed (make sure the bigos doesn't stick to the bottom of the pan).",
            ),
            Instructions(
                number = 4,
                step = "In a frying pan heat the remaining oil (1-2 tablespoons) and fry the chopped sausage until crispy stirring often. Add the sausage into the stew and continue cooking gently for 1-1½ hours. Add a little more water if needed.",
            ),
            Instructions(
                number = 5,
                step = "Remove the chicken from the pot, separate the meat from the bone and put the meat pieces back into the pot. Serve with boiled/mashed potatoes or rye/pumpernickel bread."
            ),
        ),
        imageUrl = "$BASE_URL/static/meals/bigos.png",
        prepTimeMinutes = 45,
        cookTimeMinutes = 180,
        difficulty = DifficultyLevel.EASY,
        tags = listOf("bigos", "polish")
    ),
    MealData(
        mealId = 4,
        name = "Kotlet Schabowy",
        description = "Breaded pork chops with mashed potatoes and salad (preferably a sauerkraut salad) " +
                "is served regularly for Sunday dinner in Poland. Pound the meat as thinly as you " +
                "can for best results.",
        dietary = Dietary.MEAT_BASED,
        ingredients = listOf(
            Ingredients(
                name = "Pork chops",
                imageUrl = "$BASE_URL/static/meals/pork_chop.png",
                unit = IngredientUnit.PIECES,
                quantity = "2"
            ),
            Ingredients(
                name = "Ground black pepper",
                imageUrl = "$BASE_URL/static/meals/ground_black_pepper.png",
                quantity = "Add pepper to taste"
            ),
            Ingredients(
                name = "Flour",
                imageUrl = "$BASE_URL/static/meals/flour.png",
                unit = IngredientUnit.TABLESPOONS,
                quantity = "1"
            ),
            Ingredients(
                name = "Egg",
                imageUrl = "$BASE_URL/static/meals/egg.png",
                unit = IngredientUnit.PIECES,
                quantity = "1"
            ),
            Ingredients(
                name = "Bread crumb",
                imageUrl = "$BASE_URL/static/meals/bread_crumb.png",
                unit = IngredientUnit.TABLESPOONS,
                quantity = "5"
            ),
            Ingredients(
                name = "Oil",
                imageUrl = "$BASE_URL/static/meals/neutral_oil.png",
                unit = IngredientUnit.TABLESPOONS,
                quantity = "2",
                optional = "Vegetable oil or olive oil."
            ),
        ),
        origin = "Poland",
        instructions = listOf(
            Instructions(
                number = 1,
                step = "Place pork chops between 2 sheets of heavy plastic on a solid, level surface. Firmly pound with the smooth side of a meat mallet, turning occasionally, until very thin. Season with salt and pepper.",
            ),
            Instructions(
                number = 2,
                step = "Pour flour onto a large plate. Whisk egg in a wide, shallow bowl. Place breadcrumbs in a separate shallow bowl.",
            ),
            Instructions(
                number = 3,
                step = "Dredge chops with flour. Dip in whisked egg. Coat with bread crumbs on both sides. Shake off excess coating.",
            ),
            Instructions(
                number = 4,
                step = "Heat oil in a large skillet over medium-high heat. Add breaded chops; cook until golden brown, about 5 minutes per side.",
            )
        ),
        imageUrl = "$BASE_URL/static/meals/kotlet_schabowy.png",
        prepTimeMinutes = 10,
        cookTimeMinutes = 10,
        difficulty = DifficultyLevel.MODERATE,
        tags = listOf("kotlet", "polish", "schabowy")
    ),
    MealData(
        mealId = 5,
        name = "Kotlet mielony",
        description = "Kotlety mielone are delicious meat patties made from ground pork. " +
                "It’s one of the most popular Polish dishes, it’s eaten by Polish families " +
                "on a regular basis. These cutlets and thick and juicy, and so comforting.",
        dietary = Dietary.MEAT_BASED,
        ingredients = listOf(
            Ingredients(
                name = "Ground beef",
                imageUrl = "$BASE_URL/static/meals/ground_beef.png",
                unit = IngredientUnit.GRAMS,
                quantity = "600"
            ),
            Ingredients(
                name = "Cracker crumb",
                imageUrl = "$BASE_URL/static/meals/cracker_crumb.png",
                unit = IngredientUnit.CUPS,
                quantity = "2/3"
            ),
            Ingredients(
                name = "Onion",
                imageUrl = "$BASE_URL/static/meals/onion.png",
                unit = IngredientUnit.PIECES,
                quantity = "1",
                optional = "Small"
            ),
            Ingredients(
                name = "Egg",
                imageUrl = "$BASE_URL/static/meals/egg.png",
                unit = IngredientUnit.PIECES,
                quantity = "1"
            ),
            Ingredients(
                name = "Milk",
                imageUrl = "$BASE_URL/static/meals/milk.png",
                unit = IngredientUnit.TABLESPOONS,
                quantity = "1"
            ),
            Ingredients(
                name = "Garlic",
                imageUrl = "$BASE_URL/static/meals/garlic.png",
                unit = IngredientUnit.PIECES,
                quantity = "1",
                optional = "One clove garlic"
            ),
            Ingredients(
                name = "Salt",
                imageUrl = "$BASE_URL/static/meals/salt.png",
                unit = IngredientUnit.TABLESPOONS,
                quantity = "1/4"
            ),
            Ingredients(
                name = "Ground black pepper",
                imageUrl = "$BASE_URL/static/meals/ground_black_pepper.png",
                unit = IngredientUnit.TEASPOONS,
                quantity = "1/2"
            ),
            Ingredients(
                name = "Shortening",
                imageUrl = "$BASE_URL/static/meals/shortening.png",
                unit = IngredientUnit.CUPS,
                quantity = "1/2"
            ),
        ),
        origin = "Poland",
        instructions = listOf(
            Instructions(
                number = 1,
                step = "Mix ground beef, cracker crumbs, onion, egg, milk, garlic, kosher salt, and black pepper in a large bowl until evenly blended. Shape meat mixture into twelve 3-inch patties about 1 1/4-inch thick.",
            ),
            Instructions(
                number = 2,
                step = "Heat vegetable shortening in a large skillet over medium-high heat. Sear patties until golden brown, about 2 minutes per side. Reduce heat to low and continue cooking, uncovered, until patties are no longer pink in the center, about 20 minutes more. Remove patties from skillet and drain on paper towels until ready to serve.",
            )
        ),
        imageUrl = "$BASE_URL/static/meals/kotlet_mielony.png",
        prepTimeMinutes = 15,
        cookTimeMinutes = 25,
        difficulty = DifficultyLevel.EASY,
        tags = listOf("kotlet", "polish", "mielony")
    ),
    MealData(
        mealId = 6,
        name = "Gulasz",
        description = "Goulash is another meal borrowed by Poles that became a traditional dish in a Polish Cuisine." +
                "It is a Hungarian soup but in Poland it is cooked to be more like a thick beef stew.",
        dietary = Dietary.MEAT_BASED,
        ingredients = listOf(
            Ingredients(
                name = "Beef",
                imageUrl = "$BASE_URL/static/meals/beef.png",
                unit = IngredientUnit.GRAMS,
                quantity = "800"
            ),
            Ingredients(
                name = "Onion",
                imageUrl = "$BASE_URL/static/meals/onion.png",
                unit = IngredientUnit.PIECES,
                quantity = "1"
            ),
            Ingredients(
                name = "Carrot",
                imageUrl = "$BASE_URL/static/meals/carrot.png",
                unit = IngredientUnit.CUPS,
                quantity = "1",
            ),
            Ingredients(
                name = "Red bell pepper",
                imageUrl = "$BASE_URL/static/meals/red_bell_pepper.png",
                unit = IngredientUnit.CUPS,
                quantity = "1"
            ),
            Ingredients(
                name = "Mushroom",
                imageUrl = "$BASE_URL/static/meals/mushroom.png",
                unit = IngredientUnit.CUPS,
                quantity = "1"
            ),
            Ingredients(
                name = "Garlic",
                imageUrl = "$BASE_URL/static/meals/garlic.png",
                unit = IngredientUnit.PIECES,
                quantity = "3",
                optional = "3 cloves"
            ),
            Ingredients(
                name = "Tomato paste",
                imageUrl = "$BASE_URL/static/meals/tomato_paste.png",
                unit = IngredientUnit.TABLESPOONS,
                quantity = "2"
            ),
            Ingredients(
                name = "Salt",
                imageUrl = "$BASE_URL/static/meals/salt.png",
                unit = IngredientUnit.TABLESPOONS,
                quantity = "2",
                optional = "Add it how much you like."
            ),
            Ingredients(
                name = "Ground black pepper",
                imageUrl = "$BASE_URL/static/meals/ground_black_pepper.png",
                unit = IngredientUnit.TABLESPOONS,
                quantity = "2",
                optional = "Add it how much you like."
            ),
            Ingredients(
                name = "Oil",
                imageUrl = "$BASE_URL/static/meals/neutral_oil.png",
                unit = IngredientUnit.TABLESPOONS,
                quantity = "2",
                optional = "Add it how much you like"
            )
        ),
        origin = "Hungary",
        instructions = listOf(
            Instructions(
                number = 1,
                step = "In a small bowl mix together 3 cloves minced garlic, 1 Tbsp Salt, 1 Tbsp Pepper and 1 Tbsp Oregano, Cumin, Thyme and 4 Tbsp Olive Oil. Pour it over meat and mix well. The best way it to marinade the meat a day before making Goulash but if you don’t have time it might be the same day and put it in the fridge for 1-2h.",
            ),
            Instructions(
                number = 2,
                step = "Fry marinated beef on preheat oil in a regular pot and move to pressure cooker and set for 20 minutes. *if you don’t have pressure cooker your meat should cook for about 2-3 hours and should be tender. cooking time depends on meat.",
            ),
            Instructions(
                number = 3,
                step = "Prepare the veggies: chop the Onion, cut Bell Pepper and Carrot in half inch cubes. Cut Mushroom in quarters or halves.",
            ),
            Instructions(
                number = 4,
                step = "In the meantime: Add onion to cold oil and heat up, then add Bell Pepper, Mushrooms and Carrots. Simmer on low hear for 10 minutes until juicy.",
            ),
            Instructions(
                number = 5,
                step = "When beef is ready, add vegetables and tomato paste and cook for another 10 minutes or until vegetables are soft (especially check for carrot)."
            ),
            Instructions(
                number = 6,
                step = "Prepare thickening: melt Butter, add Flour, stir until smooth, add paprika and cook on low heat until bubbly. "
            ),
            Instructions(
                number = 7,
                step = "Add to the veggies and meat and cook 1-2 minutes until thickened."
            ),
        ),
        imageUrl = "$BASE_URL/static/meals/gulasz.png",
        prepTimeMinutes = 45,
        cookTimeMinutes = 120,
        difficulty = DifficultyLevel.HARD,
        tags = listOf("gulasz", "polish", "hungary")
    ),
    MealData(
        mealId = 7,
        name = "Kluski śląskie",
        description = "Kluski Śląskie Silesian Dumplings come from Silesia, a region in the southwest of " +
                "Poland that also encompasses small bits of Germany and the Czech Republic," +
                " but Silesain Dumplings are so popular throughout Poland that they’re readily available " +
                "in the refrigerator case of supermarkets all over the country, coming in a package that" +
                " reminds me of brown and serve rolls.",
        dietary = Dietary.VEGETARIAN,
        ingredients = listOf(
            Ingredients(
                name = "Potato",
                imageUrl = "$BASE_URL/static/meals/potato.png",
                unit = IngredientUnit.PIECES,
                quantity = "2",
                optional = "Peeled and diced"
            ),
            Ingredients(
                name = "Potato starch",
                imageUrl = "$BASE_URL/static/meals/flour.png",
                unit = IngredientUnit.CUPS,
                quantity = "1"
            ),
            Ingredients(
                name = "Egg",
                imageUrl = "$BASE_URL/static/meals/egg.png",
                unit = IngredientUnit.PIECES,
                quantity = "1",
            ),
            Ingredients(
                name = "Salt",
                imageUrl = "$BASE_URL/static/meals/salt.png",
                unit = IngredientUnit.TEASPOONS,
                quantity = "1/2"
            )
        ),
        origin = "Poland",
        instructions = listOf(
            Instructions(
                number = 1,
                step = "Cook the potatoes in boiling salted water, until tender.",
            ),
            Instructions(
                number = 2,
                step = "Drain thoroughly and mash or rice.",
            ),
            Instructions(
                number = 3,
                step = "Press the mashed potatoes into a bowl and smooth the top.",
            ),
            Instructions(
                number = 4,
                step = "Draw two lines on the top of the potatoes, dividing the mass into fourths.",
            ),
            Instructions(
                number = 5,
                step = "Scoop out 1/4 of the potatoes and fill this space with potato starch, return the potatoes you just scooped out.",
            ),
            Instructions(
                number = 6,
                step = "Add egg and salt, stir until well combined.",
            ),
            Instructions(
                number = 7,
                step = "Roll a small amount of the mixture, about the size of a golf ball, in your hands until smooth.",
            ),Instructions(
                number = 8,
                step = "Make an indentation with your thumb and continue smoothing the dumpling.",
            ),
            Instructions(
                number = 9,
                step = "Preparing a large pot of barely simmering salted water.",
            ),
            Instructions(
                number = 10,
                step = "Without overcrowding the pot, place dumplings in water with a slotted spoon.",
            ),
            Instructions(
                number = 11,
                step = "They will rise to the top after a few minutes, if a stubborn one or two stay on the bottom, give them a gentle nudge, they may be stuck.",
            ),
            Instructions(
                number = 12,
                step = "Cook for 5 more minutes, remove with a slotted spoon.",
            ),Instructions(
                number = 13,
                step = "Top with with whatever wonderful creation you’re using.",
            ),
        ),
        imageUrl = "$BASE_URL/static/meals/kluski_slaskie.png",
        prepTimeMinutes = 20,
        cookTimeMinutes = 20,
        difficulty = DifficultyLevel.MODERATE,
        tags = listOf("kluski", "polish", "slaskie")
    ),
    MealData(
        mealId = 8,
        name = "Pyzy",
        description = "Pyzy are a type of dumpling (kluski). The dish is most commonly referred to in its" +
                " plural for pyzy, as it is most commonly served as a main " +
                "course meal: large oval-shaped kluski, characteristic to Polish cuisine.",
        dietary = Dietary.MEAT_BASED,
        ingredients = listOf(
            Ingredients(
                name = "Flour",
                imageUrl = "$BASE_URL/static/meals/flour.png",
                unit = IngredientUnit.GRAMS,
                quantity = "500"
            ),
            Ingredients(
                name = "Milk",
                imageUrl = "$BASE_URL/static/meals/milk.png",
                unit = IngredientUnit.MILLILITERS,
                quantity = "300",
                optional = "Warm"
            ),
            Ingredients(
                name = "Dry yeast",
                imageUrl = "$BASE_URL/static/meals/dry_yeast.png",
                unit = IngredientUnit.GRAMS,
                quantity = "8",
                optional = "Or 20 grams."
            ),
            Ingredients(
                name = "Egg",
                imageUrl = "$BASE_URL/static/meals/egg.png",
                unit = IngredientUnit.PIECES,
                quantity = "2"
            ),
            Ingredients(
                name = "Sugar",
                imageUrl = "$BASE_URL/static/meals/sugar.png",
                unit = IngredientUnit.TEASPOONS,
                quantity = "1"
            ),
            Ingredients(
                name = "Salt",
                imageUrl = "$BASE_URL/static/meals/salt.png",
                unit = IngredientUnit.TEASPOONS,
                quantity = "1/2",
            )
        ),
        origin = "Poland",
        instructions = listOf(
            Instructions(
                number = 1,
                step = "Prepare the leaven by putting yeast, a teaspoon of sugar and 2 tablespoons of flour into warm milk. Stir, cover and set aside for 15 minutes.",
            ),
            Instructions(
                number = 2,
                step = "In a bowl, mix 2 eggs, salt, sifted flour and risen leaven. Knead the dough for about 10 minutes. You can use a robot for that. Then cover the bowl and leave the dough to rise for 1-2 hours.",
            ),
            Instructions(
                number = 3,
                step = "When the dough has risen, make balls out of it. Sprinkle flour on your hands and the baking sheet or a plate on which you will place the pyzy so that the dough does not stick to them. Then cover the pyzy with a cloth and leave to rise again for 30 minutes.",
            ),
            Instructions(
                number = 4,
                step = "When the dumplings grow up, steam them. To do this pour water (approx. 2 cm) into the pot, put a colander/sieve in it or use a steamer. You can grease the colander/sieve with oil so that the dough does not stick to it. When the water in the pot starts to boil, place the pyzy on the sieve and cover the pot. Cook the pyzy for about 10 minutes and done. Serve with gravy.",
            ),
        ),
        imageUrl = "$BASE_URL/static/meals/pyzy.png",
        prepTimeMinutes = 30,
        cookTimeMinutes = 90,
        difficulty = DifficultyLevel.MODERATE,
        tags = listOf("pyzy", "polish")
    ),
    MealData(
        mealId = 9,
        name = "Knedle",
        description = "Knedle is a dish of boiled potato-dough dumplings filled with plums or apricots," +
                " originating in the Austro-Hungarian Empire. Popular in Central and Eastern European " +
                "countries, the dish is eaten as dessert, a main dish, or side dish.    ",
        dietary = Dietary.MEAT_BASED,
        ingredients = listOf(
            Ingredients(
                name = "Potato",
                imageUrl = "$BASE_URL/static/meals/potato.png",
                unit = IngredientUnit.KILOGRAMS,
                quantity = "1.5"
            ),
            Ingredients(
                name = "Salt",
                imageUrl = "$BASE_URL/static/meals/salt.png",
                unit = IngredientUnit.TEASPOONS,
                quantity = "2"
            ),
            Ingredients(
                name = "Butter",
                imageUrl = "$BASE_URL/static/meals/butter.png",
                unit = IngredientUnit.TABLESPOONS,
                quantity = "5",
                optional = "Soft or melted."
            ),
            Ingredients(
                name = "Flour",
                imageUrl = "$BASE_URL/static/meals/flour.png",
                unit = IngredientUnit.GRAMS,
                quantity = "400"
            ),
            Ingredients(
                name = "Egg",
                imageUrl = "$BASE_URL/static/meals/egg.png",
                unit = IngredientUnit.PIECES,
                quantity = "1"
            ),
            Ingredients(
                name = "Plum",
                imageUrl = "$BASE_URL/static/meals/plum.png",
                unit = IngredientUnit.PIECES,
                quantity = "30",
                optional = "Smaller, ripe"
            ),
            Ingredients(
                name = "Oil",
                imageUrl = "$BASE_URL/static/meals/neutral_oil.png",
                unit = IngredientUnit.TEASPOONS,
                quantity = "1"
            ),
            Ingredients(
                name = "Bread crumb",
                imageUrl = "$BASE_URL/static/meals/bread_crumb.png",
                unit = IngredientUnit.GRAMS,
                quantity = "400"
            ),
            Ingredients(
                name = "Sugar",
                imageUrl = "$BASE_URL/static/meals/sugar.png",
                unit = IngredientUnit.GRAMS,
                quantity = "300"
            )
        ),
        origin = "Austro-Hungarian Empire",
        instructions = listOf(
            Instructions(
                number = 1,
                step = "Peel and dice potatoes. Place in a deep pot, cover with water, and add salt. Bring to a boil on high. Lower the temperature and continue boiling for about 15 minutes, or until potatoes are soft when you test them with a fork.",
            ),
            Instructions(
                number = 2,
                step = "Strain potatoes and mash them. Leave aside for an hour to cool. Meanwhile pit each plum by cutting it along its natural longitude on one side, and taking the pit out. Do not cut in half completely, instead leave plums in tact. Take the butter out of the fridge so it's soft.",
            ),
            Instructions(
                number = 3,
                step = "Dust the working area with plenty of flour. Add mashed potatoes, egg, butter, more flour and start working the ingredients into dough. How much flour you use will depend on the kind of potatoes you end up with. If the potatoes are dry, use less flour. If the potatoes are wet, use a little more. The dough should be on the softer, more elastic side, but not falling apart. It needs to be just tough enough to be worked into dumplings, and hold a plum inside without separating.",
            ),
            Instructions(
                number = 4,
                step = "Divide the dough it into two loaves. Work each loaf a few minutes more, and then cut each into one-inch dumpling rounds. Meanwhile, fill up a large pot with a gallon or two of water, leaving ample space on the top. (The water level will rise as you place the dumplings in.) Place the pot on stove on highest, cover, and bring to a boil.",
            ),
            Instructions(
                number = 5,
                step = "Take a pitted plum, place a teaspoon of sugar into it, and transfer onto a dumpling round. Form everything into a ball making sure that the plum is safely secured inside the dough. Repeat until you are out of rounds or plums. The number will vary, but with this recipe you should end up with around 30 dumplings.",
            ),
            Instructions(
                number = 6,
                step = "By this time the water should be boiling. Uncover it, lower the temperature to medium, and start placing formed dumplings in. They'll sink to the bottom. They are finished when they rise up, so take them out one by one. It may take up to 15-20 minutes for the dumplings to rise, sometimes longer, just make sure you got your eye on the water. Stir the water occasionally so the dumplings don't clump together, and don't put too many in at any one time. As there are a lot of dumplings, you'll have to boil them in rounds.",
            ),
            Instructions(
                number = 7,
                step = "Meanwhile, simmer breadcrumbs and oil in a larger pan for 3-4 minutes, and prepare a bowl with sugar, and set aside. After taking each dumpling out of the boiling water, roll it in bread crumbs first until it's covered on all sides. Afterward, transfer the dumpling into the bowl with sugar and repeat.",
            ),
            Instructions(
                number = 8,
                step = "Consume warm. (Optionally serve with sour cream.)",
            )
        ),
        imageUrl = "$BASE_URL/static/meals/knedle.png",
        prepTimeMinutes = 20,
        cookTimeMinutes = 10,
        difficulty = DifficultyLevel.HARD,
        tags = listOf("knedle", "polish")
    ),
    MealData(
        mealId = 10,
        name = "Leniwe",
        description = "Polish Lazy Pierogi is a simple mixture of tangy farmer’s cheese with flour and eggs." +
                " They are a simple Polish dumpling, that does not require making stuffing," +
                " neatly rolling out the dough, cutting circular shapes, stuffing and sealing." +
                " This is simple stuff. Combine, lightly roll and boil. ",
        dietary = Dietary.VEGETARIAN,
        ingredients = listOf(
            Ingredients(
                name = "Farmer's cheese",
                imageUrl = "$BASE_URL/static/meals/farmers_cheese.png",
                unit = IngredientUnit.GRAMS,
                quantity = "500",
                optional = "It is also called twarog"
            ),
            Ingredients(
                name = "Egg",
                imageUrl = "$BASE_URL/static/meals/egg.png",
                unit = IngredientUnit.PIECES,
                quantity = "3"
            ),
            Ingredients(
                name = "Salt",
                imageUrl = "$BASE_URL/static/meals/salt.png",
                unit = IngredientUnit.TEASPOONS,
                quantity = "1/2"
            ),
            Ingredients(
                name = "Flour",
                imageUrl = "$BASE_URL/static/meals/flour.png",
                unit = IngredientUnit.GRAMS,
                quantity = "150"
            ),
            Ingredients(
                name = "Butter",
                imageUrl = "$BASE_URL/static/meals/butter.png",
                unit = IngredientUnit.TABLESPOONS,
                quantity = "4"
            ),
            Ingredients(
                name = "Bread crumb",
                imageUrl = "$BASE_URL/static/meals/bread_crumb.png",
                unit = IngredientUnit.TABLESPOONS,
                quantity = "4"
            ),
            Ingredients(
                name = "Sugar",
                imageUrl = "$BASE_URL/static/meals/sugar.png",
                unit = IngredientUnit.TEASPOONS,
                quantity = "1/2"
            )
        ),
        origin = "Poland",
        instructions = listOf(
            Instructions(
                number = 1,
                step = "Crumble farmer's cheese into a bowl, add eggs and salt. Use hand mixer to break up the cheese and mix with eggs until fairly broken up (there will be visible lumps of cheese).",
            ),
            Instructions(
                number = 2,
                step = "Add about 1 cup / 135 grams of flour and fold in with your hands. When it combines a bit, transfer onto a well-floured board or other clean surface. Keep folding until dough forms, don't knead. If still too loose, add a bit more flour. Dough should be soft, but keep form.",
            ),
            Instructions(
                number = 3,
                step = "Fill a large pot with water about half way, add about a ½ teaspoon of salt and a splash of oil and set to boil.",
            ),
            Instructions(
                number = 4,
                step = "Place bread crumbs in a small pan (dry) and toast until golden brown. WATCH THIS PART! They will burn quickly if not stirred. Add butter and stir until combined. Turn off and set aside.",
            ),
            Instructions(
                number = 5,
                step = "Divide dough into about 3 parts and form a log by rolling against the board back and forth with your hands pressing lightly. When desired thickness is achieved (2 inches / 4 centimeters), lightly flatten the log and cut into pieces at an angle.",
            ),
            Instructions(
                number = 6,
                step = "When the water starts boiling, turn the heat down and add about half of your batch. Lightly stir to prevent from sticking to the bottom. When dumplings start to float, boil on very low for about 2 min. Serve immediately, garnished with buttery bread crumbs and a sprinkle of sugar.",
            ),
        ),
        imageUrl = "$BASE_URL/static/meals/leniwe.png",
        prepTimeMinutes = 10,
        cookTimeMinutes = 5,
        difficulty = DifficultyLevel.EASY,
        tags = listOf("leniwe", "polish", "pierogi")
    ),
    MealData(
        mealId = 11,
        name = "Placki Ziemniaczane",
        description = "Polish potato pancakes, known as placki kartoflane or placki ziemniaczane in Polish," +
                " are delicious and delightful. This traditional recipe comes from Gwizdały village in" +
                " the Mazovia region of Poland and it's surprisingly easy.",
        dietary = Dietary.MEAT_BASED,
        ingredients = listOf(
            Ingredients(
                name = "Potato",
                imageUrl = "$BASE_URL/static/meals/potato.png",
                unit = IngredientUnit.PIECES,
                quantity = "3"
            ),
            Ingredients(
                name = "Onion",
                imageUrl = "$BASE_URL/static/meals/onion.png",
                unit = IngredientUnit.PIECES,
                quantity = "1",
                optional = "Small."
            ),
            Ingredients(
                name = "Egg",
                imageUrl = "$BASE_URL/static/meals/egg.png",
                unit = IngredientUnit.PIECES,
                quantity = "1",
                optional = "Small."
            ),
            Ingredients(
                name = "Flour",
                imageUrl = "$BASE_URL/static/meals/flour.png",
                unit = IngredientUnit.TABLESPOONS,
                quantity = "2"
            ),
            Ingredients(
                name = "Salt",
                imageUrl = "$BASE_URL/static/meals/salt.png",
                unit = IngredientUnit.TEASPOONS,
                quantity = "1"
            ),
            Ingredients(
                name = "Pepper",
                imageUrl = "$BASE_URL/static/meals/ground_black_pepper.png",
                unit = IngredientUnit.TEASPOONS,
                quantity = "1/4"
            ),
            Ingredients(
                name = "Oil",
                imageUrl = "$BASE_URL/static/meals/neutral_oil.png",
                unit = IngredientUnit.TEASPOONS,
                quantity = "Canola oil for frying."
            ),

            ),
        origin = "Poland",
        instructions = listOf(
            Instructions(
                number = 1,
                step = "Peel potatoes and grate on the fine side of the grater. ",
            ),
            Instructions(
                number = 2,
                step = "Grate onion.",
            ),
            Instructions(
                number = 3,
                step = "Drain potatoes and onion.",
            ),
            Instructions(
                number = 4,
                step = "In a bowl, beat egg, stir in flour, salt, and pepper until smooth.",
            ),
            Instructions(
                number = 5,
                step = "Add drained potatoes and onion, stirring until well combined.",
            ),
            Instructions(
                number = 6,
                step = "Heat 1/4 inch oil in frying pan over medium-high heat.",
            ),
            Instructions(
                number = 7,
                step = "Add potato batter, 1/4 cup at a time.",
            ),
            Instructions(
                number = 8,
                step = "Using the back of a spoon, spread the batter until the pancake is about 1/2 inch thick, I was able to make 3 at a time.",
            ),
            Instructions(
                number = 9,
                step = "Cook 2 to 3 minutes on each side, my frying pan is larger than the largest burner, so I also rotated them half way through each side to keep the middle from cooking and the outside edge from not getting dark enough.",
            ),
            Instructions(
                number = 10,
                step = "Drain on paper towels.",
            ),

            ),
        imageUrl = "$BASE_URL/static/meals/placki_ziemniaczane.png",
        prepTimeMinutes = 10,
        cookTimeMinutes = 15,
        difficulty = DifficultyLevel.MODERATE,
        tags = listOf("placki", "polish", "ziemniaczane")
    ),
    MealData(
        mealId = 12,
        name = "Golonka w piwie",
        description = "Golonka W Piwie is a tasty Polish dish of pork knuckles and veggies that are slow-cooked for hours and then baked with beer. Perfect for a special dinner!",
        dietary = Dietary.MEAT_BASED,
        ingredients = listOf(
            Ingredients(
                name = "Pork knuckle",
                imageUrl = "$BASE_URL/static/meals/golonka.png",
                unit = IngredientUnit.PIECES,
                quantity = "5",
                optional = "5-6 pork knuckles."
            ),
            Ingredients(
                name = "Carrot",
                imageUrl = "$BASE_URL/static/meals/carrot.png",
                unit = IngredientUnit.PIECES,
                quantity = "3"
            ),
            Ingredients(
                name = "Celery root",
                imageUrl = "$BASE_URL/static/meals/celery_root.png",
                unit = IngredientUnit.PIECES,
                quantity = "1"
            ),
            Ingredients(
                name = "Onion",
                imageUrl = "$BASE_URL/static/meals/onion.png",
                unit = IngredientUnit.GRAMS,
                quantity = "2"
            ),
            Ingredients(
                name = "Allspice berry",
                imageUrl = "$BASE_URL/static/meals/allspice_berry.png",
                unit = IngredientUnit.PIECES,
                quantity = "7"
            ),
            Ingredients(
                name = "Bay leaf",
                imageUrl = "$BASE_URL/static/meals/bay_leaf.png",
                unit = IngredientUnit.GRAMS,
                quantity = "5"
            ),
            Ingredients(
                name = "Dried marjoram",
                imageUrl = "$BASE_URL/static/meals/dried_marjoram.png",
                unit = IngredientUnit.TABLESPOONS,
                quantity = "1"
            ),
            Ingredients(
                name = "Salt",
                imageUrl = "$BASE_URL/static/meals/salt.png",
                unit = IngredientUnit.TABLESPOONS,
                quantity = "1"
            ),
            Ingredients(
                name = "Pepper",
                imageUrl = "$BASE_URL/static/meals/ground_black_pepper.png",
                unit = IngredientUnit.TEASPOONS,
                quantity = "1"
            ),
            Ingredients(
                name = "Oil",
                imageUrl = "$BASE_URL/static/meals/neutral_oil.png",
                unit = IngredientUnit.TABLESPOONS,
                quantity = "2"
            ),
            Ingredients(
                name = "Beer",
                imageUrl = "$BASE_URL/static/meals/beer.png",
                unit = IngredientUnit.CUPS,
                quantity = "2"
            ),
        ),
        origin = "Poland",
        instructions = listOf(
            Instructions(
                number = 1,
                step = "Cover the pork knuckles with cold water, add allspice berries, dried marjoram, and bay leaves. Cook slowly for about 3-5 hours until pork knuckles are soft.",
            ),
            Instructions(
                number = 2,
                step = "In the meantime, peel the carrot, celery root, and onions.",
            ),
            Instructions(
                number = 3,
                step = "Grate the carrot and celery root. Cut onions into half moons.",
            ),
            Instructions(
                number = 4,
                step = "Mix the veggies with salt, pepper, and oil.",
            ),
            Instructions(
                number = 5,
                step = "Take off the cooked pork knuckles from the water. Don't pour out the broth! It's a perfect base for any Polish soup, such as krupnik, white bortsch, or Polish sorrel soup.",
            ),
            Instructions(
                number = 6,
                step = "Preheat the oven to 356°F (180°C).",
            ),
            Instructions(
                number = 7,
                step = "Place pork knuckles into the heat-resistant vessel. Add veggies and beer.",
            ),
            Instructions(
                number = 8,
                step = "Bake in the oven for about 1 hour.",
            ),
        ),
        imageUrl = "$BASE_URL/static/meals/golonka_w_piwie.png",
        prepTimeMinutes = 10,
        cookTimeMinutes = 360,
        difficulty = DifficultyLevel.MODERATE,
        tags = listOf("golonka", "polish", "beer")
    ),
)