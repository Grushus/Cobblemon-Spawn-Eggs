package net.grubas.cobblemonspawneggs.item;

import net.grubas.cobblemonspawneggs.CobblemonSpawnEggs;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CobblemonSpawnEggs.MOD_ID);

    public static final DeferredItem<Item> BULBASAUR_SPAWN_EGG = ITEMS.register("bulbasaur_spawn_egg",
            () -> new SpawnEggItem("bulbasaur", 5, 32));
    public static final DeferredItem<Item> IVYSAUR_SPAWN_EGG = ITEMS.register("ivysaur_spawn_egg",
            () -> new SpawnEggItem("ivysaur", 16, 40));
    public static final DeferredItem<Item> VENUSAUR_SPAWN_EGG = ITEMS.register("venusaur_spawn_egg",
            () -> new SpawnEggItem("venusaur", 32, 52));
    public static final DeferredItem<Item> CHARMANDER_SPAWN_EGG = ITEMS.register("charmander_spawn_egg",
            () -> new SpawnEggItem("charmander", 5, 31));
    public static final DeferredItem<Item> CHARMELEON_SPAWN_EGG = ITEMS.register("charmeleon_spawn_egg",
            () -> new SpawnEggItem("charmeleon", 16, 40));
    public static final DeferredItem<Item> CHARIZARD_SPAWN_EGG = ITEMS.register("charizard_spawn_egg",
            () -> new SpawnEggItem("charizard", 36, 53));
    public static final DeferredItem<Item> SQUIRTLE_SPAWN_EGG = ITEMS.register("squirtle_spawn_egg",
            () -> new SpawnEggItem("squirtle", 5, 31));
    public static final DeferredItem<Item> WARTORTLE_SPAWN_EGG = ITEMS.register("wartortle_spawn_egg",
            () -> new SpawnEggItem("wartortle", 16, 40));
    public static final DeferredItem<Item> BLASTOISE_SPAWN_EGG = ITEMS.register("blastoise_spawn_egg",
            () -> new SpawnEggItem("blastoise", 36, 53));
    public static final DeferredItem<Item> CATERPIE_SPAWN_EGG = ITEMS.register("caterpie_spawn_egg",
            () -> new SpawnEggItem("caterpie", 1, 20));
    public static final DeferredItem<Item> VALENCIAN_CATERPIE_SPAWN_EGG = ITEMS.register("valencian_caterpie_spawn_egg",
            () -> new SpawnEggItem("valencian caterpie", 1, 20));
    public static final DeferredItem<Item> METAPOD_SPAWN_EGG = ITEMS.register("metapod_spawn_egg",
            () -> new SpawnEggItem("metapod", 7, 21));
    public static final DeferredItem<Item> VALENCIAN_METAPOD_SPAWN_EGG = ITEMS.register("valencian_metapod_spawn_egg",
            () -> new SpawnEggItem("valencian metapod", 7, 21));
    public static final DeferredItem<Item> BUTTERFREE_SPAWN_EGG = ITEMS.register("butterfree_spawn_egg",
            () -> new SpawnEggItem("butterfree", 10, 40));
    public static final DeferredItem<Item> VALENCIAN_BUTTERFREE_SPAWN_EGG = ITEMS.register("valencian_butterfree_spawn_egg",
            () -> new SpawnEggItem("valencian butterfree", 10, 40));
    public static final DeferredItem<Item> WEEDLE_SPAWN_EGG = ITEMS.register("weedle_spawn_egg",
            () -> new SpawnEggItem("weedle", 1, 20));
    public static final DeferredItem<Item> KAKUNA_SPAWN_EGG = ITEMS.register("kakuna_spawn_egg",
            () -> new SpawnEggItem("kakuna", 7, 21));
    public static final DeferredItem<Item> BEEDRILL_SPAWN_EGG = ITEMS.register("beedrill_spawn_egg",
            () -> new SpawnEggItem("beedrill", 10, 40));
    public static final DeferredItem<Item> PIDGEY_SPAWN_EGG = ITEMS.register("pidgey_spawn_egg",
            () -> new SpawnEggItem("pidgey", 1, 25));
    public static final DeferredItem<Item> PIDGEOTTO_SPAWN_EGG = ITEMS.register("pidgeotto_spawn_egg",
            () -> new SpawnEggItem("pidgeotto", 18, 35));
    public static final DeferredItem<Item> PIDGEOT_SPAWN_EGG = ITEMS.register("pidgeot_spawn_egg",
            () -> new SpawnEggItem("pidgeot", 36, 48));
    public static final DeferredItem<Item> RATTATA_SPAWN_EGG = ITEMS.register("rattata_spawn_egg",
            () -> new SpawnEggItem("rattata", 1, 25));
    public static final DeferredItem<Item> ALOLAN_RATTATA_SPAWN_EGG = ITEMS.register("alolan_rattata_spawn_egg",
            () -> new SpawnEggItem("alolan rattata", 1, 25));
    public static final DeferredItem<Item> RATICATE_SPAWN_EGG = ITEMS.register("raticate_spawn_egg",
            () -> new SpawnEggItem("raticate", 20, 41));
    public static final DeferredItem<Item> ALOLAN_RATICATE_SPAWN_EGG = ITEMS.register("alolan_raticate_spawn_egg",
            () -> new SpawnEggItem("alolan raticate", 20, 41));
    public static final DeferredItem<Item> SPEAROW_SPAWN_EGG = ITEMS.register("spearow_spawn_egg",
            () -> new SpawnEggItem("spearow", 1, 26));
    public static final DeferredItem<Item> FEAROW_SPAWN_EGG = ITEMS.register("fearow_spawn_egg",
            () -> new SpawnEggItem("fearow", 20, 44));
    public static final DeferredItem<Item> EKANS_SPAWN_EGG = ITEMS.register("ekans_spawn_egg",
            () -> new SpawnEggItem("ekans", 4, 29));
    public static final DeferredItem<Item> ARBOK_SPAWN_EGG = ITEMS.register("arbok_spawn_egg",
            () -> new SpawnEggItem("arbok", 22, 45));
    public static final DeferredItem<Item> PIKACHU_SPAWN_EGG = ITEMS.register("pikachu_spawn_egg",
            () -> new SpawnEggItem("pikachu", 16, 32));
    public static final DeferredItem<Item> RAICHU_SPAWN_EGG = ITEMS.register("raichu_spawn_egg",
            () -> new SpawnEggItem("raichu", 27, 49));
    public static final DeferredItem<Item> ALOLAN_RAICHU_SPAWN_EGG = ITEMS.register("alolan_raichu_spawn_egg",
            () -> new SpawnEggItem("alolan raichu", 27, 49));
    public static final DeferredItem<Item> SANDSHREW_SPAWN_EGG = ITEMS.register("sandshrew_spawn_egg",
            () -> new SpawnEggItem("sandshrew", 5, 30));
    public static final DeferredItem<Item> SANDSLASH_SPAWN_EGG = ITEMS.register("sandslash_spawn_egg",
            () -> new SpawnEggItem("sandslash", 22, 45));
    public static final DeferredItem<Item> NIDORAN_F_SPAWN_EGG = ITEMS.register("nidoran_f_spawn_egg",
            () -> new SpawnEggItem("nidoran", 3, 28));
    public static final DeferredItem<Item> NIDORINA_SPAWN_EGG = ITEMS.register("nidorina_spawn_egg",
            () -> new SpawnEggItem("nidorina", 16, 37));
    public static final DeferredItem<Item> NIDOQUEEN_SPAWN_EGG = ITEMS.register("nidoqueen_spawn_egg",
            () -> new SpawnEggItem("nidoqueen", 37, 51));
    public static final DeferredItem<Item> NIDORAN_M_SPAWN_EGG = ITEMS.register("nidoran_m_spawn_egg",
            () -> new SpawnEggItem("nidoran", 3, 28));
    public static final DeferredItem<Item> NIDORINO_SPAWN_EGG = ITEMS.register("nidorino_spawn_egg",
            () -> new SpawnEggItem("nidorino", 16, 37));
    public static final DeferredItem<Item> NIDOKING_SPAWN_EGG = ITEMS.register("nidoking_spawn_egg",
            () -> new SpawnEggItem("nidoking", 37, 51));
    public static final DeferredItem<Item> CLEFAIRY_SPAWN_EGG = ITEMS.register("clefairy_spawn_egg",
            () -> new SpawnEggItem("clefairy", 17, 32));
    public static final DeferredItem<Item> CLEFABLE_SPAWN_EGG = ITEMS.register("clefable_spawn_egg",
            () -> new SpawnEggItem("clefable", 27, 48));
    public static final DeferredItem<Item> VULPIX_SPAWN_EGG = ITEMS.register("vulpix_spawn_egg",
            () -> new SpawnEggItem("vulpix", 5, 30));
    public static final DeferredItem<Item> ALOLAN_VULPIX_SPAWN_EGG = ITEMS.register("alolan_vulpix_spawn_egg",
            () -> new SpawnEggItem("alolan vulpix", 5, 30));
    public static final DeferredItem<Item> NINETALES_SPAWN_EGG = ITEMS.register("ninetales_spawn_egg",
            () -> new SpawnEggItem("ninetales", 25, 51));
    public static final DeferredItem<Item> ALOLAN_NINETALES_SPAWN_EGG = ITEMS.register("alolan_ninetales_spawn_egg",
            () -> new SpawnEggItem("alolan ninetales", 25, 51));
    public static final DeferredItem<Item> JIGGLYPUFF_SPAWN_EGG = ITEMS.register("jigglypuff_spawn_egg",
            () -> new SpawnEggItem("jigglypuff", 16, 27));
    public static final DeferredItem<Item> WIGGLYTUFF_SPAWN_EGG = ITEMS.register("wigglytuff_spawn_egg",
            () -> new SpawnEggItem("wigglytuff", 22, 44));
    public static final DeferredItem<Item> ZUBAT_SPAWN_EGG = ITEMS.register("zubat_spawn_egg",
            () -> new SpawnEggItem("zubat", 1, 25));
    public static final DeferredItem<Item> GOLBAT_SPAWN_EGG = ITEMS.register("golbat_spawn_egg",
            () -> new SpawnEggItem("golbat", 22, 46));
    public static final DeferredItem<Item> ODDISH_SPAWN_EGG = ITEMS.register("oddish_spawn_egg",
            () -> new SpawnEggItem("oddish", 7, 32));
    public static final DeferredItem<Item> VALENCIAN_ODDISH_SPAWN_EGG = ITEMS.register("valencian_oddish_spawn_egg",
            () -> new SpawnEggItem("valencian oddish", 7, 32));
    public static final DeferredItem<Item> GLOOM_SPAWN_EGG = ITEMS.register("gloom_spawn_egg",
            () -> new SpawnEggItem("gloom", 21, 40));
    public static final DeferredItem<Item> VALENCIAN_GLOOM_SPAWN_EGG = ITEMS.register("valencian_gloom_spawn_egg",
            () -> new SpawnEggItem("valencian gloom", 21, 40));
    public static final DeferredItem<Item> VILEPLUME_SPAWN_EGG = ITEMS.register("vileplume_spawn_egg",
            () -> new SpawnEggItem("vileplume", 35, 49));
    public static final DeferredItem<Item> VALENCIAN_VILEPLUME_SPAWN_EGG = ITEMS.register("valencian_vileplume_spawn_egg",
            () -> new SpawnEggItem("valencian vileplume", 35, 49));
    public static final DeferredItem<Item> PARAS_SPAWN_EGG = ITEMS.register("paras_spawn_egg",
            () -> new SpawnEggItem("paras", 4, 29));
    public static final DeferredItem<Item> PARASECT_SPAWN_EGG = ITEMS.register("parasect_spawn_egg",
            () -> new SpawnEggItem("parasect", 24, 41));
    public static final DeferredItem<Item> VENONAT_SPAWN_EGG = ITEMS.register("venonat_spawn_egg",
            () -> new SpawnEggItem("venonat", 6, 31));
    public static final DeferredItem<Item> VENOMOTH_SPAWN_EGG = ITEMS.register("venomoth_spawn_egg",
            () -> new SpawnEggItem("venomoth", 31, 45));
    public static final DeferredItem<Item> DIGLETT_SPAWN_EGG = ITEMS.register("diglett_spawn_egg",
            () -> new SpawnEggItem("diglett", 2, 27));
    public static final DeferredItem<Item> ALOLAN_DIGLETT_SPAWN_EGG = ITEMS.register("alolan_diglett_spawn_egg",
            () -> new SpawnEggItem("alolan diglett", 2, 27));
    public static final DeferredItem<Item> DUGTRIO_SPAWN_EGG = ITEMS.register("dugtrio_spawn_egg",
            () -> new SpawnEggItem("dugtrio", 26, 43));
    public static final DeferredItem<Item> ALOLAN_DUGTRIO_SPAWN_EGG = ITEMS.register("alolan_dugtrio_spawn_egg",
            () -> new SpawnEggItem("alolan dugtrio", 26, 43));
    public static final DeferredItem<Item> MEOWTH_SPAWN_EGG = ITEMS.register("meowth_spawn_egg",
            () -> new SpawnEggItem("meowth", 4, 29));
    public static final DeferredItem<Item> ALOLAN_MEOWTH_SPAWN_EGG = ITEMS.register("alolan_meowth_spawn_egg",
            () -> new SpawnEggItem("alolan meowth", 4, 29));
    public static final DeferredItem<Item> GALARIAN_MEOWTH_SPAWN_EGG = ITEMS.register("galarian_meowth_spawn_egg",
            () -> new SpawnEggItem("galarian meowth", 4, 29));
    public static final DeferredItem<Item> PERSIAN_SPAWN_EGG = ITEMS.register("persian_spawn_egg",
            () -> new SpawnEggItem("persian", 28, 44));
    public static final DeferredItem<Item> ALOLAN_PERSIAN_SPAWN_EGG = ITEMS.register("alolan_persian_spawn_egg",
            () -> new SpawnEggItem("alolan persian", 28, 44));
    public static final DeferredItem<Item> PSYDUCK_SPAWN_EGG = ITEMS.register("psyduck_spawn_egg",
            () -> new SpawnEggItem("psyduck", 7, 32));
    public static final DeferredItem<Item> GOLDUCK_SPAWN_EGG = ITEMS.register("golduck_spawn_egg",
            () -> new SpawnEggItem("golduck", 33, 50));
    public static final DeferredItem<Item> MANKEY_SPAWN_EGG = ITEMS.register("mankey_spawn_egg",
            () -> new SpawnEggItem("mankey", 6, 31));
    public static final DeferredItem<Item> PRIMEAPE_SPAWN_EGG = ITEMS.register("primeape_spawn_egg",
            () -> new SpawnEggItem("primeape", 28, 46));
    public static final DeferredItem<Item> GROWLITHE_SPAWN_EGG = ITEMS.register("growlithe_spawn_egg",
            () -> new SpawnEggItem("growlithe", 10, 35));
    public static final DeferredItem<Item> ARCANINE_SPAWN_EGG = ITEMS.register("arcanine_spawn_egg",
            () -> new SpawnEggItem("arcanine", 30, 56));
    public static final DeferredItem<Item> POLIWAG_SPAWN_EGG = ITEMS.register("poliwag_spawn_egg",
            () -> new SpawnEggItem("poliwag", 5, 30));
    public static final DeferredItem<Item> POLIWHIRL_SPAWN_EGG = ITEMS.register("poliwhirl_spawn_egg",
            () -> new SpawnEggItem("poliwhirl", 25, 39));
    public static final DeferredItem<Item> POLIWRATH_SPAWN_EGG = ITEMS.register("poliwrath_spawn_egg",
            () -> new SpawnEggItem("poliwrath", 34, 51));
    public static final DeferredItem<Item> ABRA_SPAWN_EGG = ITEMS.register("abra_spawn_egg",
            () -> new SpawnEggItem("abra", 6, 31));
    public static final DeferredItem<Item> KADABRA_SPAWN_EGG = ITEMS.register("kadabra_spawn_egg",
            () -> new SpawnEggItem("kadabra", 16, 40));
    public static final DeferredItem<Item> ALAKAZAM_SPAWN_EGG = ITEMS.register("alakazam_spawn_egg",
            () -> new SpawnEggItem("alakazam", 35, 50));
    public static final DeferredItem<Item> MACHOP_SPAWN_EGG = ITEMS.register("machop_spawn_egg",
            () -> new SpawnEggItem("machop", 6, 31));
    public static final DeferredItem<Item> MACHOKE_SPAWN_EGG = ITEMS.register("machoke_spawn_egg",
            () -> new SpawnEggItem("machoke", 28, 41));
    public static final DeferredItem<Item> MACHAMP_SPAWN_EGG = ITEMS.register("machamp_spawn_egg",
            () -> new SpawnEggItem("machamp", 36, 51));
    public static final DeferredItem<Item> BELLSPROUT_SPAWN_EGG = ITEMS.register("bellsprout_spawn_egg",
            () -> new SpawnEggItem("bellsprout", 5, 30));
    public static final DeferredItem<Item> WEEPINBELL_SPAWN_EGG = ITEMS.register("weepinbell_spawn_egg",
            () -> new SpawnEggItem("weepinbell", 21, 39));
    public static final DeferredItem<Item> VICTREEBEL_SPAWN_EGG = ITEMS.register("victreebel_spawn_egg",
            () -> new SpawnEggItem("victreebel", 34, 49));
    public static final DeferredItem<Item> TENTACOOL_SPAWN_EGG = ITEMS.register("tentacool_spawn_egg",
            () -> new SpawnEggItem("tentacool", 9, 34));
    public static final DeferredItem<Item> TENTACRUEL_SPAWN_EGG = ITEMS.register("tentacruel_spawn_egg",
            () -> new SpawnEggItem("tentacruel", 30, 52));
    public static final DeferredItem<Item> GEODUDE_SPAWN_EGG = ITEMS.register("geodude_spawn_egg",
            () -> new SpawnEggItem("geodude", 5, 30));
    public static final DeferredItem<Item> ALOLAN_GEODUDE_SPAWN_EGG = ITEMS.register("alolan_geodude_spawn_egg",
            () -> new SpawnEggItem("alolan geodude", 5, 30));
    public static final DeferredItem<Item> GRAVELER_SPAWN_EGG = ITEMS.register("graveler_spawn_egg",
            () -> new SpawnEggItem("graveler", 25, 39));
    public static final DeferredItem<Item> ALOLAN_GRAVELER_SPAWN_EGG = ITEMS.register("alolan_graveler_spawn_egg",
            () -> new SpawnEggItem("alolan graveler", 25, 39));
    public static final DeferredItem<Item> GOLEM_SPAWN_EGG = ITEMS.register("golem_spawn_egg",
            () -> new SpawnEggItem("golem", 34, 50));
    public static final DeferredItem<Item> ALOLAN_GOLEM_SPAWN_EGG = ITEMS.register("alolan_golem_spawn_egg",
            () -> new SpawnEggItem("alolan golem", 34, 50));
    public static final DeferredItem<Item> PONYTA_SPAWN_EGG = ITEMS.register("ponyta_spawn_egg",
            () -> new SpawnEggItem("ponyta", 16, 41));
    public static final DeferredItem<Item> GALARIAN_PONYTA_SPAWN_EGG = ITEMS.register("galarian_ponyta_spawn_egg",
            () -> new SpawnEggItem("galarian ponyta", 16, 41));
    public static final DeferredItem<Item> RAPIDASH_SPAWN_EGG = ITEMS.register("rapidash_spawn_egg",
            () -> new SpawnEggItem("rapidash", 40, 50));
    public static final DeferredItem<Item> GALARIAN_RAPIDASH_SPAWN_EGG = ITEMS.register("galarian_rapidash_spawn_egg",
            () -> new SpawnEggItem("galarian rapidash", 40, 50));
    public static final DeferredItem<Item> SLOWPOKE_SPAWN_EGG = ITEMS.register("slowpoke_spawn_egg",
            () -> new SpawnEggItem("slowpoke", 7, 32));
    public static final DeferredItem<Item> GALARIAN_SLOWPOKE_SPAWN_EGG = ITEMS.register("galarian_slowpoke_spawn_egg",
            () -> new SpawnEggItem("galarian slowpoke", 7, 32));
    public static final DeferredItem<Item> SLOWBRO_SPAWN_EGG = ITEMS.register("slowbro_spawn_egg",
            () -> new SpawnEggItem("slowbro", 37, 49));
    public static final DeferredItem<Item> GALARIAN_SLOWBRO_SPAWN_EGG = ITEMS.register("galarian_slowbro_spawn_egg",
            () -> new SpawnEggItem("galarian slowbro", 37, 49));
    public static final DeferredItem<Item> MAGNEMITE_SPAWN_EGG = ITEMS.register("magnemite_spawn_egg",
            () -> new SpawnEggItem("magnemite", 8, 33));
    public static final DeferredItem<Item> MAGNETON_SPAWN_EGG = ITEMS.register("magneton_spawn_egg",
            () -> new SpawnEggItem("magneton", 30, 47));
    public static final DeferredItem<Item> FARFETCHD_SPAWN_EGG = ITEMS.register("farfetchd_spawn_egg",
            () -> new SpawnEggItem("farfetch'd", 13, 38));
    public static final DeferredItem<Item> GALARIAN_FARFETCHD_SPAWN_EGG = ITEMS.register("galarian_farfetchd_spawn_egg",
            () -> new SpawnEggItem("galarian farfetch'd", 13, 38));
    public static final DeferredItem<Item> DODUO_SPAWN_EGG = ITEMS.register("doduo_spawn_egg",
            () -> new SpawnEggItem("doduo", 6, 31));
    public static final DeferredItem<Item> DODRIO_SPAWN_EGG = ITEMS.register("dodrio_spawn_egg",
            () -> new SpawnEggItem("dodrio", 31, 47));
    public static final DeferredItem<Item> SEEL_SPAWN_EGG = ITEMS.register("seel_spawn_egg",
            () -> new SpawnEggItem("seel", 8, 33));
    public static final DeferredItem<Item> DEWGONG_SPAWN_EGG = ITEMS.register("dewgong_spawn_egg",
            () -> new SpawnEggItem("dewgong", 34, 48));
    public static final DeferredItem<Item> GRIMER_SPAWN_EGG = ITEMS.register("grimer_spawn_egg",
            () -> new SpawnEggItem("grimer", 8, 33));
    public static final DeferredItem<Item> ALOLAN_GRIMER_SPAWN_EGG = ITEMS.register("alolan_grimer_spawn_egg",
            () -> new SpawnEggItem("alolan grimer", 8, 33));
    public static final DeferredItem<Item> MUK_SPAWN_EGG = ITEMS.register("muk_spawn_egg",
            () -> new SpawnEggItem("muk", 38, 50));
    public static final DeferredItem<Item> ALOLAN_MUK_SPAWN_EGG = ITEMS.register("alolan_muk_spawn_egg",
            () -> new SpawnEggItem("alolan muk", 38, 50));
    public static final DeferredItem<Item> SHELLDER_SPAWN_EGG = ITEMS.register("shellder_spawn_egg",
            () -> new SpawnEggItem("shellder", 6, 31));
    public static final DeferredItem<Item> CLOYSTER_SPAWN_EGG = ITEMS.register("cloyster_spawn_egg",
            () -> new SpawnEggItem("cloyster", 26, 53));
    public static final DeferredItem<Item> GASTLY_SPAWN_EGG = ITEMS.register("gastly_spawn_egg",
            () -> new SpawnEggItem("gastly", 6, 31));
    public static final DeferredItem<Item> HAUNTER_SPAWN_EGG = ITEMS.register("haunter_spawn_egg",
            () -> new SpawnEggItem("haunter", 25, 41));
    public static final DeferredItem<Item> GENGAR_SPAWN_EGG = ITEMS.register("gengar_spawn_egg",
            () -> new SpawnEggItem("gengar", 36, 50));
    public static final DeferredItem<Item> ONIX_SPAWN_EGG = ITEMS.register("onix_spawn_egg",
            () -> new SpawnEggItem("onix", 14, 39));
    public static final DeferredItem<Item> DROWZEE_SPAWN_EGG = ITEMS.register("drowzee_spawn_egg",
            () -> new SpawnEggItem("drowzee", 8, 33));
    public static final DeferredItem<Item> HYPNO_SPAWN_EGG = ITEMS.register("hypno_spawn_egg",
            () -> new SpawnEggItem("hypno", 26, 48));
    public static final DeferredItem<Item> KRABBY_SPAWN_EGG = ITEMS.register("krabby_spawn_egg",
            () -> new SpawnEggItem("krabby", 8, 33));
    public static final DeferredItem<Item> KINGLER_SPAWN_EGG = ITEMS.register("kingler_spawn_egg",
            () -> new SpawnEggItem("kingler", 28, 48));
    public static final DeferredItem<Item> VOLTORB_SPAWN_EGG = ITEMS.register("voltorb_spawn_egg",
            () -> new SpawnEggItem("voltorb", 8, 33));
    public static final DeferredItem<Item> HISUIAN_VOLTORB_SPAWN_EGG = ITEMS.register("hisuian_voltorb_spawn_egg",
            () -> new SpawnEggItem("hisuian voltorb", 8, 33));
    public static final DeferredItem<Item> ELECTRODE_SPAWN_EGG = ITEMS.register("electrode_spawn_egg",
            () -> new SpawnEggItem("electrode", 30, 49));
    public static final DeferredItem<Item> HISUIAN_ELECTRODE_SPAWN_EGG = ITEMS.register("hisuian_electrode_spawn_egg",
            () -> new SpawnEggItem("hisuian electrode", 30, 49));
    public static final DeferredItem<Item> EXEGGCUTE_SPAWN_EGG = ITEMS.register("exeggcute_spawn_egg",
            () -> new SpawnEggItem("exeggcute", 8, 33));
    public static final DeferredItem<Item> EXEGGUTOR_SPAWN_EGG = ITEMS.register("exeggutor_spawn_egg",
            () -> new SpawnEggItem("exeggutor", 28, 53));
    public static final DeferredItem<Item> ALOLAN_EXEGGUTOR_SPAWN_EGG = ITEMS.register("alolan_exeggutor_spawn_egg",
            () -> new SpawnEggItem("alolan exeggutor", 28, 53));
    public static final DeferredItem<Item> CUBONE_SPAWN_EGG = ITEMS.register("cubone_spawn_egg",
            () -> new SpawnEggItem("cubone", 7, 32));
    public static final DeferredItem<Item> MAROWAK_SPAWN_EGG = ITEMS.register("marowak_spawn_egg",
            () -> new SpawnEggItem("marowak", 28, 43));
    public static final DeferredItem<Item> ALOLAN_MAROWAK_SPAWN_EGG = ITEMS.register("alolan_marowak_spawn_egg",
            () -> new SpawnEggItem("alolan marowak", 28, 43));
    public static final DeferredItem<Item> HITMONLEE_SPAWN_EGG = ITEMS.register("hitmonlee_spawn_egg",
            () -> new SpawnEggItem("hitmonlee", 20, 46));
    public static final DeferredItem<Item> HITMONCHAN_SPAWN_EGG = ITEMS.register("hitmonchan_spawn_egg",
            () -> new SpawnEggItem("hitmonchan", 20, 46));
    public static final DeferredItem<Item> LICKITUNG_SPAWN_EGG = ITEMS.register("lickitung_spawn_egg",
            () -> new SpawnEggItem("lickitung", 14, 39));
    public static final DeferredItem<Item> KOFFING_SPAWN_EGG = ITEMS.register("koffing_spawn_egg",
            () -> new SpawnEggItem("koffing", 9, 34));
    public static final DeferredItem<Item> WEEZING_SPAWN_EGG = ITEMS.register("weezing_spawn_egg",
            () -> new SpawnEggItem("weezing", 35, 49));
    public static final DeferredItem<Item> GALARIAN_WEEZING_SPAWN_EGG = ITEMS.register("galarian_weezing_spawn_egg",
            () -> new SpawnEggItem("galarian weezing", 35, 49));
    public static final DeferredItem<Item> RHYHORN_SPAWN_EGG = ITEMS.register("rhyhorn_spawn_egg",
            () -> new SpawnEggItem("rhyhorn", 10, 35));
    public static final DeferredItem<Item> RHYDON_SPAWN_EGG = ITEMS.register("rhydon_spawn_egg",
            () -> new SpawnEggItem("rhydon", 42, 49));
    public static final DeferredItem<Item> CHANSEY_SPAWN_EGG = ITEMS.register("chansey_spawn_egg",
            () -> new SpawnEggItem("chansey", 17, 45));
    public static final DeferredItem<Item> TANGELA_SPAWN_EGG = ITEMS.register("tangela_spawn_egg",
            () -> new SpawnEggItem("tangela", 19, 44));
    public static final DeferredItem<Item> KANGASKHAN_SPAWN_EGG = ITEMS.register("kangaskhan_spawn_egg",
            () -> new SpawnEggItem("kangaskhan", 24, 49));
    public static final DeferredItem<Item> HORSEA_SPAWN_EGG = ITEMS.register("horsea_spawn_egg",
            () -> new SpawnEggItem("horsea", 5, 30));
    public static final DeferredItem<Item> SEADRA_SPAWN_EGG = ITEMS.register("seadra_spawn_egg",
            () -> new SpawnEggItem("seadra", 32, 44));
    public static final DeferredItem<Item> GOLDEEN_SPAWN_EGG = ITEMS.register("goldeen_spawn_egg",
            () -> new SpawnEggItem("goldeen", 7, 32));
    public static final DeferredItem<Item> SEAKING_SPAWN_EGG = ITEMS.register("seaking_spawn_egg",
            () -> new SpawnEggItem("seaking", 33, 45));
    public static final DeferredItem<Item> STARYU_SPAWN_EGG = ITEMS.register("staryu_spawn_egg",
            () -> new SpawnEggItem("staryu", 9, 34));
    public static final DeferredItem<Item> STARMIE_SPAWN_EGG = ITEMS.register("starmie_spawn_egg",
            () -> new SpawnEggItem("starmie", 29, 52));
    public static final DeferredItem<Item> MRMIME_SPAWN_EGG = ITEMS.register("mrmime_spawn_egg",
            () -> new SpawnEggItem("mr.mime", 26, 46));
    public static final DeferredItem<Item> GALARIAN_MRMIME_SPAWN_EGG = ITEMS.register("galarian_mrmime_spawn_egg",
            () -> new SpawnEggItem("galarian mr.mime", 26, 46));
    public static final DeferredItem<Item> SCYTHER_SPAWN_EGG = ITEMS.register("scyther_spawn_egg",
            () -> new SpawnEggItem("scyther", 25, 50));
    public static final DeferredItem<Item> JYNX_SPAWN_EGG = ITEMS.register("jynx_spawn_egg",
            () -> new SpawnEggItem("jynx", 30, 46));
    public static final DeferredItem<Item> ELECTABUZZ_SPAWN_EGG = ITEMS.register("electabuzz_spawn_egg",
            () -> new SpawnEggItem("electabuzz", 30, 50));
    public static final DeferredItem<Item> MAGMAR_SPAWN_EGG = ITEMS.register("magmar_spawn_egg",
            () -> new SpawnEggItem("magmar", 30, 50));
    public static final DeferredItem<Item> PINSIR_SPAWN_EGG = ITEMS.register("pinsir_spawn_egg",
            () -> new SpawnEggItem("pinsir", 25, 50));
    public static final DeferredItem<Item> TAUROS_SPAWN_EGG = ITEMS.register("tauros_spawn_egg",
            () -> new SpawnEggItem("tauros", 24, 49));
    public static final DeferredItem<Item> MAGIKARP_SPAWN_EGG = ITEMS.register("magikarp_spawn_egg",
            () -> new SpawnEggItem("magikarp", 1, 20));
    public static final DeferredItem<Item> GYARADOS_SPAWN_EGG = ITEMS.register("gyarados_spawn_egg",
            () -> new SpawnEggItem("gyarados", 20, 54));
    public static final DeferredItem<Item> LAPRAS_SPAWN_EGG = ITEMS.register("lapras_spawn_egg",
            () -> new SpawnEggItem("lapras", 29, 54));
    public static final DeferredItem<Item> DITTO_SPAWN_EGG = ITEMS.register("ditto_spawn_egg",
            () -> new SpawnEggItem("ditto", 4, 29));
    public static final DeferredItem<Item> EEVEE_SPAWN_EGG = ITEMS.register("eevee_spawn_egg",
            () -> new SpawnEggItem("eevee", 5, 33));
    public static final DeferredItem<Item> VAPOREON_SPAWN_EGG = ITEMS.register("vaporeon_spawn_egg",
            () -> new SpawnEggItem("vaporeon", 28, 53));
    public static final DeferredItem<Item> JOLTEON_SPAWN_EGG = ITEMS.register("jolteon_spawn_egg",
            () -> new SpawnEggItem("jolteon", 28, 53));
    public static final DeferredItem<Item> FLAREON_SPAWN_EGG = ITEMS.register("flareon_spawn_egg",
            () -> new SpawnEggItem("flareon", 28, 53));
    public static final DeferredItem<Item> PORYGON_SPAWN_EGG = ITEMS.register("porygon_spawn_egg",
            () -> new SpawnEggItem("porygon", 15, 40));
    public static final DeferredItem<Item> OMANYTE_SPAWN_EGG = ITEMS.register("omanyte_spawn_egg",
            () -> new SpawnEggItem("omanyte", 11, 36));
    public static final DeferredItem<Item> OMASTAR_SPAWN_EGG = ITEMS.register("omastar_spawn_egg",
            () -> new SpawnEggItem("omastar", 40, 50));
    public static final DeferredItem<Item> KABUTO_SPAWN_EGG = ITEMS.register("kabuto_spawn_egg",
            () -> new SpawnEggItem("kabuto", 11, 36));
    public static final DeferredItem<Item> KABUTOPS_SPAWN_EGG = ITEMS.register("kabutops_spawn_egg",
            () -> new SpawnEggItem("kabutops", 40, 50));
    public static final DeferredItem<Item> AERODACTYL_SPAWN_EGG = ITEMS.register("aerodactyl_spawn_egg",
            () -> new SpawnEggItem("aerodactyl", 27, 52));
    public static final DeferredItem<Item> SNORLAX_SPAWN_EGG = ITEMS.register("snorlax_spawn_egg",
            () -> new SpawnEggItem("snorlax", 34, 54));
    public static final DeferredItem<Item> DRATINI_SPAWN_EGG = ITEMS.register("dratini_spawn_egg",
            () -> new SpawnEggItem("dratini", 5, 30));
    public static final DeferredItem<Item> DRAGONAIR_SPAWN_EGG = ITEMS.register("dragonair_spawn_egg",
            () -> new SpawnEggItem("dragonair", 30, 42));
    public static final DeferredItem<Item> DRAGONITE_SPAWN_EGG = ITEMS.register("dragonite_spawn_egg",
            () -> new SpawnEggItem("dragonite", 55, 60));
    public static final DeferredItem<Item> CHIKORITA_SPAWN_EGG = ITEMS.register("chikorita_spawn_egg",
            () -> new SpawnEggItem("chikorita", 5, 32));
    public static final DeferredItem<Item> BAYLEEF_SPAWN_EGG = ITEMS.register("bayleef_spawn_egg",
            () -> new SpawnEggItem("bayleef", 16, 41));
    public static final DeferredItem<Item> MEGANIUM_SPAWN_EGG = ITEMS.register("meganium_spawn_egg",
            () -> new SpawnEggItem("meganium", 32, 53));
    public static final DeferredItem<Item> CYNDAQUIL_SPAWN_EGG = ITEMS.register("cyndaquil_spawn_egg",
            () -> new SpawnEggItem("cyndaquil", 5, 31));
    public static final DeferredItem<Item> QUILAVA_SPAWN_EGG = ITEMS.register("quilava_spawn_egg",
            () -> new SpawnEggItem("quilava", 17, 41));
    public static final DeferredItem<Item> TYPHLOSION_SPAWN_EGG = ITEMS.register("typhlosion_spawn_egg",
            () -> new SpawnEggItem("typhlosion", 36, 53));
    public static final DeferredItem<Item> HISUIAN_TYPHLOSION_SPAWN_EGG = ITEMS.register("hisuian_typhlosion_spawn_egg",
            () -> new SpawnEggItem("hisuian typhlosion", 36, 53));
    public static final DeferredItem<Item> TOTODILE_SPAWN_EGG = ITEMS.register("totodile_spawn_egg",
            () -> new SpawnEggItem("totodile", 5, 31));
    public static final DeferredItem<Item> CROCONAW_SPAWN_EGG = ITEMS.register("croconaw_spawn_egg",
            () -> new SpawnEggItem("croconaw", 18, 41));
    public static final DeferredItem<Item> FERALIGATR_SPAWN_EGG = ITEMS.register("feraligatr_spawn_egg",
            () -> new SpawnEggItem("feraligatr", 30, 53));
    public static final DeferredItem<Item> SENTRET_SPAWN_EGG = ITEMS.register("sentret_spawn_egg",
            () -> new SpawnEggItem("sentret", 1, 22));
    public static final DeferredItem<Item> FURRET_SPAWN_EGG = ITEMS.register("furret_spawn_egg",
            () -> new SpawnEggItem("furret", 15, 42));
    public static final DeferredItem<Item> HOOTHOOT_SPAWN_EGG = ITEMS.register("hoothoot_spawn_egg",
            () -> new SpawnEggItem("hoothoot", 1, 26));
    public static final DeferredItem<Item> NOCTOWL_SPAWN_EGG = ITEMS.register("noctowl_spawn_egg",
            () -> new SpawnEggItem("noctowl", 20, 45));
    public static final DeferredItem<Item> LEDYBA_SPAWN_EGG = ITEMS.register("ledyba_spawn_egg",
            () -> new SpawnEggItem("ledyba", 2, 27));
    public static final DeferredItem<Item> LEDIAN_SPAWN_EGG = ITEMS.register("ledian_spawn_egg",
            () -> new SpawnEggItem("ledian", 18, 39));
    public static final DeferredItem<Item> SPINARAK_SPAWN_EGG = ITEMS.register("spinarak_spawn_egg",
            () -> new SpawnEggItem("spinarak", 1, 25));
    public static final DeferredItem<Item> ARIADOS_SPAWN_EGG = ITEMS.register("ariados_spawn_egg",
            () -> new SpawnEggItem("ariados", 22, 40));
    public static final DeferredItem<Item> CROBAT_SPAWN_EGG = ITEMS.register("crobat_spawn_egg",
            () -> new SpawnEggItem("crobat", 41, 54));
    public static final DeferredItem<Item> CHINCHOU_SPAWN_EGG = ITEMS.register("chinchou_spawn_egg",
            () -> new SpawnEggItem("chinchou", 8, 33));
    public static final DeferredItem<Item> LANTURN_SPAWN_EGG = ITEMS.register("lanturn_spawn_egg",
            () -> new SpawnEggItem("lanturn", 27, 46));
    public static final DeferredItem<Item> PICHU_SPAWN_EGG = ITEMS.register("pichu_spawn_egg",
            () -> new SpawnEggItem("pichu", 1, 21));
    public static final DeferredItem<Item> CLEFFA_SPAWN_EGG = ITEMS.register("cleffa_spawn_egg",
            () -> new SpawnEggItem("cleffa", 1, 22));
    public static final DeferredItem<Item> IGGLYBUFF_SPAWN_EGG = ITEMS.register("igglybuff_spawn_egg",
            () -> new SpawnEggItem("igglybuff", 1, 21));
    public static final DeferredItem<Item> TOGEPI_SPAWN_EGG = ITEMS.register("togepi_spawn_egg",
            () -> new SpawnEggItem("togepi", 1, 25));
    public static final DeferredItem<Item> TOGETIC_SPAWN_EGG = ITEMS.register("togetic_spawn_egg",
            () -> new SpawnEggItem("togetic", 20, 41));
    public static final DeferredItem<Item> NATU_SPAWN_EGG = ITEMS.register("natu_spawn_egg",
            () -> new SpawnEggItem("natu", 7, 32));
    public static final DeferredItem<Item> XATU_SPAWN_EGG = ITEMS.register("xatu_spawn_egg",
            () -> new SpawnEggItem("xatu", 25, 47));
    public static final DeferredItem<Item> MAREEP_SPAWN_EGG = ITEMS.register("mareep_spawn_egg",
            () -> new SpawnEggItem("mareep", 3, 28));
    public static final DeferredItem<Item> FLAAFFY_SPAWN_EGG = ITEMS.register("flaaffy_spawn_egg",
            () -> new SpawnEggItem("flaaffy", 15, 37));
    public static final DeferredItem<Item> AMPHAROS_SPAWN_EGG = ITEMS.register("ampharos_spawn_egg",
            () -> new SpawnEggItem("ampharos", 30, 51));
    public static final DeferredItem<Item> BELLOSSOM_SPAWN_EGG = ITEMS.register("bellossom_spawn_egg",
            () -> new SpawnEggItem("bellossom", 35, 49));
    public static final DeferredItem<Item> VALENCIAN_BELLOSSOM_SPAWN_EGG = ITEMS.register("valencian_bellossom_spawn_egg",
            () -> new SpawnEggItem("valencian bellossom", 35, 49));
    public static final DeferredItem<Item> MARILL_SPAWN_EGG = ITEMS.register("marill_spawn_egg",
            () -> new SpawnEggItem("marill", 14, 25));
    public static final DeferredItem<Item> AZUMARILL_SPAWN_EGG = ITEMS.register("azumarill_spawn_egg",
            () -> new SpawnEggItem("azumarill", 18, 42));
    public static final DeferredItem<Item> SUDOWOODO_SPAWN_EGG = ITEMS.register("sudowoodo_spawn_egg",
            () -> new SpawnEggItem("sudowoodo", 16, 41));
    public static final DeferredItem<Item> POLITOED_SPAWN_EGG = ITEMS.register("politoed_spawn_egg",
            () -> new SpawnEggItem("politoed", 34, 50));
    public static final DeferredItem<Item> HOPPIP_SPAWN_EGG = ITEMS.register("hoppip_spawn_egg",
            () -> new SpawnEggItem("hoppip", 1, 25));
    public static final DeferredItem<Item> SKIPLOOM_SPAWN_EGG = ITEMS.register("skiploom_spawn_egg",
            () -> new SpawnEggItem("skiploom", 18, 34));
    public static final DeferredItem<Item> JUMPLUFF_SPAWN_EGG = ITEMS.register("jumpluff_spawn_egg",
            () -> new SpawnEggItem("jumpluff", 27, 46));
    public static final DeferredItem<Item> AIPOM_SPAWN_EGG = ITEMS.register("aipom_spawn_egg",
            () -> new SpawnEggItem("aipom", 11, 36));
    public static final DeferredItem<Item> SUNKERN_SPAWN_EGG = ITEMS.register("sunkern_spawn_egg",
            () -> new SpawnEggItem("sunkern", 1, 18));
    public static final DeferredItem<Item> SUNFLORA_SPAWN_EGG = ITEMS.register("sunflora_spawn_egg",
            () -> new SpawnEggItem("sunflora", 13, 43));
    public static final DeferredItem<Item> YANMA_SPAWN_EGG = ITEMS.register("yanma_spawn_egg",
            () -> new SpawnEggItem("yanma", 14, 39));
    public static final DeferredItem<Item> WOOPER_SPAWN_EGG = ITEMS.register("wooper_spawn_egg",
            () -> new SpawnEggItem("wooper", 1, 21));
    public static final DeferredItem<Item> PALDEAN_WOOPER_SPAWN_EGG = ITEMS.register("paldean_wooper_spawn_egg",
            () -> new SpawnEggItem("paldean wooper", 1, 21));
    public static final DeferredItem<Item> QUAGSIRE_SPAWN_EGG = ITEMS.register("quagsire_spawn_egg",
            () -> new SpawnEggItem("quagsire", 20, 43));
    public static final DeferredItem<Item> ESPEON_SPAWN_EGG = ITEMS.register("espeon_spawn_egg",
            () -> new SpawnEggItem("espeon", 28, 53));
    public static final DeferredItem<Item> UMBREON_SPAWN_EGG = ITEMS.register("umbreon_spawn_egg",
            () -> new SpawnEggItem("umbreon", 28, 53));
    public static final DeferredItem<Item> MURKROW_SPAWN_EGG = ITEMS.register("murkrow_spawn_egg",
            () -> new SpawnEggItem("murkrow", 16, 41));
    public static final DeferredItem<Item> SLOWKING_SPAWN_EGG = ITEMS.register("slowking_spawn_egg",
            () -> new SpawnEggItem("slowking", 37, 49));
    public static final DeferredItem<Item> GALARIAN_SLOWKING_SPAWN_EGG = ITEMS.register("galarian_slowking_spawn_egg",
            () -> new SpawnEggItem("galarian slowking", 37, 49));
    public static final DeferredItem<Item> MISDREAVUS_SPAWN_EGG = ITEMS.register("misdreavus_spawn_egg",
            () -> new SpawnEggItem("misdreavus", 19, 44));
    public static final DeferredItem<Item> UNOWN_SPAWN_EGG = ITEMS.register("unown_spawn_egg",
            () -> new SpawnEggItem("unown", 1, 100));
    public static final DeferredItem<Item> WOBBUFFET_SPAWN_EGG = ITEMS.register("wobbuffet_spawn_egg",
            () -> new SpawnEggItem("wobbuffet", 15, 41));
    public static final DeferredItem<Item> GIRAFARIG_SPAWN_EGG = ITEMS.register("girafarig_spawn_egg",
            () -> new SpawnEggItem("girafarig", 21, 46));
    public static final DeferredItem<Item> PINECO_SPAWN_EGG = ITEMS.register("pineco_spawn_egg",
            () -> new SpawnEggItem("pineco", 4, 29));
    public static final DeferredItem<Item> FORRETRESS_SPAWN_EGG = ITEMS.register("forretress_spawn_egg",
            () -> new SpawnEggItem("forretress", 31, 47));
    public static final DeferredItem<Item> DUNSPARCE_SPAWN_EGG = ITEMS.register("dunsparce_spawn_egg",
            () -> new SpawnEggItem("dunsparce", 17, 42));
    public static final DeferredItem<Item> GLIGAR_SPAWN_EGG = ITEMS.register("gligar_spawn_egg",
            () -> new SpawnEggItem("gligar", 18, 43));
    public static final DeferredItem<Item> STEELIX_SPAWN_EGG = ITEMS.register("steelix_spawn_egg",
            () -> new SpawnEggItem("steelix", 34, 51));
    public static final DeferredItem<Item> SNUBBULL_SPAWN_EGG = ITEMS.register("snubbull_spawn_egg",
            () -> new SpawnEggItem("snubbull", 5, 30));
    public static final DeferredItem<Item> GRANBULL_SPAWN_EGG = ITEMS.register("granbull_spawn_egg",
            () -> new SpawnEggItem("granbull", 23, 45));
    public static final DeferredItem<Item> QWILFISH_SPAWN_EGG = ITEMS.register("qwilfish_spawn_egg",
            () -> new SpawnEggItem("qwilfish", 19, 44));
    public static final DeferredItem<Item> HISUIAN_QWILFISH_SPAWN_EGG = ITEMS.register("hisuian_qwilfish_spawn_egg",
            () -> new SpawnEggItem("hisuian qwilfish", 19, 44));
    public static final DeferredItem<Item> SCIZOR_SPAWN_EGG = ITEMS.register("scizor_spawn_egg",
            () -> new SpawnEggItem("scizor", 45, 50));
    public static final DeferredItem<Item> SHUCKLE_SPAWN_EGG = ITEMS.register("shuckle_spawn_egg",
            () -> new SpawnEggItem("shuckle", 16, 51));
    public static final DeferredItem<Item> HERACROSS_SPAWN_EGG = ITEMS.register("heracross_spawn_egg",
            () -> new SpawnEggItem("heracross", 25, 50));
    public static final DeferredItem<Item> SNEASEL_SPAWN_EGG = ITEMS.register("sneasel_spawn_egg",
            () -> new SpawnEggItem("sneasel", 18, 43));
    public static final DeferredItem<Item> HISUIAN_SNEASEL_SPAWN_EGG = ITEMS.register("hisuian_sneasel_spawn_egg",
            () -> new SpawnEggItem("hisuian sneasel", 18, 43));
    public static final DeferredItem<Item> TEDDIURSA_SPAWN_EGG = ITEMS.register("teddiursa_spawn_egg",
            () -> new SpawnEggItem("teddiursa", 8, 33));
    public static final DeferredItem<Item> URSARING_SPAWN_EGG = ITEMS.register("ursaring_spawn_egg",
            () -> new SpawnEggItem("ursaring", 30, 50));
    public static final DeferredItem<Item> SLUGMA_SPAWN_EGG = ITEMS.register("slugma_spawn_egg",
            () -> new SpawnEggItem("slugma", 1, 25));
    public static final DeferredItem<Item> MAGCARGO_SPAWN_EGG = ITEMS.register("magcargo_spawn_egg",
            () -> new SpawnEggItem("magcargo", 38, 43));
    public static final DeferredItem<Item> SWINUB_SPAWN_EGG = ITEMS.register("swinub_spawn_egg",
            () -> new SpawnEggItem("swinub", 1, 25));
    public static final DeferredItem<Item> PILOSWINE_SPAWN_EGG = ITEMS.register("piloswine_spawn_egg",
            () -> new SpawnEggItem("piloswine", 33, 45));
    public static final DeferredItem<Item> CORSOLA_SPAWN_EGG = ITEMS.register("corsola_spawn_egg",
            () -> new SpawnEggItem("corsola", 16, 41));
    public static final DeferredItem<Item> GALARIAN_CORSOLA_SPAWN_EGG = ITEMS.register("galarian_corsola_spawn_egg",
            () -> new SpawnEggItem("galarian corsola", 16, 41));
    public static final DeferredItem<Item> REMORAID_SPAWN_EGG = ITEMS.register("remoraid_spawn_egg",
            () -> new SpawnEggItem("remoraid", 5, 30));
    public static final DeferredItem<Item> OCTILLERY_SPAWN_EGG = ITEMS.register("octillery_spawn_egg",
            () -> new SpawnEggItem("octillery", 25, 48));
    public static final DeferredItem<Item> DELIBIRD_SPAWN_EGG = ITEMS.register("delibird_spawn_egg",
            () -> new SpawnEggItem("delibird", 8, 33));
    public static final DeferredItem<Item> MANTINE_SPAWN_EGG = ITEMS.register("mantine_spawn_egg",
            () -> new SpawnEggItem("mantine", 30, 49));
    public static final DeferredItem<Item> SKARMORY_SPAWN_EGG = ITEMS.register("skarmory_spawn_egg",
            () -> new SpawnEggItem("skarmory", 22, 47));
    public static final DeferredItem<Item> HOUNDOUR_SPAWN_EGG = ITEMS.register("houndour_spawn_egg",
            () -> new SpawnEggItem("houndour", 8, 33));
    public static final DeferredItem<Item> HOUNDOOM_SPAWN_EGG = ITEMS.register("houndoom_spawn_egg",
            () -> new SpawnEggItem("houndoom", 24, 50));
    public static final DeferredItem<Item> KINGDRA_SPAWN_EGG = ITEMS.register("kingdra_spawn_egg",
            () -> new SpawnEggItem("kingdra", 39, 54));
    public static final DeferredItem<Item> PHANPY_SPAWN_EGG = ITEMS.register("phanpy_spawn_egg",
            () -> new SpawnEggItem("phanpy", 8, 33));
    public static final DeferredItem<Item> DONPHAN_SPAWN_EGG = ITEMS.register("donphan_spawn_egg",
            () -> new SpawnEggItem("donphan", 25, 50));
    public static final DeferredItem<Item> PORYGON2_SPAWN_EGG = ITEMS.register("porygon2_spawn_egg",
            () -> new SpawnEggItem("porygon2", 35, 52));
    public static final DeferredItem<Item> STANTLER_SPAWN_EGG = ITEMS.register("stantler_spawn_egg",
            () -> new SpawnEggItem("stantler", 22, 47));
    public static final DeferredItem<Item> SMEARGLE_SPAWN_EGG = ITEMS.register("smeargle_spawn_egg",
            () -> new SpawnEggItem("smeargle", 1, 25));
    public static final DeferredItem<Item> TYROGUE_SPAWN_EGG = ITEMS.register("tyrogue_spawn_egg",
            () -> new SpawnEggItem("tyrogue", 1, 21));
    public static final DeferredItem<Item> HITMONTOP_SPAWN_EGG = ITEMS.register("hitmontop_spawn_egg",
            () -> new SpawnEggItem("hitmontop", 20, 46));
    public static final DeferredItem<Item> SMOOCHUM_SPAWN_EGG = ITEMS.register("smoochum_spawn_egg",
            () -> new SpawnEggItem("smoochum", 6, 31));
    public static final DeferredItem<Item> ELEKID_SPAWN_EGG = ITEMS.register("elekid_spawn_egg",
            () -> new SpawnEggItem("elekid", 11, 36));
    public static final DeferredItem<Item> MAGBY_SPAWN_EGG = ITEMS.register("magby_spawn_egg",
            () -> new SpawnEggItem("magby", 11, 36));
    public static final DeferredItem<Item> MILTANK_SPAWN_EGG = ITEMS.register("miltank_spawn_egg",
            () -> new SpawnEggItem("miltank", 24, 49));
    public static final DeferredItem<Item> BLISSEY_SPAWN_EGG = ITEMS.register("blissey_spawn_egg",
            () -> new SpawnEggItem("blissey", 40, 54));
    public static final DeferredItem<Item> LARVITAR_SPAWN_EGG = ITEMS.register("larvitar_spawn_egg",
            () -> new SpawnEggItem("larvitar", 5, 30));
    public static final DeferredItem<Item> PUPITAR_SPAWN_EGG = ITEMS.register("pupitar_spawn_egg",
            () -> new SpawnEggItem("pupitar", 30, 54));
    public static final DeferredItem<Item> TYRANITAR_SPAWN_EGG = ITEMS.register("tyranitar_spawn_egg",
            () -> new SpawnEggItem("tyranitar", 55, 60));
    public static final DeferredItem<Item> TREECKO_SPAWN_EGG = ITEMS.register("treecko_spawn_egg",
            () -> new SpawnEggItem("treecko", 5, 31));
    public static final DeferredItem<Item> GROVYLE_SPAWN_EGG = ITEMS.register("grovyle_spawn_egg",
            () -> new SpawnEggItem("grovyle", 16, 41));
    public static final DeferredItem<Item> SCEPTILE_SPAWN_EGG = ITEMS.register("sceptile_spawn_egg",
            () -> new SpawnEggItem("sceptile", 36, 53));
    public static final DeferredItem<Item> TORCHIC_SPAWN_EGG = ITEMS.register("torchic_spawn_egg",
            () -> new SpawnEggItem("torchic", 5, 31));
    public static final DeferredItem<Item> COMBUSKEN_SPAWN_EGG = ITEMS.register("combusken_spawn_egg",
            () -> new SpawnEggItem("combusken", 16, 41));
    public static final DeferredItem<Item> BLAZIKEN_SPAWN_EGG = ITEMS.register("blaziken_spawn_egg",
            () -> new SpawnEggItem("blaziken", 36, 53));
    public static final DeferredItem<Item> MUDKIP_SPAWN_EGG = ITEMS.register("mudkip_spawn_egg",
            () -> new SpawnEggItem("mudkip", 5, 31));
    public static final DeferredItem<Item> MARSHTOMP_SPAWN_EGG = ITEMS.register("marshtomp_spawn_egg",
            () -> new SpawnEggItem("marshtomp", 16, 41));
    public static final DeferredItem<Item> SWAMPERT_SPAWN_EGG = ITEMS.register("swampert_spawn_egg",
            () -> new SpawnEggItem("swampert", 36, 53));
    public static final DeferredItem<Item> POOCHYENA_SPAWN_EGG = ITEMS.register("poochyena_spawn_egg",
            () -> new SpawnEggItem("poochyena", 1, 22));
    public static final DeferredItem<Item> MIGHTYENA_SPAWN_EGG = ITEMS.register("mightyena_spawn_egg",
            () -> new SpawnEggItem("mightyena", 18, 42));
    public static final DeferredItem<Item> ZIGZAGOON_SPAWN_EGG = ITEMS.register("zigzagoon_spawn_egg",
            () -> new SpawnEggItem("zigzagoon", 1, 24));
    public static final DeferredItem<Item> GALARIAN_ZIGZAGOON_SPAWN_EGG = ITEMS.register("galarian_zigzagoon_spawn_egg",
            () -> new SpawnEggItem("galarian zigzagoon", 1, 24));
    public static final DeferredItem<Item> LINOONE_SPAWN_EGG = ITEMS.register("linoone_spawn_egg",
            () -> new SpawnEggItem("linoone", 20, 42));
    public static final DeferredItem<Item> GALARIAN_LINOONE_SPAWN_EGG = ITEMS.register("galarian_linoone_spawn_egg",
            () -> new SpawnEggItem("galarian linoone", 20, 42));
    public static final DeferredItem<Item> LOTAD_SPAWN_EGG = ITEMS.register("lotad_spawn_egg",
            () -> new SpawnEggItem("lotad", 1, 22));
    public static final DeferredItem<Item> LOMBRE_SPAWN_EGG = ITEMS.register("lombre_spawn_egg",
            () -> new SpawnEggItem("lombre", 14, 34));
    public static final DeferredItem<Item> LUDICOLO_SPAWN_EGG = ITEMS.register("ludicolo_spawn_egg",
            () -> new SpawnEggItem("ludicolo", 29, 48));
    public static final DeferredItem<Item> SEEDOT_SPAWN_EGG = ITEMS.register("seedot_spawn_egg",
            () -> new SpawnEggItem("seedot", 1, 22));
    public static final DeferredItem<Item> NUZLEAF_SPAWN_EGG = ITEMS.register("nuzleaf_spawn_egg",
            () -> new SpawnEggItem("nuzleaf", 14, 34));
    public static final DeferredItem<Item> SHIFTRY_SPAWN_EGG = ITEMS.register("shiftry_spawn_egg",
            () -> new SpawnEggItem("shiftry", 29, 48));
    public static final DeferredItem<Item> TAILLOW_SPAWN_EGG = ITEMS.register("taillow_spawn_egg",
            () -> new SpawnEggItem("taillow", 2, 27));
    public static final DeferredItem<Item> SWELLOW_SPAWN_EGG = ITEMS.register("swellow_spawn_egg",
            () -> new SpawnEggItem("swellow", 22, 46));
    public static final DeferredItem<Item> WINGULL_SPAWN_EGG = ITEMS.register("wingull_spawn_egg",
            () -> new SpawnEggItem("wingull", 2, 27));
    public static final DeferredItem<Item> PELIPPER_SPAWN_EGG = ITEMS.register("pelipper_spawn_egg",
            () -> new SpawnEggItem("pelipper", 25, 44));
    public static final DeferredItem<Item> RALTS_SPAWN_EGG = ITEMS.register("ralts_spawn_egg",
            () -> new SpawnEggItem("ralts", 1, 20));
    public static final DeferredItem<Item> KIRLIA_SPAWN_EGG = ITEMS.register("kirlia_spawn_egg",
            () -> new SpawnEggItem("kirlia", 20, 29));
    public static final DeferredItem<Item> GARDEVOIR_SPAWN_EGG = ITEMS.register("gardevoir_spawn_egg",
            () -> new SpawnEggItem("gardevoir", 30, 52));
    public static final DeferredItem<Item> SURSKIT_SPAWN_EGG = ITEMS.register("surskit_spawn_egg",
            () -> new SpawnEggItem("surskit", 2, 27));
    public static final DeferredItem<Item> MASQUERAIN_SPAWN_EGG = ITEMS.register("masquerain_spawn_egg",
            () -> new SpawnEggItem("masquerain", 22, 45));
    public static final DeferredItem<Item> SHROOMISH_SPAWN_EGG = ITEMS.register("shroomish_spawn_egg",
            () -> new SpawnEggItem("shroomish", 5, 30));
    public static final DeferredItem<Item> BRELOOM_SPAWN_EGG = ITEMS.register("breloom_spawn_egg",
            () -> new SpawnEggItem("breloom", 23, 46));
    public static final DeferredItem<Item> SLAKOTH_SPAWN_EGG = ITEMS.register("slakoth_spawn_egg",
            () -> new SpawnEggItem("slakoth", 3, 28));
    public static final DeferredItem<Item> VIGOROTH_SPAWN_EGG = ITEMS.register("vigoroth_spawn_egg",
            () -> new SpawnEggItem("vigoroth", 18, 44));
    public static final DeferredItem<Item> SLAKING_SPAWN_EGG = ITEMS.register("slaking_spawn_egg",
            () -> new SpawnEggItem("slaking", 36, 67));
    public static final DeferredItem<Item> NINCADA_SPAWN_EGG = ITEMS.register("nincada_spawn_egg",
            () -> new SpawnEggItem("nincada", 2, 27));
    public static final DeferredItem<Item> NINJASK_SPAWN_EGG = ITEMS.register("ninjask_spawn_egg",
            () -> new SpawnEggItem("ninjask", 20, 46));
    public static final DeferredItem<Item> SHEDINJA_SPAWN_EGG = ITEMS.register("shedinja_spawn_egg",
            () -> new SpawnEggItem("shedinja", 20, 24));
    public static final DeferredItem<Item> WHISMUR_SPAWN_EGG = ITEMS.register("whismur_spawn_egg",
            () -> new SpawnEggItem("whismur", 1, 24));
    public static final DeferredItem<Item> LOUDRED_SPAWN_EGG = ITEMS.register("loudred_spawn_egg",
            () -> new SpawnEggItem("loudred", 20, 39));
    public static final DeferredItem<Item> EXPLOUD_SPAWN_EGG = ITEMS.register("exploud_spawn_egg",
            () -> new SpawnEggItem("exploud", 40, 49));
    public static final DeferredItem<Item> MAKUHITA_SPAWN_EGG = ITEMS.register("makuhita_spawn_egg",
            () -> new SpawnEggItem("makuhita", 1, 24));
    public static final DeferredItem<Item> HARIYAMA_SPAWN_EGG = ITEMS.register("hariyama_spawn_egg",
            () -> new SpawnEggItem("hariyama", 24, 47));
    public static final DeferredItem<Item> AZURILL_SPAWN_EGG = ITEMS.register("azurill_spawn_egg",
            () -> new SpawnEggItem("azurill", 1, 19));
    public static final DeferredItem<Item> NOSEPASS_SPAWN_EGG = ITEMS.register("nosepass_spawn_egg",
            () -> new SpawnEggItem("nosepass", 13, 38));
    public static final DeferredItem<Item> SABLEYE_SPAWN_EGG = ITEMS.register("sableye_spawn_egg",
            () -> new SpawnEggItem("sableye", 13, 38));
    public static final DeferredItem<Item> MAWILE_SPAWN_EGG = ITEMS.register("mawile_spawn_egg",
            () -> new SpawnEggItem("mawile", 13, 38));
    public static final DeferredItem<Item> ARON_SPAWN_EGG = ITEMS.register("aron_spawn_egg",
            () -> new SpawnEggItem("aron", 8, 33));
    public static final DeferredItem<Item> LAIRON_SPAWN_EGG = ITEMS.register("lairon_spawn_egg",
            () -> new SpawnEggItem("lairon", 32, 43));
    public static final DeferredItem<Item> AGGRON_SPAWN_EGG = ITEMS.register("aggron_spawn_egg",
            () -> new SpawnEggItem("aggron", 42, 53));
    public static final DeferredItem<Item> MEDITITE_SPAWN_EGG = ITEMS.register("meditite_spawn_egg",
            () -> new SpawnEggItem("meditite", 3, 28));
    public static final DeferredItem<Item> MEDICHAM_SPAWN_EGG = ITEMS.register("medicham_spawn_egg",
            () -> new SpawnEggItem("medicham", 37, 41));
    public static final DeferredItem<Item> ELECTRIKE_SPAWN_EGG = ITEMS.register("electrike_spawn_egg",
            () -> new SpawnEggItem("electrike", 5, 30));
    public static final DeferredItem<Item> MANECTRIC_SPAWN_EGG = ITEMS.register("manectric_spawn_egg",
            () -> new SpawnEggItem("manectric", 26, 48));
    public static final DeferredItem<Item> PLUSLE_SPAWN_EGG = ITEMS.register("plusle_spawn_egg",
            () -> new SpawnEggItem("plusle", 16, 41));
    public static final DeferredItem<Item> MINUN_SPAWN_EGG = ITEMS.register("minun_spawn_egg",
            () -> new SpawnEggItem("minun", 16, 41));
    public static final DeferredItem<Item> VOLBEAT_SPAWN_EGG = ITEMS.register("volbeat_spawn_egg",
            () -> new SpawnEggItem("volbeat", 18, 43));
    public static final DeferredItem<Item> ILLUMISE_SPAWN_EGG = ITEMS.register("illumise_spawn_egg",
            () -> new SpawnEggItem("illumise", 18, 43));
    public static final DeferredItem<Item> ROSELIA_SPAWN_EGG = ITEMS.register("roselia_spawn_egg",
            () -> new SpawnEggItem("roselia", 23, 40));
    public static final DeferredItem<Item> CARVANHA_SPAWN_EGG = ITEMS.register("carvanha_spawn_egg",
            () -> new SpawnEggItem("carvanha", 6, 31));
    public static final DeferredItem<Item> SHARPEDO_SPAWN_EGG = ITEMS.register("sharpedo_spawn_egg",
            () -> new SpawnEggItem("sharpedo", 30, 46));
    public static final DeferredItem<Item> WAILMER_SPAWN_EGG = ITEMS.register("wailmer_spawn_egg",
            () -> new SpawnEggItem("wailmer", 15, 40));
    public static final DeferredItem<Item> WAILORD_SPAWN_EGG = ITEMS.register("wailord_spawn_egg",
            () -> new SpawnEggItem("wailord", 40, 50));
    public static final DeferredItem<Item> NUMEL_SPAWN_EGG = ITEMS.register("numel_spawn_egg",
            () -> new SpawnEggItem("numel", 6, 31));
    public static final DeferredItem<Item> CAMERUPT_SPAWN_EGG = ITEMS.register("camerupt_spawn_egg",
            () -> new SpawnEggItem("camerupt", 33, 46));
    public static final DeferredItem<Item> TORKOAL_SPAWN_EGG = ITEMS.register("torkoal_spawn_egg",
            () -> new SpawnEggItem("torkoal", 22, 47));
    public static final DeferredItem<Item> SPOINK_SPAWN_EGG = ITEMS.register("spoink_spawn_egg",
            () -> new SpawnEggItem("spoink", 8, 33));
    public static final DeferredItem<Item> GRUMPIG_SPAWN_EGG = ITEMS.register("grumpig_spawn_egg",
            () -> new SpawnEggItem("grumpig", 32, 47));
    public static final DeferredItem<Item> SPINDA_SPAWN_EGG = ITEMS.register("spinda_spawn_egg",
            () -> new SpawnEggItem("spinda", 11, 36));
    public static final DeferredItem<Item> TRAPINCH_SPAWN_EGG = ITEMS.register("trapinch_spawn_egg",
            () -> new SpawnEggItem("trapinch", 4, 29));
    public static final DeferredItem<Item> VIBRAVA_SPAWN_EGG = ITEMS.register("vibrava_spawn_egg",
            () -> new SpawnEggItem("vibrava", 35, 40));
    public static final DeferredItem<Item> FLYGON_SPAWN_EGG = ITEMS.register("flygon_spawn_egg",
            () -> new SpawnEggItem("flygon", 45, 52));
    public static final DeferredItem<Item> CACNEA_SPAWN_EGG = ITEMS.register("cacnea_spawn_egg",
            () -> new SpawnEggItem("cacnea", 9, 34));
    public static final DeferredItem<Item> CACTURNE_SPAWN_EGG = ITEMS.register("cacturne_spawn_egg",
            () -> new SpawnEggItem("cacturne", 32, 48));
    public static final DeferredItem<Item> SWABLU_SPAWN_EGG = ITEMS.register("swablu_spawn_egg",
            () -> new SpawnEggItem("swablu", 6, 31));
    public static final DeferredItem<Item> ALTARIA_SPAWN_EGG = ITEMS.register("altaria_spawn_egg",
            () -> new SpawnEggItem("altaria", 35, 49));
    public static final DeferredItem<Item> LUNATONE_SPAWN_EGG = ITEMS.register("lunatone_spawn_egg",
            () -> new SpawnEggItem("lunatone", 21, 46));
    public static final DeferredItem<Item> SOLROCK_SPAWN_EGG = ITEMS.register("solrock_spawn_egg",
            () -> new SpawnEggItem("solrock", 21, 46));
    public static final DeferredItem<Item> BARBOACH_SPAWN_EGG = ITEMS.register("barboach_spawn_egg",
            () -> new SpawnEggItem("barboach", 4, 29));
    public static final DeferredItem<Item> WHISCASH_SPAWN_EGG = ITEMS.register("whiscash_spawn_egg",
            () -> new SpawnEggItem("whiscash", 30, 47));
    public static final DeferredItem<Item> CORPHISH_SPAWN_EGG = ITEMS.register("corphish_spawn_egg",
            () -> new SpawnEggItem("corphish", 6, 31));
    public static final DeferredItem<Item> CRAWDAUNT_SPAWN_EGG = ITEMS.register("crawdaunt_spawn_egg",
            () -> new SpawnEggItem("crawdaunt", 30, 47));
    public static final DeferredItem<Item> BALTOY_SPAWN_EGG = ITEMS.register("baltoy_spawn_egg",
            () -> new SpawnEggItem("baltoy", 5, 30));
    public static final DeferredItem<Item> CLAYDOL_SPAWN_EGG = ITEMS.register("claydol_spawn_egg",
            () -> new SpawnEggItem("claydol", 36, 50));
    public static final DeferredItem<Item> LILEEP_SPAWN_EGG = ITEMS.register("lileep_spawn_egg",
            () -> new SpawnEggItem("lileep", 11, 36));
    public static final DeferredItem<Item> CRADILY_SPAWN_EGG = ITEMS.register("cradily_spawn_egg",
            () -> new SpawnEggItem("cradily", 40, 50));
    public static final DeferredItem<Item> ANORITH_SPAWN_EGG = ITEMS.register("anorith_spawn_egg",
            () -> new SpawnEggItem("anorith", 11, 36));
    public static final DeferredItem<Item> ARMALDO_SPAWN_EGG = ITEMS.register("armaldo_spawn_egg",
            () -> new SpawnEggItem("armaldo", 40, 50));
    public static final DeferredItem<Item> FEEBAS_SPAWN_EGG = ITEMS.register("feebas_spawn_egg",
            () -> new SpawnEggItem("feebas", 1, 20));
    public static final DeferredItem<Item> MILOTIC_SPAWN_EGG = ITEMS.register("milotic_spawn_egg",
            () -> new SpawnEggItem("milotic", 15, 54));
    public static final DeferredItem<Item> KECLEON_SPAWN_EGG = ITEMS.register("kecleon_spawn_egg",
            () -> new SpawnEggItem("kecleon", 19, 44));
    public static final DeferredItem<Item> SHUPPET_SPAWN_EGG = ITEMS.register("shuppet_spawn_egg",
            () -> new SpawnEggItem("shuppet", 5, 30));
    public static final DeferredItem<Item> BANETTE_SPAWN_EGG = ITEMS.register("banette_spawn_egg",
            () -> new SpawnEggItem("banette", 37, 46));
    public static final DeferredItem<Item> DUSKULL_SPAWN_EGG = ITEMS.register("duskull_spawn_egg",
            () -> new SpawnEggItem("duskull", 5, 30));
    public static final DeferredItem<Item> DUSCLOPS_SPAWN_EGG = ITEMS.register("dusclops_spawn_egg",
            () -> new SpawnEggItem("dusclops", 37, 46));
    public static final DeferredItem<Item> TROPIUS_SPAWN_EGG = ITEMS.register("tropius_spawn_egg",
            () -> new SpawnEggItem("tropius", 21, 46));
    public static final DeferredItem<Item> CHIMECHO_SPAWN_EGG = ITEMS.register("chimecho_spawn_egg",
            () -> new SpawnEggItem("chimecho", 24, 46));
    public static final DeferredItem<Item> ABSOL_SPAWN_EGG = ITEMS.register("absol_spawn_egg",
            () -> new SpawnEggItem("absol", 22, 47));
    public static final DeferredItem<Item> WYNAUT_SPAWN_EGG = ITEMS.register("wynaut_spawn_egg",
            () -> new SpawnEggItem("wynaut", 1, 26));
    public static final DeferredItem<Item> SNORUNT_SPAWN_EGG = ITEMS.register("snorunt_spawn_egg",
            () -> new SpawnEggItem("snorunt", 5, 30));
    public static final DeferredItem<Item> GLALIE_SPAWN_EGG = ITEMS.register("glalie_spawn_egg",
            () -> new SpawnEggItem("glalie", 42, 48));
    public static final DeferredItem<Item> SPHEAL_SPAWN_EGG = ITEMS.register("spheal_spawn_egg",
            () -> new SpawnEggItem("spheal", 4, 29));
    public static final DeferredItem<Item> SEALEO_SPAWN_EGG = ITEMS.register("sealeo_spawn_egg",
            () -> new SpawnEggItem("sealeo", 32, 41));
    public static final DeferredItem<Item> WALREIN_SPAWN_EGG = ITEMS.register("walrein_spawn_egg",
            () -> new SpawnEggItem("walrein", 44, 53));
    public static final DeferredItem<Item> CLAMPERL_SPAWN_EGG = ITEMS.register("clamperl_spawn_egg",
            () -> new SpawnEggItem("clamperl", 10, 35));
    public static final DeferredItem<Item> HUNTAIL_SPAWN_EGG = ITEMS.register("huntail_spawn_egg",
            () -> new SpawnEggItem("huntail", 30, 49));
    public static final DeferredItem<Item> GOREBYSS_SPAWN_EGG = ITEMS.register("gorebyss_spawn_egg",
            () -> new SpawnEggItem("gorebyss", 30, 49));
    public static final DeferredItem<Item> RELICANTH_SPAWN_EGG = ITEMS.register("relicanth_spawn_egg",
            () -> new SpawnEggItem("relicanth", 24, 49));
    public static final DeferredItem<Item> LUVDISC_SPAWN_EGG = ITEMS.register("luvdisc_spawn_egg",
            () -> new SpawnEggItem("luvdisc", 8, 33));
    public static final DeferredItem<Item> BAGON_SPAWN_EGG = ITEMS.register("bagon_spawn_egg",
            () -> new SpawnEggItem("bagon", 5, 30));
    public static final DeferredItem<Item> SHELGON_SPAWN_EGG = ITEMS.register("shelgon_spawn_egg",
            () -> new SpawnEggItem("shelgon", 30, 42));
    public static final DeferredItem<Item> SALAMENCE_SPAWN_EGG = ITEMS.register("salamence_spawn_egg",
            () -> new SpawnEggItem("salamence", 50, 60));
    public static final DeferredItem<Item> BELDUM_SPAWN_EGG = ITEMS.register("beldum_spawn_egg",
            () -> new SpawnEggItem("beldum", 5, 30));
    public static final DeferredItem<Item> METANG_SPAWN_EGG = ITEMS.register("metang_spawn_egg",
            () -> new SpawnEggItem("metang", 20, 44));
    public static final DeferredItem<Item> METAGROSS_SPAWN_EGG = ITEMS.register("metagross_spawn_egg",
            () -> new SpawnEggItem("metagross", 45, 60));
    public static final DeferredItem<Item> TURTWIG_SPAWN_EGG = ITEMS.register("turtwig_spawn_egg",
            () -> new SpawnEggItem("turtwig", 5, 32));
    public static final DeferredItem<Item> GROTLE_SPAWN_EGG = ITEMS.register("grotle_spawn_egg",
            () -> new SpawnEggItem("grotle", 18, 41));
    public static final DeferredItem<Item> TORTERRA_SPAWN_EGG = ITEMS.register("torterra_spawn_egg",
            () -> new SpawnEggItem("torterra", 32, 53));
    public static final DeferredItem<Item> CHIMCHAR_SPAWN_EGG = ITEMS.register("chimchar_spawn_egg",
            () -> new SpawnEggItem("chimchar", 5, 31));
    public static final DeferredItem<Item> MONFERNO_SPAWN_EGG = ITEMS.register("monferno_spawn_egg",
            () -> new SpawnEggItem("monferno", 14, 41));
    public static final DeferredItem<Item> INFERNAPE_SPAWN_EGG = ITEMS.register("infernape_spawn_egg",
            () -> new SpawnEggItem("infernape", 36, 53));
    public static final DeferredItem<Item> PIPLUP_SPAWN_EGG = ITEMS.register("piplup_spawn_egg",
            () -> new SpawnEggItem("piplup", 5, 31));
    public static final DeferredItem<Item> PRINPLUP_SPAWN_EGG = ITEMS.register("prinplup_spawn_egg",
            () -> new SpawnEggItem("prinplup", 16, 41));
    public static final DeferredItem<Item> EMPOLEON_SPAWN_EGG = ITEMS.register("empoleon_spawn_egg",
            () -> new SpawnEggItem("empoleon", 36, 53));
    public static final DeferredItem<Item> STARLY_SPAWN_EGG = ITEMS.register("starly_spawn_egg",
            () -> new SpawnEggItem("starly", 1, 25));
    public static final DeferredItem<Item> STARAVIA_SPAWN_EGG = ITEMS.register("staravia_spawn_egg",
            () -> new SpawnEggItem("staravia", 14, 34));
    public static final DeferredItem<Item> STARAPTOR_SPAWN_EGG = ITEMS.register("staraptor_spawn_egg",
            () -> new SpawnEggItem("staraptor", 34, 49));
    public static final DeferredItem<Item> BIDOOF_SPAWN_EGG = ITEMS.register("bidoof_spawn_egg",
            () -> new SpawnEggItem("bidoof", 1, 25));
    public static final DeferredItem<Item> BIBAREL_SPAWN_EGG = ITEMS.register("bibarel_spawn_egg",
            () -> new SpawnEggItem("bibarel", 15, 41));
    public static final DeferredItem<Item> KRICKETOT_SPAWN_EGG = ITEMS.register("kricketot_spawn_egg",
            () -> new SpawnEggItem("kricketot", 1, 19));
    public static final DeferredItem<Item> KRICKETUNE_SPAWN_EGG = ITEMS.register("kricketune_spawn_egg",
            () -> new SpawnEggItem("kricketune", 10, 38));
    public static final DeferredItem<Item> SHINX_SPAWN_EGG = ITEMS.register("shinx_spawn_egg",
            () -> new SpawnEggItem("shinx", 1, 26));
    public static final DeferredItem<Item> LUXIO_SPAWN_EGG = ITEMS.register("luxio_spawn_egg",
            () -> new SpawnEggItem("luxio", 15, 36));
    public static final DeferredItem<Item> LUXRAY_SPAWN_EGG = ITEMS.register("luxray_spawn_egg",
            () -> new SpawnEggItem("luxray", 30, 52));
    public static final DeferredItem<Item> BUDEW_SPAWN_EGG = ITEMS.register("budew_spawn_egg",
            () -> new SpawnEggItem("budew", 3, 28));
    public static final DeferredItem<Item> ROSERADE_SPAWN_EGG = ITEMS.register("roserade_spawn_egg",
            () -> new SpawnEggItem("roserade", 35, 52));
    public static final DeferredItem<Item> CRANIDOS_SPAWN_EGG = ITEMS.register("cranidos_spawn_egg",
            () -> new SpawnEggItem("cranidos", 10, 35));
    public static final DeferredItem<Item> RAMPARDOS_SPAWN_EGG = ITEMS.register("rampardos_spawn_egg",
            () -> new SpawnEggItem("rampardos", 30, 50));
    public static final DeferredItem<Item> SHIELDON_SPAWN_EGG = ITEMS.register("shieldon_spawn_egg",
            () -> new SpawnEggItem("shieldon", 10, 35));
    public static final DeferredItem<Item> BASTIODON_SPAWN_EGG = ITEMS.register("bastiodon_spawn_egg",
            () -> new SpawnEggItem("bastiodon", 30, 50));
    public static final DeferredItem<Item> COMBEE_SPAWN_EGG = ITEMS.register("combee_spawn_egg",
            () -> new SpawnEggItem("combee", 1, 24));
    public static final DeferredItem<Item> VESPIQUEN_SPAWN_EGG = ITEMS.register("vespiquen_spawn_egg",
            () -> new SpawnEggItem("vespiquen", 21, 47));
    public static final DeferredItem<Item> PACHIRISU_SPAWN_EGG = ITEMS.register("pachirisu_spawn_egg",
            () -> new SpawnEggItem("pachirisu", 16, 41));
    public static final DeferredItem<Item> BUIZEL_SPAWN_EGG = ITEMS.register("buizel_spawn_egg",
            () -> new SpawnEggItem("buizel", 8, 33));
    public static final DeferredItem<Item> FLOATZEL_SPAWN_EGG = ITEMS.register("floatzel_spawn_egg",
            () -> new SpawnEggItem("floatzel", 26, 50));
    public static final DeferredItem<Item> SHELLOS_SPAWN_EGG = ITEMS.register("shellos_spawn_egg",
            () -> new SpawnEggItem("shellos", 8, 33));
    public static final DeferredItem<Item> GASTRODON_SPAWN_EGG = ITEMS.register("gastrodon_spawn_egg",
            () -> new SpawnEggItem("gastrodon", 30, 48));
    public static final DeferredItem<Item> AMBIPOM_SPAWN_EGG = ITEMS.register("ambipom_spawn_egg",
            () -> new SpawnEggItem("ambipom", 32, 48));
    public static final DeferredItem<Item> DRIFLOON_SPAWN_EGG = ITEMS.register("drifloon_spawn_egg",
            () -> new SpawnEggItem("drifloon", 10, 35));
    public static final DeferredItem<Item> DRIFBLIM_SPAWN_EGG = ITEMS.register("drifblim_spawn_egg",
            () -> new SpawnEggItem("drifblim", 28, 50));
    public static final DeferredItem<Item> BUNEARY_SPAWN_EGG = ITEMS.register("buneary_spawn_egg",
            () -> new SpawnEggItem("buneary", 10, 35));
    public static final DeferredItem<Item> LOPUNNY_SPAWN_EGG = ITEMS.register("lopunny_spawn_egg",
            () -> new SpawnEggItem("lopunny", 30, 48));
    public static final DeferredItem<Item> MISMAGIUS_SPAWN_EGG = ITEMS.register("mismagius_spawn_egg",
            () -> new SpawnEggItem("mismagius", 39, 50));
    public static final DeferredItem<Item> HONCHKROW_SPAWN_EGG = ITEMS.register("honchkrow_spawn_egg",
            () -> new SpawnEggItem("honchkrow", 36, 51));
    public static final DeferredItem<Item> GLAMEOW_SPAWN_EGG = ITEMS.register("glameow_spawn_egg",
            () -> new SpawnEggItem("glameow", 6, 31));
    public static final DeferredItem<Item> PURUGLY_SPAWN_EGG = ITEMS.register("purugly_spawn_egg",
            () -> new SpawnEggItem("purugly", 38, 45));
    public static final DeferredItem<Item> CHINGLING_SPAWN_EGG = ITEMS.register("chingling_spawn_egg",
            () -> new SpawnEggItem("chingling", 4, 29));
    public static final DeferredItem<Item> BRONZOR_SPAWN_EGG = ITEMS.register("bronzor_spawn_egg",
            () -> new SpawnEggItem("bronzor", 5, 30));
    public static final DeferredItem<Item> BRONZONG_SPAWN_EGG = ITEMS.register("bronzong_spawn_egg",
            () -> new SpawnEggItem("bronzong", 33, 50));
    public static final DeferredItem<Item> BONSLY_SPAWN_EGG = ITEMS.register("bonsly_spawn_egg",
            () -> new SpawnEggItem("bonsly", 4, 29));
    public static final DeferredItem<Item> MIME_JR_SPAWN_EGG = ITEMS.register("mime_jr_spawn_egg",
            () -> new SpawnEggItem("mime jr.", 6, 31));
    public static final DeferredItem<Item> HAPPINY_SPAWN_EGG = ITEMS.register("happiny_spawn_egg",
            () -> new SpawnEggItem("happiny", 1, 22));
    public static final DeferredItem<Item> CHATOT_SPAWN_EGG = ITEMS.register("chatot_spawn_egg",
            () -> new SpawnEggItem("chatot", 16, 41));
    public static final DeferredItem<Item> SPIRITOMB_SPAWN_EGG = ITEMS.register("spiritomb_spawn_egg",
            () -> new SpawnEggItem("spiritomb", 24, 49));
    public static final DeferredItem<Item> GIBLE_SPAWN_EGG = ITEMS.register("gible_spawn_egg",
            () -> new SpawnEggItem("gible", 5, 30));
    public static final DeferredItem<Item> GABITE_SPAWN_EGG = ITEMS.register("gabite_spawn_egg",
            () -> new SpawnEggItem("gabite", 24, 47));
    public static final DeferredItem<Item> GARCHOMP_SPAWN_EGG = ITEMS.register("garchomp_spawn_egg",
            () -> new SpawnEggItem("garchomp", 48, 60));
    public static final DeferredItem<Item> MUNCHLAX_SPAWN_EGG = ITEMS.register("munchlax_spawn_egg",
            () -> new SpawnEggItem("munchlax", 24, 39));
    public static final DeferredItem<Item> RIOLU_SPAWN_EGG = ITEMS.register("riolu_spawn_egg",
            () -> new SpawnEggItem("riolu", 4, 29));
    public static final DeferredItem<Item> LUCARIO_SPAWN_EGG = ITEMS.register("lucario_spawn_egg",
            () -> new SpawnEggItem("lucario", 24, 53));
    public static final DeferredItem<Item> HIPPOPOTAS_SPAWN_EGG = ITEMS.register("hippopotas_spawn_egg",
            () -> new SpawnEggItem("hippopotas", 8, 33));
    public static final DeferredItem<Item> HIPPOWDON_SPAWN_EGG = ITEMS.register("hippowdon_spawn_egg",
            () -> new SpawnEggItem("hippowdon", 34, 53));
    public static final DeferredItem<Item> SKORUPI_SPAWN_EGG = ITEMS.register("skorupi_spawn_egg",
            () -> new SpawnEggItem("skorupi", 8, 33));
    public static final DeferredItem<Item> DRAPION_SPAWN_EGG = ITEMS.register("drapion_spawn_egg",
            () -> new SpawnEggItem("drapion", 40, 50));
    public static final DeferredItem<Item> CROAGUNK_SPAWN_EGG = ITEMS.register("croagunk_spawn_egg",
            () -> new SpawnEggItem("croagunk", 5, 30));
    public static final DeferredItem<Item> TOXICROAK_SPAWN_EGG = ITEMS.register("toxicroak_spawn_egg",
            () -> new SpawnEggItem("toxicroak", 37, 49));
    public static final DeferredItem<Item> CARNIVINE_SPAWN_EGG = ITEMS.register("carnivine_spawn_egg",
            () -> new SpawnEggItem("carnivine", 20, 45));
    public static final DeferredItem<Item> FINNEON_SPAWN_EGG = ITEMS.register("finneon_spawn_egg",
            () -> new SpawnEggItem("finneon", 8, 33));
    public static final DeferredItem<Item> LUMINEON_SPAWN_EGG = ITEMS.register("lumineon_spawn_egg",
            () -> new SpawnEggItem("lumineon", 31, 46));
    public static final DeferredItem<Item> MANTYKE_SPAWN_EGG = ITEMS.register("mantyke_spawn_egg",
            () -> new SpawnEggItem("mantyke", 10, 35));
    public static final DeferredItem<Item> WEAVILE_SPAWN_EGG = ITEMS.register("weavile_spawn_egg",
            () -> new SpawnEggItem("weavile", 38, 51));
    public static final DeferredItem<Item> MAGNEZONE_SPAWN_EGG = ITEMS.register("magnezone_spawn_egg",
            () -> new SpawnEggItem("magnezone", 42, 54));
    public static final DeferredItem<Item> LICKILICKY_SPAWN_EGG = ITEMS.register("lickilicky_spawn_egg",
            () -> new SpawnEggItem("lickilicky", 34, 52));
    public static final DeferredItem<Item> RHYPERIOR_SPAWN_EGG = ITEMS.register("rhyperior_spawn_egg",
            () -> new SpawnEggItem("rhyperior", 44, 54));
    public static final DeferredItem<Item> TANGROWTH_SPAWN_EGG = ITEMS.register("tangrowth_spawn_egg",
            () -> new SpawnEggItem("tangrowth", 24, 54));
    public static final DeferredItem<Item> ELECTIVIRE_SPAWN_EGG = ITEMS.register("electivire_spawn_egg",
            () -> new SpawnEggItem("electivire", 45, 54));
    public static final DeferredItem<Item> MAGMORTAR_SPAWN_EGG = ITEMS.register("magmortar_spawn_egg",
            () -> new SpawnEggItem("magmortar", 45, 54));
    public static final DeferredItem<Item> TOGEKISS_SPAWN_EGG = ITEMS.register("togekiss_spawn_egg",
            () -> new SpawnEggItem("togekiss", 36, 55));
    public static final DeferredItem<Item> YANMEGA_SPAWN_EGG = ITEMS.register("yanmega_spawn_egg",
            () -> new SpawnEggItem("yanmega", 33, 52));
    public static final DeferredItem<Item> LEAFEON_SPAWN_EGG = ITEMS.register("leafeon_spawn_egg",
            () -> new SpawnEggItem("leafeon", 28, 53));
    public static final DeferredItem<Item> GLACEON_SPAWN_EGG = ITEMS.register("glaceon_spawn_egg",
            () -> new SpawnEggItem("glaceon", 28, 53));
    public static final DeferredItem<Item> GLISCOR_SPAWN_EGG = ITEMS.register("gliscor_spawn_egg",
            () -> new SpawnEggItem("gliscor", 38, 51));
    public static final DeferredItem<Item> MAMOSWINE_SPAWN_EGG = ITEMS.register("mamoswine_spawn_egg",
            () -> new SpawnEggItem("mamoswine", 40, 53));
    public static final DeferredItem<Item> PORYGON_Z_SPAWN_EGG = ITEMS.register("porygon_z_spawn_egg",
            () -> new SpawnEggItem("porygon-z", 47, 54));
    public static final DeferredItem<Item> GALLADE_SPAWN_EGG = ITEMS.register("gallade_spawn_egg",
            () -> new SpawnEggItem("gallade", 30, 52));
    public static final DeferredItem<Item> PROBOPASS_SPAWN_EGG = ITEMS.register("probopass_spawn_egg",
            () -> new SpawnEggItem("probopass", 33, 53));
    public static final DeferredItem<Item> DUSKNOIR_SPAWN_EGG = ITEMS.register("dusknoir_spawn_egg",
            () -> new SpawnEggItem("dusknoir", 41, 53));
    public static final DeferredItem<Item> FROSLASS_SPAWN_EGG = ITEMS.register("froslass_spawn_egg",
            () -> new SpawnEggItem("froslass", 42, 48));
    public static final DeferredItem<Item> SNIVY_SPAWN_EGG = ITEMS.register("snivy_spawn_egg",
            () -> new SpawnEggItem("snivy", 5, 31));
    public static final DeferredItem<Item> SERVINE_SPAWN_EGG = ITEMS.register("servine_spawn_egg",
            () -> new SpawnEggItem("servine", 17, 41));
    public static final DeferredItem<Item> SERPERIOR_SPAWN_EGG = ITEMS.register("serperior_spawn_egg",
            () -> new SpawnEggItem("serperior", 36, 53));
    public static final DeferredItem<Item> TEPIG_SPAWN_EGG = ITEMS.register("tepig_spawn_egg",
            () -> new SpawnEggItem("tepig", 5, 31));
    public static final DeferredItem<Item> PIGNITE_SPAWN_EGG = ITEMS.register("pignite_spawn_egg",
            () -> new SpawnEggItem("pignite", 17, 42));
    public static final DeferredItem<Item> EMBOAR_SPAWN_EGG = ITEMS.register("emboar_spawn_egg",
            () -> new SpawnEggItem("emboar", 36, 53));
    public static final DeferredItem<Item> OSHAWOTT_SPAWN_EGG = ITEMS.register("oshawott_spawn_egg",
            () -> new SpawnEggItem("oshawott", 5, 31));
    public static final DeferredItem<Item> DEWOTT_SPAWN_EGG = ITEMS.register("dewott_spawn_egg",
            () -> new SpawnEggItem("dewott", 17, 41));
    public static final DeferredItem<Item> SAMUROTT_SPAWN_EGG = ITEMS.register("samurott_spawn_egg",
            () -> new SpawnEggItem("samurott", 36, 53));
    public static final DeferredItem<Item> HISUIAN_SAMUROTT_SPAWN_EGG = ITEMS.register("hisuian_samurott_spawn_egg",
            () -> new SpawnEggItem("hisuian samurott", 36, 53));
    public static final DeferredItem<Item> PATRAT_SPAWN_EGG = ITEMS.register("patrat_spawn_egg",
            () -> new SpawnEggItem("patrat", 1, 26));
    public static final DeferredItem<Item> WATCHOG_SPAWN_EGG = ITEMS.register("watchog_spawn_egg",
            () -> new SpawnEggItem("watchog", 20, 42));
    public static final DeferredItem<Item> LILLIPUP_SPAWN_EGG = ITEMS.register("lillipup_spawn_egg",
            () -> new SpawnEggItem("lillipup", 3, 28));
    public static final DeferredItem<Item> HERDIER_SPAWN_EGG = ITEMS.register("herdier_spawn_egg",
            () -> new SpawnEggItem("herdier", 16, 37));
    public static final DeferredItem<Item> STOUTLAND_SPAWN_EGG = ITEMS.register("stoutland_spawn_egg",
            () -> new SpawnEggItem("stoutland", 32, 50));
    public static final DeferredItem<Item> PURRLOIN_SPAWN_EGG = ITEMS.register("purrloin_spawn_egg",
            () -> new SpawnEggItem("purrloin", 3, 28));
    public static final DeferredItem<Item> LIEPARD_SPAWN_EGG = ITEMS.register("liepard_spawn_egg",
            () -> new SpawnEggItem("liepard", 20, 45));
    public static final DeferredItem<Item> PANSAGE_SPAWN_EGG = ITEMS.register("pansage_spawn_egg",
            () -> new SpawnEggItem("pansage", 7, 32));
    public static final DeferredItem<Item> SIMISAGE_SPAWN_EGG = ITEMS.register("simisage_spawn_egg",
            () -> new SpawnEggItem("simisage", 27, 50));
    public static final DeferredItem<Item> PANSEAR_SPAWN_EGG = ITEMS.register("pansear_spawn_egg",
            () -> new SpawnEggItem("pansear", 7, 32));
    public static final DeferredItem<Item> SIMISEAR_SPAWN_EGG = ITEMS.register("simisear_spawn_egg",
            () -> new SpawnEggItem("simisear", 27, 50));
    public static final DeferredItem<Item> PANPOUR_SPAWN_EGG = ITEMS.register("panpour_spawn_egg",
            () -> new SpawnEggItem("panpour", 7, 32));
    public static final DeferredItem<Item> SIMIPOUR_SPAWN_EGG = ITEMS.register("simipour_spawn_egg",
            () -> new SpawnEggItem("simipour", 27, 50));
    public static final DeferredItem<Item> MUNNA_SPAWN_EGG = ITEMS.register("munna_spawn_egg",
            () -> new SpawnEggItem("munna", 4, 29));
    public static final DeferredItem<Item> MUSHARNA_SPAWN_EGG = ITEMS.register("musharna_spawn_egg",
            () -> new SpawnEggItem("musharna", 24, 49));
    public static final DeferredItem<Item> PIDOVE_SPAWN_EGG = ITEMS.register("pidove_spawn_egg",
            () -> new SpawnEggItem("pidove", 1, 26));
    public static final DeferredItem<Item> TRANQUILL_SPAWN_EGG = ITEMS.register("tranquill_spawn_egg",
            () -> new SpawnEggItem("tranquill", 21, 36));
    public static final DeferredItem<Item> UNFEZANT_SPAWN_EGG = ITEMS.register("unfezant_spawn_egg",
            () -> new SpawnEggItem("unfezant", 32, 49));
    public static final DeferredItem<Item> BLITZLE_SPAWN_EGG = ITEMS.register("blitzle_spawn_egg",
            () -> new SpawnEggItem("blitzle", 5, 30));
    public static final DeferredItem<Item> ZEBSTRIKA_SPAWN_EGG = ITEMS.register("zebstrika_spawn_egg",
            () -> new SpawnEggItem("zebstrika", 27, 50));
    public static final DeferredItem<Item> ROGGENROLA_SPAWN_EGG = ITEMS.register("roggenrola_spawn_egg",
            () -> new SpawnEggItem("roggenrola", 3, 28));
    public static final DeferredItem<Item> BOLDORE_SPAWN_EGG = ITEMS.register("boldore_spawn_egg",
            () -> new SpawnEggItem("boldore", 25, 39));
    public static final DeferredItem<Item> GIGALITH_SPAWN_EGG = ITEMS.register("gigalith_spawn_egg",
            () -> new SpawnEggItem("gigalith", 34, 52));
    public static final DeferredItem<Item> WOOBAT_SPAWN_EGG = ITEMS.register("woobat_spawn_egg",
            () -> new SpawnEggItem("woobat", 7, 32));
    public static final DeferredItem<Item> SWOOBAT_SPAWN_EGG = ITEMS.register("swoobat_spawn_egg",
            () -> new SpawnEggItem("swoobat", 27, 43));
    public static final DeferredItem<Item> DRILBUR_SPAWN_EGG = ITEMS.register("drilbur_spawn_egg",
            () -> new SpawnEggItem("drilbur", 8, 33));
    public static final DeferredItem<Item> EXCADRILL_SPAWN_EGG = ITEMS.register("excadrill_spawn_egg",
            () -> new SpawnEggItem("excadrill", 31, 51));
    public static final DeferredItem<Item> TIMBURR_SPAWN_EGG = ITEMS.register("timburr_spawn_egg",
            () -> new SpawnEggItem("timburr", 6, 31));
    public static final DeferredItem<Item> GURDURR_SPAWN_EGG = ITEMS.register("gurdurr_spawn_egg",
            () -> new SpawnEggItem("gurdurr", 25, 41));
    public static final DeferredItem<Item> CONKELDURR_SPAWN_EGG = ITEMS.register("conkeldurr_spawn_egg",
            () -> new SpawnEggItem("conkeldurr", 36, 51));
    public static final DeferredItem<Item> SEWADDLE_SPAWN_EGG = ITEMS.register("sewaddle_spawn_egg",
            () -> new SpawnEggItem("sewaddle", 6, 31));
    public static final DeferredItem<Item> SWADLOON_SPAWN_EGG = ITEMS.register("swadloon_spawn_egg",
            () -> new SpawnEggItem("swadloon", 20, 38));
    public static final DeferredItem<Item> LEAVANNY_SPAWN_EGG = ITEMS.register("leavanny_spawn_egg",
            () -> new SpawnEggItem("leavanny", 33, 50));
    public static final DeferredItem<Item> VENIPEDE_SPAWN_EGG = ITEMS.register("venipede_spawn_egg",
            () -> new SpawnEggItem("venipede", 1, 26));
    public static final DeferredItem<Item> WHIRLIPEDE_SPAWN_EGG = ITEMS.register("whirlipede_spawn_egg",
            () -> new SpawnEggItem("whirlipede", 22, 36));
    public static final DeferredItem<Item> SCOLIPEDE_SPAWN_EGG = ITEMS.register("scolipede_spawn_egg",
            () -> new SpawnEggItem("scolipede", 30, 49));
    public static final DeferredItem<Item> COTTONEE_SPAWN_EGG = ITEMS.register("cottonee_spawn_egg",
            () -> new SpawnEggItem("cottonee", 3, 28));
    public static final DeferredItem<Item> WHIMSICOTT_SPAWN_EGG = ITEMS.register("whimsicott_spawn_egg",
            () -> new SpawnEggItem("whimsicott", 23, 48));
    public static final DeferredItem<Item> PETILIL_SPAWN_EGG = ITEMS.register("petilil_spawn_egg",
            () -> new SpawnEggItem("petilil", 3, 28));
    public static final DeferredItem<Item> LILLIGANT_SPAWN_EGG = ITEMS.register("lilligant_spawn_egg",
            () -> new SpawnEggItem("lilligant", 23, 48));
    public static final DeferredItem<Item> HISUIAN_LILLIGANT_SPAWN_EGG = ITEMS.register("hisuian_lilligant_spawn_egg",
            () -> new SpawnEggItem("hisuian lilligant", 23, 48));
    public static final DeferredItem<Item> BASCULIN_SPAWN_EGG = ITEMS.register("basculin_spawn_egg",
            () -> new SpawnEggItem("basculin", 21, 46));
    public static final DeferredItem<Item> SANDILE_SPAWN_EGG = ITEMS.register("sandile_spawn_egg",
            () -> new SpawnEggItem("sandile", 4, 29));
    public static final DeferredItem<Item> KROKOROK_SPAWN_EGG = ITEMS.register("krokorok_spawn_egg",
            () -> new SpawnEggItem("krokorok", 29, 35));
    public static final DeferredItem<Item> KROOKODILE_SPAWN_EGG = ITEMS.register("krookodile_spawn_egg",
            () -> new SpawnEggItem("krookodile", 40, 52));
    public static final DeferredItem<Item> DARUMAKA_SPAWN_EGG = ITEMS.register("darumaka_spawn_egg",
            () -> new SpawnEggItem("darumaka", 7, 32));
    public static final DeferredItem<Item> DARMANITAN_SPAWN_EGG = ITEMS.register("darmanitan_spawn_egg",
            () -> new SpawnEggItem("darmanitan", 35, 54));
    public static final DeferredItem<Item> MARACTUS_SPAWN_EGG = ITEMS.register("maractus_spawn_egg",
            () -> new SpawnEggItem("maractus", 21, 46));
    public static final DeferredItem<Item> DWEBBLE_SPAWN_EGG = ITEMS.register("dwebble_spawn_egg",
            () -> new SpawnEggItem("dwebble", 8, 33));
    public static final DeferredItem<Item> CRUSTLE_SPAWN_EGG = ITEMS.register("crustle_spawn_egg",
            () -> new SpawnEggItem("crustle", 34, 49));
    public static final DeferredItem<Item> SCRAGGY_SPAWN_EGG = ITEMS.register("scraggy_spawn_egg",
            () -> new SpawnEggItem("scraggy", 10, 35));
    public static final DeferredItem<Item> SCRAFTY_SPAWN_EGG = ITEMS.register("scrafty_spawn_egg",
            () -> new SpawnEggItem("scrafty", 39, 49));
    public static final DeferredItem<Item> SIGILYPH_SPAWN_EGG = ITEMS.register("sigilyph_spawn_egg",
            () -> new SpawnEggItem("sigilyph", 24, 49));
    public static final DeferredItem<Item> YAMASK_SPAWN_EGG = ITEMS.register("yamask_spawn_egg",
            () -> new SpawnEggItem("yamask", 5, 30));
    public static final DeferredItem<Item> COFAGRIGUS_SPAWN_EGG = ITEMS.register("cofagrigus_spawn_egg",
            () -> new SpawnEggItem("cofagrigus", 34, 48));
    public static final DeferredItem<Item> TIRTOUGA_SPAWN_EGG = ITEMS.register("tirtouga_spawn_egg",
            () -> new SpawnEggItem("tirtouga", 15, 40));
    public static final DeferredItem<Item> CARRACOSTA_SPAWN_EGG = ITEMS.register("carracosta_spawn_egg",
            () -> new SpawnEggItem("carracosta", 37, 57));
    public static final DeferredItem<Item> ARCHEN_SPAWN_EGG = ITEMS.register("archen_spawn_egg",
            () -> new SpawnEggItem("archen", 15, 40));
    public static final DeferredItem<Item> ARCHEOPS_SPAWN_EGG = ITEMS.register("archeops_spawn_egg",
            () -> new SpawnEggItem("archeops", 37, 57));
    public static final DeferredItem<Item> TRUBBISH_SPAWN_EGG = ITEMS.register("trubbish_spawn_egg",
            () -> new SpawnEggItem("trubbish", 8, 33));
    public static final DeferredItem<Item> GARBODOR_SPAWN_EGG = ITEMS.register("garbodor_spawn_egg",
            () -> new SpawnEggItem("garbodor", 36, 47));
    public static final DeferredItem<Item> ZORUA_SPAWN_EGG = ITEMS.register("zorua_spawn_egg",
            () -> new SpawnEggItem("zorua", 8, 33));
    public static final DeferredItem<Item> HISUIAN_ZORUA_SPAWN_EGG = ITEMS.register("hisuian_zorua_spawn_egg",
            () -> new SpawnEggItem("hisuian zorua", 8, 33));
    public static final DeferredItem<Item> ZOROARK_SPAWN_EGG = ITEMS.register("zoroark_spawn_egg",
            () -> new SpawnEggItem("zoroark", 30, 51));
    public static final DeferredItem<Item> HISUIAN_ZOROARK_SPAWN_EGG = ITEMS.register("hisuian_zoroark_spawn_egg",
            () -> new SpawnEggItem("hisuian zoroark", 30, 51));
    public static final DeferredItem<Item> MINCCINO_SPAWN_EGG = ITEMS.register("minccino_spawn_egg",
            () -> new SpawnEggItem("minccino", 5, 30));
    public static final DeferredItem<Item> CINCCINO_SPAWN_EGG = ITEMS.register("cinccino_spawn_egg",
            () -> new SpawnEggItem("cinccino", 25, 47));
    public static final DeferredItem<Item> GOTHITA_SPAWN_EGG = ITEMS.register("gothita_spawn_egg",
            () -> new SpawnEggItem("gothita", 4, 29));
    public static final DeferredItem<Item> GOTHORITA_SPAWN_EGG = ITEMS.register("gothorita_spawn_egg",
            () -> new SpawnEggItem("gothorita", 32, 39));
    public static final DeferredItem<Item> GOTHITELLE_SPAWN_EGG = ITEMS.register("gothitelle_spawn_egg",
            () -> new SpawnEggItem("gothitelle", 41, 49));
    public static final DeferredItem<Item> SOLOSIS_SPAWN_EGG = ITEMS.register("solosis_spawn_egg",
            () -> new SpawnEggItem("solosis", 4, 29));
    public static final DeferredItem<Item> DUOSION_SPAWN_EGG = ITEMS.register("duosion_spawn_egg",
            () -> new SpawnEggItem("duosion", 32, 37));
    public static final DeferredItem<Item> REUNICLUS_SPAWN_EGG = ITEMS.register("reuniclus_spawn_egg",
            () -> new SpawnEggItem("reuniclus", 41, 49));
    public static final DeferredItem<Item> DUCKLETT_SPAWN_EGG = ITEMS.register("ducklett_spawn_egg",
            () -> new SpawnEggItem("ducklett", 6, 31));
    public static final DeferredItem<Item> SWANNA_SPAWN_EGG = ITEMS.register("swanna_spawn_egg",
            () -> new SpawnEggItem("swanna", 35, 47));
    public static final DeferredItem<Item> VANILLITE_SPAWN_EGG = ITEMS.register("vanillite_spawn_egg",
            () -> new SpawnEggItem("vanillite", 6, 31));
    public static final DeferredItem<Item> VANILLISH_SPAWN_EGG = ITEMS.register("vanillish_spawn_egg",
            () -> new SpawnEggItem("vanillish", 35, 40));
    public static final DeferredItem<Item> VANILLUXE_SPAWN_EGG = ITEMS.register("vanilluxe_spawn_egg",
            () -> new SpawnEggItem("vanilluxe", 47, 54));
    public static final DeferredItem<Item> DEERLING_SPAWN_EGG = ITEMS.register("deerling_spawn_egg",
            () -> new SpawnEggItem("deerling", 9, 34));
    public static final DeferredItem<Item> SAWSBUCK_SPAWN_EGG = ITEMS.register("sawsbuck_spawn_egg",
            () -> new SpawnEggItem("sawsbuck", 34, 48));
    public static final DeferredItem<Item> EMOLGA_SPAWN_EGG = ITEMS.register("emolga_spawn_egg",
            () -> new SpawnEggItem("emolga", 18, 43));
    public static final DeferredItem<Item> KARRABLAST_SPAWN_EGG = ITEMS.register("karrablast_spawn_egg",
            () -> new SpawnEggItem("karrablast", 7, 32));
    public static final DeferredItem<Item> ESCAVALIER_SPAWN_EGG = ITEMS.register("escavalier_spawn_egg",
            () -> new SpawnEggItem("escavalier", 27, 50));
    public static final DeferredItem<Item> FOONGUS_SPAWN_EGG = ITEMS.register("foongus_spawn_egg",
            () -> new SpawnEggItem("foongus", 4, 29));
    public static final DeferredItem<Item> AMOONGUSS_SPAWN_EGG = ITEMS.register("amoonguss_spawn_egg",
            () -> new SpawnEggItem("amoonguss", 39, 46));
    public static final DeferredItem<Item> FRILLISH_SPAWN_EGG = ITEMS.register("frillish_spawn_egg",
            () -> new SpawnEggItem("frillish", 9, 34));
    public static final DeferredItem<Item> JELLICENT_SPAWN_EGG = ITEMS.register("jellicent_spawn_egg",
            () -> new SpawnEggItem("jellicent", 40, 48));
    public static final DeferredItem<Item> ALOMOMOLA_SPAWN_EGG = ITEMS.register("alomomola_spawn_egg",
            () -> new SpawnEggItem("alomomola", 22, 47));
    public static final DeferredItem<Item> JOLTIK_SPAWN_EGG = ITEMS.register("joltik_spawn_egg",
            () -> new SpawnEggItem("joltik", 7, 32));
    public static final DeferredItem<Item> GALVANTULA_SPAWN_EGG = ITEMS.register("galvantula_spawn_egg",
            () -> new SpawnEggItem("galvantula", 36, 47));
    public static final DeferredItem<Item> FERROSEED_SPAWN_EGG = ITEMS.register("ferroseed_spawn_egg",
            () -> new SpawnEggItem("ferroseed", 6, 31));
    public static final DeferredItem<Item> FERROTHORN_SPAWN_EGG = ITEMS.register("ferrothorn_spawn_egg",
            () -> new SpawnEggItem("ferrothorn", 40, 49));
    public static final DeferredItem<Item> KLINK_SPAWN_EGG = ITEMS.register("klink_spawn_egg",
            () -> new SpawnEggItem("klink", 5, 30));
    public static final DeferredItem<Item> KLANG_SPAWN_EGG = ITEMS.register("klang_spawn_egg",
            () -> new SpawnEggItem("klang", 38, 44));
    public static final DeferredItem<Item> KLINKLANG_SPAWN_EGG = ITEMS.register("klinklang_spawn_egg",
            () -> new SpawnEggItem("klinklang", 49, 52));
    public static final DeferredItem<Item> TYNAMO_SPAWN_EGG = ITEMS.register("tynamo_spawn_egg",
            () -> new SpawnEggItem("tynamo", 3, 28));
    public static final DeferredItem<Item> EELEKTRIK_SPAWN_EGG = ITEMS.register("eelektrik_spawn_egg",
            () -> new SpawnEggItem("eelektrik", 39, 41));
    public static final DeferredItem<Item> EELEKTROSS_SPAWN_EGG = ITEMS.register("eelektross_spawn_egg",
            () -> new SpawnEggItem("eelektross", 36, 52));
    public static final DeferredItem<Item> ELGYEM_SPAWN_EGG = ITEMS.register("elgyem_spawn_egg",
            () -> new SpawnEggItem("elgyem", 9, 34));
    public static final DeferredItem<Item> BEHEEYEM_SPAWN_EGG = ITEMS.register("beheeyem_spawn_egg",
            () -> new SpawnEggItem("beheeyem", 42, 49));
    public static final DeferredItem<Item> LITWICK_SPAWN_EGG = ITEMS.register("litwick_spawn_egg",
            () -> new SpawnEggItem("litwick", 3, 28));
    public static final DeferredItem<Item> LAMPENT_SPAWN_EGG = ITEMS.register("lampent_spawn_egg",
            () -> new SpawnEggItem("lampent", 41, 46));
    public static final DeferredItem<Item> CHANDELURE_SPAWN_EGG = ITEMS.register("chandelure_spawn_egg",
            () -> new SpawnEggItem("chandelure", 41, 52));
    public static final DeferredItem<Item> AXEW_SPAWN_EGG = ITEMS.register("axew_spawn_egg",
            () -> new SpawnEggItem("axew", 7, 32));
    public static final DeferredItem<Item> FRAXURE_SPAWN_EGG = ITEMS.register("fraxure_spawn_egg",
            () -> new SpawnEggItem("fraxure", 38, 41));
    public static final DeferredItem<Item> HAXORUS_SPAWN_EGG = ITEMS.register("haxorus_spawn_egg",
            () -> new SpawnEggItem("haxorus", 48, 54));
    public static final DeferredItem<Item> CUBCHOO_SPAWN_EGG = ITEMS.register("cubchoo_spawn_egg",
            () -> new SpawnEggItem("cubchoo", 6, 31));
    public static final DeferredItem<Item> BEARTIC_SPAWN_EGG = ITEMS.register("beartic_spawn_egg",
            () -> new SpawnEggItem("beartic", 37, 51));
    public static final DeferredItem<Item> CRYOGONAL_SPAWN_EGG = ITEMS.register("cryogonal_spawn_egg",
            () -> new SpawnEggItem("cryogonal", 27, 52));
    public static final DeferredItem<Item> SHELMET_SPAWN_EGG = ITEMS.register("shelmet_spawn_egg",
            () -> new SpawnEggItem("shelmet", 6, 31));
    public static final DeferredItem<Item> ACCELGOR_SPAWN_EGG = ITEMS.register("accelgor_spawn_egg",
            () -> new SpawnEggItem("accelgor", 26, 50));
    public static final DeferredItem<Item> STUNFISK_SPAWN_EGG = ITEMS.register("stunfisk_spawn_egg",
            () -> new SpawnEggItem("stunfisk", 22, 47));
    public static final DeferredItem<Item> GALARIAN_STUNFISK_SPAWN_EGG = ITEMS.register("galarian_stunfisk_spawn_egg",
            () -> new SpawnEggItem("galarian stunfisk", 22, 47));
    public static final DeferredItem<Item> MIENFOO_SPAWN_EGG = ITEMS.register("mienfoo_spawn_egg",
            () -> new SpawnEggItem("mienfoo", 10, 35));
    public static final DeferredItem<Item> MIENSHAO_SPAWN_EGG = ITEMS.register("mienshao_spawn_egg",
            () -> new SpawnEggItem("mienshao", 50, 51));
    public static final DeferredItem<Item> DRUDDIGON_SPAWN_EGG = ITEMS.register("druddigon_spawn_egg",
            () -> new SpawnEggItem("druddigon", 24, 49));
    public static final DeferredItem<Item> GOLETT_SPAWN_EGG = ITEMS.register("golett_spawn_egg",
            () -> new SpawnEggItem("golett", 5, 30));
    public static final DeferredItem<Item> GOLURK_SPAWN_EGG = ITEMS.register("golurk_spawn_egg",
            () -> new SpawnEggItem("golurk", 43, 48));
    public static final DeferredItem<Item> BOUFFALANT_SPAWN_EGG = ITEMS.register("bouffalant_spawn_egg",
            () -> new SpawnEggItem("bouffalant", 24, 49));
    public static final DeferredItem<Item> RUFFLET_SPAWN_EGG = ITEMS.register("rufflet_spawn_egg",
            () -> new SpawnEggItem("rufflet", 10, 35));
    public static final DeferredItem<Item> BRAVIARY_SPAWN_EGG = ITEMS.register("braviary_spawn_egg",
            () -> new SpawnEggItem("braviary", 54, 59));
    public static final DeferredItem<Item> HISUIAN_BRAVIARY_SPAWN_EGG = ITEMS.register("hisuian_braviary_spawn_egg",
            () -> new SpawnEggItem("hisuian braviary", 54, 59));
    public static final DeferredItem<Item> HEATMOR_SPAWN_EGG = ITEMS.register("heatmor_spawn_egg",
            () -> new SpawnEggItem("heatmor", 23, 48));
    public static final DeferredItem<Item> DURANT_SPAWN_EGG = ITEMS.register("durant_spawn_egg",
            () -> new SpawnEggItem("durant", 23, 48));
    public static final DeferredItem<Item> DEINO_SPAWN_EGG = ITEMS.register("deino_spawn_egg",
            () -> new SpawnEggItem("deino", 5, 30));
    public static final DeferredItem<Item> ZWEILOUS_SPAWN_EGG = ITEMS.register("zweilous_spawn_egg",
            () -> new SpawnEggItem("zweilous", 50, 55));
    public static final DeferredItem<Item> HYDREIGON_SPAWN_EGG = ITEMS.register("hydreigon_spawn_egg",
            () -> new SpawnEggItem("hydreigon", 64, 69));
    public static final DeferredItem<Item> LARVESTA_SPAWN_EGG = ITEMS.register("larvesta_spawn_egg",
            () -> new SpawnEggItem("larvesta", 11, 36));
    public static final DeferredItem<Item> VOLCARONA_SPAWN_EGG = ITEMS.register("volcarona_spawn_egg",
            () -> new SpawnEggItem("volcarona", 59, 64));
    public static final DeferredItem<Item> CHESPIN_SPAWN_EGG = ITEMS.register("chespin_spawn_egg",
            () -> new SpawnEggItem("chespin", 5, 31));
    public static final DeferredItem<Item> QUILLADIN_SPAWN_EGG = ITEMS.register("quilladin_spawn_egg",
            () -> new SpawnEggItem("quilladin", 16, 41));
    public static final DeferredItem<Item> CHESNAUGHT_SPAWN_EGG = ITEMS.register("chesnaught_spawn_egg",
            () -> new SpawnEggItem("chesnaught", 36, 53));
    public static final DeferredItem<Item> FENNEKIN_SPAWN_EGG = ITEMS.register("fennekin_spawn_egg",
            () -> new SpawnEggItem("fennekin", 5, 31));
    public static final DeferredItem<Item> BRAIXEN_SPAWN_EGG = ITEMS.register("braixen_spawn_egg",
            () -> new SpawnEggItem("braixen", 16, 41));
    public static final DeferredItem<Item> DELPHOX_SPAWN_EGG = ITEMS.register("delphox_spawn_egg",
            () -> new SpawnEggItem("delphox", 36, 53));
    public static final DeferredItem<Item> FROAKIE_SPAWN_EGG = ITEMS.register("froakie_spawn_egg",
            () -> new SpawnEggItem("froakie", 5, 31));
    public static final DeferredItem<Item> FROGADIER_SPAWN_EGG = ITEMS.register("frogadier_spawn_egg",
            () -> new SpawnEggItem("frogadier", 16, 41));
    public static final DeferredItem<Item> GRENINJA_SPAWN_EGG = ITEMS.register("greninja_spawn_egg",
            () -> new SpawnEggItem("greninja", 36, 53));
    public static final DeferredItem<Item> BUNNELBY_SPAWN_EGG = ITEMS.register("bunnelby_spawn_egg",
            () -> new SpawnEggItem("bunnelby", 1, 24));
    public static final DeferredItem<Item> DIGGERSBY_SPAWN_EGG = ITEMS.register("diggersby_spawn_egg",
            () -> new SpawnEggItem("diggersby", 20, 42));
    public static final DeferredItem<Item> FLETCHLING_SPAWN_EGG = ITEMS.register("fletchling_spawn_egg",
            () -> new SpawnEggItem("fletchling", 3, 28));
    public static final DeferredItem<Item> FLETCHINDER_SPAWN_EGG = ITEMS.register("fletchinder_spawn_egg",
            () -> new SpawnEggItem("fletchinder", 17, 38));
    public static final DeferredItem<Item> TALONFLAME_SPAWN_EGG = ITEMS.register("talonflame_spawn_egg",
            () -> new SpawnEggItem("talonflame", 35, 50));
    public static final DeferredItem<Item> SCATTERBUG_SPAWN_EGG = ITEMS.register("scatterbug_spawn_egg",
            () -> new SpawnEggItem("scatterbug", 1, 20));
    public static final DeferredItem<Item> SPEWPA_SPAWN_EGG = ITEMS.register("spewpa_spawn_egg",
            () -> new SpawnEggItem("spewpa", 9, 21));
    public static final DeferredItem<Item> VIVILLON_SPAWN_EGG = ITEMS.register("vivillon_spawn_egg",
            () -> new SpawnEggItem("vivillon", 12, 41));
    public static final DeferredItem<Item> FLABEBE_SPAWN_EGG = ITEMS.register("flabebe_spawn_egg",
            () -> new SpawnEggItem("flabebe", 5, 30));
    public static final DeferredItem<Item> FLOETTE_SPAWN_EGG = ITEMS.register("floette_spawn_egg",
            () -> new SpawnEggItem("floette", 19, 37));
    public static final DeferredItem<Item> FLORGES_SPAWN_EGG = ITEMS.register("florges_spawn_egg",
            () -> new SpawnEggItem("florges", 32, 55));
    public static final DeferredItem<Item> SKIDDO_SPAWN_EGG = ITEMS.register("skiddo_spawn_egg",
            () -> new SpawnEggItem("skiddo", 10, 35));
    public static final DeferredItem<Item> GOGOAT_SPAWN_EGG = ITEMS.register("gogoat_spawn_egg",
            () -> new SpawnEggItem("gogoat", 32, 53));
    public static final DeferredItem<Item> FURFROU_SPAWN_EGG = ITEMS.register("furfrou_spawn_egg",
            () -> new SpawnEggItem("furfrou", 22, 47));
    public static final DeferredItem<Item> ESPURR_SPAWN_EGG = ITEMS.register("espurr_spawn_egg",
            () -> new SpawnEggItem("espurr", 11, 36));
    public static final DeferredItem<Item> MEOWSTIC_SPAWN_EGG = ITEMS.register("meowstic_spawn_egg",
            () -> new SpawnEggItem("meowstic", 25, 47));
    public static final DeferredItem<Item> HONEDGE_SPAWN_EGG = ITEMS.register("honedge_spawn_egg",
            () -> new SpawnEggItem("honedge", 8, 33));
    public static final DeferredItem<Item> DOUBLADE_SPAWN_EGG = ITEMS.register("doublade_spawn_egg",
            () -> new SpawnEggItem("doublade", 35, 45));
    public static final DeferredItem<Item> AEGISLASH_SPAWN_EGG = ITEMS.register("aegislash_spawn_egg",
            () -> new SpawnEggItem("aegislash", 40, 50));
    public static final DeferredItem<Item> INKAY_SPAWN_EGG = ITEMS.register("inkay_spawn_egg",
            () -> new SpawnEggItem("inkay", 4, 29));
    public static final DeferredItem<Item> MALAMAR_SPAWN_EGG = ITEMS.register("malamar_spawn_egg",
            () -> new SpawnEggItem("malamar", 30, 48));
    public static final DeferredItem<Item> BINACLE_SPAWN_EGG = ITEMS.register("binacle_spawn_egg",
            () -> new SpawnEggItem("binacle", 6, 31));
    public static final DeferredItem<Item> BARBARACLE_SPAWN_EGG = ITEMS.register("barbaracle_spawn_egg",
            () -> new SpawnEggItem("barbaracle", 39, 50));
    public static final DeferredItem<Item> SKRELP_SPAWN_EGG = ITEMS.register("skrelp_spawn_egg",
            () -> new SpawnEggItem("skrelp", 7, 32));
    public static final DeferredItem<Item> DRAGALGE_SPAWN_EGG = ITEMS.register("dragalge_spawn_egg",
            () -> new SpawnEggItem("dragalge", 48, 49));
    public static final DeferredItem<Item> CLAUNCHER_SPAWN_EGG = ITEMS.register("clauncher_spawn_egg",
            () -> new SpawnEggItem("clauncher", 8, 33));
    public static final DeferredItem<Item> CLAWITZER_SPAWN_EGG = ITEMS.register("clawitzer_spawn_egg",
            () -> new SpawnEggItem("clawitzer", 37, 50));
    public static final DeferredItem<Item> TYRUNT_SPAWN_EGG = ITEMS.register("tyrunt_spawn_egg",
            () -> new SpawnEggItem("tyrunt", 11, 36));
    public static final DeferredItem<Item> TYRANTRUM_SPAWN_EGG = ITEMS.register("tyrantrum_spawn_egg",
            () -> new SpawnEggItem("tyrantrum", 39, 52));
    public static final DeferredItem<Item> AMAURA_SPAWN_EGG = ITEMS.register("amaura_spawn_egg",
            () -> new SpawnEggItem("amaura", 11, 36));
    public static final DeferredItem<Item> AURORUS_SPAWN_EGG = ITEMS.register("aurorus_spawn_egg",
            () -> new SpawnEggItem("aurorus", 39, 52));
    public static final DeferredItem<Item> SYLVEON_SPAWN_EGG = ITEMS.register("sylveon_spawn_egg",
            () -> new SpawnEggItem("sylveon", 28, 53));
    public static final DeferredItem<Item> HAWLUCHA_SPAWN_EGG = ITEMS.register("hawlucha_spawn_egg",
            () -> new SpawnEggItem("hawlucha", 25, 50));
    public static final DeferredItem<Item> DEDENNE_SPAWN_EGG = ITEMS.register("dedenne_spawn_egg",
            () -> new SpawnEggItem("dedenne", 18, 43));
    public static final DeferredItem<Item> CARBINK_SPAWN_EGG = ITEMS.register("carbink_spawn_egg",
            () -> new SpawnEggItem("carbink", 25, 50));
    public static final DeferredItem<Item> GOOMY_SPAWN_EGG = ITEMS.register("goomy_spawn_egg",
            () -> new SpawnEggItem("goomy", 5, 30));
    public static final DeferredItem<Item> SLIGGOO_SPAWN_EGG = ITEMS.register("sliggoo_spawn_egg",
            () -> new SpawnEggItem("sliggoo", 40, 45));
    public static final DeferredItem<Item> HISUIAN_SLIGGOO_SPAWN_EGG = ITEMS.register("hisuian_sliggoo_spawn_egg",
            () -> new SpawnEggItem("hisuian sliggoo", 40, 45));
    public static final DeferredItem<Item> GOODRA_SPAWN_EGG = ITEMS.register("goodra_spawn_egg",
            () -> new SpawnEggItem("goodra", 50, 60));
    public static final DeferredItem<Item> HISUIAN_GOODRA_SPAWN_EGG = ITEMS.register("hisuian_goodra_spawn_egg",
            () -> new SpawnEggItem("hisuian goodra", 50, 60));
    public static final DeferredItem<Item> KLEFKI_SPAWN_EGG = ITEMS.register("klefki_spawn_egg",
            () -> new SpawnEggItem("klefki", 22, 47));
    public static final DeferredItem<Item> PHANTUMP_SPAWN_EGG = ITEMS.register("phantump_spawn_egg",
            () -> new SpawnEggItem("phantump", 6, 31));
    public static final DeferredItem<Item> TREVENANT_SPAWN_EGG = ITEMS.register("trevenant_spawn_egg",
            () -> new SpawnEggItem("trevenant", 26, 47));
    public static final DeferredItem<Item> PUMPKABOO_SPAWN_EGG = ITEMS.register("pumpkaboo_spawn_egg",
            () -> new SpawnEggItem("pumpkaboo", 9, 34));
    public static final DeferredItem<Item> GOURGEIST_SPAWN_EGG = ITEMS.register("gourgeist_spawn_egg",
            () -> new SpawnEggItem("gourgeist", 29, 49));
    public static final DeferredItem<Item> BERGMITE_SPAWN_EGG = ITEMS.register("bergmite_spawn_egg",
            () -> new SpawnEggItem("bergmite", 5, 30));
    public static final DeferredItem<Item> AVALUGG_SPAWN_EGG = ITEMS.register("avalugg_spawn_egg",
            () -> new SpawnEggItem("avalugg", 37, 51));
    public static final DeferredItem<Item> NOIBAT_SPAWN_EGG = ITEMS.register("noibat_spawn_egg",
            () -> new SpawnEggItem("noibat", 1, 25));
    public static final DeferredItem<Item> NOIVERN_SPAWN_EGG = ITEMS.register("noivern_spawn_egg",
            () -> new SpawnEggItem("noivern", 48, 54));
    public static final DeferredItem<Item> ROWLET_SPAWN_EGG = ITEMS.register("rowlet_spawn_egg",
            () -> new SpawnEggItem("rowlet", 5, 32));
    public static final DeferredItem<Item> DARTRIX_SPAWN_EGG = ITEMS.register("dartrix_spawn_egg",
            () -> new SpawnEggItem("dartrix", 17, 42));
    public static final DeferredItem<Item> DECIDUEYE_SPAWN_EGG = ITEMS.register("decidueye_spawn_egg",
            () -> new SpawnEggItem("decidueye", 34, 53));
    public static final DeferredItem<Item> HISUIAN_DECIDUEYE_SPAWN_EGG = ITEMS.register("hisuian_decidueye_spawn_egg",
            () -> new SpawnEggItem("hisuian decidueye", 34, 53));
    public static final DeferredItem<Item> LITTEN_SPAWN_EGG = ITEMS.register("litten_spawn_egg",
            () -> new SpawnEggItem("litten", 5, 32));
    public static final DeferredItem<Item> TORRACAT_SPAWN_EGG = ITEMS.register("torracat_spawn_egg",
            () -> new SpawnEggItem("torracat", 17, 42));
    public static final DeferredItem<Item> INCINEROAR_SPAWN_EGG = ITEMS.register("incineroar_spawn_egg",
            () -> new SpawnEggItem("incineroar", 34, 53));
    public static final DeferredItem<Item> POPPLIO_SPAWN_EGG = ITEMS.register("popplio_spawn_egg",
            () -> new SpawnEggItem("popplio", 5, 32));
    public static final DeferredItem<Item> BRIONNE_SPAWN_EGG = ITEMS.register("brionne_spawn_egg",
            () -> new SpawnEggItem("brionne", 17, 42));
    public static final DeferredItem<Item> PRIMARINA_SPAWN_EGG = ITEMS.register("primarina_spawn_egg",
            () -> new SpawnEggItem("primarina", 34, 53));
    public static final DeferredItem<Item> PIKIPEK_SPAWN_EGG = ITEMS.register("pikipek_spawn_egg",
            () -> new SpawnEggItem("pikipek", 2, 27));
    public static final DeferredItem<Item> TRUMBEAK_SPAWN_EGG = ITEMS.register("trumbeak_spawn_egg",
            () -> new SpawnEggItem("trumbeak", 14, 36));
    public static final DeferredItem<Item> TOUCANNON_SPAWN_EGG = ITEMS.register("toucannon_spawn_egg",
            () -> new SpawnEggItem("toucannon", 28, 49));
    public static final DeferredItem<Item> YUNGOOS_SPAWN_EGG = ITEMS.register("yungoos_spawn_egg",
            () -> new SpawnEggItem("yungoos", 1, 25));
    public static final DeferredItem<Item> GUMSHOOS_SPAWN_EGG = ITEMS.register("gumshoos_spawn_egg",
            () -> new SpawnEggItem("gumshoos", 20, 42));
    public static final DeferredItem<Item> CRABRAWLER_SPAWN_EGG = ITEMS.register("crabrawler_spawn_egg",
            () -> new SpawnEggItem("crabrawler", 9, 34));
    public static final DeferredItem<Item> CRABOMINABLE_SPAWN_EGG = ITEMS.register("crabominable_spawn_egg",
            () -> new SpawnEggItem("crabominable", 29, 48));
    public static final DeferredItem<Item> CUTIEFLY_SPAWN_EGG = ITEMS.register("cutiefly_spawn_egg",
            () -> new SpawnEggItem("cutiefly", 5, 30));
    public static final DeferredItem<Item> RIBOMBEE_SPAWN_EGG = ITEMS.register("ribombee_spawn_egg",
            () -> new SpawnEggItem("ribombee", 25, 46));
    public static final DeferredItem<Item> WISHIWASHI_SPAWN_EGG = ITEMS.register("wishiwashi_spawn_egg",
            () -> new SpawnEggItem("wishiwashi", 1, 18));
    public static final DeferredItem<Item> MAREANIE_SPAWN_EGG = ITEMS.register("mareanie_spawn_egg",
            () -> new SpawnEggItem("mareanie", 6, 31));
    public static final DeferredItem<Item> TOXAPEX_SPAWN_EGG = ITEMS.register("toxapex_spawn_egg",
            () -> new SpawnEggItem("toxapex", 38, 50));
    public static final DeferredItem<Item> MUDBRAY_SPAWN_EGG = ITEMS.register("mudbray_spawn_egg",
            () -> new SpawnEggItem("mudbray", 14, 39));
    public static final DeferredItem<Item> MUDSDALE_SPAWN_EGG = ITEMS.register("mudsdale_spawn_egg",
            () -> new SpawnEggItem("mudsdale", 30, 50));
    public static final DeferredItem<Item> DEWPIDER_SPAWN_EGG = ITEMS.register("dewpider_spawn_egg",
            () -> new SpawnEggItem("dewpider", 2, 27));
    public static final DeferredItem<Item> ARAQUANID_SPAWN_EGG = ITEMS.register("araquanid_spawn_egg",
            () -> new SpawnEggItem("araquanid", 22, 45));
    public static final DeferredItem<Item> FOMANTIS_SPAWN_EGG = ITEMS.register("fomantis_spawn_egg",
            () -> new SpawnEggItem("fomantis", 1, 25));
    public static final DeferredItem<Item> LURANTIS_SPAWN_EGG = ITEMS.register("lurantis_spawn_egg",
            () -> new SpawnEggItem("lurantis", 34, 48));
    public static final DeferredItem<Item> MORELULL_SPAWN_EGG = ITEMS.register("morelull_spawn_egg",
            () -> new SpawnEggItem("morelull", 4, 29));
    public static final DeferredItem<Item> SHIINOTIC_SPAWN_EGG = ITEMS.register("shiinotic_spawn_egg",
            () -> new SpawnEggItem("shiinotic", 24, 41));
    public static final DeferredItem<Item> SALANDIT_SPAWN_EGG = ITEMS.register("salandit_spawn_egg",
            () -> new SpawnEggItem("salandit", 7, 32));
    public static final DeferredItem<Item> SALAZZLE_SPAWN_EGG = ITEMS.register("salazzle_spawn_egg",
            () -> new SpawnEggItem("salazzle", 33, 48));
    public static final DeferredItem<Item> STUFFUL_SPAWN_EGG = ITEMS.register("stufful_spawn_egg",
            () -> new SpawnEggItem("stufful", 9, 34));
    public static final DeferredItem<Item> BEWEAR_SPAWN_EGG = ITEMS.register("bewear_spawn_egg",
            () -> new SpawnEggItem("bewear", 27, 50));
    public static final DeferredItem<Item> BOUNSWEET_SPAWN_EGG = ITEMS.register("bounsweet_spawn_egg",
            () -> new SpawnEggItem("bounsweet", 1, 21));
    public static final DeferredItem<Item> STEENEE_SPAWN_EGG = ITEMS.register("steenee_spawn_egg",
            () -> new SpawnEggItem("steenee", 18, 29));
    public static final DeferredItem<Item> TSAREENA_SPAWN_EGG = ITEMS.register("tsareena_spawn_egg",
            () -> new SpawnEggItem("tsareena", 28, 51));
    public static final DeferredItem<Item> COMFEY_SPAWN_EGG = ITEMS.register("comfey_spawn_egg",
            () -> new SpawnEggItem("comfey", 24, 49));
    public static final DeferredItem<Item> WIMPOD_SPAWN_EGG = ITEMS.register("wimpod_spawn_egg",
            () -> new SpawnEggItem("wimpod", 1, 23));
    public static final DeferredItem<Item> GOLISOPOD_SPAWN_EGG = ITEMS.register("golisopod_spawn_egg",
            () -> new SpawnEggItem("golisopod", 30, 53));
    public static final DeferredItem<Item> SANDYGAST_SPAWN_EGG = ITEMS.register("sandygast_spawn_egg",
            () -> new SpawnEggItem("sandygast", 7, 32));
    public static final DeferredItem<Item> PALOSSAND_SPAWN_EGG = ITEMS.register("palossand_spawn_egg",
            () -> new SpawnEggItem("palossand", 42, 48));
    public static final DeferredItem<Item> PYUKUMUKU_SPAWN_EGG = ITEMS.register("pyukumuku_spawn_egg",
            () -> new SpawnEggItem("pyukumuku", 16, 41));
    public static final DeferredItem<Item> KOMALA_SPAWN_EGG = ITEMS.register("komala_spawn_egg",
            () -> new SpawnEggItem("komala", 23, 48));
    public static final DeferredItem<Item> TURTONATOR_SPAWN_EGG = ITEMS.register("turtonator_spawn_egg",
            () -> new SpawnEggItem("turtonator", 24, 49));
    public static final DeferredItem<Item> TOGEDEMARU_SPAWN_EGG = ITEMS.register("togedemaru_spawn_egg",
            () -> new SpawnEggItem("togedemaru", 19, 44));
    public static final DeferredItem<Item> MIMIKYU_SPAWN_EGG = ITEMS.register("mimikyu_spawn_egg",
            () -> new SpawnEggItem("mimikyu", 23, 48));
    public static final DeferredItem<Item> BRUXISH_SPAWN_EGG = ITEMS.register("bruxish_spawn_egg",
            () -> new SpawnEggItem("bruxish", 23, 48));
    public static final DeferredItem<Item> DRAMPA_SPAWN_EGG = ITEMS.register("drampa_spawn_egg",
            () -> new SpawnEggItem("drampa", 24, 49));
    public static final DeferredItem<Item> DHELMISE_SPAWN_EGG = ITEMS.register("dhelmise_spawn_egg",
            () -> new SpawnEggItem("dhelmise", 27, 52));
    public static final DeferredItem<Item> JANGMO_O_SPAWN_EGG = ITEMS.register("jangmo_o_spawn_egg",
            () -> new SpawnEggItem("jangmo-o", 5, 30));
    public static final DeferredItem<Item> HAKAMO_O_SPAWN_EGG = ITEMS.register("hakamo_o_spawn_egg",
            () -> new SpawnEggItem("hakamo-o", 35, 42));
    public static final DeferredItem<Item> KOMMO_O_SPAWN_EGG = ITEMS.register("kommo_o_spawn_egg",
            () -> new SpawnEggItem("kommo-o", 45, 60));
    public static final DeferredItem<Item> GROOKEY_SPAWN_EGG = ITEMS.register("grookey_spawn_egg",
            () -> new SpawnEggItem("grookey", 5, 31));
    public static final DeferredItem<Item> THWACKEY_SPAWN_EGG = ITEMS.register("thwackey_spawn_egg",
            () -> new SpawnEggItem("thwackey", 16, 42));
    public static final DeferredItem<Item> RILLABOOM_SPAWN_EGG = ITEMS.register("rillaboom_spawn_egg",
            () -> new SpawnEggItem("rillaboom", 35, 53));
    public static final DeferredItem<Item> SCORBUNNY_SPAWN_EGG = ITEMS.register("scorbunny_spawn_egg",
            () -> new SpawnEggItem("scorbunny", 5, 31));
    public static final DeferredItem<Item> RABOOT_SPAWN_EGG = ITEMS.register("raboot_spawn_egg",
            () -> new SpawnEggItem("raboot", 16, 42));
    public static final DeferredItem<Item> CINDERACE_SPAWN_EGG = ITEMS.register("cinderace_spawn_egg",
            () -> new SpawnEggItem("cinderace", 35, 53));
    public static final DeferredItem<Item> SOBBLE_SPAWN_EGG = ITEMS.register("sobble_spawn_egg",
            () -> new SpawnEggItem("sobble", 5, 31));
    public static final DeferredItem<Item> DRIZZILE_SPAWN_EGG = ITEMS.register("drizzile_spawn_egg",
            () -> new SpawnEggItem("drizzile", 16, 42));
    public static final DeferredItem<Item> INTELEON_SPAWN_EGG = ITEMS.register("inteleon_spawn_egg",
            () -> new SpawnEggItem("inteleon", 35, 53));
    public static final DeferredItem<Item> SKWOVET_SPAWN_EGG = ITEMS.register("skwovet_spawn_egg",
            () -> new SpawnEggItem("skwovet", 3, 28));
    public static final DeferredItem<Item> GREEDENT_SPAWN_EGG = ITEMS.register("greedent_spawn_egg",
            () -> new SpawnEggItem("greedent", 24, 46));
    public static final DeferredItem<Item> ROOKIDEE_SPAWN_EGG = ITEMS.register("rookidee_spawn_egg",
            () -> new SpawnEggItem("rookidee", 1, 25));
    public static final DeferredItem<Item> CORVISQUIRE_SPAWN_EGG = ITEMS.register("corvisquire_spawn_egg",
            () -> new SpawnEggItem("corvisquire", 18, 37));
    public static final DeferredItem<Item> CORVIKNIGHT_SPAWN_EGG = ITEMS.register("corviknight_spawn_egg",
            () -> new SpawnEggItem("corviknight", 38, 50));
    public static final DeferredItem<Item> NICKIT_SPAWN_EGG = ITEMS.register("nickit_spawn_egg",
            () -> new SpawnEggItem("nickit", 1, 25));
    public static final DeferredItem<Item> THIEVUL_SPAWN_EGG = ITEMS.register("thievul_spawn_egg",
            () -> new SpawnEggItem("thievul", 18, 46));
    public static final DeferredItem<Item> GOSSIFLEUR_SPAWN_EGG = ITEMS.register("gossifleur_spawn_egg",
            () -> new SpawnEggItem("gossifleur", 1, 25));
    public static final DeferredItem<Item> ELDEGOSS_SPAWN_EGG = ITEMS.register("eldegoss_spawn_egg",
            () -> new SpawnEggItem("eldegoss", 20, 46));
    public static final DeferredItem<Item> WOOLOO_SPAWN_EGG = ITEMS.register("wooloo_spawn_egg",
            () -> new SpawnEggItem("wooloo", 2, 27));
    public static final DeferredItem<Item> DUBWOOL_SPAWN_EGG = ITEMS.register("dubwool_spawn_egg",
            () -> new SpawnEggItem("dubwool", 24, 49));
    public static final DeferredItem<Item> CHEWTLE_SPAWN_EGG = ITEMS.register("chewtle_spawn_egg",
            () -> new SpawnEggItem("chewtle", 3, 28));
    public static final DeferredItem<Item> DREDNAW_SPAWN_EGG = ITEMS.register("drednaw_spawn_egg",
            () -> new SpawnEggItem("drednaw", 22, 49));
    public static final DeferredItem<Item> YAMPER_SPAWN_EGG = ITEMS.register("yamper_spawn_egg",
            () -> new SpawnEggItem("yamper", 2, 27));
    public static final DeferredItem<Item> BOLTUND_SPAWN_EGG = ITEMS.register("boltund_spawn_egg",
            () -> new SpawnEggItem("boltund", 25, 49));
    public static final DeferredItem<Item> SILICOBRA_SPAWN_EGG = ITEMS.register("silicobra_spawn_egg",
            () -> new SpawnEggItem("silicobra", 7, 32));
    public static final DeferredItem<Item> SANDACONDA_SPAWN_EGG = ITEMS.register("sandaconda_spawn_egg",
            () -> new SpawnEggItem("sandaconda", 36, 51));
    public static final DeferredItem<Item> CRAMORANT_SPAWN_EGG = ITEMS.register("cramorant_spawn_egg",
            () -> new SpawnEggItem("cramorant", 23, 48));
    public static final DeferredItem<Item> ARROKUDA_SPAWN_EGG = ITEMS.register("arrokuda_spawn_egg",
            () -> new SpawnEggItem("arrokuda", 3, 28));
    public static final DeferredItem<Item> BARRASKEWDA_SPAWN_EGG = ITEMS.register("barraskewda_spawn_egg",
            () -> new SpawnEggItem("barraskewda", 26, 49));
    public static final DeferredItem<Item> TOXEL_SPAWN_EGG = ITEMS.register("toxel_spawn_egg",
            () -> new SpawnEggItem("toxel", 1, 24));
    public static final DeferredItem<Item> TOXTRICITY_SPAWN_EGG = ITEMS.register("toxtricity_spawn_egg",
            () -> new SpawnEggItem("toxtricity", 30, 50));
    public static final DeferredItem<Item> SIZZLIPEDE_SPAWN_EGG = ITEMS.register("sizzlipede_spawn_egg",
            () -> new SpawnEggItem("sizzlipede", 6, 31));
    public static final DeferredItem<Item> CENTISKORCH_SPAWN_EGG = ITEMS.register("centiskorch_spawn_egg",
            () -> new SpawnEggItem("centiskorch", 28, 53));
    public static final DeferredItem<Item> CLOBBOPUS_SPAWN_EGG = ITEMS.register("clobbopus_spawn_egg",
            () -> new SpawnEggItem("clobbopus", 6, 31));
    public static final DeferredItem<Item> GRAPPLOCT_SPAWN_EGG = ITEMS.register("grapploct_spawn_egg",
            () -> new SpawnEggItem("grapploct", 35, 48));
    public static final DeferredItem<Item> SINISTEA_SPAWN_EGG = ITEMS.register("sinistea_spawn_egg",
            () -> new SpawnEggItem("sinistea", 6, 31));
    public static final DeferredItem<Item> POLTEAGEIST_SPAWN_EGG = ITEMS.register("polteageist_spawn_egg",
            () -> new SpawnEggItem("polteageist", 26, 51));
    public static final DeferredItem<Item> HATENNA_SPAWN_EGG = ITEMS.register("hatenna_spawn_egg",
            () -> new SpawnEggItem("hatenna", 2, 27));
    public static final DeferredItem<Item> HATTREM_SPAWN_EGG = ITEMS.register("hattrem_spawn_egg",
            () -> new SpawnEggItem("hattrem", 32, 37));
    public static final DeferredItem<Item> HATTERENE_SPAWN_EGG = ITEMS.register("hatterene_spawn_egg",
            () -> new SpawnEggItem("hatterene", 42, 51));
    public static final DeferredItem<Item> IMPIDIMP_SPAWN_EGG = ITEMS.register("impidimp_spawn_egg",
            () -> new SpawnEggItem("impidimp", 2, 27));
    public static final DeferredItem<Item> MORGREM_SPAWN_EGG = ITEMS.register("morgrem_spawn_egg",
            () -> new SpawnEggItem("morgrem", 32, 37));
    public static final DeferredItem<Item> GRIMMSNARL_SPAWN_EGG = ITEMS.register("grimmsnarl_spawn_egg",
            () -> new SpawnEggItem("grimmsnarl", 42, 51));
    public static final DeferredItem<Item> OBSTAGOON_SPAWN_EGG = ITEMS.register("obstagoon_spawn_egg",
            () -> new SpawnEggItem("obstagoon", 35, 52));
    public static final DeferredItem<Item> PERRSERKER_SPAWN_EGG = ITEMS.register("perrserker_spawn_egg",
            () -> new SpawnEggItem("perrserker", 28, 44));
    public static final DeferredItem<Item> CURSOLA_SPAWN_EGG = ITEMS.register("cursola_spawn_egg",
            () -> new SpawnEggItem("cursola", 38, 51));
    public static final DeferredItem<Item> SIRFETCHD_SPAWN_EGG = ITEMS.register("sirfetchd_spawn_egg",
            () -> new SpawnEggItem("sirfetch'd", 33, 51));
    public static final DeferredItem<Item> MR_RIME_SPAWN_EGG = ITEMS.register("mr_rime_spawn_egg",
            () -> new SpawnEggItem("mr. rime", 42, 52));
    public static final DeferredItem<Item> MILCERY_SPAWN_EGG = ITEMS.register("milcery_spawn_egg",
            () -> new SpawnEggItem("milcery", 2, 27));
    public static final DeferredItem<Item> ALCREMIE_SPAWN_EGG = ITEMS.register("alcremie_spawn_egg",
            () -> new SpawnEggItem("alcremie", 22, 50));
    public static final DeferredItem<Item> FALINKS_SPAWN_EGG = ITEMS.register("falinks_spawn_egg",
            () -> new SpawnEggItem("falinks", 22, 47));
    public static final DeferredItem<Item> PINCURCHIN_SPAWN_EGG = ITEMS.register("pincurchin_spawn_egg",
            () -> new SpawnEggItem("pincurchin", 19, 44));
    public static final DeferredItem<Item> STONJOURNER_SPAWN_EGG = ITEMS.register("stonjourner_spawn_egg",
            () -> new SpawnEggItem("stonjourner", 22, 47));
    public static final DeferredItem<Item> EISCUE_SPAWN_EGG = ITEMS.register("eiscue_spawn_egg",
            () -> new SpawnEggItem("eiscue", 22, 47));
    public static final DeferredItem<Item> MORPEKO_SPAWN_EGG = ITEMS.register("morpeko_spawn_egg",
            () -> new SpawnEggItem("morpeko", 19, 44));
    public static final DeferredItem<Item> CUFANT_SPAWN_EGG = ITEMS.register("cufant_spawn_egg",
            () -> new SpawnEggItem("cufant", 8, 33));
    public static final DeferredItem<Item> COPPERAJAH_SPAWN_EGG = ITEMS.register("copperajah_spawn_egg",
            () -> new SpawnEggItem("copperajah", 34, 50));
    public static final DeferredItem<Item> DREEPY_SPAWN_EGG = ITEMS.register("dreepy_spawn_egg",
            () -> new SpawnEggItem("dreepy", 2, 27));
    public static final DeferredItem<Item> DRAKLOAK_SPAWN_EGG = ITEMS.register("drakloak_spawn_egg",
            () -> new SpawnEggItem("drakloak", 50, 55));
    public static final DeferredItem<Item> DRAGAPULT_SPAWN_EGG = ITEMS.register("dragapult_spawn_egg",
            () -> new SpawnEggItem("dragapult", 60, 65));
    public static final DeferredItem<Item> WYRDEER_SPAWN_EGG = ITEMS.register("wyrdeer_spawn_egg",
            () -> new SpawnEggItem("wyrdeer", 42, 53));
    public static final DeferredItem<Item> KLEAVOR_SPAWN_EGG = ITEMS.register("kleavor_spawn_egg",
            () -> new SpawnEggItem("kleavor", 45, 50));
    public static final DeferredItem<Item> URSALUNA_SPAWN_EGG = ITEMS.register("ursaluna_spawn_egg",
            () -> new SpawnEggItem("ursaluna", 45, 55));
    public static final DeferredItem<Item> BASCULEGION_SPAWN_EGG = ITEMS.register("basculegion_spawn_egg",
            () -> new SpawnEggItem("basculegion", 41, 53));
    public static final DeferredItem<Item> SNEASLER_SPAWN_EGG = ITEMS.register("sneasler_spawn_egg",
            () -> new SpawnEggItem("sneasler", 38, 51));
    public static final DeferredItem<Item> OVERQWIL_SPAWN_EGG = ITEMS.register("overqwil_spawn_egg",
            () -> new SpawnEggItem("overqwil", 39, 51));
    public static final DeferredItem<Item> SPRIGATITO_SPAWN_EGG = ITEMS.register("sprigatito_spawn_egg",
            () -> new SpawnEggItem("sprigatito", 5, 31));
    public static final DeferredItem<Item> FLORAGATO_SPAWN_EGG = ITEMS.register("floragato_spawn_egg",
            () -> new SpawnEggItem("floragato", 16, 41));
    public static final DeferredItem<Item> MEOWSCARADA_SPAWN_EGG = ITEMS.register("meowscarada_spawn_egg",
            () -> new SpawnEggItem("meowscarada", 36, 53));
    public static final DeferredItem<Item> FUECOCO_SPAWN_EGG = ITEMS.register("fuecoco_spawn_egg",
            () -> new SpawnEggItem("fuecoco", 5, 31));
    public static final DeferredItem<Item> CROCALOR_SPAWN_EGG = ITEMS.register("crocalor_spawn_egg",
            () -> new SpawnEggItem("crocalor", 16, 41));
    public static final DeferredItem<Item> SKELEDIRGE_SPAWN_EGG = ITEMS.register("skeledirge_spawn_egg",
            () -> new SpawnEggItem("skeledirge", 36, 53));
    public static final DeferredItem<Item> QUAXLY_SPAWN_EGG = ITEMS.register("quaxly_spawn_egg",
            () -> new SpawnEggItem("quaxly", 5, 31));
    public static final DeferredItem<Item> QUAXWELL_SPAWN_EGG = ITEMS.register("quaxwell_spawn_egg",
            () -> new SpawnEggItem("quaxwell", 16, 41));
    public static final DeferredItem<Item> QUAQUAVAL_SPAWN_EGG = ITEMS.register("quaquaval_spawn_egg",
            () -> new SpawnEggItem("quaquaval", 36, 53));
    public static final DeferredItem<Item> LECHONK_SPAWN_EGG = ITEMS.register("lechonk_spawn_egg",
            () -> new SpawnEggItem("lechonk", 1, 25));
    public static final DeferredItem<Item> OINKOLOGNE_SPAWN_EGG = ITEMS.register("oinkologne_spawn_egg",
            () -> new SpawnEggItem("oinkologne", 18, 49));
    public static final DeferredItem<Item> TAROUNTULA_SPAWN_EGG = ITEMS.register("tarountula_spawn_egg",
            () -> new SpawnEggItem("tarountula", 1, 21));
    public static final DeferredItem<Item> SPIDOPS_SPAWN_EGG = ITEMS.register("spidops_spawn_egg",
            () -> new SpawnEggItem("spidops", 15, 40));
    public static final DeferredItem<Item> TANDEMAUS_SPAWN_EGG = ITEMS.register("tandemaus_spawn_egg",
            () -> new SpawnEggItem("tandemaus", 6, 31));
    public static final DeferredItem<Item> MAUSHOLD_SPAWN_EGG = ITEMS.register("maushold_spawn_egg",
            () -> new SpawnEggItem("maushold", 25, 47));
    public static final DeferredItem<Item> FIDOUGH_SPAWN_EGG = ITEMS.register("fidough_spawn_egg",
            () -> new SpawnEggItem("fidough", 6, 31));
    public static final DeferredItem<Item> DACHSBUN_SPAWN_EGG = ITEMS.register("dachsbun_spawn_egg",
            () -> new SpawnEggItem("dachsbun", 26, 48));
    public static final DeferredItem<Item> SMOLIV_SPAWN_EGG = ITEMS.register("smoliv_spawn_egg",
            () -> new SpawnEggItem("smoliv", 1, 26));
    public static final DeferredItem<Item> DOLLIV_SPAWN_EGG = ITEMS.register("dolliv_spawn_egg",
            () -> new SpawnEggItem("dolliv", 25, 35));
    public static final DeferredItem<Item> ARBOLIVA_SPAWN_EGG = ITEMS.register("arboliva_spawn_egg",
            () -> new SpawnEggItem("arboliva", 35, 51));
    public static final DeferredItem<Item> SQUAWKABILLY_SPAWN_EGG = ITEMS.register("squawkabilly_spawn_egg",
            () -> new SpawnEggItem("squawkabilly", 17, 42));
    public static final DeferredItem<Item> NACLI_SPAWN_EGG = ITEMS.register("nacli_spawn_egg",
            () -> new SpawnEggItem("nacli", 3, 28));
    public static final DeferredItem<Item> NACLSTACK_SPAWN_EGG = ITEMS.register("naclstack_spawn_egg",
            () -> new SpawnEggItem("naclstack", 24, 36));
    public static final DeferredItem<Item> GARGANACL_SPAWN_EGG = ITEMS.register("garganacl_spawn_egg",
            () -> new SpawnEggItem("garganacl", 38, 50));
    public static final DeferredItem<Item> CHARCADET_SPAWN_EGG = ITEMS.register("charcadet_spawn_egg",
            () -> new SpawnEggItem("charcadet", 1, 26));
    public static final DeferredItem<Item> ARMAROUGE_SPAWN_EGG = ITEMS.register("armarouge_spawn_egg",
            () -> new SpawnEggItem("armarouge", 21, 53));
    public static final DeferredItem<Item> CERULEDGE_SPAWN_EGG = ITEMS.register("ceruledge_spawn_egg",
            () -> new SpawnEggItem("ceruledge", 21, 53));
    public static final DeferredItem<Item> TADBULB_SPAWN_EGG = ITEMS.register("tadbulb_spawn_egg",
            () -> new SpawnEggItem("tadbulb", 2, 27));
    public static final DeferredItem<Item> BELLIBOLT_SPAWN_EGG = ITEMS.register("bellibolt_spawn_egg",
            () -> new SpawnEggItem("bellibolt", 22, 50));
    public static final DeferredItem<Item> WATTREL_SPAWN_EGG = ITEMS.register("wattrel_spawn_egg",
            () -> new SpawnEggItem("wattrel", 3, 28));
    public static final DeferredItem<Item> KILOWATTREL_SPAWN_EGG = ITEMS.register("kilowattrel_spawn_egg",
            () -> new SpawnEggItem("kilowattrel", 25, 49));
    public static final DeferredItem<Item> MASCHIFF_SPAWN_EGG = ITEMS.register("maschiff_spawn_egg",
            () -> new SpawnEggItem("maschiff", 9, 34));
    public static final DeferredItem<Item> MABOSSTIFF_SPAWN_EGG = ITEMS.register("mabosstiff_spawn_egg",
            () -> new SpawnEggItem("mabosstiff", 30, 51));
    public static final DeferredItem<Item> SHROODLE_SPAWN_EGG = ITEMS.register("shroodle_spawn_egg",
            () -> new SpawnEggItem("shroodle", 4, 29));
    public static final DeferredItem<Item> GRAFAIAI_SPAWN_EGG = ITEMS.register("grafaiai_spawn_egg",
            () -> new SpawnEggItem("grafaiai", 28, 49));
    public static final DeferredItem<Item> BRAMBLIN_SPAWN_EGG = ITEMS.register("bramblin_spawn_egg",
            () -> new SpawnEggItem("bramblin", 3, 28));
    public static final DeferredItem<Item> BRAMBLEGHAST_SPAWN_EGG = ITEMS.register("brambleghast_spawn_egg",
            () -> new SpawnEggItem("brambleghast", 23, 48));
    public static final DeferredItem<Item> TOEDSCOOL_SPAWN_EGG = ITEMS.register("toedscool_spawn_egg",
            () -> new SpawnEggItem("toedscool", 9, 34));
    public static final DeferredItem<Item> TOEDSCRUEL_SPAWN_EGG = ITEMS.register("toedscruel_spawn_egg",
            () -> new SpawnEggItem("toedscruel", 30, 52));
    public static final DeferredItem<Item> KLAWF_SPAWN_EGG = ITEMS.register("klawf_spawn_egg",
            () -> new SpawnEggItem("klawf", 20, 45));
    public static final DeferredItem<Item> CAPSAKID_SPAWN_EGG = ITEMS.register("capsakid_spawn_egg",
            () -> new SpawnEggItem("capsakid", 5, 30));
    public static final DeferredItem<Item> SCOVILLAIN_SPAWN_EGG = ITEMS.register("scovillain_spawn_egg",
            () -> new SpawnEggItem("scovillain", 25, 49));
    public static final DeferredItem<Item> RELLOR_SPAWN_EGG = ITEMS.register("rellor_spawn_egg",
            () -> new SpawnEggItem("rellor", 2, 27));
    public static final DeferredItem<Item> RABSCA_SPAWN_EGG = ITEMS.register("rabsca_spawn_egg",
            () -> new SpawnEggItem("rabsca", 22, 47));
    public static final DeferredItem<Item> FLITTLE_SPAWN_EGG = ITEMS.register("flittle_spawn_egg",
            () -> new SpawnEggItem("flittle", 1, 26));
    public static final DeferredItem<Item> ESPATHRA_SPAWN_EGG = ITEMS.register("espathra_spawn_egg",
            () -> new SpawnEggItem("espathra", 35, 48));
    public static final DeferredItem<Item> TINKATINK_SPAWN_EGG = ITEMS.register("tinkatink_spawn_egg",
            () -> new SpawnEggItem("tinkatink", 5, 30));
    public static final DeferredItem<Item> TINKATUFF_SPAWN_EGG = ITEMS.register("tinkatuff_spawn_egg",
            () -> new SpawnEggItem("tinkatuff", 24, 38));
    public static final DeferredItem<Item> TINKATON_SPAWN_EGG = ITEMS.register("tinkaton_spawn_egg",
            () -> new SpawnEggItem("tinkaton", 38, 51));
    public static final DeferredItem<Item> WIGLETT_SPAWN_EGG = ITEMS.register("wiglett_spawn_egg",
            () -> new SpawnEggItem("wiglett", 1, 25));
    public static final DeferredItem<Item> WUGTRIO_SPAWN_EGG = ITEMS.register("wugtrio_spawn_egg",
            () -> new SpawnEggItem("wugtrio", 26, 43));
    public static final DeferredItem<Item> FINIZEN_SPAWN_EGG = ITEMS.register("finizen_spawn_egg",
            () -> new SpawnEggItem("finizen", 7, 32));
    public static final DeferredItem<Item> PALAFIN_SPAWN_EGG = ITEMS.register("palafin_spawn_egg",
            () -> new SpawnEggItem("palafin", 38, 46));
    public static final DeferredItem<Item> VAROOM_SPAWN_EGG = ITEMS.register("varoom_spawn_egg",
            () -> new SpawnEggItem("varoom", 5, 30));
    public static final DeferredItem<Item> REVAVROOM_SPAWN_EGG = ITEMS.register("revavroom_spawn_egg",
            () -> new SpawnEggItem("revavroom", 40, 50));
    public static final DeferredItem<Item> CYCLIZAR_SPAWN_EGG = ITEMS.register("cyclizar_spawn_egg",
            () -> new SpawnEggItem("cyclizar", 25, 50));
    public static final DeferredItem<Item> ORTHWORM_SPAWN_EGG = ITEMS.register("orthworm_spawn_egg",
            () -> new SpawnEggItem("orthworm", 23, 48));
    public static final DeferredItem<Item> GLIMMET_SPAWN_EGG = ITEMS.register("glimmet_spawn_egg",
            () -> new SpawnEggItem("glimmet", 10, 35));
    public static final DeferredItem<Item> GLIMMORA_SPAWN_EGG = ITEMS.register("glimmora_spawn_egg",
            () -> new SpawnEggItem("glimmora", 35, 53));
    public static final DeferredItem<Item> FLAMIGO_SPAWN_EGG = ITEMS.register("flamigo_spawn_egg",
            () -> new SpawnEggItem("flamigo", 25, 50));
    public static final DeferredItem<Item> CETODDLE_SPAWN_EGG = ITEMS.register("cetoddle_spawn_egg",
            () -> new SpawnEggItem("cetoddle", 8, 33));
    public static final DeferredItem<Item> CETITAN_SPAWN_EGG = ITEMS.register("cetitan_spawn_egg",
            () -> new SpawnEggItem("cetitan", 28, 52));
    public static final DeferredItem<Item> VELUZA_SPAWN_EGG = ITEMS.register("veluza_spawn_egg",
            () -> new SpawnEggItem("veluza", 23, 48));
    public static final DeferredItem<Item> DONDOZO_SPAWN_EGG = ITEMS.register("dondozo_spawn_egg",
            () -> new SpawnEggItem("dondozo", 28, 53));
    public static final DeferredItem<Item> TATSUGIRI_SPAWN_EGG = ITEMS.register("tatsugiri_spawn_egg",
            () -> new SpawnEggItem("tatsugiri", 23, 48));
    public static final DeferredItem<Item> ANNIHILAPE_SPAWN_EGG = ITEMS.register("annihilape_spawn_egg",
            () -> new SpawnEggItem("annihilape", 35, 54));
    public static final DeferredItem<Item> CLODSIRE_SPAWN_EGG = ITEMS.register("clodsire_spawn_egg",
            () -> new SpawnEggItem("clodsire", 20, 43));
    public static final DeferredItem<Item> FARIGIRAF_SPAWN_EGG = ITEMS.register("farigiraf_spawn_egg",
            () -> new SpawnEggItem("farigiraf", 32, 45));
    public static final DeferredItem<Item> DUDUNSPARCE_SPAWN_EGG = ITEMS.register("dudunsparce_spawn_egg",
            () -> new SpawnEggItem("dudunsparce", 32, 52));
    public static final DeferredItem<Item> ROAMING_GIMMIGHOUL_SPAWN_EGG = ITEMS.register("roaming_gimmighoul_spawn_egg",
            () -> new SpawnEggItem("roaming gimmighoul", 5, 30));
    public static final DeferredItem<Item> CHEST_GIMMIGHOUL_SPAWN_EGG = ITEMS.register("chest_gimmighoul_spawn_egg",
            () -> new SpawnEggItem("chest gimmighoul", 5, 30));
    public static final DeferredItem<Item> POLTCHAGEIST_SPAWN_EGG = ITEMS.register("poltchageist_spawn_egg",
            () -> new SpawnEggItem("poltchageist", 6, 31));
    public static final DeferredItem<Item> SINISTCHA_SPAWN_EGG = ITEMS.register("sinistcha_spawn_egg",
            () -> new SpawnEggItem("sinistcha", 26, 51));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}