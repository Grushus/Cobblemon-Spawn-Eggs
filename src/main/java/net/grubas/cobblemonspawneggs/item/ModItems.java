package net.grubas.cobblemonspawneggs.item;

import net.grubas.cobblemonspawneggs.CobblemonSpawnEggs;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CobblemonSpawnEggs.MOD_ID);

    public static final DeferredItem<Item> BULBASAUR_SPAWN_EGG = ITEMS.register("bulbasaur_spawn_egg",
            () -> new SpawnEggItem("bulbasaur"));
    public static final DeferredItem<Item> IVYSAUR_SPAWN_EGG = ITEMS.register("ivysaur_spawn_egg",
            () -> new SpawnEggItem("ivysaur"));
    public static final DeferredItem<Item> VENUSAUR_SPAWN_EGG = ITEMS.register("venusaur_spawn_egg",
            () -> new SpawnEggItem("venusaur"));
    public static final DeferredItem<Item> CHARMANDER_SPAWN_EGG = ITEMS.register("charmander_spawn_egg",
            () -> new SpawnEggItem("charmander"));
    public static final DeferredItem<Item> CHARMELEON_SPAWN_EGG = ITEMS.register("charmeleon_spawn_egg",
            () -> new SpawnEggItem("charmeleon"));
    public static final DeferredItem<Item> CHARIZARD_SPAWN_EGG = ITEMS.register("charizard_spawn_egg",
            () -> new SpawnEggItem("charizard"));
    public static final DeferredItem<Item> SQUIRTLE_SPAWN_EGG = ITEMS.register("squirtle_spawn_egg",
            () -> new SpawnEggItem("squirtle"));
    public static final DeferredItem<Item> WARTORTLE_SPAWN_EGG = ITEMS.register("wartortle_spawn_egg",
            () -> new SpawnEggItem("wartortle"));
    public static final DeferredItem<Item> BLASTOISE_SPAWN_EGG = ITEMS.register("blastoise_spawn_egg",
            () -> new SpawnEggItem("blastoise"));
    public static final DeferredItem<Item> CATERPIE_SPAWN_EGG = ITEMS.register("caterpie_spawn_egg",
            () -> new SpawnEggItem("caterpie"));
    public static final DeferredItem<Item> METAPOD_SPAWN_EGG = ITEMS.register("metapod_spawn_egg",
            () -> new SpawnEggItem("metapod"));
    public static final DeferredItem<Item> BUTTERFREE_SPAWN_EGG = ITEMS.register("butterfree_spawn_egg",
            () -> new SpawnEggItem("butterfree"));
    public static final DeferredItem<Item> WEEDLE_SPAWN_EGG = ITEMS.register("weedle_spawn_egg",
            () -> new SpawnEggItem("weedle"));
    public static final DeferredItem<Item> KAKUNA_SPAWN_EGG = ITEMS.register("kakuna_spawn_egg",
            () -> new SpawnEggItem("kakuna"));
    public static final DeferredItem<Item> BEEDRILL_SPAWN_EGG = ITEMS.register("beedrill_spawn_egg",
            () -> new SpawnEggItem("beedrill"));
    public static final DeferredItem<Item> PIDGEY_SPAWN_EGG = ITEMS.register("pidgey_spawn_egg",
            () -> new SpawnEggItem("pidgey"));
    public static final DeferredItem<Item> PIDGEOTTO_SPAWN_EGG = ITEMS.register("pidgeotto_spawn_egg",
            () -> new SpawnEggItem("pidgeotto"));
    public static final DeferredItem<Item> PIDGEOT_SPAWN_EGG = ITEMS.register("pidgeot_spawn_egg",
            () -> new SpawnEggItem("pidgeot"));
    public static final DeferredItem<Item> RATTATA_SPAWN_EGG = ITEMS.register("rattata_spawn_egg",
            () -> new SpawnEggItem("rattata"));
    public static final DeferredItem<Item> ALOLAN_RATTATA_SPAWN_EGG = ITEMS.register("alolan_rattata_spawn_egg",
            () -> new SpawnEggItem("alolan rattata"));
    public static final DeferredItem<Item> RATICATE_SPAWN_EGG = ITEMS.register("raticate_spawn_egg",
            () -> new SpawnEggItem("raticate"));
    public static final DeferredItem<Item> ALOLAN_RATICATE_SPAWN_EGG = ITEMS.register("alolan_raticate_spawn_egg",
            () -> new SpawnEggItem("alolan raticate"));
    public static final DeferredItem<Item> SPEAROW_SPAWN_EGG = ITEMS.register("spearow_spawn_egg",
            () -> new SpawnEggItem("spearow"));
    public static final DeferredItem<Item> FEAROW_SPAWN_EGG = ITEMS.register("fearow_spawn_egg",
            () -> new SpawnEggItem("fearow"));
    public static final DeferredItem<Item> EKANS_SPAWN_EGG = ITEMS.register("ekans_spawn_egg",
            () -> new SpawnEggItem("ekans"));
    public static final DeferredItem<Item> ARBOK_SPAWN_EGG = ITEMS.register("arbok_spawn_egg",
            () -> new SpawnEggItem("arbok"));
    public static final DeferredItem<Item> PIKACHU_SPAWN_EGG = ITEMS.register("pikachu_spawn_egg",
            () -> new SpawnEggItem("pikachu"));
    public static final DeferredItem<Item> RAICHU_SPAWN_EGG = ITEMS.register("raichu_spawn_egg",
            () -> new SpawnEggItem("raichu"));
    public static final DeferredItem<Item> ALOLAN_RAICHU_SPAWN_EGG = ITEMS.register("alolan_raichu_spawn_egg",
            () -> new SpawnEggItem("alolan raichu"));
    public static final DeferredItem<Item> SANDSHREW_SPAWN_EGG = ITEMS.register("sandshrew_spawn_egg",
            () -> new SpawnEggItem("sandshrew"));
    public static final DeferredItem<Item> ALOLAN_SANDSHREW_SPAWN_EGG = ITEMS.register("alolan_sandshrew_spawn_egg",
            () -> new SpawnEggItem("alolan sandshrew"));
    public static final DeferredItem<Item> SANDSLASH_SPAWN_EGG = ITEMS.register("sandslash_spawn_egg",
            () -> new SpawnEggItem("sandslash"));
    public static final DeferredItem<Item> ALOLAN_SANDSLASH_SPAWN_EGG = ITEMS.register("alolan_sandslash_spawn_egg",
            () -> new SpawnEggItem("alolan sandslash"));
    public static final DeferredItem<Item> NIDORAN_F_SPAWN_EGG = ITEMS.register("nidoran_f_spawn_egg",
            () -> new SpawnEggItem("nidoranf"));
    public static final DeferredItem<Item> NIDORINA_SPAWN_EGG = ITEMS.register("nidorina_spawn_egg",
            () -> new SpawnEggItem("nidorina"));
    public static final DeferredItem<Item> NIDOQUEEN_SPAWN_EGG = ITEMS.register("nidoqueen_spawn_egg",
            () -> new SpawnEggItem("nidoqueen"));
    public static final DeferredItem<Item> NIDORAN_M_SPAWN_EGG = ITEMS.register("nidoran_m_spawn_egg",
            () -> new SpawnEggItem("nidoranm"));
    public static final DeferredItem<Item> NIDORINO_SPAWN_EGG = ITEMS.register("nidorino_spawn_egg",
            () -> new SpawnEggItem("nidorino"));
    public static final DeferredItem<Item> NIDOKING_SPAWN_EGG = ITEMS.register("nidoking_spawn_egg",
            () -> new SpawnEggItem("nidoking"));
    public static final DeferredItem<Item> CLEFAIRY_SPAWN_EGG = ITEMS.register("clefairy_spawn_egg",
            () -> new SpawnEggItem("clefairy"));
    public static final DeferredItem<Item> CLEFABLE_SPAWN_EGG = ITEMS.register("clefable_spawn_egg",
            () -> new SpawnEggItem("clefable"));
    public static final DeferredItem<Item> VULPIX_SPAWN_EGG = ITEMS.register("vulpix_spawn_egg",
            () -> new SpawnEggItem("vulpix"));
    public static final DeferredItem<Item> ALOLAN_VULPIX_SPAWN_EGG = ITEMS.register("alolan_vulpix_spawn_egg",
            () -> new SpawnEggItem("alolan vulpix"));
    public static final DeferredItem<Item> NINETALES_SPAWN_EGG = ITEMS.register("ninetales_spawn_egg",
            () -> new SpawnEggItem("ninetales"));
    public static final DeferredItem<Item> ALOLAN_NINETALES_SPAWN_EGG = ITEMS.register("alolan_ninetales_spawn_egg",
            () -> new SpawnEggItem("alolan ninetales"));
    public static final DeferredItem<Item> JIGGLYPUFF_SPAWN_EGG = ITEMS.register("jigglypuff_spawn_egg",
            () -> new SpawnEggItem("jigglypuff"));
    public static final DeferredItem<Item> WIGGLYTUFF_SPAWN_EGG = ITEMS.register("wigglytuff_spawn_egg",
            () -> new SpawnEggItem("wigglytuff"));
    public static final DeferredItem<Item> ZUBAT_SPAWN_EGG = ITEMS.register("zubat_spawn_egg",
            () -> new SpawnEggItem("zubat"));
    public static final DeferredItem<Item> GOLBAT_SPAWN_EGG = ITEMS.register("golbat_spawn_egg",
            () -> new SpawnEggItem("golbat"));
    public static final DeferredItem<Item> ODDISH_SPAWN_EGG = ITEMS.register("oddish_spawn_egg",
            () -> new SpawnEggItem("oddish"));
    public static final DeferredItem<Item> GLOOM_SPAWN_EGG = ITEMS.register("gloom_spawn_egg",
            () -> new SpawnEggItem("gloom"));
    public static final DeferredItem<Item> VILEPLUME_SPAWN_EGG = ITEMS.register("vileplume_spawn_egg",
            () -> new SpawnEggItem("vileplume"));
    public static final DeferredItem<Item> PARAS_SPAWN_EGG = ITEMS.register("paras_spawn_egg",
            () -> new SpawnEggItem("paras"));
    public static final DeferredItem<Item> PARASECT_SPAWN_EGG = ITEMS.register("parasect_spawn_egg",
            () -> new SpawnEggItem("parasect"));
    public static final DeferredItem<Item> VENONAT_SPAWN_EGG = ITEMS.register("venonat_spawn_egg",
            () -> new SpawnEggItem("venonat"));
    public static final DeferredItem<Item> VENOMOTH_SPAWN_EGG = ITEMS.register("venomoth_spawn_egg",
            () -> new SpawnEggItem("venomoth"));
    public static final DeferredItem<Item> DIGLETT_SPAWN_EGG = ITEMS.register("diglett_spawn_egg",
            () -> new SpawnEggItem("diglett"));
    public static final DeferredItem<Item> ALOLAN_DIGLETT_SPAWN_EGG = ITEMS.register("alolan_diglett_spawn_egg",
            () -> new SpawnEggItem("alolan diglett"));
    public static final DeferredItem<Item> DUGTRIO_SPAWN_EGG = ITEMS.register("dugtrio_spawn_egg",
            () -> new SpawnEggItem("dugtrio"));
    public static final DeferredItem<Item> ALOLAN_DUGTRIO_SPAWN_EGG = ITEMS.register("alolan_dugtrio_spawn_egg",
            () -> new SpawnEggItem("alolan dugtrio"));
    public static final DeferredItem<Item> MEOWTH_SPAWN_EGG = ITEMS.register("meowth_spawn_egg",
            () -> new SpawnEggItem("meowth"));
    public static final DeferredItem<Item> ALOLAN_MEOWTH_SPAWN_EGG = ITEMS.register("alolan_meowth_spawn_egg",
            () -> new SpawnEggItem("alolan meowth"));
    public static final DeferredItem<Item> GALARIAN_MEOWTH_SPAWN_EGG = ITEMS.register("galarian_meowth_spawn_egg",
            () -> new SpawnEggItem("galarian meowth"));
    public static final DeferredItem<Item> PERSIAN_SPAWN_EGG = ITEMS.register("persian_spawn_egg",
            () -> new SpawnEggItem("persian"));
    public static final DeferredItem<Item> ALOLAN_PERSIAN_SPAWN_EGG = ITEMS.register("alolan_persian_spawn_egg",
            () -> new SpawnEggItem("alolan persian"));
    public static final DeferredItem<Item> PSYDUCK_SPAWN_EGG = ITEMS.register("psyduck_spawn_egg",
            () -> new SpawnEggItem("psyduck"));
    public static final DeferredItem<Item> GOLDUCK_SPAWN_EGG = ITEMS.register("golduck_spawn_egg",
            () -> new SpawnEggItem("golduck"));
    public static final DeferredItem<Item> MANKEY_SPAWN_EGG = ITEMS.register("mankey_spawn_egg",
            () -> new SpawnEggItem("mankey"));
    public static final DeferredItem<Item> PRIMEAPE_SPAWN_EGG = ITEMS.register("primeape_spawn_egg",
            () -> new SpawnEggItem("primeape"));
    public static final DeferredItem<Item> GROWLITHE_SPAWN_EGG = ITEMS.register("growlithe_spawn_egg",
            () -> new SpawnEggItem("growlithe"));
    public static final DeferredItem<Item> HISUIAN_GROWLITHE_SPAWN_EGG = ITEMS.register("hisuian_growlithe_spawn_egg",
            () -> new SpawnEggItem("hisuian growlithe"));
    public static final DeferredItem<Item> ARCANINE_SPAWN_EGG = ITEMS.register("arcanine_spawn_egg",
            () -> new SpawnEggItem("arcanine"));
    public static final DeferredItem<Item> HISUIAN_ARCANINE_SPAWN_EGG = ITEMS.register("hisuian_arcanine_spawn_egg",
            () -> new SpawnEggItem("hisuian arcanine"));
    public static final DeferredItem<Item> POLIWAG_SPAWN_EGG = ITEMS.register("poliwag_spawn_egg",
            () -> new SpawnEggItem("poliwag"));
    public static final DeferredItem<Item> POLIWHIRL_SPAWN_EGG = ITEMS.register("poliwhirl_spawn_egg",
            () -> new SpawnEggItem("poliwhirl"));
    public static final DeferredItem<Item> POLIWRATH_SPAWN_EGG = ITEMS.register("poliwrath_spawn_egg",
            () -> new SpawnEggItem("poliwrath"));
    public static final DeferredItem<Item> ABRA_SPAWN_EGG = ITEMS.register("abra_spawn_egg",
            () -> new SpawnEggItem("abra"));
    public static final DeferredItem<Item> KADABRA_SPAWN_EGG = ITEMS.register("kadabra_spawn_egg",
            () -> new SpawnEggItem("kadabra"));
    public static final DeferredItem<Item> ALAKAZAM_SPAWN_EGG = ITEMS.register("alakazam_spawn_egg",
            () -> new SpawnEggItem("alakazam"));
    public static final DeferredItem<Item> MACHOP_SPAWN_EGG = ITEMS.register("machop_spawn_egg",
            () -> new SpawnEggItem("machop"));
    public static final DeferredItem<Item> MACHOKE_SPAWN_EGG = ITEMS.register("machoke_spawn_egg",
            () -> new SpawnEggItem("machoke"));
    public static final DeferredItem<Item> MACHAMP_SPAWN_EGG = ITEMS.register("machamp_spawn_egg",
            () -> new SpawnEggItem("machamp"));
    public static final DeferredItem<Item> BELLSPROUT_SPAWN_EGG = ITEMS.register("bellsprout_spawn_egg",
            () -> new SpawnEggItem("bellsprout"));
    public static final DeferredItem<Item> WEEPINBELL_SPAWN_EGG = ITEMS.register("weepinbell_spawn_egg",
            () -> new SpawnEggItem("weepinbell"));
    public static final DeferredItem<Item> VICTREEBEL_SPAWN_EGG = ITEMS.register("victreebel_spawn_egg",
            () -> new SpawnEggItem("victreebel"));
    public static final DeferredItem<Item> TENTACOOL_SPAWN_EGG = ITEMS.register("tentacool_spawn_egg",
            () -> new SpawnEggItem("tentacool"));
    public static final DeferredItem<Item> TENTACRUEL_SPAWN_EGG = ITEMS.register("tentacruel_spawn_egg",
            () -> new SpawnEggItem("tentacruel"));
    public static final DeferredItem<Item> GEODUDE_SPAWN_EGG = ITEMS.register("geodude_spawn_egg",
            () -> new SpawnEggItem("geodude"));
    public static final DeferredItem<Item> ALOLAN_GEODUDE_SPAWN_EGG = ITEMS.register("alolan_geodude_spawn_egg",
            () -> new SpawnEggItem("alolan geodude"));
    public static final DeferredItem<Item> GRAVELER_SPAWN_EGG = ITEMS.register("graveler_spawn_egg",
            () -> new SpawnEggItem("graveler"));
    public static final DeferredItem<Item> ALOLAN_GRAVELER_SPAWN_EGG = ITEMS.register("alolan_graveler_spawn_egg",
            () -> new SpawnEggItem("alolan graveler"));
    public static final DeferredItem<Item> GOLEM_SPAWN_EGG = ITEMS.register("golem_spawn_egg",
            () -> new SpawnEggItem("golem"));
    public static final DeferredItem<Item> ALOLAN_GOLEM_SPAWN_EGG = ITEMS.register("alolan_golem_spawn_egg",
            () -> new SpawnEggItem("alolan golem"));
    public static final DeferredItem<Item> PONYTA_SPAWN_EGG = ITEMS.register("ponyta_spawn_egg",
            () -> new SpawnEggItem("ponyta"));
    public static final DeferredItem<Item> GALARIAN_PONYTA_SPAWN_EGG = ITEMS.register("galarian_ponyta_spawn_egg",
            () -> new SpawnEggItem("galarian ponyta"));
    public static final DeferredItem<Item> RAPIDASH_SPAWN_EGG = ITEMS.register("rapidash_spawn_egg",
            () -> new SpawnEggItem("rapidash"));
    public static final DeferredItem<Item> GALARIAN_RAPIDASH_SPAWN_EGG = ITEMS.register("galarian_rapidash_spawn_egg",
            () -> new SpawnEggItem("galarian rapidash"));
    public static final DeferredItem<Item> SLOWPOKE_SPAWN_EGG = ITEMS.register("slowpoke_spawn_egg",
            () -> new SpawnEggItem("slowpoke"));
    public static final DeferredItem<Item> GALARIAN_SLOWPOKE_SPAWN_EGG = ITEMS.register("galarian_slowpoke_spawn_egg",
            () -> new SpawnEggItem("galarian slowpoke"));
    public static final DeferredItem<Item> SLOWBRO_SPAWN_EGG = ITEMS.register("slowbro_spawn_egg",
            () -> new SpawnEggItem("slowbro"));
    public static final DeferredItem<Item> GALARIAN_SLOWBRO_SPAWN_EGG = ITEMS.register("galarian_slowbro_spawn_egg",
            () -> new SpawnEggItem("galarian slowbro"));
    public static final DeferredItem<Item> MAGNEMITE_SPAWN_EGG = ITEMS.register("magnemite_spawn_egg",
            () -> new SpawnEggItem("magnemite"));
    public static final DeferredItem<Item> MAGNETON_SPAWN_EGG = ITEMS.register("magneton_spawn_egg",
            () -> new SpawnEggItem("magneton"));
    public static final DeferredItem<Item> FARFETCHD_SPAWN_EGG = ITEMS.register("farfetchd_spawn_egg",
            () -> new SpawnEggItem("farfetch'd"));
    public static final DeferredItem<Item> GALARIAN_FARFETCHD_SPAWN_EGG = ITEMS.register("galarian_farfetchd_spawn_egg",
            () -> new SpawnEggItem("galarian farfetch'd"));
    public static final DeferredItem<Item> DODUO_SPAWN_EGG = ITEMS.register("doduo_spawn_egg",
            () -> new SpawnEggItem("doduo"));
    public static final DeferredItem<Item> DODRIO_SPAWN_EGG = ITEMS.register("dodrio_spawn_egg",
            () -> new SpawnEggItem("dodrio"));
    public static final DeferredItem<Item> SEEL_SPAWN_EGG = ITEMS.register("seel_spawn_egg",
            () -> new SpawnEggItem("seel"));
    public static final DeferredItem<Item> DEWGONG_SPAWN_EGG = ITEMS.register("dewgong_spawn_egg",
            () -> new SpawnEggItem("dewgong"));
    public static final DeferredItem<Item> GRIMER_SPAWN_EGG = ITEMS.register("grimer_spawn_egg",
            () -> new SpawnEggItem("grimer"));
    public static final DeferredItem<Item> ALOLAN_GRIMER_SPAWN_EGG = ITEMS.register("alolan_grimer_spawn_egg",
            () -> new SpawnEggItem("alolan grimer"));
    public static final DeferredItem<Item> MUK_SPAWN_EGG = ITEMS.register("muk_spawn_egg",
            () -> new SpawnEggItem("muk"));
    public static final DeferredItem<Item> ALOLAN_MUK_SPAWN_EGG = ITEMS.register("alolan_muk_spawn_egg",
            () -> new SpawnEggItem("alolan muk"));
    public static final DeferredItem<Item> SHELLDER_SPAWN_EGG = ITEMS.register("shellder_spawn_egg",
            () -> new SpawnEggItem("shellder"));
    public static final DeferredItem<Item> CLOYSTER_SPAWN_EGG = ITEMS.register("cloyster_spawn_egg",
            () -> new SpawnEggItem("cloyster"));
    public static final DeferredItem<Item> GASTLY_SPAWN_EGG = ITEMS.register("gastly_spawn_egg",
            () -> new SpawnEggItem("gastly"));
    public static final DeferredItem<Item> HAUNTER_SPAWN_EGG = ITEMS.register("haunter_spawn_egg",
            () -> new SpawnEggItem("haunter"));
    public static final DeferredItem<Item> GENGAR_SPAWN_EGG = ITEMS.register("gengar_spawn_egg",
            () -> new SpawnEggItem("gengar"));
    public static final DeferredItem<Item> ONIX_SPAWN_EGG = ITEMS.register("onix_spawn_egg",
            () -> new SpawnEggItem("onix"));
    public static final DeferredItem<Item> DROWZEE_SPAWN_EGG = ITEMS.register("drowzee_spawn_egg",
            () -> new SpawnEggItem("drowzee"));
    public static final DeferredItem<Item> HYPNO_SPAWN_EGG = ITEMS.register("hypno_spawn_egg",
            () -> new SpawnEggItem("hypno"));
    public static final DeferredItem<Item> KRABBY_SPAWN_EGG = ITEMS.register("krabby_spawn_egg",
            () -> new SpawnEggItem("krabby"));
    public static final DeferredItem<Item> KINGLER_SPAWN_EGG = ITEMS.register("kingler_spawn_egg",
            () -> new SpawnEggItem("kingler"));
    public static final DeferredItem<Item> VOLTORB_SPAWN_EGG = ITEMS.register("voltorb_spawn_egg",
            () -> new SpawnEggItem("voltorb"));
    public static final DeferredItem<Item> HISUIAN_VOLTORB_SPAWN_EGG = ITEMS.register("hisuian_voltorb_spawn_egg",
            () -> new SpawnEggItem("hisuian voltorb"));
    public static final DeferredItem<Item> ELECTRODE_SPAWN_EGG = ITEMS.register("electrode_spawn_egg",
            () -> new SpawnEggItem("electrode"));
    public static final DeferredItem<Item> HISUIAN_ELECTRODE_SPAWN_EGG = ITEMS.register("hisuian_electrode_spawn_egg",
            () -> new SpawnEggItem("hisuian electrode"));
    public static final DeferredItem<Item> EXEGGCUTE_SPAWN_EGG = ITEMS.register("exeggcute_spawn_egg",
            () -> new SpawnEggItem("exeggcute"));
    public static final DeferredItem<Item> EXEGGUTOR_SPAWN_EGG = ITEMS.register("exeggutor_spawn_egg",
            () -> new SpawnEggItem("exeggutor"));
    public static final DeferredItem<Item> ALOLAN_EXEGGUTOR_SPAWN_EGG = ITEMS.register("alolan_exeggutor_spawn_egg",
            () -> new SpawnEggItem("alolan exeggutor"));
    public static final DeferredItem<Item> CUBONE_SPAWN_EGG = ITEMS.register("cubone_spawn_egg",
            () -> new SpawnEggItem("cubone"));
    public static final DeferredItem<Item> MAROWAK_SPAWN_EGG = ITEMS.register("marowak_spawn_egg",
            () -> new SpawnEggItem("marowak"));
    public static final DeferredItem<Item> ALOLAN_MAROWAK_SPAWN_EGG = ITEMS.register("alolan_marowak_spawn_egg",
            () -> new SpawnEggItem("alolan marowak"));
    public static final DeferredItem<Item> HITMONLEE_SPAWN_EGG = ITEMS.register("hitmonlee_spawn_egg",
            () -> new SpawnEggItem("hitmonlee"));
    public static final DeferredItem<Item> HITMONCHAN_SPAWN_EGG = ITEMS.register("hitmonchan_spawn_egg",
            () -> new SpawnEggItem("hitmonchan"));
    public static final DeferredItem<Item> LICKITUNG_SPAWN_EGG = ITEMS.register("lickitung_spawn_egg",
            () -> new SpawnEggItem("lickitung"));
    public static final DeferredItem<Item> KOFFING_SPAWN_EGG = ITEMS.register("koffing_spawn_egg",
            () -> new SpawnEggItem("koffing"));
    public static final DeferredItem<Item> WEEZING_SPAWN_EGG = ITEMS.register("weezing_spawn_egg",
            () -> new SpawnEggItem("weezing"));
    public static final DeferredItem<Item> GALARIAN_WEEZING_SPAWN_EGG = ITEMS.register("galarian_weezing_spawn_egg",
            () -> new SpawnEggItem("galarian weezing"));
    public static final DeferredItem<Item> RHYHORN_SPAWN_EGG = ITEMS.register("rhyhorn_spawn_egg",
            () -> new SpawnEggItem("rhyhorn"));
    public static final DeferredItem<Item> RHYDON_SPAWN_EGG = ITEMS.register("rhydon_spawn_egg",
            () -> new SpawnEggItem("rhydon"));
    public static final DeferredItem<Item> CHANSEY_SPAWN_EGG = ITEMS.register("chansey_spawn_egg",
            () -> new SpawnEggItem("chansey"));
    public static final DeferredItem<Item> TANGELA_SPAWN_EGG = ITEMS.register("tangela_spawn_egg",
            () -> new SpawnEggItem("tangela"));
    public static final DeferredItem<Item> KANGASKHAN_SPAWN_EGG = ITEMS.register("kangaskhan_spawn_egg",
            () -> new SpawnEggItem("kangaskhan"));
    public static final DeferredItem<Item> HORSEA_SPAWN_EGG = ITEMS.register("horsea_spawn_egg",
            () -> new SpawnEggItem("horsea"));
    public static final DeferredItem<Item> SEADRA_SPAWN_EGG = ITEMS.register("seadra_spawn_egg",
            () -> new SpawnEggItem("seadra"));
    public static final DeferredItem<Item> GOLDEEN_SPAWN_EGG = ITEMS.register("goldeen_spawn_egg",
            () -> new SpawnEggItem("goldeen"));
    public static final DeferredItem<Item> SEAKING_SPAWN_EGG = ITEMS.register("seaking_spawn_egg",
            () -> new SpawnEggItem("seaking"));
    public static final DeferredItem<Item> STARYU_SPAWN_EGG = ITEMS.register("staryu_spawn_egg",
            () -> new SpawnEggItem("staryu"));
    public static final DeferredItem<Item> STARMIE_SPAWN_EGG = ITEMS.register("starmie_spawn_egg",
            () -> new SpawnEggItem("starmie"));
    public static final DeferredItem<Item> MR_MIME_SPAWN_EGG = ITEMS.register("mr_mime_spawn_egg",
            () -> new SpawnEggItem("mrmime"));
    public static final DeferredItem<Item> GALARIAN_MR_MIME_SPAWN_EGG = ITEMS.register("galarian_mr_mime_spawn_egg",
            () -> new SpawnEggItem("galarian mrmime"));
    public static final DeferredItem<Item> SCYTHER_SPAWN_EGG = ITEMS.register("scyther_spawn_egg",
            () -> new SpawnEggItem("scyther"));
    public static final DeferredItem<Item> JYNX_SPAWN_EGG = ITEMS.register("jynx_spawn_egg",
            () -> new SpawnEggItem("jynx"));
    public static final DeferredItem<Item> ELECTABUZZ_SPAWN_EGG = ITEMS.register("electabuzz_spawn_egg",
            () -> new SpawnEggItem("electabuzz"));
    public static final DeferredItem<Item> MAGMAR_SPAWN_EGG = ITEMS.register("magmar_spawn_egg",
            () -> new SpawnEggItem("magmar"));
    public static final DeferredItem<Item> PINSIR_SPAWN_EGG = ITEMS.register("pinsir_spawn_egg",
            () -> new SpawnEggItem("pinsir"));
    public static final DeferredItem<Item> TAUROS_SPAWN_EGG = ITEMS.register("tauros_spawn_egg",
            () -> new SpawnEggItem("tauros"));
    public static final DeferredItem<Item> PALDEAN_TAUROS_SPAWN_EGG = ITEMS.register("paldean_tauros_spawn_egg",
            () -> new SpawnEggItem("paldean tauros"));
    public static final DeferredItem<Item> MAGIKARP_SPAWN_EGG = ITEMS.register("magikarp_spawn_egg",
            () -> new SpawnEggItem("magikarp"));
    public static final DeferredItem<Item> GYARADOS_SPAWN_EGG = ITEMS.register("gyarados_spawn_egg",
            () -> new SpawnEggItem("gyarados"));
    public static final DeferredItem<Item> LAPRAS_SPAWN_EGG = ITEMS.register("lapras_spawn_egg",
            () -> new SpawnEggItem("lapras"));
    public static final DeferredItem<Item> DITTO_SPAWN_EGG = ITEMS.register("ditto_spawn_egg",
            () -> new SpawnEggItem("ditto"));
    public static final DeferredItem<Item> EEVEE_SPAWN_EGG = ITEMS.register("eevee_spawn_egg",
            () -> new SpawnEggItem("eevee"));
    public static final DeferredItem<Item> VAPOREON_SPAWN_EGG = ITEMS.register("vaporeon_spawn_egg",
            () -> new SpawnEggItem("vaporeon"));
    public static final DeferredItem<Item> JOLTEON_SPAWN_EGG = ITEMS.register("jolteon_spawn_egg",
            () -> new SpawnEggItem("jolteon"));
    public static final DeferredItem<Item> FLAREON_SPAWN_EGG = ITEMS.register("flareon_spawn_egg",
            () -> new SpawnEggItem("flareon"));
    public static final DeferredItem<Item> PORYGON_SPAWN_EGG = ITEMS.register("porygon_spawn_egg",
            () -> new SpawnEggItem("porygon"));
    public static final DeferredItem<Item> OMANYTE_SPAWN_EGG = ITEMS.register("omanyte_spawn_egg",
            () -> new SpawnEggItem("omanyte"));
    public static final DeferredItem<Item> OMASTAR_SPAWN_EGG = ITEMS.register("omastar_spawn_egg",
            () -> new SpawnEggItem("omastar"));
    public static final DeferredItem<Item> KABUTO_SPAWN_EGG = ITEMS.register("kabuto_spawn_egg",
            () -> new SpawnEggItem("kabuto"));
    public static final DeferredItem<Item> KABUTOPS_SPAWN_EGG = ITEMS.register("kabutops_spawn_egg",
            () -> new SpawnEggItem("kabutops"));
    public static final DeferredItem<Item> AERODACTYL_SPAWN_EGG = ITEMS.register("aerodactyl_spawn_egg",
            () -> new SpawnEggItem("aerodactyl"));
    public static final DeferredItem<Item> SNORLAX_SPAWN_EGG = ITEMS.register("snorlax_spawn_egg",
            () -> new SpawnEggItem("snorlax"));
    public static final DeferredItem<Item> ARTICUNO_SPAWN_EGG = ITEMS.register("articuno_spawn_egg",
            () -> new SpawnEggItem("articuno"));
    public static final DeferredItem<Item> GALARIAN_ARTICUNO_SPAWN_EGG = ITEMS.register("galarian_articuno_spawn_egg",
            () -> new SpawnEggItem("galarian articuno"));
    public static final DeferredItem<Item> ZAPDOS_SPAWN_EGG = ITEMS.register("zapdos_spawn_egg",
            () -> new SpawnEggItem("zapdos"));
    public static final DeferredItem<Item> GALARIAN_ZAPDOS_SPAWN_EGG = ITEMS.register("galarian_zapdos_spawn_egg",
            () -> new SpawnEggItem("galarian zapdos"));
    public static final DeferredItem<Item> MOLTRES_SPAWN_EGG = ITEMS.register("moltres_spawn_egg",
            () -> new SpawnEggItem("moltres"));
    public static final DeferredItem<Item> GALARIAN_MOLTRES_SPAWN_EGG = ITEMS.register("galarian_moltres_spawn_egg",
            () -> new SpawnEggItem("galarian moltres"));
    public static final DeferredItem<Item> DRATINI_SPAWN_EGG = ITEMS.register("dratini_spawn_egg",
            () -> new SpawnEggItem("dratini"));
    public static final DeferredItem<Item> DRAGONAIR_SPAWN_EGG = ITEMS.register("dragonair_spawn_egg",
            () -> new SpawnEggItem("dragonair"));
    public static final DeferredItem<Item> DRAGONITE_SPAWN_EGG = ITEMS.register("dragonite_spawn_egg",
            () -> new SpawnEggItem("dragonite"));
    public static final DeferredItem<Item> MEWTWO_SPAWN_EGG = ITEMS.register("mewtwo_spawn_egg",
            () -> new SpawnEggItem("mewtwo"));
    public static final DeferredItem<Item> MEW_SPAWN_EGG = ITEMS.register("mew_spawn_egg",
            () -> new SpawnEggItem("mew"));
    public static final DeferredItem<Item> CHIKORITA_SPAWN_EGG = ITEMS.register("chikorita_spawn_egg",
            () -> new SpawnEggItem("chikorita"));
    public static final DeferredItem<Item> BAYLEEF_SPAWN_EGG = ITEMS.register("bayleef_spawn_egg",
            () -> new SpawnEggItem("bayleef"));
    public static final DeferredItem<Item> MEGANIUM_SPAWN_EGG = ITEMS.register("meganium_spawn_egg",
            () -> new SpawnEggItem("meganium"));
    public static final DeferredItem<Item> CYNDAQUIL_SPAWN_EGG = ITEMS.register("cyndaquil_spawn_egg",
            () -> new SpawnEggItem("cyndaquil"));
    public static final DeferredItem<Item> QUILAVA_SPAWN_EGG = ITEMS.register("quilava_spawn_egg",
            () -> new SpawnEggItem("quilava"));
    public static final DeferredItem<Item> TYPHLOSION_SPAWN_EGG = ITEMS.register("typhlosion_spawn_egg",
            () -> new SpawnEggItem("typhlosion"));
    public static final DeferredItem<Item> HISUIAN_TYPHLOSION_SPAWN_EGG = ITEMS.register("hisuian_typhlosion_spawn_egg",
            () -> new SpawnEggItem("hisuian typhlosion"));
    public static final DeferredItem<Item> TOTODILE_SPAWN_EGG = ITEMS.register("totodile_spawn_egg",
            () -> new SpawnEggItem("totodile"));
    public static final DeferredItem<Item> CROCONAW_SPAWN_EGG = ITEMS.register("croconaw_spawn_egg",
            () -> new SpawnEggItem("croconaw"));
    public static final DeferredItem<Item> FERALIGATR_SPAWN_EGG = ITEMS.register("feraligatr_spawn_egg",
            () -> new SpawnEggItem("feraligatr"));
    public static final DeferredItem<Item> SENTRET_SPAWN_EGG = ITEMS.register("sentret_spawn_egg",
            () -> new SpawnEggItem("sentret"));
    public static final DeferredItem<Item> FURRET_SPAWN_EGG = ITEMS.register("furret_spawn_egg",
            () -> new SpawnEggItem("furret"));
    public static final DeferredItem<Item> HOOTHOOT_SPAWN_EGG = ITEMS.register("hoothoot_spawn_egg",
            () -> new SpawnEggItem("hoothoot"));
    public static final DeferredItem<Item> NOCTOWL_SPAWN_EGG = ITEMS.register("noctowl_spawn_egg",
            () -> new SpawnEggItem("noctowl"));
    public static final DeferredItem<Item> LEDYBA_SPAWN_EGG = ITEMS.register("ledyba_spawn_egg",
            () -> new SpawnEggItem("ledyba"));
    public static final DeferredItem<Item> LEDIAN_SPAWN_EGG = ITEMS.register("ledian_spawn_egg",
            () -> new SpawnEggItem("ledian"));
    public static final DeferredItem<Item> SPINARAK_SPAWN_EGG = ITEMS.register("spinarak_spawn_egg",
            () -> new SpawnEggItem("spinarak"));
    public static final DeferredItem<Item> ARIADOS_SPAWN_EGG = ITEMS.register("ariados_spawn_egg",
            () -> new SpawnEggItem("ariados"));
    public static final DeferredItem<Item> CROBAT_SPAWN_EGG = ITEMS.register("crobat_spawn_egg",
            () -> new SpawnEggItem("crobat"));
    public static final DeferredItem<Item> CHINCHOU_SPAWN_EGG = ITEMS.register("chinchou_spawn_egg",
            () -> new SpawnEggItem("chinchou"));
    public static final DeferredItem<Item> LANTURN_SPAWN_EGG = ITEMS.register("lanturn_spawn_egg",
            () -> new SpawnEggItem("lanturn"));
    public static final DeferredItem<Item> PICHU_SPAWN_EGG = ITEMS.register("pichu_spawn_egg",
            () -> new SpawnEggItem("pichu"));
    public static final DeferredItem<Item> CLEFFA_SPAWN_EGG = ITEMS.register("cleffa_spawn_egg",
            () -> new SpawnEggItem("cleffa"));
    public static final DeferredItem<Item> IGGLYBUFF_SPAWN_EGG = ITEMS.register("igglybuff_spawn_egg",
            () -> new SpawnEggItem("igglybuff"));
    public static final DeferredItem<Item> TOGEPI_SPAWN_EGG = ITEMS.register("togepi_spawn_egg",
            () -> new SpawnEggItem("togepi"));
    public static final DeferredItem<Item> TOGETIC_SPAWN_EGG = ITEMS.register("togetic_spawn_egg",
            () -> new SpawnEggItem("togetic"));
    public static final DeferredItem<Item> NATU_SPAWN_EGG = ITEMS.register("natu_spawn_egg",
            () -> new SpawnEggItem("natu"));
    public static final DeferredItem<Item> XATU_SPAWN_EGG = ITEMS.register("xatu_spawn_egg",
            () -> new SpawnEggItem("xatu"));
    public static final DeferredItem<Item> MAREEP_SPAWN_EGG = ITEMS.register("mareep_spawn_egg",
            () -> new SpawnEggItem("mareep"));
    public static final DeferredItem<Item> FLAAFFY_SPAWN_EGG = ITEMS.register("flaaffy_spawn_egg",
            () -> new SpawnEggItem("flaaffy"));
    public static final DeferredItem<Item> AMPHAROS_SPAWN_EGG = ITEMS.register("ampharos_spawn_egg",
            () -> new SpawnEggItem("ampharos"));
    public static final DeferredItem<Item> BELLOSSOM_SPAWN_EGG = ITEMS.register("bellossom_spawn_egg",
            () -> new SpawnEggItem("bellossom"));
    public static final DeferredItem<Item> MARILL_SPAWN_EGG = ITEMS.register("marill_spawn_egg",
            () -> new SpawnEggItem("marill"));
    public static final DeferredItem<Item> AZUMARILL_SPAWN_EGG = ITEMS.register("azumarill_spawn_egg",
            () -> new SpawnEggItem("azumarill"));
    public static final DeferredItem<Item> SUDOWOODO_SPAWN_EGG = ITEMS.register("sudowoodo_spawn_egg",
            () -> new SpawnEggItem("sudowoodo"));
    public static final DeferredItem<Item> POLITOED_SPAWN_EGG = ITEMS.register("politoed_spawn_egg",
            () -> new SpawnEggItem("politoed"));
    public static final DeferredItem<Item> HOPPIP_SPAWN_EGG = ITEMS.register("hoppip_spawn_egg",
            () -> new SpawnEggItem("hoppip"));
    public static final DeferredItem<Item> SKIPLOOM_SPAWN_EGG = ITEMS.register("skiploom_spawn_egg",
            () -> new SpawnEggItem("skiploom"));
    public static final DeferredItem<Item> JUMPLUFF_SPAWN_EGG = ITEMS.register("jumpluff_spawn_egg",
            () -> new SpawnEggItem("jumpluff"));
    public static final DeferredItem<Item> AIPOM_SPAWN_EGG = ITEMS.register("aipom_spawn_egg",
            () -> new SpawnEggItem("aipom"));
    public static final DeferredItem<Item> SUNKERN_SPAWN_EGG = ITEMS.register("sunkern_spawn_egg",
            () -> new SpawnEggItem("sunkern"));
    public static final DeferredItem<Item> SUNFLORA_SPAWN_EGG = ITEMS.register("sunflora_spawn_egg",
            () -> new SpawnEggItem("sunflora"));
    public static final DeferredItem<Item> YANMA_SPAWN_EGG = ITEMS.register("yanma_spawn_egg",
            () -> new SpawnEggItem("yanma"));
    public static final DeferredItem<Item> WOOPER_SPAWN_EGG = ITEMS.register("wooper_spawn_egg",
            () -> new SpawnEggItem("wooper"));
    public static final DeferredItem<Item> PALDEAN_WOOPER_SPAWN_EGG = ITEMS.register("paldean_wooper_spawn_egg",
            () -> new SpawnEggItem("paldean wooper"));
    public static final DeferredItem<Item> QUAGSIRE_SPAWN_EGG = ITEMS.register("quagsire_spawn_egg",
            () -> new SpawnEggItem("quagsire"));
    public static final DeferredItem<Item> ESPEON_SPAWN_EGG = ITEMS.register("espeon_spawn_egg",
            () -> new SpawnEggItem("espeon"));
    public static final DeferredItem<Item> UMBREON_SPAWN_EGG = ITEMS.register("umbreon_spawn_egg",
            () -> new SpawnEggItem("umbreon"));
    public static final DeferredItem<Item> MURKROW_SPAWN_EGG = ITEMS.register("murkrow_spawn_egg",
            () -> new SpawnEggItem("murkrow"));
    public static final DeferredItem<Item> SLOWKING_SPAWN_EGG = ITEMS.register("slowking_spawn_egg",
            () -> new SpawnEggItem("slowking"));
    public static final DeferredItem<Item> GALARIAN_SLOWKING_SPAWN_EGG = ITEMS.register("galarian_slowking_spawn_egg",
            () -> new SpawnEggItem("galarian slowking"));
    public static final DeferredItem<Item> MISDREAVUS_SPAWN_EGG = ITEMS.register("misdreavus_spawn_egg",
            () -> new SpawnEggItem("misdreavus"));
    public static final DeferredItem<Item> UNOWN_SPAWN_EGG = ITEMS.register("unown_spawn_egg",
            () -> new SpawnEggItem("unown"));
    public static final DeferredItem<Item> WOBBUFFET_SPAWN_EGG = ITEMS.register("wobbuffet_spawn_egg",
            () -> new SpawnEggItem("wobbuffet"));
    public static final DeferredItem<Item> GIRAFARIG_SPAWN_EGG = ITEMS.register("girafarig_spawn_egg",
            () -> new SpawnEggItem("girafarig"));
    public static final DeferredItem<Item> PINECO_SPAWN_EGG = ITEMS.register("pineco_spawn_egg",
            () -> new SpawnEggItem("pineco"));
    public static final DeferredItem<Item> FORRETRESS_SPAWN_EGG = ITEMS.register("forretress_spawn_egg",
            () -> new SpawnEggItem("forretress"));
    public static final DeferredItem<Item> DUNSPARCE_SPAWN_EGG = ITEMS.register("dunsparce_spawn_egg",
            () -> new SpawnEggItem("dunsparce"));
    public static final DeferredItem<Item> GLIGAR_SPAWN_EGG = ITEMS.register("gligar_spawn_egg",
            () -> new SpawnEggItem("gligar"));
    public static final DeferredItem<Item> STEELIX_SPAWN_EGG = ITEMS.register("steelix_spawn_egg",
            () -> new SpawnEggItem("steelix"));
    public static final DeferredItem<Item> SNUBBULL_SPAWN_EGG = ITEMS.register("snubbull_spawn_egg",
            () -> new SpawnEggItem("snubbull"));
    public static final DeferredItem<Item> GRANBULL_SPAWN_EGG = ITEMS.register("granbull_spawn_egg",
            () -> new SpawnEggItem("granbull"));
    public static final DeferredItem<Item> QWILFISH_SPAWN_EGG = ITEMS.register("qwilfish_spawn_egg",
            () -> new SpawnEggItem("qwilfish"));
    public static final DeferredItem<Item> HISUIAN_QWILFISH_SPAWN_EGG = ITEMS.register("hisuian_qwilfish_spawn_egg",
            () -> new SpawnEggItem("hisuian qwilfish"));
    public static final DeferredItem<Item> SCIZOR_SPAWN_EGG = ITEMS.register("scizor_spawn_egg",
            () -> new SpawnEggItem("scizor"));
    public static final DeferredItem<Item> SHUCKLE_SPAWN_EGG = ITEMS.register("shuckle_spawn_egg",
            () -> new SpawnEggItem("shuckle"));
    public static final DeferredItem<Item> HERACROSS_SPAWN_EGG = ITEMS.register("heracross_spawn_egg",
            () -> new SpawnEggItem("heracross"));
    public static final DeferredItem<Item> SNEASEL_SPAWN_EGG = ITEMS.register("sneasel_spawn_egg",
            () -> new SpawnEggItem("sneasel"));
    public static final DeferredItem<Item> HISUIAN_SNEASEL_SPAWN_EGG = ITEMS.register("hisuian_sneasel_spawn_egg",
            () -> new SpawnEggItem("hisuian sneasel"));
    public static final DeferredItem<Item> TEDDIURSA_SPAWN_EGG = ITEMS.register("teddiursa_spawn_egg",
            () -> new SpawnEggItem("teddiursa"));
    public static final DeferredItem<Item> URSARING_SPAWN_EGG = ITEMS.register("ursaring_spawn_egg",
            () -> new SpawnEggItem("ursaring"));
    public static final DeferredItem<Item> SLUGMA_SPAWN_EGG = ITEMS.register("slugma_spawn_egg",
            () -> new SpawnEggItem("slugma"));
    public static final DeferredItem<Item> MAGCARGO_SPAWN_EGG = ITEMS.register("magcargo_spawn_egg",
            () -> new SpawnEggItem("magcargo"));
    public static final DeferredItem<Item> SWINUB_SPAWN_EGG = ITEMS.register("swinub_spawn_egg",
            () -> new SpawnEggItem("swinub"));
    public static final DeferredItem<Item> PILOSWINE_SPAWN_EGG = ITEMS.register("piloswine_spawn_egg",
            () -> new SpawnEggItem("piloswine"));
    public static final DeferredItem<Item> CORSOLA_SPAWN_EGG = ITEMS.register("corsola_spawn_egg",
            () -> new SpawnEggItem("corsola"));
    public static final DeferredItem<Item> GALARIAN_CORSOLA_SPAWN_EGG = ITEMS.register("galarian_corsola_spawn_egg",
            () -> new SpawnEggItem("galarian corsola"));
    public static final DeferredItem<Item> REMORAID_SPAWN_EGG = ITEMS.register("remoraid_spawn_egg",
            () -> new SpawnEggItem("remoraid"));
    public static final DeferredItem<Item> OCTILLERY_SPAWN_EGG = ITEMS.register("octillery_spawn_egg",
            () -> new SpawnEggItem("octillery"));
    public static final DeferredItem<Item> DELIBIRD_SPAWN_EGG = ITEMS.register("delibird_spawn_egg",
            () -> new SpawnEggItem("delibird"));
    public static final DeferredItem<Item> MANTINE_SPAWN_EGG = ITEMS.register("mantine_spawn_egg",
            () -> new SpawnEggItem("mantine"));
    public static final DeferredItem<Item> SKARMORY_SPAWN_EGG = ITEMS.register("skarmory_spawn_egg",
            () -> new SpawnEggItem("skarmory"));
    public static final DeferredItem<Item> HOUNDOUR_SPAWN_EGG = ITEMS.register("houndour_spawn_egg",
            () -> new SpawnEggItem("houndour"));
    public static final DeferredItem<Item> HOUNDOOM_SPAWN_EGG = ITEMS.register("houndoom_spawn_egg",
            () -> new SpawnEggItem("houndoom"));
    public static final DeferredItem<Item> KINGDRA_SPAWN_EGG = ITEMS.register("kingdra_spawn_egg",
            () -> new SpawnEggItem("kingdra"));
    public static final DeferredItem<Item> PHANPY_SPAWN_EGG = ITEMS.register("phanpy_spawn_egg",
            () -> new SpawnEggItem("phanpy"));
    public static final DeferredItem<Item> DONPHAN_SPAWN_EGG = ITEMS.register("donphan_spawn_egg",
            () -> new SpawnEggItem("donphan"));
    public static final DeferredItem<Item> PORYGON2_SPAWN_EGG = ITEMS.register("porygon2_spawn_egg",
            () -> new SpawnEggItem("porygon2"));
    public static final DeferredItem<Item> STANTLER_SPAWN_EGG = ITEMS.register("stantler_spawn_egg",
            () -> new SpawnEggItem("stantler"));
    public static final DeferredItem<Item> SMEARGLE_SPAWN_EGG = ITEMS.register("smeargle_spawn_egg",
            () -> new SpawnEggItem("smeargle"));
    public static final DeferredItem<Item> TYROGUE_SPAWN_EGG = ITEMS.register("tyrogue_spawn_egg",
            () -> new SpawnEggItem("tyrogue"));
    public static final DeferredItem<Item> HITMONTOP_SPAWN_EGG = ITEMS.register("hitmontop_spawn_egg",
            () -> new SpawnEggItem("hitmontop"));
    public static final DeferredItem<Item> SMOOCHUM_SPAWN_EGG = ITEMS.register("smoochum_spawn_egg",
            () -> new SpawnEggItem("smoochum"));
    public static final DeferredItem<Item> ELEKID_SPAWN_EGG = ITEMS.register("elekid_spawn_egg",
            () -> new SpawnEggItem("elekid"));
    public static final DeferredItem<Item> MAGBY_SPAWN_EGG = ITEMS.register("magby_spawn_egg",
            () -> new SpawnEggItem("magby"));
    public static final DeferredItem<Item> MILTANK_SPAWN_EGG = ITEMS.register("miltank_spawn_egg",
            () -> new SpawnEggItem("miltank"));
    public static final DeferredItem<Item> BLISSEY_SPAWN_EGG = ITEMS.register("blissey_spawn_egg",
            () -> new SpawnEggItem("blissey"));
    public static final DeferredItem<Item> RAIKOU_SPAWN_EGG = ITEMS.register("raikou_spawn_egg",
            () -> new SpawnEggItem("raikou"));
    public static final DeferredItem<Item> ENTEI_SPAWN_EGG = ITEMS.register("entei_spawn_egg",
            () -> new SpawnEggItem("entei"));
    public static final DeferredItem<Item> SUICUNE_SPAWN_EGG = ITEMS.register("suicune_spawn_egg",
            () -> new SpawnEggItem("suicune"));
    public static final DeferredItem<Item> LARVITAR_SPAWN_EGG = ITEMS.register("larvitar_spawn_egg",
            () -> new SpawnEggItem("larvitar"));
    public static final DeferredItem<Item> PUPITAR_SPAWN_EGG = ITEMS.register("pupitar_spawn_egg",
            () -> new SpawnEggItem("pupitar"));
    public static final DeferredItem<Item> TYRANITAR_SPAWN_EGG = ITEMS.register("tyranitar_spawn_egg",
            () -> new SpawnEggItem("tyranitar"));
    public static final DeferredItem<Item> LUGIA_SPAWN_EGG = ITEMS.register("lugia_spawn_egg",
            () -> new SpawnEggItem("lugia"));
    public static final DeferredItem<Item> HO_OH_SPAWN_EGG = ITEMS.register("ho_oh_spawn_egg",
            () -> new SpawnEggItem("ho-oh"));
    public static final DeferredItem<Item> CELEBI_SPAWN_EGG = ITEMS.register("celebi_spawn_egg",
            () -> new SpawnEggItem("celebi"));
    public static final DeferredItem<Item> TREECKO_SPAWN_EGG = ITEMS.register("treecko_spawn_egg",
            () -> new SpawnEggItem("treecko"));
    public static final DeferredItem<Item> GROVYLE_SPAWN_EGG = ITEMS.register("grovyle_spawn_egg",
            () -> new SpawnEggItem("grovyle"));
    public static final DeferredItem<Item> SCEPTILE_SPAWN_EGG = ITEMS.register("sceptile_spawn_egg",
            () -> new SpawnEggItem("sceptile"));
    public static final DeferredItem<Item> TORCHIC_SPAWN_EGG = ITEMS.register("torchic_spawn_egg",
            () -> new SpawnEggItem("torchic"));
    public static final DeferredItem<Item> COMBUSKEN_SPAWN_EGG = ITEMS.register("combusken_spawn_egg",
            () -> new SpawnEggItem("combusken"));
    public static final DeferredItem<Item> BLAZIKEN_SPAWN_EGG = ITEMS.register("blaziken_spawn_egg",
            () -> new SpawnEggItem("blaziken"));
    public static final DeferredItem<Item> MUDKIP_SPAWN_EGG = ITEMS.register("mudkip_spawn_egg",
            () -> new SpawnEggItem("mudkip"));
    public static final DeferredItem<Item> MARSHTOMP_SPAWN_EGG = ITEMS.register("marshtomp_spawn_egg",
            () -> new SpawnEggItem("marshtomp"));
    public static final DeferredItem<Item> SWAMPERT_SPAWN_EGG = ITEMS.register("swampert_spawn_egg",
            () -> new SpawnEggItem("swampert"));
    public static final DeferredItem<Item> POOCHYENA_SPAWN_EGG = ITEMS.register("poochyena_spawn_egg",
            () -> new SpawnEggItem("poochyena"));
    public static final DeferredItem<Item> MIGHTYENA_SPAWN_EGG = ITEMS.register("mightyena_spawn_egg",
            () -> new SpawnEggItem("mightyena"));
    public static final DeferredItem<Item> ZIGZAGOON_SPAWN_EGG = ITEMS.register("zigzagoon_spawn_egg",
            () -> new SpawnEggItem("zigzagoon"));
    public static final DeferredItem<Item> GALARIAN_ZIGZAGOON_SPAWN_EGG = ITEMS.register("galarian_zigzagoon_spawn_egg",
            () -> new SpawnEggItem("galarian zigzagoon"));
    public static final DeferredItem<Item> LINOONE_SPAWN_EGG = ITEMS.register("linoone_spawn_egg",
            () -> new SpawnEggItem("linoone"));
    public static final DeferredItem<Item> GALARIAN_LINOONE_SPAWN_EGG = ITEMS.register("galarian_linoone_spawn_egg",
            () -> new SpawnEggItem("galarian linoone"));
    public static final DeferredItem<Item> WURMPLE_SPAWN_EGG = ITEMS.register("wurmple_spawn_egg",
            () -> new SpawnEggItem("wurmple"));
    public static final DeferredItem<Item> SILCOON_SPAWN_EGG = ITEMS.register("silcoon_spawn_egg",
            () -> new SpawnEggItem("silcoon"));
    public static final DeferredItem<Item> BEAUTIFLY_SPAWN_EGG = ITEMS.register("beautifly_spawn_egg",
            () -> new SpawnEggItem("beautifly"));
    public static final DeferredItem<Item> CASCOON_SPAWN_EGG = ITEMS.register("cascoon_spawn_egg",
            () -> new SpawnEggItem("cascoon"));
    public static final DeferredItem<Item> DUSTOX_SPAWN_EGG = ITEMS.register("dustox_spawn_egg",
            () -> new SpawnEggItem("dustox"));
    public static final DeferredItem<Item> LOTAD_SPAWN_EGG = ITEMS.register("lotad_spawn_egg",
            () -> new SpawnEggItem("lotad"));
    public static final DeferredItem<Item> LOMBRE_SPAWN_EGG = ITEMS.register("lombre_spawn_egg",
            () -> new SpawnEggItem("lombre"));
    public static final DeferredItem<Item> LUDICOLO_SPAWN_EGG = ITEMS.register("ludicolo_spawn_egg",
            () -> new SpawnEggItem("ludicolo"));
    public static final DeferredItem<Item> SEEDOT_SPAWN_EGG = ITEMS.register("seedot_spawn_egg",
            () -> new SpawnEggItem("seedot"));
    public static final DeferredItem<Item> NUZLEAF_SPAWN_EGG = ITEMS.register("nuzleaf_spawn_egg",
            () -> new SpawnEggItem("nuzleaf"));
    public static final DeferredItem<Item> SHIFTRY_SPAWN_EGG = ITEMS.register("shiftry_spawn_egg",
            () -> new SpawnEggItem("shiftry"));
    public static final DeferredItem<Item> TAILLOW_SPAWN_EGG = ITEMS.register("taillow_spawn_egg",
            () -> new SpawnEggItem("taillow"));
    public static final DeferredItem<Item> SWELLOW_SPAWN_EGG = ITEMS.register("swellow_spawn_egg",
            () -> new SpawnEggItem("swellow"));
    public static final DeferredItem<Item> WINGULL_SPAWN_EGG = ITEMS.register("wingull_spawn_egg",
            () -> new SpawnEggItem("wingull"));
    public static final DeferredItem<Item> PELIPPER_SPAWN_EGG = ITEMS.register("pelipper_spawn_egg",
            () -> new SpawnEggItem("pelipper"));
    public static final DeferredItem<Item> RALTS_SPAWN_EGG = ITEMS.register("ralts_spawn_egg",
            () -> new SpawnEggItem("ralts"));
    public static final DeferredItem<Item> KIRLIA_SPAWN_EGG = ITEMS.register("kirlia_spawn_egg",
            () -> new SpawnEggItem("kirlia"));
    public static final DeferredItem<Item> GARDEVOIR_SPAWN_EGG = ITEMS.register("gardevoir_spawn_egg",
            () -> new SpawnEggItem("gardevoir"));
    public static final DeferredItem<Item> SURSKIT_SPAWN_EGG = ITEMS.register("surskit_spawn_egg",
            () -> new SpawnEggItem("surskit"));
    public static final DeferredItem<Item> MASQUERAIN_SPAWN_EGG = ITEMS.register("masquerain_spawn_egg",
            () -> new SpawnEggItem("masquerain"));
    public static final DeferredItem<Item> SHROOMISH_SPAWN_EGG = ITEMS.register("shroomish_spawn_egg",
            () -> new SpawnEggItem("shroomish"));
    public static final DeferredItem<Item> BRELOOM_SPAWN_EGG = ITEMS.register("breloom_spawn_egg",
            () -> new SpawnEggItem("breloom"));
    public static final DeferredItem<Item> SLAKOTH_SPAWN_EGG = ITEMS.register("slakoth_spawn_egg",
            () -> new SpawnEggItem("slakoth"));
    public static final DeferredItem<Item> VIGOROTH_SPAWN_EGG = ITEMS.register("vigoroth_spawn_egg",
            () -> new SpawnEggItem("vigoroth"));
    public static final DeferredItem<Item> SLAKING_SPAWN_EGG = ITEMS.register("slaking_spawn_egg",
            () -> new SpawnEggItem("slaking"));
    public static final DeferredItem<Item> NINCADA_SPAWN_EGG = ITEMS.register("nincada_spawn_egg",
            () -> new SpawnEggItem("nincada"));
    public static final DeferredItem<Item> NINJASK_SPAWN_EGG = ITEMS.register("ninjask_spawn_egg",
            () -> new SpawnEggItem("ninjask"));
    public static final DeferredItem<Item> SHEDINJA_SPAWN_EGG = ITEMS.register("shedinja_spawn_egg",
            () -> new SpawnEggItem("shedinja"));
    public static final DeferredItem<Item> WHISMUR_SPAWN_EGG = ITEMS.register("whismur_spawn_egg",
            () -> new SpawnEggItem("whismur"));
    public static final DeferredItem<Item> LOUDRED_SPAWN_EGG = ITEMS.register("loudred_spawn_egg",
            () -> new SpawnEggItem("loudred"));
    public static final DeferredItem<Item> EXPLOUD_SPAWN_EGG = ITEMS.register("exploud_spawn_egg",
            () -> new SpawnEggItem("exploud"));
    public static final DeferredItem<Item> MAKUHITA_SPAWN_EGG = ITEMS.register("makuhita_spawn_egg",
            () -> new SpawnEggItem("makuhita"));
    public static final DeferredItem<Item> HARIYAMA_SPAWN_EGG = ITEMS.register("hariyama_spawn_egg",
            () -> new SpawnEggItem("hariyama"));
    public static final DeferredItem<Item> AZURILL_SPAWN_EGG = ITEMS.register("azurill_spawn_egg",
            () -> new SpawnEggItem("azurill"));
    public static final DeferredItem<Item> NOSEPASS_SPAWN_EGG = ITEMS.register("nosepass_spawn_egg",
            () -> new SpawnEggItem("nosepass"));
    public static final DeferredItem<Item> SKITTY_SPAWN_EGG = ITEMS.register("skitty_spawn_egg",
            () -> new SpawnEggItem("skitty"));
    public static final DeferredItem<Item> DELCATTY_SPAWN_EGG = ITEMS.register("delcatty_spawn_egg",
            () -> new SpawnEggItem("delcatty"));
    public static final DeferredItem<Item> SABLEYE_SPAWN_EGG = ITEMS.register("sableye_spawn_egg",
            () -> new SpawnEggItem("sableye"));
    public static final DeferredItem<Item> MAWILE_SPAWN_EGG = ITEMS.register("mawile_spawn_egg",
            () -> new SpawnEggItem("mawile"));
    public static final DeferredItem<Item> ARON_SPAWN_EGG = ITEMS.register("aron_spawn_egg",
            () -> new SpawnEggItem("aron"));
    public static final DeferredItem<Item> LAIRON_SPAWN_EGG = ITEMS.register("lairon_spawn_egg",
            () -> new SpawnEggItem("lairon"));
    public static final DeferredItem<Item> AGGRON_SPAWN_EGG = ITEMS.register("aggron_spawn_egg",
            () -> new SpawnEggItem("aggron"));
    public static final DeferredItem<Item> MEDITITE_SPAWN_EGG = ITEMS.register("meditite_spawn_egg",
            () -> new SpawnEggItem("meditite"));
    public static final DeferredItem<Item> MEDICHAM_SPAWN_EGG = ITEMS.register("medicham_spawn_egg",
            () -> new SpawnEggItem("medicham"));
    public static final DeferredItem<Item> ELECTRIKE_SPAWN_EGG = ITEMS.register("electrike_spawn_egg",
            () -> new SpawnEggItem("electrike"));
    public static final DeferredItem<Item> MANECTRIC_SPAWN_EGG = ITEMS.register("manectric_spawn_egg",
            () -> new SpawnEggItem("manectric"));
    public static final DeferredItem<Item> PLUSLE_SPAWN_EGG = ITEMS.register("plusle_spawn_egg",
            () -> new SpawnEggItem("plusle"));
    public static final DeferredItem<Item> MINUN_SPAWN_EGG = ITEMS.register("minun_spawn_egg",
            () -> new SpawnEggItem("minun"));
    public static final DeferredItem<Item> VOLBEAT_SPAWN_EGG = ITEMS.register("volbeat_spawn_egg",
            () -> new SpawnEggItem("volbeat"));
    public static final DeferredItem<Item> ILLUMISE_SPAWN_EGG = ITEMS.register("illumise_spawn_egg",
            () -> new SpawnEggItem("illumise"));
    public static final DeferredItem<Item> ROSELIA_SPAWN_EGG = ITEMS.register("roselia_spawn_egg",
            () -> new SpawnEggItem("roselia"));
    public static final DeferredItem<Item> GULPIN_SPAWN_EGG = ITEMS.register("gulpin_spawn_egg",
            () -> new SpawnEggItem("gulpin"));
    public static final DeferredItem<Item> SWALOT_SPAWN_EGG = ITEMS.register("swalot_spawn_egg",
            () -> new SpawnEggItem("swalot"));
    public static final DeferredItem<Item> CARVANHA_SPAWN_EGG = ITEMS.register("carvanha_spawn_egg",
            () -> new SpawnEggItem("carvanha"));
    public static final DeferredItem<Item> SHARPEDO_SPAWN_EGG = ITEMS.register("sharpedo_spawn_egg",
            () -> new SpawnEggItem("sharpedo"));
    public static final DeferredItem<Item> WAILMER_SPAWN_EGG = ITEMS.register("wailmer_spawn_egg",
            () -> new SpawnEggItem("wailmer"));
    public static final DeferredItem<Item> WAILORD_SPAWN_EGG = ITEMS.register("wailord_spawn_egg",
            () -> new SpawnEggItem("wailord"));
    public static final DeferredItem<Item> NUMEL_SPAWN_EGG = ITEMS.register("numel_spawn_egg",
            () -> new SpawnEggItem("numel"));
    public static final DeferredItem<Item> CAMERUPT_SPAWN_EGG = ITEMS.register("camerupt_spawn_egg",
            () -> new SpawnEggItem("camerupt"));
    public static final DeferredItem<Item> TORKOAL_SPAWN_EGG = ITEMS.register("torkoal_spawn_egg",
            () -> new SpawnEggItem("torkoal"));
    public static final DeferredItem<Item> SPOINK_SPAWN_EGG = ITEMS.register("spoink_spawn_egg",
            () -> new SpawnEggItem("spoink"));
    public static final DeferredItem<Item> GRUMPIG_SPAWN_EGG = ITEMS.register("grumpig_spawn_egg",
            () -> new SpawnEggItem("grumpig"));
    public static final DeferredItem<Item> SPINDA_SPAWN_EGG = ITEMS.register("spinda_spawn_egg",
            () -> new SpawnEggItem("spinda"));
    public static final DeferredItem<Item> TRAPINCH_SPAWN_EGG = ITEMS.register("trapinch_spawn_egg",
            () -> new SpawnEggItem("trapinch"));
    public static final DeferredItem<Item> VIBRAVA_SPAWN_EGG = ITEMS.register("vibrava_spawn_egg",
            () -> new SpawnEggItem("vibrava"));
    public static final DeferredItem<Item> FLYGON_SPAWN_EGG = ITEMS.register("flygon_spawn_egg",
            () -> new SpawnEggItem("flygon"));
    public static final DeferredItem<Item> CACNEA_SPAWN_EGG = ITEMS.register("cacnea_spawn_egg",
            () -> new SpawnEggItem("cacnea"));
    public static final DeferredItem<Item> CACTURNE_SPAWN_EGG = ITEMS.register("cacturne_spawn_egg",
            () -> new SpawnEggItem("cacturne"));
    public static final DeferredItem<Item> SWABLU_SPAWN_EGG = ITEMS.register("swablu_spawn_egg",
            () -> new SpawnEggItem("swablu"));
    public static final DeferredItem<Item> ALTARIA_SPAWN_EGG = ITEMS.register("altaria_spawn_egg",
            () -> new SpawnEggItem("altaria"));
    public static final DeferredItem<Item> ZANGOOSE_SPAWN_EGG = ITEMS.register("zangoose_spawn_egg",
            () -> new SpawnEggItem("zangoose"));
    public static final DeferredItem<Item> SEVIPER_SPAWN_EGG = ITEMS.register("seviper_spawn_egg",
            () -> new SpawnEggItem("seviper"));
    public static final DeferredItem<Item> LUNATONE_SPAWN_EGG = ITEMS.register("lunatone_spawn_egg",
            () -> new SpawnEggItem("lunatone"));
    public static final DeferredItem<Item> SOLROCK_SPAWN_EGG = ITEMS.register("solrock_spawn_egg",
            () -> new SpawnEggItem("solrock"));
    public static final DeferredItem<Item> BARBOACH_SPAWN_EGG = ITEMS.register("barboach_spawn_egg",
            () -> new SpawnEggItem("barboach"));
    public static final DeferredItem<Item> WHISCASH_SPAWN_EGG = ITEMS.register("whiscash_spawn_egg",
            () -> new SpawnEggItem("whiscash"));
    public static final DeferredItem<Item> CORPHISH_SPAWN_EGG = ITEMS.register("corphish_spawn_egg",
            () -> new SpawnEggItem("corphish"));
    public static final DeferredItem<Item> CRAWDAUNT_SPAWN_EGG = ITEMS.register("crawdaunt_spawn_egg",
            () -> new SpawnEggItem("crawdaunt"));
    public static final DeferredItem<Item> BALTOY_SPAWN_EGG = ITEMS.register("baltoy_spawn_egg",
            () -> new SpawnEggItem("baltoy"));
    public static final DeferredItem<Item> CLAYDOL_SPAWN_EGG = ITEMS.register("claydol_spawn_egg",
            () -> new SpawnEggItem("claydol"));
    public static final DeferredItem<Item> LILEEP_SPAWN_EGG = ITEMS.register("lileep_spawn_egg",
            () -> new SpawnEggItem("lileep"));
    public static final DeferredItem<Item> CRADILY_SPAWN_EGG = ITEMS.register("cradily_spawn_egg",
            () -> new SpawnEggItem("cradily"));
    public static final DeferredItem<Item> ANORITH_SPAWN_EGG = ITEMS.register("anorith_spawn_egg",
            () -> new SpawnEggItem("anorith"));
    public static final DeferredItem<Item> ARMALDO_SPAWN_EGG = ITEMS.register("armaldo_spawn_egg",
            () -> new SpawnEggItem("armaldo"));
    public static final DeferredItem<Item> FEEBAS_SPAWN_EGG = ITEMS.register("feebas_spawn_egg",
            () -> new SpawnEggItem("feebas"));
    public static final DeferredItem<Item> MILOTIC_SPAWN_EGG = ITEMS.register("milotic_spawn_egg",
            () -> new SpawnEggItem("milotic"));
    public static final DeferredItem<Item> CASTFORM_SPAWN_EGG = ITEMS.register("castform_spawn_egg",
            () -> new SpawnEggItem("castform"));
    public static final DeferredItem<Item> KECLEON_SPAWN_EGG = ITEMS.register("kecleon_spawn_egg",
            () -> new SpawnEggItem("kecleon"));
    public static final DeferredItem<Item> SHUPPET_SPAWN_EGG = ITEMS.register("shuppet_spawn_egg",
            () -> new SpawnEggItem("shuppet"));
    public static final DeferredItem<Item> BANETTE_SPAWN_EGG = ITEMS.register("banette_spawn_egg",
            () -> new SpawnEggItem("banette"));
    public static final DeferredItem<Item> DUSKULL_SPAWN_EGG = ITEMS.register("duskull_spawn_egg",
            () -> new SpawnEggItem("duskull"));
    public static final DeferredItem<Item> DUSCLOPS_SPAWN_EGG = ITEMS.register("dusclops_spawn_egg",
            () -> new SpawnEggItem("dusclops"));
    public static final DeferredItem<Item> TROPIUS_SPAWN_EGG = ITEMS.register("tropius_spawn_egg",
            () -> new SpawnEggItem("tropius"));
    public static final DeferredItem<Item> CHIMECHO_SPAWN_EGG = ITEMS.register("chimecho_spawn_egg",
            () -> new SpawnEggItem("chimecho"));
    public static final DeferredItem<Item> ABSOL_SPAWN_EGG = ITEMS.register("absol_spawn_egg",
            () -> new SpawnEggItem("absol"));
    public static final DeferredItem<Item> WYNAUT_SPAWN_EGG = ITEMS.register("wynaut_spawn_egg",
            () -> new SpawnEggItem("wynaut"));
    public static final DeferredItem<Item> SNORUNT_SPAWN_EGG = ITEMS.register("snorunt_spawn_egg",
            () -> new SpawnEggItem("snorunt"));
    public static final DeferredItem<Item> GLALIE_SPAWN_EGG = ITEMS.register("glalie_spawn_egg",
            () -> new SpawnEggItem("glalie"));
    public static final DeferredItem<Item> SPHEAL_SPAWN_EGG = ITEMS.register("spheal_spawn_egg",
            () -> new SpawnEggItem("spheal"));
    public static final DeferredItem<Item> SEALEO_SPAWN_EGG = ITEMS.register("sealeo_spawn_egg",
            () -> new SpawnEggItem("sealeo"));
    public static final DeferredItem<Item> WALREIN_SPAWN_EGG = ITEMS.register("walrein_spawn_egg",
            () -> new SpawnEggItem("walrein"));
    public static final DeferredItem<Item> CLAMPERL_SPAWN_EGG = ITEMS.register("clamperl_spawn_egg",
            () -> new SpawnEggItem("clamperl"));
    public static final DeferredItem<Item> HUNTAIL_SPAWN_EGG = ITEMS.register("huntail_spawn_egg",
            () -> new SpawnEggItem("huntail"));
    public static final DeferredItem<Item> GOREBYSS_SPAWN_EGG = ITEMS.register("gorebyss_spawn_egg",
            () -> new SpawnEggItem("gorebyss"));
    public static final DeferredItem<Item> RELICANTH_SPAWN_EGG = ITEMS.register("relicanth_spawn_egg",
            () -> new SpawnEggItem("relicanth"));
    public static final DeferredItem<Item> LUVDISC_SPAWN_EGG = ITEMS.register("luvdisc_spawn_egg",
            () -> new SpawnEggItem("luvdisc"));
    public static final DeferredItem<Item> BAGON_SPAWN_EGG = ITEMS.register("bagon_spawn_egg",
            () -> new SpawnEggItem("bagon"));
    public static final DeferredItem<Item> SHELGON_SPAWN_EGG = ITEMS.register("shelgon_spawn_egg",
            () -> new SpawnEggItem("shelgon"));
    public static final DeferredItem<Item> SALAMENCE_SPAWN_EGG = ITEMS.register("salamence_spawn_egg",
            () -> new SpawnEggItem("salamence"));
    public static final DeferredItem<Item> BELDUM_SPAWN_EGG = ITEMS.register("beldum_spawn_egg",
            () -> new SpawnEggItem("beldum"));
    public static final DeferredItem<Item> METANG_SPAWN_EGG = ITEMS.register("metang_spawn_egg",
            () -> new SpawnEggItem("metang"));
    public static final DeferredItem<Item> METAGROSS_SPAWN_EGG = ITEMS.register("metagross_spawn_egg",
            () -> new SpawnEggItem("metagross"));
    public static final DeferredItem<Item> REGIROCK_SPAWN_EGG = ITEMS.register("regirock_spawn_egg",
            () -> new SpawnEggItem("regirock"));
    public static final DeferredItem<Item> REGICE_SPAWN_EGG = ITEMS.register("regice_spawn_egg",
            () -> new SpawnEggItem("regice"));
    public static final DeferredItem<Item> REGISTEEL_SPAWN_EGG = ITEMS.register("registeel_spawn_egg",
            () -> new SpawnEggItem("registeel"));
    public static final DeferredItem<Item> LATIAS_SPAWN_EGG = ITEMS.register("latias_spawn_egg",
            () -> new SpawnEggItem("latias"));
    public static final DeferredItem<Item> LATIOS_SPAWN_EGG = ITEMS.register("latios_spawn_egg",
            () -> new SpawnEggItem("latios"));
    public static final DeferredItem<Item> KYOGRE_SPAWN_EGG = ITEMS.register("kyogre_spawn_egg",
            () -> new SpawnEggItem("kyogre"));
    public static final DeferredItem<Item> GROUDON_SPAWN_EGG = ITEMS.register("groudon_spawn_egg",
            () -> new SpawnEggItem("groudon"));
    public static final DeferredItem<Item> RAYQUAZA_SPAWN_EGG = ITEMS.register("rayquaza_spawn_egg",
            () -> new SpawnEggItem("rayquaza"));
    public static final DeferredItem<Item> JIRACHI_SPAWN_EGG = ITEMS.register("jirachi_spawn_egg",
            () -> new SpawnEggItem("jirachi"));
    public static final DeferredItem<Item> DEOXYS_SPAWN_EGG = ITEMS.register("deoxys_spawn_egg",
            () -> new SpawnEggItem("deoxys"));
    public static final DeferredItem<Item> TURTWIG_SPAWN_EGG = ITEMS.register("turtwig_spawn_egg",
            () -> new SpawnEggItem("turtwig"));
    public static final DeferredItem<Item> GROTLE_SPAWN_EGG = ITEMS.register("grotle_spawn_egg",
            () -> new SpawnEggItem("grotle"));
    public static final DeferredItem<Item> TORTERRA_SPAWN_EGG = ITEMS.register("torterra_spawn_egg",
            () -> new SpawnEggItem("torterra"));
    public static final DeferredItem<Item> CHIMCHAR_SPAWN_EGG = ITEMS.register("chimchar_spawn_egg",
            () -> new SpawnEggItem("chimchar"));
    public static final DeferredItem<Item> MONFERNO_SPAWN_EGG = ITEMS.register("monferno_spawn_egg",
            () -> new SpawnEggItem("monferno"));
    public static final DeferredItem<Item> INFERNAPE_SPAWN_EGG = ITEMS.register("infernape_spawn_egg",
            () -> new SpawnEggItem("infernape"));
    public static final DeferredItem<Item> PIPLUP_SPAWN_EGG = ITEMS.register("piplup_spawn_egg",
            () -> new SpawnEggItem("piplup"));
    public static final DeferredItem<Item> PRINPLUP_SPAWN_EGG = ITEMS.register("prinplup_spawn_egg",
            () -> new SpawnEggItem("prinplup"));
    public static final DeferredItem<Item> EMPOLEON_SPAWN_EGG = ITEMS.register("empoleon_spawn_egg",
            () -> new SpawnEggItem("empoleon"));
    public static final DeferredItem<Item> STARLY_SPAWN_EGG = ITEMS.register("starly_spawn_egg",
            () -> new SpawnEggItem("starly"));
    public static final DeferredItem<Item> STARAVIA_SPAWN_EGG = ITEMS.register("staravia_spawn_egg",
            () -> new SpawnEggItem("staravia"));
    public static final DeferredItem<Item> STARAPTOR_SPAWN_EGG = ITEMS.register("staraptor_spawn_egg",
            () -> new SpawnEggItem("staraptor"));
    public static final DeferredItem<Item> BIDOOF_SPAWN_EGG = ITEMS.register("bidoof_spawn_egg",
            () -> new SpawnEggItem("bidoof"));
    public static final DeferredItem<Item> BIBAREL_SPAWN_EGG = ITEMS.register("bibarel_spawn_egg",
            () -> new SpawnEggItem("bibarel"));
    public static final DeferredItem<Item> KRICKETOT_SPAWN_EGG = ITEMS.register("kricketot_spawn_egg",
            () -> new SpawnEggItem("kricketot"));
    public static final DeferredItem<Item> KRICKETUNE_SPAWN_EGG = ITEMS.register("kricketune_spawn_egg",
            () -> new SpawnEggItem("kricketune"));
    public static final DeferredItem<Item> SHINX_SPAWN_EGG = ITEMS.register("shinx_spawn_egg",
            () -> new SpawnEggItem("shinx"));
    public static final DeferredItem<Item> LUXIO_SPAWN_EGG = ITEMS.register("luxio_spawn_egg",
            () -> new SpawnEggItem("luxio"));
    public static final DeferredItem<Item> LUXRAY_SPAWN_EGG = ITEMS.register("luxray_spawn_egg",
            () -> new SpawnEggItem("luxray"));
    public static final DeferredItem<Item> BUDEW_SPAWN_EGG = ITEMS.register("budew_spawn_egg",
            () -> new SpawnEggItem("budew"));
    public static final DeferredItem<Item> ROSERADE_SPAWN_EGG = ITEMS.register("roserade_spawn_egg",
            () -> new SpawnEggItem("roserade"));
    public static final DeferredItem<Item> CRANIDOS_SPAWN_EGG = ITEMS.register("cranidos_spawn_egg",
            () -> new SpawnEggItem("cranidos"));
    public static final DeferredItem<Item> RAMPARDOS_SPAWN_EGG = ITEMS.register("rampardos_spawn_egg",
            () -> new SpawnEggItem("rampardos"));
    public static final DeferredItem<Item> SHIELDON_SPAWN_EGG = ITEMS.register("shieldon_spawn_egg",
            () -> new SpawnEggItem("shieldon"));
    public static final DeferredItem<Item> BASTIODON_SPAWN_EGG = ITEMS.register("bastiodon_spawn_egg",
            () -> new SpawnEggItem("bastiodon"));
    public static final DeferredItem<Item> BURMY_SPAWN_EGG = ITEMS.register("burmy_spawn_egg",
            () -> new SpawnEggItem("burmy"));
    public static final DeferredItem<Item> WORMADAM_SPAWN_EGG = ITEMS.register("wormadam_spawn_egg",
            () -> new SpawnEggItem("wormadam"));
    public static final DeferredItem<Item> MOTHIM_SPAWN_EGG = ITEMS.register("mothim_spawn_egg",
            () -> new SpawnEggItem("mothim"));
    public static final DeferredItem<Item> COMBEE_SPAWN_EGG = ITEMS.register("combee_spawn_egg",
            () -> new SpawnEggItem("combee"));
    public static final DeferredItem<Item> VESPIQUEN_SPAWN_EGG = ITEMS.register("vespiquen_spawn_egg",
            () -> new SpawnEggItem("vespiquen"));
    public static final DeferredItem<Item> PACHIRISU_SPAWN_EGG = ITEMS.register("pachirisu_spawn_egg",
            () -> new SpawnEggItem("pachirisu"));
    public static final DeferredItem<Item> BUIZEL_SPAWN_EGG = ITEMS.register("buizel_spawn_egg",
            () -> new SpawnEggItem("buizel"));
    public static final DeferredItem<Item> FLOATZEL_SPAWN_EGG = ITEMS.register("floatzel_spawn_egg",
            () -> new SpawnEggItem("floatzel"));
    public static final DeferredItem<Item> CHERUBI_SPAWN_EGG = ITEMS.register("cherubi_spawn_egg",
            () -> new SpawnEggItem("cherubi"));
    public static final DeferredItem<Item> CHERRIM_SPAWN_EGG = ITEMS.register("cherrim_spawn_egg",
            () -> new SpawnEggItem("cherrim"));
    public static final DeferredItem<Item> SHELLOS_SPAWN_EGG = ITEMS.register("shellos_spawn_egg",
            () -> new SpawnEggItem("shellos"));
    public static final DeferredItem<Item> GASTRODON_SPAWN_EGG = ITEMS.register("gastrodon_spawn_egg",
            () -> new SpawnEggItem("gastrodon"));
    public static final DeferredItem<Item> AMBIPOM_SPAWN_EGG = ITEMS.register("ambipom_spawn_egg",
            () -> new SpawnEggItem("ambipom"));
    public static final DeferredItem<Item> DRIFLOON_SPAWN_EGG = ITEMS.register("drifloon_spawn_egg",
            () -> new SpawnEggItem("drifloon"));
    public static final DeferredItem<Item> DRIFBLIM_SPAWN_EGG = ITEMS.register("drifblim_spawn_egg",
            () -> new SpawnEggItem("drifblim"));
    public static final DeferredItem<Item> BUNEARY_SPAWN_EGG = ITEMS.register("buneary_spawn_egg",
            () -> new SpawnEggItem("buneary"));
    public static final DeferredItem<Item> LOPUNNY_SPAWN_EGG = ITEMS.register("lopunny_spawn_egg",
            () -> new SpawnEggItem("lopunny"));
    public static final DeferredItem<Item> MISMAGIUS_SPAWN_EGG = ITEMS.register("mismagius_spawn_egg",
            () -> new SpawnEggItem("mismagius"));
    public static final DeferredItem<Item> HONCHKROW_SPAWN_EGG = ITEMS.register("honchkrow_spawn_egg",
            () -> new SpawnEggItem("honchkrow"));
    public static final DeferredItem<Item> GLAMEOW_SPAWN_EGG = ITEMS.register("glameow_spawn_egg",
            () -> new SpawnEggItem("glameow"));
    public static final DeferredItem<Item> PURUGLY_SPAWN_EGG = ITEMS.register("purugly_spawn_egg",
            () -> new SpawnEggItem("purugly"));
    public static final DeferredItem<Item> CHINGLING_SPAWN_EGG = ITEMS.register("chingling_spawn_egg",
            () -> new SpawnEggItem("chingling"));
    public static final DeferredItem<Item> STUNKY_SPAWN_EGG = ITEMS.register("stunky_spawn_egg",
            () -> new SpawnEggItem("stunky"));
    public static final DeferredItem<Item> SKUNTANK_SPAWN_EGG = ITEMS.register("skuntank_spawn_egg",
            () -> new SpawnEggItem("skuntank"));
    public static final DeferredItem<Item> BRONZOR_SPAWN_EGG = ITEMS.register("bronzor_spawn_egg",
            () -> new SpawnEggItem("bronzor"));
    public static final DeferredItem<Item> BRONZONG_SPAWN_EGG = ITEMS.register("bronzong_spawn_egg",
            () -> new SpawnEggItem("bronzong"));
    public static final DeferredItem<Item> BONSLY_SPAWN_EGG = ITEMS.register("bonsly_spawn_egg",
            () -> new SpawnEggItem("bonsly"));
    public static final DeferredItem<Item> MIME_JR_SPAWN_EGG = ITEMS.register("mime_jr_spawn_egg",
            () -> new SpawnEggItem("mimejr"));
    public static final DeferredItem<Item> HAPPINY_SPAWN_EGG = ITEMS.register("happiny_spawn_egg",
            () -> new SpawnEggItem("happiny"));
    public static final DeferredItem<Item> CHATOT_SPAWN_EGG = ITEMS.register("chatot_spawn_egg",
            () -> new SpawnEggItem("chatot"));
    public static final DeferredItem<Item> SPIRITOMB_SPAWN_EGG = ITEMS.register("spiritomb_spawn_egg",
            () -> new SpawnEggItem("spiritomb"));
    public static final DeferredItem<Item> GIBLE_SPAWN_EGG = ITEMS.register("gible_spawn_egg",
            () -> new SpawnEggItem("gible"));
    public static final DeferredItem<Item> GABITE_SPAWN_EGG = ITEMS.register("gabite_spawn_egg",
            () -> new SpawnEggItem("gabite"));
    public static final DeferredItem<Item> GARCHOMP_SPAWN_EGG = ITEMS.register("garchomp_spawn_egg",
            () -> new SpawnEggItem("garchomp"));
    public static final DeferredItem<Item> MUNCHLAX_SPAWN_EGG = ITEMS.register("munchlax_spawn_egg",
            () -> new SpawnEggItem("munchlax"));
    public static final DeferredItem<Item> RIOLU_SPAWN_EGG = ITEMS.register("riolu_spawn_egg",
            () -> new SpawnEggItem("riolu"));
    public static final DeferredItem<Item> LUCARIO_SPAWN_EGG = ITEMS.register("lucario_spawn_egg",
            () -> new SpawnEggItem("lucario"));
    public static final DeferredItem<Item> HIPPOPOTAS_SPAWN_EGG = ITEMS.register("hippopotas_spawn_egg",
            () -> new SpawnEggItem("hippopotas"));
    public static final DeferredItem<Item> HIPPOWDON_SPAWN_EGG = ITEMS.register("hippowdon_spawn_egg",
            () -> new SpawnEggItem("hippowdon"));
    public static final DeferredItem<Item> SKORUPI_SPAWN_EGG = ITEMS.register("skorupi_spawn_egg",
            () -> new SpawnEggItem("skorupi"));
    public static final DeferredItem<Item> DRAPION_SPAWN_EGG = ITEMS.register("drapion_spawn_egg",
            () -> new SpawnEggItem("drapion"));
    public static final DeferredItem<Item> CROAGUNK_SPAWN_EGG = ITEMS.register("croagunk_spawn_egg",
            () -> new SpawnEggItem("croagunk"));
    public static final DeferredItem<Item> TOXICROAK_SPAWN_EGG = ITEMS.register("toxicroak_spawn_egg",
            () -> new SpawnEggItem("toxicroak"));
    public static final DeferredItem<Item> CARNIVINE_SPAWN_EGG = ITEMS.register("carnivine_spawn_egg",
            () -> new SpawnEggItem("carnivine"));
    public static final DeferredItem<Item> FINNEON_SPAWN_EGG = ITEMS.register("finneon_spawn_egg",
            () -> new SpawnEggItem("finneon"));
    public static final DeferredItem<Item> LUMINEON_SPAWN_EGG = ITEMS.register("lumineon_spawn_egg",
            () -> new SpawnEggItem("lumineon"));
    public static final DeferredItem<Item> MANTYKE_SPAWN_EGG = ITEMS.register("mantyke_spawn_egg",
            () -> new SpawnEggItem("mantyke"));
    public static final DeferredItem<Item> SNOVER_SPAWN_EGG = ITEMS.register("snover_spawn_egg",
            () -> new SpawnEggItem("snover"));
    public static final DeferredItem<Item> ABOMASNOW_SPAWN_EGG = ITEMS.register("abomasnow_spawn_egg",
            () -> new SpawnEggItem("abomasnow"));
    public static final DeferredItem<Item> WEAVILE_SPAWN_EGG = ITEMS.register("weavile_spawn_egg",
            () -> new SpawnEggItem("weavile"));
    public static final DeferredItem<Item> MAGNEZONE_SPAWN_EGG = ITEMS.register("magnezone_spawn_egg",
            () -> new SpawnEggItem("magnezone"));
    public static final DeferredItem<Item> LICKILICKY_SPAWN_EGG = ITEMS.register("lickilicky_spawn_egg",
            () -> new SpawnEggItem("lickilicky"));
    public static final DeferredItem<Item> RHYPERIOR_SPAWN_EGG = ITEMS.register("rhyperior_spawn_egg",
            () -> new SpawnEggItem("rhyperior"));
    public static final DeferredItem<Item> TANGROWTH_SPAWN_EGG = ITEMS.register("tangrowth_spawn_egg",
            () -> new SpawnEggItem("tangrowth"));
    public static final DeferredItem<Item> ELECTIVIRE_SPAWN_EGG = ITEMS.register("electivire_spawn_egg",
            () -> new SpawnEggItem("electivire"));
    public static final DeferredItem<Item> MAGMORTAR_SPAWN_EGG = ITEMS.register("magmortar_spawn_egg",
            () -> new SpawnEggItem("magmortar"));
    public static final DeferredItem<Item> TOGEKISS_SPAWN_EGG = ITEMS.register("togekiss_spawn_egg",
            () -> new SpawnEggItem("togekiss"));
    public static final DeferredItem<Item> YANMEGA_SPAWN_EGG = ITEMS.register("yanmega_spawn_egg",
            () -> new SpawnEggItem("yanmega"));
    public static final DeferredItem<Item> LEAFEON_SPAWN_EGG = ITEMS.register("leafeon_spawn_egg",
            () -> new SpawnEggItem("leafeon"));
    public static final DeferredItem<Item> GLACEON_SPAWN_EGG = ITEMS.register("glaceon_spawn_egg",
            () -> new SpawnEggItem("glaceon"));
    public static final DeferredItem<Item> GLISCOR_SPAWN_EGG = ITEMS.register("gliscor_spawn_egg",
            () -> new SpawnEggItem("gliscor"));
    public static final DeferredItem<Item> MAMOSWINE_SPAWN_EGG = ITEMS.register("mamoswine_spawn_egg",
            () -> new SpawnEggItem("mamoswine"));
    public static final DeferredItem<Item> PORYGON_Z_SPAWN_EGG = ITEMS.register("porygon_z_spawn_egg",
            () -> new SpawnEggItem("porygon-z"));
    public static final DeferredItem<Item> GALLADE_SPAWN_EGG = ITEMS.register("gallade_spawn_egg",
            () -> new SpawnEggItem("gallade"));
    public static final DeferredItem<Item> PROBOPASS_SPAWN_EGG = ITEMS.register("probopass_spawn_egg",
            () -> new SpawnEggItem("probopass"));
    public static final DeferredItem<Item> DUSKNOIR_SPAWN_EGG = ITEMS.register("dusknoir_spawn_egg",
            () -> new SpawnEggItem("dusknoir"));
    public static final DeferredItem<Item> FROSLASS_SPAWN_EGG = ITEMS.register("froslass_spawn_egg",
            () -> new SpawnEggItem("froslass"));
    public static final DeferredItem<Item> ROTOM_SPAWN_EGG = ITEMS.register("rotom_spawn_egg",
            () -> new SpawnEggItem("rotom"));
    public static final DeferredItem<Item> UXIE_SPAWN_EGG = ITEMS.register("uxie_spawn_egg",
            () -> new SpawnEggItem("uxie"));
    public static final DeferredItem<Item> MESPRIT_SPAWN_EGG = ITEMS.register("mesprit_spawn_egg",
            () -> new SpawnEggItem("mesprit"));
    public static final DeferredItem<Item> AZELF_SPAWN_EGG = ITEMS.register("azelf_spawn_egg",
            () -> new SpawnEggItem("azelf"));
    public static final DeferredItem<Item> DIALGA_SPAWN_EGG = ITEMS.register("dialga_spawn_egg",
            () -> new SpawnEggItem("dialga"));
    public static final DeferredItem<Item> PALKIA_SPAWN_EGG = ITEMS.register("palkia_spawn_egg",
            () -> new SpawnEggItem("palkia"));
    public static final DeferredItem<Item> HEATRAN_SPAWN_EGG = ITEMS.register("heatran_spawn_egg",
            () -> new SpawnEggItem("heatran"));
    public static final DeferredItem<Item> REGIGIGAS_SPAWN_EGG = ITEMS.register("regigigas_spawn_egg",
            () -> new SpawnEggItem("regigigas"));
    public static final DeferredItem<Item> GIRATINA_SPAWN_EGG = ITEMS.register("giratina_spawn_egg",
            () -> new SpawnEggItem("giratina"));
    public static final DeferredItem<Item> CRESSELIA_SPAWN_EGG = ITEMS.register("cresselia_spawn_egg",
            () -> new SpawnEggItem("cresselia"));
    public static final DeferredItem<Item> PHIONE_SPAWN_EGG = ITEMS.register("phione_spawn_egg",
            () -> new SpawnEggItem("phione"));
    public static final DeferredItem<Item> MANAPHY_SPAWN_EGG = ITEMS.register("manaphy_spawn_egg",
            () -> new SpawnEggItem("manaphy"));
    public static final DeferredItem<Item> DARKRAI_SPAWN_EGG = ITEMS.register("darkrai_spawn_egg",
            () -> new SpawnEggItem("darkrai"));
    public static final DeferredItem<Item> SHAYMIN_SPAWN_EGG = ITEMS.register("shaymin_spawn_egg",
            () -> new SpawnEggItem("shaymin"));
    public static final DeferredItem<Item> ARCEUS_SPAWN_EGG = ITEMS.register("arceus_spawn_egg",
            () -> new SpawnEggItem("arceus"));
    public static final DeferredItem<Item> VICTINI_SPAWN_EGG = ITEMS.register("victini_spawn_egg",
            () -> new SpawnEggItem("victini"));
    public static final DeferredItem<Item> SNIVY_SPAWN_EGG = ITEMS.register("snivy_spawn_egg",
            () -> new SpawnEggItem("snivy"));
    public static final DeferredItem<Item> SERVINE_SPAWN_EGG = ITEMS.register("servine_spawn_egg",
            () -> new SpawnEggItem("servine"));
    public static final DeferredItem<Item> SERPERIOR_SPAWN_EGG = ITEMS.register("serperior_spawn_egg",
            () -> new SpawnEggItem("serperior"));
    public static final DeferredItem<Item> TEPIG_SPAWN_EGG = ITEMS.register("tepig_spawn_egg",
            () -> new SpawnEggItem("tepig"));
    public static final DeferredItem<Item> PIGNITE_SPAWN_EGG = ITEMS.register("pignite_spawn_egg",
            () -> new SpawnEggItem("pignite"));
    public static final DeferredItem<Item> EMBOAR_SPAWN_EGG = ITEMS.register("emboar_spawn_egg",
            () -> new SpawnEggItem("emboar"));
    public static final DeferredItem<Item> OSHAWOTT_SPAWN_EGG = ITEMS.register("oshawott_spawn_egg",
            () -> new SpawnEggItem("oshawott"));
    public static final DeferredItem<Item> DEWOTT_SPAWN_EGG = ITEMS.register("dewott_spawn_egg",
            () -> new SpawnEggItem("dewott"));
    public static final DeferredItem<Item> SAMUROTT_SPAWN_EGG = ITEMS.register("samurott_spawn_egg",
            () -> new SpawnEggItem("samurott"));
    public static final DeferredItem<Item> HISUIAN_SAMUROTT_SPAWN_EGG = ITEMS.register("hisuian_samurott_spawn_egg",
            () -> new SpawnEggItem("hisuian samurott"));
    public static final DeferredItem<Item> PATRAT_SPAWN_EGG = ITEMS.register("patrat_spawn_egg",
            () -> new SpawnEggItem("patrat"));
    public static final DeferredItem<Item> WATCHOG_SPAWN_EGG = ITEMS.register("watchog_spawn_egg",
            () -> new SpawnEggItem("watchog"));
    public static final DeferredItem<Item> LILLIPUP_SPAWN_EGG = ITEMS.register("lillipup_spawn_egg",
            () -> new SpawnEggItem("lillipup"));
    public static final DeferredItem<Item> HERDIER_SPAWN_EGG = ITEMS.register("herdier_spawn_egg",
            () -> new SpawnEggItem("herdier"));
    public static final DeferredItem<Item> STOUTLAND_SPAWN_EGG = ITEMS.register("stoutland_spawn_egg",
            () -> new SpawnEggItem("stoutland"));
    public static final DeferredItem<Item> PURRLOIN_SPAWN_EGG = ITEMS.register("purrloin_spawn_egg",
            () -> new SpawnEggItem("purrloin"));
    public static final DeferredItem<Item> LIEPARD_SPAWN_EGG = ITEMS.register("liepard_spawn_egg",
            () -> new SpawnEggItem("liepard"));
    public static final DeferredItem<Item> PANSAGE_SPAWN_EGG = ITEMS.register("pansage_spawn_egg",
            () -> new SpawnEggItem("pansage"));
    public static final DeferredItem<Item> SIMISAGE_SPAWN_EGG = ITEMS.register("simisage_spawn_egg",
            () -> new SpawnEggItem("simisage"));
    public static final DeferredItem<Item> PANSEAR_SPAWN_EGG = ITEMS.register("pansear_spawn_egg",
            () -> new SpawnEggItem("pansear"));
    public static final DeferredItem<Item> SIMISEAR_SPAWN_EGG = ITEMS.register("simisear_spawn_egg",
            () -> new SpawnEggItem("simisear"));
    public static final DeferredItem<Item> PANPOUR_SPAWN_EGG = ITEMS.register("panpour_spawn_egg",
            () -> new SpawnEggItem("panpour"));
    public static final DeferredItem<Item> SIMIPOUR_SPAWN_EGG = ITEMS.register("simipour_spawn_egg",
            () -> new SpawnEggItem("simipour"));
    public static final DeferredItem<Item> MUNNA_SPAWN_EGG = ITEMS.register("munna_spawn_egg",
            () -> new SpawnEggItem("munna"));
    public static final DeferredItem<Item> MUSHARNA_SPAWN_EGG = ITEMS.register("musharna_spawn_egg",
            () -> new SpawnEggItem("musharna"));
    public static final DeferredItem<Item> PIDOVE_SPAWN_EGG = ITEMS.register("pidove_spawn_egg",
            () -> new SpawnEggItem("pidove"));
    public static final DeferredItem<Item> TRANQUILL_SPAWN_EGG = ITEMS.register("tranquill_spawn_egg",
            () -> new SpawnEggItem("tranquill"));
    public static final DeferredItem<Item> UNFEZANT_SPAWN_EGG = ITEMS.register("unfezant_spawn_egg",
            () -> new SpawnEggItem("unfezant"));
    public static final DeferredItem<Item> BLITZLE_SPAWN_EGG = ITEMS.register("blitzle_spawn_egg",
            () -> new SpawnEggItem("blitzle"));
    public static final DeferredItem<Item> ZEBSTRIKA_SPAWN_EGG = ITEMS.register("zebstrika_spawn_egg",
            () -> new SpawnEggItem("zebstrika"));
    public static final DeferredItem<Item> ROGGENROLA_SPAWN_EGG = ITEMS.register("roggenrola_spawn_egg",
            () -> new SpawnEggItem("roggenrola"));
    public static final DeferredItem<Item> BOLDORE_SPAWN_EGG = ITEMS.register("boldore_spawn_egg",
            () -> new SpawnEggItem("boldore"));
    public static final DeferredItem<Item> GIGALITH_SPAWN_EGG = ITEMS.register("gigalith_spawn_egg",
            () -> new SpawnEggItem("gigalith"));
    public static final DeferredItem<Item> WOOBAT_SPAWN_EGG = ITEMS.register("woobat_spawn_egg",
            () -> new SpawnEggItem("woobat"));
    public static final DeferredItem<Item> SWOOBAT_SPAWN_EGG = ITEMS.register("swoobat_spawn_egg",
            () -> new SpawnEggItem("swoobat"));
    public static final DeferredItem<Item> DRILBUR_SPAWN_EGG = ITEMS.register("drilbur_spawn_egg",
            () -> new SpawnEggItem("drilbur"));
    public static final DeferredItem<Item> EXCADRILL_SPAWN_EGG = ITEMS.register("excadrill_spawn_egg",
            () -> new SpawnEggItem("excadrill"));
    public static final DeferredItem<Item> AUDINO_SPAWN_EGG = ITEMS.register("audino_spawn_egg",
            () -> new SpawnEggItem("audino"));
    public static final DeferredItem<Item> TIMBURR_SPAWN_EGG = ITEMS.register("timburr_spawn_egg",
            () -> new SpawnEggItem("timburr"));
    public static final DeferredItem<Item> GURDURR_SPAWN_EGG = ITEMS.register("gurdurr_spawn_egg",
            () -> new SpawnEggItem("gurdurr"));
    public static final DeferredItem<Item> CONKELDURR_SPAWN_EGG = ITEMS.register("conkeldurr_spawn_egg",
            () -> new SpawnEggItem("conkeldurr"));
    public static final DeferredItem<Item> TYMPOLE_SPAWN_EGG = ITEMS.register("tympole_spawn_egg",
            () -> new SpawnEggItem("tympole"));
    public static final DeferredItem<Item> PALPITOAD_SPAWN_EGG = ITEMS.register("palpitoad_spawn_egg",
            () -> new SpawnEggItem("palpitoad"));
    public static final DeferredItem<Item> SEISMITOAD_SPAWN_EGG = ITEMS.register("seismitoad_spawn_egg",
            () -> new SpawnEggItem("seismitoad"));
    public static final DeferredItem<Item> THROH_SPAWN_EGG = ITEMS.register("throh_spawn_egg",
            () -> new SpawnEggItem("throh"));
    public static final DeferredItem<Item> SAWK_SPAWN_EGG = ITEMS.register("sawk_spawn_egg",
            () -> new SpawnEggItem("sawk"));
    public static final DeferredItem<Item> SEWADDLE_SPAWN_EGG = ITEMS.register("sewaddle_spawn_egg",
            () -> new SpawnEggItem("sewaddle"));
    public static final DeferredItem<Item> SWADLOON_SPAWN_EGG = ITEMS.register("swadloon_spawn_egg",
            () -> new SpawnEggItem("swadloon"));
    public static final DeferredItem<Item> LEAVANNY_SPAWN_EGG = ITEMS.register("leavanny_spawn_egg",
            () -> new SpawnEggItem("leavanny"));
    public static final DeferredItem<Item> VENIPEDE_SPAWN_EGG = ITEMS.register("venipede_spawn_egg",
            () -> new SpawnEggItem("venipede"));
    public static final DeferredItem<Item> WHIRLIPEDE_SPAWN_EGG = ITEMS.register("whirlipede_spawn_egg",
            () -> new SpawnEggItem("whirlipede"));
    public static final DeferredItem<Item> SCOLIPEDE_SPAWN_EGG = ITEMS.register("scolipede_spawn_egg",
            () -> new SpawnEggItem("scolipede"));
    public static final DeferredItem<Item> COTTONEE_SPAWN_EGG = ITEMS.register("cottonee_spawn_egg",
            () -> new SpawnEggItem("cottonee"));
    public static final DeferredItem<Item> WHIMSICOTT_SPAWN_EGG = ITEMS.register("whimsicott_spawn_egg",
            () -> new SpawnEggItem("whimsicott"));
    public static final DeferredItem<Item> PETILIL_SPAWN_EGG = ITEMS.register("petilil_spawn_egg",
            () -> new SpawnEggItem("petilil"));
    public static final DeferredItem<Item> LILLIGANT_SPAWN_EGG = ITEMS.register("lilligant_spawn_egg",
            () -> new SpawnEggItem("lilligant"));
    public static final DeferredItem<Item> HISUIAN_LILLIGANT_SPAWN_EGG = ITEMS.register("hisuian_lilligant_spawn_egg",
            () -> new SpawnEggItem("hisuian lilligant"));
    public static final DeferredItem<Item> BASCULIN_SPAWN_EGG = ITEMS.register("basculin_spawn_egg",
            () -> new SpawnEggItem("basculin"));
    public static final DeferredItem<Item> SANDILE_SPAWN_EGG = ITEMS.register("sandile_spawn_egg",
            () -> new SpawnEggItem("sandile"));
    public static final DeferredItem<Item> KROKOROK_SPAWN_EGG = ITEMS.register("krokorok_spawn_egg",
            () -> new SpawnEggItem("krokorok"));
    public static final DeferredItem<Item> KROOKODILE_SPAWN_EGG = ITEMS.register("krookodile_spawn_egg",
            () -> new SpawnEggItem("krookodile"));
    public static final DeferredItem<Item> DARUMAKA_SPAWN_EGG = ITEMS.register("darumaka_spawn_egg",
            () -> new SpawnEggItem("darumaka"));
    public static final DeferredItem<Item> GALARIAN_DARUMAKA_SPAWN_EGG = ITEMS.register("galarian_darumaka_spawn_egg",
            () -> new SpawnEggItem("galarian darumaka"));
    public static final DeferredItem<Item> DARMANITAN_SPAWN_EGG = ITEMS.register("darmanitan_spawn_egg",
            () -> new SpawnEggItem("darmanitan"));
    public static final DeferredItem<Item> GALARIAN_DARMANITAN_SPAWN_EGG = ITEMS.register("galarian_darmanitan_spawn_egg",
            () -> new SpawnEggItem("galarian darmanitan"));
    public static final DeferredItem<Item> MARACTUS_SPAWN_EGG = ITEMS.register("maractus_spawn_egg",
            () -> new SpawnEggItem("maractus"));
    public static final DeferredItem<Item> DWEBBLE_SPAWN_EGG = ITEMS.register("dwebble_spawn_egg",
            () -> new SpawnEggItem("dwebble"));
    public static final DeferredItem<Item> CRUSTLE_SPAWN_EGG = ITEMS.register("crustle_spawn_egg",
            () -> new SpawnEggItem("crustle"));
    public static final DeferredItem<Item> SCRAGGY_SPAWN_EGG = ITEMS.register("scraggy_spawn_egg",
            () -> new SpawnEggItem("scraggy"));
    public static final DeferredItem<Item> SCRAFTY_SPAWN_EGG = ITEMS.register("scrafty_spawn_egg",
            () -> new SpawnEggItem("scrafty"));
    public static final DeferredItem<Item> SIGILYPH_SPAWN_EGG = ITEMS.register("sigilyph_spawn_egg",
            () -> new SpawnEggItem("sigilyph"));
    public static final DeferredItem<Item> YAMASK_SPAWN_EGG = ITEMS.register("yamask_spawn_egg",
            () -> new SpawnEggItem("yamask"));
    public static final DeferredItem<Item> GALARIAN_YAMASK_SPAWN_EGG = ITEMS.register("galarian_yamask_spawn_egg",
            () -> new SpawnEggItem("galarian yamask"));
    public static final DeferredItem<Item> COFAGRIGUS_SPAWN_EGG = ITEMS.register("cofagrigus_spawn_egg",
            () -> new SpawnEggItem("cofagrigus"));
    public static final DeferredItem<Item> TIRTOUGA_SPAWN_EGG = ITEMS.register("tirtouga_spawn_egg",
            () -> new SpawnEggItem("tirtouga"));
    public static final DeferredItem<Item> CARRACOSTA_SPAWN_EGG = ITEMS.register("carracosta_spawn_egg",
            () -> new SpawnEggItem("carracosta"));
    public static final DeferredItem<Item> ARCHEN_SPAWN_EGG = ITEMS.register("archen_spawn_egg",
            () -> new SpawnEggItem("archen"));
    public static final DeferredItem<Item> ARCHEOPS_SPAWN_EGG = ITEMS.register("archeops_spawn_egg",
            () -> new SpawnEggItem("archeops"));
    public static final DeferredItem<Item> TRUBBISH_SPAWN_EGG = ITEMS.register("trubbish_spawn_egg",
            () -> new SpawnEggItem("trubbish"));
    public static final DeferredItem<Item> GARBODOR_SPAWN_EGG = ITEMS.register("garbodor_spawn_egg",
            () -> new SpawnEggItem("garbodor"));
    public static final DeferredItem<Item> ZORUA_SPAWN_EGG = ITEMS.register("zorua_spawn_egg",
            () -> new SpawnEggItem("zorua"));
    public static final DeferredItem<Item> HISUIAN_ZORUA_SPAWN_EGG = ITEMS.register("hisuian_zorua_spawn_egg",
            () -> new SpawnEggItem("hisuian zorua"));
    public static final DeferredItem<Item> ZOROARK_SPAWN_EGG = ITEMS.register("zoroark_spawn_egg",
            () -> new SpawnEggItem("zoroark"));
    public static final DeferredItem<Item> HISUIAN_ZOROARK_SPAWN_EGG = ITEMS.register("hisuian_zoroark_spawn_egg",
            () -> new SpawnEggItem("hisuian zoroark"));
    public static final DeferredItem<Item> MINCCINO_SPAWN_EGG = ITEMS.register("minccino_spawn_egg",
            () -> new SpawnEggItem("minccino"));
    public static final DeferredItem<Item> CINCCINO_SPAWN_EGG = ITEMS.register("cinccino_spawn_egg",
            () -> new SpawnEggItem("cinccino"));
    public static final DeferredItem<Item> GOTHITA_SPAWN_EGG = ITEMS.register("gothita_spawn_egg",
            () -> new SpawnEggItem("gothita"));
    public static final DeferredItem<Item> GOTHORITA_SPAWN_EGG = ITEMS.register("gothorita_spawn_egg",
            () -> new SpawnEggItem("gothorita"));
    public static final DeferredItem<Item> GOTHITELLE_SPAWN_EGG = ITEMS.register("gothitelle_spawn_egg",
            () -> new SpawnEggItem("gothitelle"));
    public static final DeferredItem<Item> SOLOSIS_SPAWN_EGG = ITEMS.register("solosis_spawn_egg",
            () -> new SpawnEggItem("solosis"));
    public static final DeferredItem<Item> DUOSION_SPAWN_EGG = ITEMS.register("duosion_spawn_egg",
            () -> new SpawnEggItem("duosion"));
    public static final DeferredItem<Item> REUNICLUS_SPAWN_EGG = ITEMS.register("reuniclus_spawn_egg",
            () -> new SpawnEggItem("reuniclus"));
    public static final DeferredItem<Item> DUCKLETT_SPAWN_EGG = ITEMS.register("ducklett_spawn_egg",
            () -> new SpawnEggItem("ducklett"));
    public static final DeferredItem<Item> SWANNA_SPAWN_EGG = ITEMS.register("swanna_spawn_egg",
            () -> new SpawnEggItem("swanna"));
    public static final DeferredItem<Item> VANILLITE_SPAWN_EGG = ITEMS.register("vanillite_spawn_egg",
            () -> new SpawnEggItem("vanillite"));
    public static final DeferredItem<Item> VANILLISH_SPAWN_EGG = ITEMS.register("vanillish_spawn_egg",
            () -> new SpawnEggItem("vanillish"));
    public static final DeferredItem<Item> VANILLUXE_SPAWN_EGG = ITEMS.register("vanilluxe_spawn_egg",
            () -> new SpawnEggItem("vanilluxe"));
    public static final DeferredItem<Item> DEERLING_SPAWN_EGG = ITEMS.register("deerling_spawn_egg",
            () -> new SpawnEggItem("deerling"));
    public static final DeferredItem<Item> SAWSBUCK_SPAWN_EGG = ITEMS.register("sawsbuck_spawn_egg",
            () -> new SpawnEggItem("sawsbuck"));
    public static final DeferredItem<Item> EMOLGA_SPAWN_EGG = ITEMS.register("emolga_spawn_egg",
            () -> new SpawnEggItem("emolga"));
    public static final DeferredItem<Item> KARRABLAST_SPAWN_EGG = ITEMS.register("karrablast_spawn_egg",
            () -> new SpawnEggItem("karrablast"));
    public static final DeferredItem<Item> ESCAVALIER_SPAWN_EGG = ITEMS.register("escavalier_spawn_egg",
            () -> new SpawnEggItem("escavalier"));
    public static final DeferredItem<Item> FOONGUS_SPAWN_EGG = ITEMS.register("foongus_spawn_egg",
            () -> new SpawnEggItem("foongus"));
    public static final DeferredItem<Item> AMOONGUSS_SPAWN_EGG = ITEMS.register("amoonguss_spawn_egg",
            () -> new SpawnEggItem("amoonguss"));
    public static final DeferredItem<Item> FRILLISH_SPAWN_EGG = ITEMS.register("frillish_spawn_egg",
            () -> new SpawnEggItem("frillish"));
    public static final DeferredItem<Item> JELLICENT_SPAWN_EGG = ITEMS.register("jellicent_spawn_egg",
            () -> new SpawnEggItem("jellicent"));
    public static final DeferredItem<Item> ALOMOMOLA_SPAWN_EGG = ITEMS.register("alomomola_spawn_egg",
            () -> new SpawnEggItem("alomomola"));
    public static final DeferredItem<Item> JOLTIK_SPAWN_EGG = ITEMS.register("joltik_spawn_egg",
            () -> new SpawnEggItem("joltik"));
    public static final DeferredItem<Item> GALVANTULA_SPAWN_EGG = ITEMS.register("galvantula_spawn_egg",
            () -> new SpawnEggItem("galvantula"));
    public static final DeferredItem<Item> FERROSEED_SPAWN_EGG = ITEMS.register("ferroseed_spawn_egg",
            () -> new SpawnEggItem("ferroseed"));
    public static final DeferredItem<Item> FERROTHORN_SPAWN_EGG = ITEMS.register("ferrothorn_spawn_egg",
            () -> new SpawnEggItem("ferrothorn"));
    public static final DeferredItem<Item> KLINK_SPAWN_EGG = ITEMS.register("klink_spawn_egg",
            () -> new SpawnEggItem("klink"));
    public static final DeferredItem<Item> KLANG_SPAWN_EGG = ITEMS.register("klang_spawn_egg",
            () -> new SpawnEggItem("klang"));
    public static final DeferredItem<Item> KLINKLANG_SPAWN_EGG = ITEMS.register("klinklang_spawn_egg",
            () -> new SpawnEggItem("klinklang"));
    public static final DeferredItem<Item> TYNAMO_SPAWN_EGG = ITEMS.register("tynamo_spawn_egg",
            () -> new SpawnEggItem("tynamo"));
    public static final DeferredItem<Item> EELEKTRIK_SPAWN_EGG = ITEMS.register("eelektrik_spawn_egg",
            () -> new SpawnEggItem("eelektrik"));
    public static final DeferredItem<Item> EELEKTROSS_SPAWN_EGG = ITEMS.register("eelektross_spawn_egg",
            () -> new SpawnEggItem("eelektross"));
    public static final DeferredItem<Item> ELGYEM_SPAWN_EGG = ITEMS.register("elgyem_spawn_egg",
            () -> new SpawnEggItem("elgyem"));
    public static final DeferredItem<Item> BEHEEYEM_SPAWN_EGG = ITEMS.register("beheeyem_spawn_egg",
            () -> new SpawnEggItem("beheeyem"));
    public static final DeferredItem<Item> LITWICK_SPAWN_EGG = ITEMS.register("litwick_spawn_egg",
            () -> new SpawnEggItem("litwick"));
    public static final DeferredItem<Item> LAMPENT_SPAWN_EGG = ITEMS.register("lampent_spawn_egg",
            () -> new SpawnEggItem("lampent"));
    public static final DeferredItem<Item> CHANDELURE_SPAWN_EGG = ITEMS.register("chandelure_spawn_egg",
            () -> new SpawnEggItem("chandelure"));
    public static final DeferredItem<Item> AXEW_SPAWN_EGG = ITEMS.register("axew_spawn_egg",
            () -> new SpawnEggItem("axew"));
    public static final DeferredItem<Item> FRAXURE_SPAWN_EGG = ITEMS.register("fraxure_spawn_egg",
            () -> new SpawnEggItem("fraxure"));
    public static final DeferredItem<Item> HAXORUS_SPAWN_EGG = ITEMS.register("haxorus_spawn_egg",
            () -> new SpawnEggItem("haxorus"));
    public static final DeferredItem<Item> CUBCHOO_SPAWN_EGG = ITEMS.register("cubchoo_spawn_egg",
            () -> new SpawnEggItem("cubchoo"));
    public static final DeferredItem<Item> BEARTIC_SPAWN_EGG = ITEMS.register("beartic_spawn_egg",
            () -> new SpawnEggItem("beartic"));
    public static final DeferredItem<Item> CRYOGONAL_SPAWN_EGG = ITEMS.register("cryogonal_spawn_egg",
            () -> new SpawnEggItem("cryogonal"));
    public static final DeferredItem<Item> SHELMET_SPAWN_EGG = ITEMS.register("shelmet_spawn_egg",
            () -> new SpawnEggItem("shelmet"));
    public static final DeferredItem<Item> ACCELGOR_SPAWN_EGG = ITEMS.register("accelgor_spawn_egg",
            () -> new SpawnEggItem("accelgor"));
    public static final DeferredItem<Item> STUNFISK_SPAWN_EGG = ITEMS.register("stunfisk_spawn_egg",
            () -> new SpawnEggItem("stunfisk"));
    public static final DeferredItem<Item> GALARIAN_STUNFISK_SPAWN_EGG = ITEMS.register("galarian_stunfisk_spawn_egg",
            () -> new SpawnEggItem("galarian stunfisk"));
    public static final DeferredItem<Item> MIENFOO_SPAWN_EGG = ITEMS.register("mienfoo_spawn_egg",
            () -> new SpawnEggItem("mienfoo"));
    public static final DeferredItem<Item> MIENSHAO_SPAWN_EGG = ITEMS.register("mienshao_spawn_egg",
            () -> new SpawnEggItem("mienshao"));
    public static final DeferredItem<Item> DRUDDIGON_SPAWN_EGG = ITEMS.register("druddigon_spawn_egg",
            () -> new SpawnEggItem("druddigon"));
    public static final DeferredItem<Item> GOLETT_SPAWN_EGG = ITEMS.register("golett_spawn_egg",
            () -> new SpawnEggItem("golett"));
    public static final DeferredItem<Item> GOLURK_SPAWN_EGG = ITEMS.register("golurk_spawn_egg",
            () -> new SpawnEggItem("golurk"));
    public static final DeferredItem<Item> PAWNIARD_SPAWN_EGG = ITEMS.register("pawniard_spawn_egg",
            () -> new SpawnEggItem("pawniard"));
    public static final DeferredItem<Item> BISHARP_SPAWN_EGG = ITEMS.register("bisharp_spawn_egg",
            () -> new SpawnEggItem("bisharp"));
    public static final DeferredItem<Item> BOUFFALANT_SPAWN_EGG = ITEMS.register("bouffalant_spawn_egg",
            () -> new SpawnEggItem("bouffalant"));
    public static final DeferredItem<Item> RUFFLET_SPAWN_EGG = ITEMS.register("rufflet_spawn_egg",
            () -> new SpawnEggItem("rufflet"));
    public static final DeferredItem<Item> BRAVIARY_SPAWN_EGG = ITEMS.register("braviary_spawn_egg",
            () -> new SpawnEggItem("braviary"));
    public static final DeferredItem<Item> HISUIAN_BRAVIARY_SPAWN_EGG = ITEMS.register("hisuian_braviary_spawn_egg",
            () -> new SpawnEggItem("hisuian braviary"));
    public static final DeferredItem<Item> VULLABY_SPAWN_EGG = ITEMS.register("vullaby_spawn_egg",
            () -> new SpawnEggItem("vullaby"));
    public static final DeferredItem<Item> MANDIBUZZ_SPAWN_EGG = ITEMS.register("mandibuzz_spawn_egg",
            () -> new SpawnEggItem("mandibuzz"));
    public static final DeferredItem<Item> HEATMOR_SPAWN_EGG = ITEMS.register("heatmor_spawn_egg",
            () -> new SpawnEggItem("heatmor"));
    public static final DeferredItem<Item> DURANT_SPAWN_EGG = ITEMS.register("durant_spawn_egg",
            () -> new SpawnEggItem("durant"));
    public static final DeferredItem<Item> DEINO_SPAWN_EGG = ITEMS.register("deino_spawn_egg",
            () -> new SpawnEggItem("deino"));
    public static final DeferredItem<Item> ZWEILOUS_SPAWN_EGG = ITEMS.register("zweilous_spawn_egg",
            () -> new SpawnEggItem("zweilous"));
    public static final DeferredItem<Item> HYDREIGON_SPAWN_EGG = ITEMS.register("hydreigon_spawn_egg",
            () -> new SpawnEggItem("hydreigon"));
    public static final DeferredItem<Item> LARVESTA_SPAWN_EGG = ITEMS.register("larvesta_spawn_egg",
            () -> new SpawnEggItem("larvesta"));
    public static final DeferredItem<Item> VOLCARONA_SPAWN_EGG = ITEMS.register("volcarona_spawn_egg",
            () -> new SpawnEggItem("volcarona"));
    public static final DeferredItem<Item> COBALION_SPAWN_EGG = ITEMS.register("cobalion_spawn_egg",
            () -> new SpawnEggItem("cobalion"));
    public static final DeferredItem<Item> TERRAKION_SPAWN_EGG = ITEMS.register("terrakion_spawn_egg",
            () -> new SpawnEggItem("terrakion"));
    public static final DeferredItem<Item> VIRIZION_SPAWN_EGG = ITEMS.register("virizion_spawn_egg",
            () -> new SpawnEggItem("virizion"));
    public static final DeferredItem<Item> TORNADUS_SPAWN_EGG = ITEMS.register("tornadus_spawn_egg",
            () -> new SpawnEggItem("tornadus"));
    public static final DeferredItem<Item> THUNDURUS_SPAWN_EGG = ITEMS.register("thundurus_spawn_egg",
            () -> new SpawnEggItem("thundurus"));
    public static final DeferredItem<Item> RESHIRAM_SPAWN_EGG = ITEMS.register("reshiram_spawn_egg",
            () -> new SpawnEggItem("reshiram"));
    public static final DeferredItem<Item> ZEKROM_SPAWN_EGG = ITEMS.register("zekrom_spawn_egg",
            () -> new SpawnEggItem("zekrom"));
    public static final DeferredItem<Item> LANDORUS_SPAWN_EGG = ITEMS.register("landorus_spawn_egg",
            () -> new SpawnEggItem("landorus"));
    public static final DeferredItem<Item> KYUREM_SPAWN_EGG = ITEMS.register("kyurem_spawn_egg",
            () -> new SpawnEggItem("kyurem"));
    public static final DeferredItem<Item> KELDEO_SPAWN_EGG = ITEMS.register("keldeo_spawn_egg",
            () -> new SpawnEggItem("keldeo"));
    public static final DeferredItem<Item> MELOETTA_SPAWN_EGG = ITEMS.register("meloetta_spawn_egg",
            () -> new SpawnEggItem("meloetta"));
    public static final DeferredItem<Item> GENESECT_SPAWN_EGG = ITEMS.register("genesect_spawn_egg",
            () -> new SpawnEggItem("genesect"));
    public static final DeferredItem<Item> CHESPIN_SPAWN_EGG = ITEMS.register("chespin_spawn_egg",
            () -> new SpawnEggItem("chespin"));
    public static final DeferredItem<Item> QUILLADIN_SPAWN_EGG = ITEMS.register("quilladin_spawn_egg",
            () -> new SpawnEggItem("quilladin"));
    public static final DeferredItem<Item> CHESNAUGHT_SPAWN_EGG = ITEMS.register("chesnaught_spawn_egg",
            () -> new SpawnEggItem("chesnaught"));
    public static final DeferredItem<Item> FENNEKIN_SPAWN_EGG = ITEMS.register("fennekin_spawn_egg",
            () -> new SpawnEggItem("fennekin"));
    public static final DeferredItem<Item> BRAIXEN_SPAWN_EGG = ITEMS.register("braixen_spawn_egg",
            () -> new SpawnEggItem("braixen"));
    public static final DeferredItem<Item> DELPHOX_SPAWN_EGG = ITEMS.register("delphox_spawn_egg",
            () -> new SpawnEggItem("delphox"));
    public static final DeferredItem<Item> FROAKIE_SPAWN_EGG = ITEMS.register("froakie_spawn_egg",
            () -> new SpawnEggItem("froakie"));
    public static final DeferredItem<Item> FROGADIER_SPAWN_EGG = ITEMS.register("frogadier_spawn_egg",
            () -> new SpawnEggItem("frogadier"));
    public static final DeferredItem<Item> GRENINJA_SPAWN_EGG = ITEMS.register("greninja_spawn_egg",
            () -> new SpawnEggItem("greninja"));
    public static final DeferredItem<Item> BUNNELBY_SPAWN_EGG = ITEMS.register("bunnelby_spawn_egg",
            () -> new SpawnEggItem("bunnelby"));
    public static final DeferredItem<Item> DIGGERSBY_SPAWN_EGG = ITEMS.register("diggersby_spawn_egg",
            () -> new SpawnEggItem("diggersby"));
    public static final DeferredItem<Item> FLETCHLING_SPAWN_EGG = ITEMS.register("fletchling_spawn_egg",
            () -> new SpawnEggItem("fletchling"));
    public static final DeferredItem<Item> FLETCHINDER_SPAWN_EGG = ITEMS.register("fletchinder_spawn_egg",
            () -> new SpawnEggItem("fletchinder"));
    public static final DeferredItem<Item> TALONFLAME_SPAWN_EGG = ITEMS.register("talonflame_spawn_egg",
            () -> new SpawnEggItem("talonflame"));
    public static final DeferredItem<Item> SCATTERBUG_SPAWN_EGG = ITEMS.register("scatterbug_spawn_egg",
            () -> new SpawnEggItem("scatterbug"));
    public static final DeferredItem<Item> SPEWPA_SPAWN_EGG = ITEMS.register("spewpa_spawn_egg",
            () -> new SpawnEggItem("spewpa"));
    public static final DeferredItem<Item> VIVILLON_SPAWN_EGG = ITEMS.register("vivillon_spawn_egg",
            () -> new SpawnEggItem("vivillon"));
    public static final DeferredItem<Item> LITLEO_SPAWN_EGG = ITEMS.register("litleo_spawn_egg",
            () -> new SpawnEggItem("litleo"));
    public static final DeferredItem<Item> PYROAR_SPAWN_EGG = ITEMS.register("pyroar_spawn_egg",
            () -> new SpawnEggItem("pyroar"));
    public static final DeferredItem<Item> FLABÉBÉ_SPAWN_EGG = ITEMS.register("flabebe_spawn_egg",
            () -> new SpawnEggItem("flabebe"));
    public static final DeferredItem<Item> FLOETTE_SPAWN_EGG = ITEMS.register("floette_spawn_egg",
            () -> new SpawnEggItem("floette"));
    public static final DeferredItem<Item> FLORGES_SPAWN_EGG = ITEMS.register("florges_spawn_egg",
            () -> new SpawnEggItem("florges"));
    public static final DeferredItem<Item> SKIDDO_SPAWN_EGG = ITEMS.register("skiddo_spawn_egg",
            () -> new SpawnEggItem("skiddo"));
    public static final DeferredItem<Item> GOGOAT_SPAWN_EGG = ITEMS.register("gogoat_spawn_egg",
            () -> new SpawnEggItem("gogoat"));
    public static final DeferredItem<Item> PANCHAM_SPAWN_EGG = ITEMS.register("pancham_spawn_egg",
            () -> new SpawnEggItem("pancham"));
    public static final DeferredItem<Item> PANGORO_SPAWN_EGG = ITEMS.register("pangoro_spawn_egg",
            () -> new SpawnEggItem("pangoro"));
    public static final DeferredItem<Item> FURFROU_SPAWN_EGG = ITEMS.register("furfrou_spawn_egg",
            () -> new SpawnEggItem("furfrou"));
    public static final DeferredItem<Item> ESPURR_SPAWN_EGG = ITEMS.register("espurr_spawn_egg",
            () -> new SpawnEggItem("espurr"));
    public static final DeferredItem<Item> MEOWSTIC_SPAWN_EGG = ITEMS.register("meowstic_spawn_egg",
            () -> new SpawnEggItem("meowstic"));
    public static final DeferredItem<Item> HONEDGE_SPAWN_EGG = ITEMS.register("honedge_spawn_egg",
            () -> new SpawnEggItem("honedge"));
    public static final DeferredItem<Item> DOUBLADE_SPAWN_EGG = ITEMS.register("doublade_spawn_egg",
            () -> new SpawnEggItem("doublade"));
    public static final DeferredItem<Item> AEGISLASH_SPAWN_EGG = ITEMS.register("aegislash_spawn_egg",
            () -> new SpawnEggItem("aegislash"));
    public static final DeferredItem<Item> SPRITZEE_SPAWN_EGG = ITEMS.register("spritzee_spawn_egg",
            () -> new SpawnEggItem("spritzee"));
    public static final DeferredItem<Item> AROMATISSE_SPAWN_EGG = ITEMS.register("aromatisse_spawn_egg",
            () -> new SpawnEggItem("aromatisse"));
    public static final DeferredItem<Item> SWIRLIX_SPAWN_EGG = ITEMS.register("swirlix_spawn_egg",
            () -> new SpawnEggItem("swirlix"));
    public static final DeferredItem<Item> SLURPUFF_SPAWN_EGG = ITEMS.register("slurpuff_spawn_egg",
            () -> new SpawnEggItem("slurpuff"));
    public static final DeferredItem<Item> INKAY_SPAWN_EGG = ITEMS.register("inkay_spawn_egg",
            () -> new SpawnEggItem("inkay"));
    public static final DeferredItem<Item> MALAMAR_SPAWN_EGG = ITEMS.register("malamar_spawn_egg",
            () -> new SpawnEggItem("malamar"));
    public static final DeferredItem<Item> BINACLE_SPAWN_EGG = ITEMS.register("binacle_spawn_egg",
            () -> new SpawnEggItem("binacle"));
    public static final DeferredItem<Item> BARBARACLE_SPAWN_EGG = ITEMS.register("barbaracle_spawn_egg",
            () -> new SpawnEggItem("barbaracle"));
    public static final DeferredItem<Item> SKRELP_SPAWN_EGG = ITEMS.register("skrelp_spawn_egg",
            () -> new SpawnEggItem("skrelp"));
    public static final DeferredItem<Item> DRAGALGE_SPAWN_EGG = ITEMS.register("dragalge_spawn_egg",
            () -> new SpawnEggItem("dragalge"));
    public static final DeferredItem<Item> CLAUNCHER_SPAWN_EGG = ITEMS.register("clauncher_spawn_egg",
            () -> new SpawnEggItem("clauncher"));
    public static final DeferredItem<Item> CLAWITZER_SPAWN_EGG = ITEMS.register("clawitzer_spawn_egg",
            () -> new SpawnEggItem("clawitzer"));
    public static final DeferredItem<Item> HELIOPTILE_SPAWN_EGG = ITEMS.register("helioptile_spawn_egg",
            () -> new SpawnEggItem("helioptile"));
    public static final DeferredItem<Item> HELIOLISK_SPAWN_EGG = ITEMS.register("heliolisk_spawn_egg",
            () -> new SpawnEggItem("heliolisk"));
    public static final DeferredItem<Item> TYRUNT_SPAWN_EGG = ITEMS.register("tyrunt_spawn_egg",
            () -> new SpawnEggItem("tyrunt"));
    public static final DeferredItem<Item> TYRANTRUM_SPAWN_EGG = ITEMS.register("tyrantrum_spawn_egg",
            () -> new SpawnEggItem("tyrantrum"));
    public static final DeferredItem<Item> AMAURA_SPAWN_EGG = ITEMS.register("amaura_spawn_egg",
            () -> new SpawnEggItem("amaura"));
    public static final DeferredItem<Item> AURORUS_SPAWN_EGG = ITEMS.register("aurorus_spawn_egg",
            () -> new SpawnEggItem("aurorus"));
    public static final DeferredItem<Item> SYLVEON_SPAWN_EGG = ITEMS.register("sylveon_spawn_egg",
            () -> new SpawnEggItem("sylveon"));
    public static final DeferredItem<Item> HAWLUCHA_SPAWN_EGG = ITEMS.register("hawlucha_spawn_egg",
            () -> new SpawnEggItem("hawlucha"));
    public static final DeferredItem<Item> DEDENNE_SPAWN_EGG = ITEMS.register("dedenne_spawn_egg",
            () -> new SpawnEggItem("dedenne"));
    public static final DeferredItem<Item> CARBINK_SPAWN_EGG = ITEMS.register("carbink_spawn_egg",
            () -> new SpawnEggItem("carbink"));
    public static final DeferredItem<Item> GOOMY_SPAWN_EGG = ITEMS.register("goomy_spawn_egg",
            () -> new SpawnEggItem("goomy"));
    public static final DeferredItem<Item> SLIGGOO_SPAWN_EGG = ITEMS.register("sliggoo_spawn_egg",
            () -> new SpawnEggItem("sliggoo"));
    public static final DeferredItem<Item> HISUIAN_SLIGGOO_SPAWN_EGG = ITEMS.register("hisuian_sliggoo_spawn_egg",
            () -> new SpawnEggItem("hisuian sliggoo"));
    public static final DeferredItem<Item> GOODRA_SPAWN_EGG = ITEMS.register("goodra_spawn_egg",
            () -> new SpawnEggItem("goodra"));
    public static final DeferredItem<Item> HISUIAN_GOODRA_SPAWN_EGG = ITEMS.register("hisuian_goodra_spawn_egg",
            () -> new SpawnEggItem("hisuian goodra"));
    public static final DeferredItem<Item> KLEFKI_SPAWN_EGG = ITEMS.register("klefki_spawn_egg",
            () -> new SpawnEggItem("klefki"));
    public static final DeferredItem<Item> PHANTUMP_SPAWN_EGG = ITEMS.register("phantump_spawn_egg",
            () -> new SpawnEggItem("phantump"));
    public static final DeferredItem<Item> TREVENANT_SPAWN_EGG = ITEMS.register("trevenant_spawn_egg",
            () -> new SpawnEggItem("trevenant"));
    public static final DeferredItem<Item> PUMPKABOO_SPAWN_EGG = ITEMS.register("pumpkaboo_spawn_egg",
            () -> new SpawnEggItem("pumpkaboo"));
    public static final DeferredItem<Item> GOURGEIST_SPAWN_EGG = ITEMS.register("gourgeist_spawn_egg",
            () -> new SpawnEggItem("gourgeist"));
    public static final DeferredItem<Item> BERGMITE_SPAWN_EGG = ITEMS.register("bergmite_spawn_egg",
            () -> new SpawnEggItem("bergmite"));
    public static final DeferredItem<Item> AVALUGG_SPAWN_EGG = ITEMS.register("avalugg_spawn_egg",
            () -> new SpawnEggItem("avalugg"));
    public static final DeferredItem<Item> HISUIAN_AVALUGG_SPAWN_EGG = ITEMS.register("hisuian_avalugg_spawn_egg",
            () -> new SpawnEggItem("hisuian avalugg"));
    public static final DeferredItem<Item> NOIBAT_SPAWN_EGG = ITEMS.register("noibat_spawn_egg",
            () -> new SpawnEggItem("noibat"));
    public static final DeferredItem<Item> NOIVERN_SPAWN_EGG = ITEMS.register("noivern_spawn_egg",
            () -> new SpawnEggItem("noivern"));
    public static final DeferredItem<Item> XERNEAS_SPAWN_EGG = ITEMS.register("xerneas_spawn_egg",
            () -> new SpawnEggItem("xerneas"));
    public static final DeferredItem<Item> YVELTAL_SPAWN_EGG = ITEMS.register("yveltal_spawn_egg",
            () -> new SpawnEggItem("yveltal"));
    public static final DeferredItem<Item> ZYGARDE_SPAWN_EGG = ITEMS.register("zygarde_spawn_egg",
            () -> new SpawnEggItem("zygarde"));
    public static final DeferredItem<Item> DIANCIE_SPAWN_EGG = ITEMS.register("diancie_spawn_egg",
            () -> new SpawnEggItem("diancie"));
    public static final DeferredItem<Item> HOOPA_SPAWN_EGG = ITEMS.register("hoopa_spawn_egg",
            () -> new SpawnEggItem("hoopa"));
    public static final DeferredItem<Item> VOLCANION_SPAWN_EGG = ITEMS.register("volcanion_spawn_egg",
            () -> new SpawnEggItem("volcanion"));
    public static final DeferredItem<Item> ROWLET_SPAWN_EGG = ITEMS.register("rowlet_spawn_egg",
            () -> new SpawnEggItem("rowlet"));
    public static final DeferredItem<Item> DARTRIX_SPAWN_EGG = ITEMS.register("dartrix_spawn_egg",
            () -> new SpawnEggItem("dartrix"));
    public static final DeferredItem<Item> DECIDUEYE_SPAWN_EGG = ITEMS.register("decidueye_spawn_egg",
            () -> new SpawnEggItem("decidueye"));
    public static final DeferredItem<Item> HISUIAN_DECIDUEYE_SPAWN_EGG = ITEMS.register("hisuian_decidueye_spawn_egg",
            () -> new SpawnEggItem("hisuian decidueye"));
    public static final DeferredItem<Item> LITTEN_SPAWN_EGG = ITEMS.register("litten_spawn_egg",
            () -> new SpawnEggItem("litten"));
    public static final DeferredItem<Item> TORRACAT_SPAWN_EGG = ITEMS.register("torracat_spawn_egg",
            () -> new SpawnEggItem("torracat"));
    public static final DeferredItem<Item> INCINEROAR_SPAWN_EGG = ITEMS.register("incineroar_spawn_egg",
            () -> new SpawnEggItem("incineroar"));
    public static final DeferredItem<Item> POPPLIO_SPAWN_EGG = ITEMS.register("popplio_spawn_egg",
            () -> new SpawnEggItem("popplio"));
    public static final DeferredItem<Item> BRIONNE_SPAWN_EGG = ITEMS.register("brionne_spawn_egg",
            () -> new SpawnEggItem("brionne"));
    public static final DeferredItem<Item> PRIMARINA_SPAWN_EGG = ITEMS.register("primarina_spawn_egg",
            () -> new SpawnEggItem("primarina"));
    public static final DeferredItem<Item> PIKIPEK_SPAWN_EGG = ITEMS.register("pikipek_spawn_egg",
            () -> new SpawnEggItem("pikipek"));
    public static final DeferredItem<Item> TRUMBEAK_SPAWN_EGG = ITEMS.register("trumbeak_spawn_egg",
            () -> new SpawnEggItem("trumbeak"));
    public static final DeferredItem<Item> TOUCANNON_SPAWN_EGG = ITEMS.register("toucannon_spawn_egg",
            () -> new SpawnEggItem("toucannon"));
    public static final DeferredItem<Item> YUNGOOS_SPAWN_EGG = ITEMS.register("yungoos_spawn_egg",
            () -> new SpawnEggItem("yungoos"));
    public static final DeferredItem<Item> GUMSHOOS_SPAWN_EGG = ITEMS.register("gumshoos_spawn_egg",
            () -> new SpawnEggItem("gumshoos"));
    public static final DeferredItem<Item> GRUBBIN_SPAWN_EGG = ITEMS.register("grubbin_spawn_egg",
            () -> new SpawnEggItem("grubbin"));
    public static final DeferredItem<Item> CHARJABUG_SPAWN_EGG = ITEMS.register("charjabug_spawn_egg",
            () -> new SpawnEggItem("charjabug"));
    public static final DeferredItem<Item> VIKAVOLT_SPAWN_EGG = ITEMS.register("vikavolt_spawn_egg",
            () -> new SpawnEggItem("vikavolt"));
    public static final DeferredItem<Item> CRABRAWLER_SPAWN_EGG = ITEMS.register("crabrawler_spawn_egg",
            () -> new SpawnEggItem("crabrawler"));
    public static final DeferredItem<Item> CRABOMINABLE_SPAWN_EGG = ITEMS.register("crabominable_spawn_egg",
            () -> new SpawnEggItem("crabominable"));
    public static final DeferredItem<Item> ORICORIO_SPAWN_EGG = ITEMS.register("oricorio_spawn_egg",
            () -> new SpawnEggItem("oricorio"));
    public static final DeferredItem<Item> CUTIEFLY_SPAWN_EGG = ITEMS.register("cutiefly_spawn_egg",
            () -> new SpawnEggItem("cutiefly"));
    public static final DeferredItem<Item> RIBOMBEE_SPAWN_EGG = ITEMS.register("ribombee_spawn_egg",
            () -> new SpawnEggItem("ribombee"));
    public static final DeferredItem<Item> ROCKRUFF_SPAWN_EGG = ITEMS.register("rockruff_spawn_egg",
            () -> new SpawnEggItem("rockruff"));
    public static final DeferredItem<Item> LYCANROC_SPAWN_EGG = ITEMS.register("lycanroc_spawn_egg",
            () -> new SpawnEggItem("lycanroc"));
    public static final DeferredItem<Item> WISHIWASHI_SPAWN_EGG = ITEMS.register("wishiwashi_spawn_egg",
            () -> new SpawnEggItem("wishiwashi"));
    public static final DeferredItem<Item> MAREANIE_SPAWN_EGG = ITEMS.register("mareanie_spawn_egg",
            () -> new SpawnEggItem("mareanie"));
    public static final DeferredItem<Item> TOXAPEX_SPAWN_EGG = ITEMS.register("toxapex_spawn_egg",
            () -> new SpawnEggItem("toxapex"));
    public static final DeferredItem<Item> MUDBRAY_SPAWN_EGG = ITEMS.register("mudbray_spawn_egg",
            () -> new SpawnEggItem("mudbray"));
    public static final DeferredItem<Item> MUDSDALE_SPAWN_EGG = ITEMS.register("mudsdale_spawn_egg",
            () -> new SpawnEggItem("mudsdale"));
    public static final DeferredItem<Item> DEWPIDER_SPAWN_EGG = ITEMS.register("dewpider_spawn_egg",
            () -> new SpawnEggItem("dewpider"));
    public static final DeferredItem<Item> ARAQUANID_SPAWN_EGG = ITEMS.register("araquanid_spawn_egg",
            () -> new SpawnEggItem("araquanid"));
    public static final DeferredItem<Item> FOMANTIS_SPAWN_EGG = ITEMS.register("fomantis_spawn_egg",
            () -> new SpawnEggItem("fomantis"));
    public static final DeferredItem<Item> LURANTIS_SPAWN_EGG = ITEMS.register("lurantis_spawn_egg",
            () -> new SpawnEggItem("lurantis"));
    public static final DeferredItem<Item> MORELULL_SPAWN_EGG = ITEMS.register("morelull_spawn_egg",
            () -> new SpawnEggItem("morelull"));
    public static final DeferredItem<Item> SHIINOTIC_SPAWN_EGG = ITEMS.register("shiinotic_spawn_egg",
            () -> new SpawnEggItem("shiinotic"));
    public static final DeferredItem<Item> SALANDIT_SPAWN_EGG = ITEMS.register("salandit_spawn_egg",
            () -> new SpawnEggItem("salandit"));
    public static final DeferredItem<Item> SALAZZLE_SPAWN_EGG = ITEMS.register("salazzle_spawn_egg",
            () -> new SpawnEggItem("salazzle"));
    public static final DeferredItem<Item> STUFFUL_SPAWN_EGG = ITEMS.register("stufful_spawn_egg",
            () -> new SpawnEggItem("stufful"));
    public static final DeferredItem<Item> BEWEAR_SPAWN_EGG = ITEMS.register("bewear_spawn_egg",
            () -> new SpawnEggItem("bewear"));
    public static final DeferredItem<Item> BOUNSWEET_SPAWN_EGG = ITEMS.register("bounsweet_spawn_egg",
            () -> new SpawnEggItem("bounsweet"));
    public static final DeferredItem<Item> STEENEE_SPAWN_EGG = ITEMS.register("steenee_spawn_egg",
            () -> new SpawnEggItem("steenee"));
    public static final DeferredItem<Item> TSAREENA_SPAWN_EGG = ITEMS.register("tsareena_spawn_egg",
            () -> new SpawnEggItem("tsareena"));
    public static final DeferredItem<Item> COMFEY_SPAWN_EGG = ITEMS.register("comfey_spawn_egg",
            () -> new SpawnEggItem("comfey"));
    public static final DeferredItem<Item> ORANGURU_SPAWN_EGG = ITEMS.register("oranguru_spawn_egg",
            () -> new SpawnEggItem("oranguru"));
    public static final DeferredItem<Item> PASSIMIAN_SPAWN_EGG = ITEMS.register("passimian_spawn_egg",
            () -> new SpawnEggItem("passimian"));
    public static final DeferredItem<Item> WIMPOD_SPAWN_EGG = ITEMS.register("wimpod_spawn_egg",
            () -> new SpawnEggItem("wimpod"));
    public static final DeferredItem<Item> GOLISOPOD_SPAWN_EGG = ITEMS.register("golisopod_spawn_egg",
            () -> new SpawnEggItem("golisopod"));
    public static final DeferredItem<Item> SANDYGAST_SPAWN_EGG = ITEMS.register("sandygast_spawn_egg",
            () -> new SpawnEggItem("sandygast"));
    public static final DeferredItem<Item> PALOSSAND_SPAWN_EGG = ITEMS.register("palossand_spawn_egg",
            () -> new SpawnEggItem("palossand"));
    public static final DeferredItem<Item> PYUKUMUKU_SPAWN_EGG = ITEMS.register("pyukumuku_spawn_egg",
            () -> new SpawnEggItem("pyukumuku"));
    public static final DeferredItem<Item> TYPE_NULL_SPAWN_EGG = ITEMS.register("type_null_spawn_egg",
            () -> new SpawnEggItem("typenull"));
    public static final DeferredItem<Item> SILVALLY_SPAWN_EGG = ITEMS.register("silvally_spawn_egg",
            () -> new SpawnEggItem("silvally"));
    public static final DeferredItem<Item> MINIOR_SPAWN_EGG = ITEMS.register("minior_spawn_egg",
            () -> new SpawnEggItem("minior"));
    public static final DeferredItem<Item> KOMALA_SPAWN_EGG = ITEMS.register("komala_spawn_egg",
            () -> new SpawnEggItem("komala"));
    public static final DeferredItem<Item> TURTONATOR_SPAWN_EGG = ITEMS.register("turtonator_spawn_egg",
            () -> new SpawnEggItem("turtonator"));
    public static final DeferredItem<Item> TOGEDEMARU_SPAWN_EGG = ITEMS.register("togedemaru_spawn_egg",
            () -> new SpawnEggItem("togedemaru"));
    public static final DeferredItem<Item> MIMIKYU_SPAWN_EGG = ITEMS.register("mimikyu_spawn_egg",
            () -> new SpawnEggItem("mimikyu"));
    public static final DeferredItem<Item> BRUXISH_SPAWN_EGG = ITEMS.register("bruxish_spawn_egg",
            () -> new SpawnEggItem("bruxish"));
    public static final DeferredItem<Item> DRAMPA_SPAWN_EGG = ITEMS.register("drampa_spawn_egg",
            () -> new SpawnEggItem("drampa"));
    public static final DeferredItem<Item> DHELMISE_SPAWN_EGG = ITEMS.register("dhelmise_spawn_egg",
            () -> new SpawnEggItem("dhelmise"));
    public static final DeferredItem<Item> JANGMO_O_SPAWN_EGG = ITEMS.register("jangmo_o_spawn_egg",
            () -> new SpawnEggItem("jangmo-o"));
    public static final DeferredItem<Item> HAKAMO_O_SPAWN_EGG = ITEMS.register("hakamo_o_spawn_egg",
            () -> new SpawnEggItem("hakamo-o"));
    public static final DeferredItem<Item> KOMMO_O_SPAWN_EGG = ITEMS.register("kommo_o_spawn_egg",
            () -> new SpawnEggItem("kommo-o"));
    public static final DeferredItem<Item> TAPU_KOKO_SPAWN_EGG = ITEMS.register("tapu_koko_spawn_egg",
            () -> new SpawnEggItem("tapukoko"));
    public static final DeferredItem<Item> TAPU_LELE_SPAWN_EGG = ITEMS.register("tapu_lele_spawn_egg",
            () -> new SpawnEggItem("tapulele"));
    public static final DeferredItem<Item> TAPU_BULU_SPAWN_EGG = ITEMS.register("tapu_bulu_spawn_egg",
            () -> new SpawnEggItem("tapubulu"));
    public static final DeferredItem<Item> TAPU_FINI_SPAWN_EGG = ITEMS.register("tapu_fini_spawn_egg",
            () -> new SpawnEggItem("tapufini"));
    public static final DeferredItem<Item> COSMOG_SPAWN_EGG = ITEMS.register("cosmog_spawn_egg",
            () -> new SpawnEggItem("cosmog"));
    public static final DeferredItem<Item> COSMOEM_SPAWN_EGG = ITEMS.register("cosmoem_spawn_egg",
            () -> new SpawnEggItem("cosmoem"));
    public static final DeferredItem<Item> SOLGALEO_SPAWN_EGG = ITEMS.register("solgaleo_spawn_egg",
            () -> new SpawnEggItem("solgaleo"));
    public static final DeferredItem<Item> LUNALA_SPAWN_EGG = ITEMS.register("lunala_spawn_egg",
            () -> new SpawnEggItem("lunala"));
    public static final DeferredItem<Item> NIHILEGO_SPAWN_EGG = ITEMS.register("nihilego_spawn_egg",
            () -> new SpawnEggItem("nihilego"));
    public static final DeferredItem<Item> BUZZWOLE_SPAWN_EGG = ITEMS.register("buzzwole_spawn_egg",
            () -> new SpawnEggItem("buzzwole"));
    public static final DeferredItem<Item> PHEROMOSA_SPAWN_EGG = ITEMS.register("pheromosa_spawn_egg",
            () -> new SpawnEggItem("pheromosa"));
    public static final DeferredItem<Item> XURKITREE_SPAWN_EGG = ITEMS.register("xurkitree_spawn_egg",
            () -> new SpawnEggItem("xurkitree"));
    public static final DeferredItem<Item> CELESTEELA_SPAWN_EGG = ITEMS.register("celesteela_spawn_egg",
            () -> new SpawnEggItem("celesteela"));
    public static final DeferredItem<Item> KARTANA_SPAWN_EGG = ITEMS.register("kartana_spawn_egg",
            () -> new SpawnEggItem("kartana"));
    public static final DeferredItem<Item> GUZZLORD_SPAWN_EGG = ITEMS.register("guzzlord_spawn_egg",
            () -> new SpawnEggItem("guzzlord"));
    public static final DeferredItem<Item> NECROZMA_SPAWN_EGG = ITEMS.register("necrozma_spawn_egg",
            () -> new SpawnEggItem("necrozma"));
    public static final DeferredItem<Item> MAGEARNA_SPAWN_EGG = ITEMS.register("magearna_spawn_egg",
            () -> new SpawnEggItem("magearna"));
    public static final DeferredItem<Item> MARSHADOW_SPAWN_EGG = ITEMS.register("marshadow_spawn_egg",
            () -> new SpawnEggItem("marshadow"));
    public static final DeferredItem<Item> POIPOLE_SPAWN_EGG = ITEMS.register("poipole_spawn_egg",
            () -> new SpawnEggItem("poipole"));
    public static final DeferredItem<Item> NAGANADEL_SPAWN_EGG = ITEMS.register("naganadel_spawn_egg",
            () -> new SpawnEggItem("naganadel"));
    public static final DeferredItem<Item> STAKATAKA_SPAWN_EGG = ITEMS.register("stakataka_spawn_egg",
            () -> new SpawnEggItem("stakataka"));
    public static final DeferredItem<Item> BLACEPHALON_SPAWN_EGG = ITEMS.register("blacephalon_spawn_egg",
            () -> new SpawnEggItem("blacephalon"));
    public static final DeferredItem<Item> ZERAORA_SPAWN_EGG = ITEMS.register("zeraora_spawn_egg",
            () -> new SpawnEggItem("zeraora"));
    public static final DeferredItem<Item> MELTAN_SPAWN_EGG = ITEMS.register("meltan_spawn_egg",
            () -> new SpawnEggItem("meltan"));
    public static final DeferredItem<Item> MELMETAL_SPAWN_EGG = ITEMS.register("melmetal_spawn_egg",
            () -> new SpawnEggItem("melmetal"));
    public static final DeferredItem<Item> GROOKEY_SPAWN_EGG = ITEMS.register("grookey_spawn_egg",
            () -> new SpawnEggItem("grookey"));
    public static final DeferredItem<Item> THWACKEY_SPAWN_EGG = ITEMS.register("thwackey_spawn_egg",
            () -> new SpawnEggItem("thwackey"));
    public static final DeferredItem<Item> RILLABOOM_SPAWN_EGG = ITEMS.register("rillaboom_spawn_egg",
            () -> new SpawnEggItem("rillaboom"));
    public static final DeferredItem<Item> SCORBUNNY_SPAWN_EGG = ITEMS.register("scorbunny_spawn_egg",
            () -> new SpawnEggItem("scorbunny"));
    public static final DeferredItem<Item> RABOOT_SPAWN_EGG = ITEMS.register("raboot_spawn_egg",
            () -> new SpawnEggItem("raboot"));
    public static final DeferredItem<Item> CINDERACE_SPAWN_EGG = ITEMS.register("cinderace_spawn_egg",
            () -> new SpawnEggItem("cinderace"));
    public static final DeferredItem<Item> SOBBLE_SPAWN_EGG = ITEMS.register("sobble_spawn_egg",
            () -> new SpawnEggItem("sobble"));
    public static final DeferredItem<Item> DRIZZILE_SPAWN_EGG = ITEMS.register("drizzile_spawn_egg",
            () -> new SpawnEggItem("drizzile"));
    public static final DeferredItem<Item> INTELEON_SPAWN_EGG = ITEMS.register("inteleon_spawn_egg",
            () -> new SpawnEggItem("inteleon"));
    public static final DeferredItem<Item> SKWOVET_SPAWN_EGG = ITEMS.register("skwovet_spawn_egg",
            () -> new SpawnEggItem("skwovet"));
    public static final DeferredItem<Item> GREEDENT_SPAWN_EGG = ITEMS.register("greedent_spawn_egg",
            () -> new SpawnEggItem("greedent"));
    public static final DeferredItem<Item> ROOKIDEE_SPAWN_EGG = ITEMS.register("rookidee_spawn_egg",
            () -> new SpawnEggItem("rookidee"));
    public static final DeferredItem<Item> CORVISQUIRE_SPAWN_EGG = ITEMS.register("corvisquire_spawn_egg",
            () -> new SpawnEggItem("corvisquire"));
    public static final DeferredItem<Item> CORVIKNIGHT_SPAWN_EGG = ITEMS.register("corviknight_spawn_egg",
            () -> new SpawnEggItem("corviknight"));
    public static final DeferredItem<Item> BLIPBUG_SPAWN_EGG = ITEMS.register("blipbug_spawn_egg",
            () -> new SpawnEggItem("blipbug"));
    public static final DeferredItem<Item> DOTTLER_SPAWN_EGG = ITEMS.register("dottler_spawn_egg",
            () -> new SpawnEggItem("dottler"));
    public static final DeferredItem<Item> ORBEETLE_SPAWN_EGG = ITEMS.register("orbeetle_spawn_egg",
            () -> new SpawnEggItem("orbeetle"));
    public static final DeferredItem<Item> NICKIT_SPAWN_EGG = ITEMS.register("nickit_spawn_egg",
            () -> new SpawnEggItem("nickit"));
    public static final DeferredItem<Item> THIEVUL_SPAWN_EGG = ITEMS.register("thievul_spawn_egg",
            () -> new SpawnEggItem("thievul"));
    public static final DeferredItem<Item> GOSSIFLEUR_SPAWN_EGG = ITEMS.register("gossifleur_spawn_egg",
            () -> new SpawnEggItem("gossifleur"));
    public static final DeferredItem<Item> ELDEGOSS_SPAWN_EGG = ITEMS.register("eldegoss_spawn_egg",
            () -> new SpawnEggItem("eldegoss"));
    public static final DeferredItem<Item> WOOLOO_SPAWN_EGG = ITEMS.register("wooloo_spawn_egg",
            () -> new SpawnEggItem("wooloo"));
    public static final DeferredItem<Item> DUBWOOL_SPAWN_EGG = ITEMS.register("dubwool_spawn_egg",
            () -> new SpawnEggItem("dubwool"));
    public static final DeferredItem<Item> CHEWTLE_SPAWN_EGG = ITEMS.register("chewtle_spawn_egg",
            () -> new SpawnEggItem("chewtle"));
    public static final DeferredItem<Item> DREDNAW_SPAWN_EGG = ITEMS.register("drednaw_spawn_egg",
            () -> new SpawnEggItem("drednaw"));
    public static final DeferredItem<Item> YAMPER_SPAWN_EGG = ITEMS.register("yamper_spawn_egg",
            () -> new SpawnEggItem("yamper"));
    public static final DeferredItem<Item> BOLTUND_SPAWN_EGG = ITEMS.register("boltund_spawn_egg",
            () -> new SpawnEggItem("boltund"));
    public static final DeferredItem<Item> ROLYCOLY_SPAWN_EGG = ITEMS.register("rolycoly_spawn_egg",
            () -> new SpawnEggItem("rolycoly"));
    public static final DeferredItem<Item> CARKOL_SPAWN_EGG = ITEMS.register("carkol_spawn_egg",
            () -> new SpawnEggItem("carkol"));
    public static final DeferredItem<Item> COALOSSAL_SPAWN_EGG = ITEMS.register("coalossal_spawn_egg",
            () -> new SpawnEggItem("coalossal"));
    public static final DeferredItem<Item> APPLIN_SPAWN_EGG = ITEMS.register("applin_spawn_egg",
            () -> new SpawnEggItem("applin"));
    public static final DeferredItem<Item> FLAPPLE_SPAWN_EGG = ITEMS.register("flapple_spawn_egg",
            () -> new SpawnEggItem("flapple"));
    public static final DeferredItem<Item> APPLETUN_SPAWN_EGG = ITEMS.register("appletun_spawn_egg",
            () -> new SpawnEggItem("appletun"));
    public static final DeferredItem<Item> SILICOBRA_SPAWN_EGG = ITEMS.register("silicobra_spawn_egg",
            () -> new SpawnEggItem("silicobra"));
    public static final DeferredItem<Item> SANDACONDA_SPAWN_EGG = ITEMS.register("sandaconda_spawn_egg",
            () -> new SpawnEggItem("sandaconda"));
    public static final DeferredItem<Item> CRAMORANT_SPAWN_EGG = ITEMS.register("cramorant_spawn_egg",
            () -> new SpawnEggItem("cramorant"));
    public static final DeferredItem<Item> ARROKUDA_SPAWN_EGG = ITEMS.register("arrokuda_spawn_egg",
            () -> new SpawnEggItem("arrokuda"));
    public static final DeferredItem<Item> BARRASKEWDA_SPAWN_EGG = ITEMS.register("barraskewda_spawn_egg",
            () -> new SpawnEggItem("barraskewda"));
    public static final DeferredItem<Item> TOXEL_SPAWN_EGG = ITEMS.register("toxel_spawn_egg",
            () -> new SpawnEggItem("toxel"));
    public static final DeferredItem<Item> TOXTRICITY_SPAWN_EGG = ITEMS.register("toxtricity_spawn_egg",
            () -> new SpawnEggItem("toxtricity"));
    public static final DeferredItem<Item> SIZZLIPEDE_SPAWN_EGG = ITEMS.register("sizzlipede_spawn_egg",
            () -> new SpawnEggItem("sizzlipede"));
    public static final DeferredItem<Item> CENTISKORCH_SPAWN_EGG = ITEMS.register("centiskorch_spawn_egg",
            () -> new SpawnEggItem("centiskorch"));
    public static final DeferredItem<Item> CLOBBOPUS_SPAWN_EGG = ITEMS.register("clobbopus_spawn_egg",
            () -> new SpawnEggItem("clobbopus"));
    public static final DeferredItem<Item> GRAPPLOCT_SPAWN_EGG = ITEMS.register("grapploct_spawn_egg",
            () -> new SpawnEggItem("grapploct"));
    public static final DeferredItem<Item> SINISTEA_SPAWN_EGG = ITEMS.register("sinistea_spawn_egg",
            () -> new SpawnEggItem("sinistea"));
    public static final DeferredItem<Item> POLTEAGEIST_SPAWN_EGG = ITEMS.register("polteageist_spawn_egg",
            () -> new SpawnEggItem("polteageist"));
    public static final DeferredItem<Item> HATENNA_SPAWN_EGG = ITEMS.register("hatenna_spawn_egg",
            () -> new SpawnEggItem("hatenna"));
    public static final DeferredItem<Item> HATTREM_SPAWN_EGG = ITEMS.register("hattrem_spawn_egg",
            () -> new SpawnEggItem("hattrem"));
    public static final DeferredItem<Item> HATTERENE_SPAWN_EGG = ITEMS.register("hatterene_spawn_egg",
            () -> new SpawnEggItem("hatterene"));
    public static final DeferredItem<Item> IMPIDIMP_SPAWN_EGG = ITEMS.register("impidimp_spawn_egg",
            () -> new SpawnEggItem("impidimp"));
    public static final DeferredItem<Item> MORGREM_SPAWN_EGG = ITEMS.register("morgrem_spawn_egg",
            () -> new SpawnEggItem("morgrem"));
    public static final DeferredItem<Item> GRIMMSNARL_SPAWN_EGG = ITEMS.register("grimmsnarl_spawn_egg",
            () -> new SpawnEggItem("grimmsnarl"));
    public static final DeferredItem<Item> OBSTAGOON_SPAWN_EGG = ITEMS.register("obstagoon_spawn_egg",
            () -> new SpawnEggItem("obstagoon"));
    public static final DeferredItem<Item> PERRSERKER_SPAWN_EGG = ITEMS.register("perrserker_spawn_egg",
            () -> new SpawnEggItem("perrserker"));
    public static final DeferredItem<Item> CURSOLA_SPAWN_EGG = ITEMS.register("cursola_spawn_egg",
            () -> new SpawnEggItem("cursola"));
    public static final DeferredItem<Item> SIRFETCHD_SPAWN_EGG = ITEMS.register("sirfetchd_spawn_egg",
            () -> new SpawnEggItem("sirfetch'd"));
    public static final DeferredItem<Item> MR_RIME_SPAWN_EGG = ITEMS.register("mr_rime_spawn_egg",
            () -> new SpawnEggItem("mrrime"));
    public static final DeferredItem<Item> RUNERIGUS_SPAWN_EGG = ITEMS.register("runerigus_spawn_egg",
            () -> new SpawnEggItem("runerigus"));
    public static final DeferredItem<Item> MILCERY_SPAWN_EGG = ITEMS.register("milcery_spawn_egg",
            () -> new SpawnEggItem("milcery"));
    public static final DeferredItem<Item> ALCREMIE_SPAWN_EGG = ITEMS.register("alcremie_spawn_egg",
            () -> new SpawnEggItem("alcremie"));
    public static final DeferredItem<Item> FALINKS_SPAWN_EGG = ITEMS.register("falinks_spawn_egg",
            () -> new SpawnEggItem("falinks"));
    public static final DeferredItem<Item> PINCURCHIN_SPAWN_EGG = ITEMS.register("pincurchin_spawn_egg",
            () -> new SpawnEggItem("pincurchin"));
    public static final DeferredItem<Item> SNOM_SPAWN_EGG = ITEMS.register("snom_spawn_egg",
            () -> new SpawnEggItem("snom"));
    public static final DeferredItem<Item> FROSMOTH_SPAWN_EGG = ITEMS.register("frosmoth_spawn_egg",
            () -> new SpawnEggItem("frosmoth"));
    public static final DeferredItem<Item> STONJOURNER_SPAWN_EGG = ITEMS.register("stonjourner_spawn_egg",
            () -> new SpawnEggItem("stonjourner"));
    public static final DeferredItem<Item> EISCUE_SPAWN_EGG = ITEMS.register("eiscue_spawn_egg",
            () -> new SpawnEggItem("eiscue"));
    public static final DeferredItem<Item> INDEEDEE_SPAWN_EGG = ITEMS.register("indeedee_spawn_egg",
            () -> new SpawnEggItem("indeedee"));
    public static final DeferredItem<Item> MORPEKO_SPAWN_EGG = ITEMS.register("morpeko_spawn_egg",
            () -> new SpawnEggItem("morpeko"));
    public static final DeferredItem<Item> CUFANT_SPAWN_EGG = ITEMS.register("cufant_spawn_egg",
            () -> new SpawnEggItem("cufant"));
    public static final DeferredItem<Item> COPPERAJAH_SPAWN_EGG = ITEMS.register("copperajah_spawn_egg",
            () -> new SpawnEggItem("copperajah"));
    public static final DeferredItem<Item> DRACOZOLT_SPAWN_EGG = ITEMS.register("dracozolt_spawn_egg",
            () -> new SpawnEggItem("dracozolt"));
    public static final DeferredItem<Item> ARCTOZOLT_SPAWN_EGG = ITEMS.register("arctozolt_spawn_egg",
            () -> new SpawnEggItem("arctozolt"));
    public static final DeferredItem<Item> DRACOVISH_SPAWN_EGG = ITEMS.register("dracovish_spawn_egg",
            () -> new SpawnEggItem("dracovish"));
    public static final DeferredItem<Item> ARCTOVISH_SPAWN_EGG = ITEMS.register("arctovish_spawn_egg",
            () -> new SpawnEggItem("arctovish"));
    public static final DeferredItem<Item> DURALUDON_SPAWN_EGG = ITEMS.register("duraludon_spawn_egg",
            () -> new SpawnEggItem("duraludon"));
    public static final DeferredItem<Item> DREEPY_SPAWN_EGG = ITEMS.register("dreepy_spawn_egg",
            () -> new SpawnEggItem("dreepy"));
    public static final DeferredItem<Item> DRAKLOAK_SPAWN_EGG = ITEMS.register("drakloak_spawn_egg",
            () -> new SpawnEggItem("drakloak"));
    public static final DeferredItem<Item> DRAGAPULT_SPAWN_EGG = ITEMS.register("dragapult_spawn_egg",
            () -> new SpawnEggItem("dragapult"));
    public static final DeferredItem<Item> ZACIAN_SPAWN_EGG = ITEMS.register("zacian_spawn_egg",
            () -> new SpawnEggItem("zacian"));
    public static final DeferredItem<Item> ZAMAZENTA_SPAWN_EGG = ITEMS.register("zamazenta_spawn_egg",
            () -> new SpawnEggItem("zamazenta"));
    public static final DeferredItem<Item> ETERNATUS_SPAWN_EGG = ITEMS.register("eternatus_spawn_egg",
            () -> new SpawnEggItem("eternatus"));
    public static final DeferredItem<Item> KUBFU_SPAWN_EGG = ITEMS.register("kubfu_spawn_egg",
            () -> new SpawnEggItem("kubfu"));
    public static final DeferredItem<Item> URSHIFU_SPAWN_EGG = ITEMS.register("urshifu_spawn_egg",
            () -> new SpawnEggItem("urshifu"));
    public static final DeferredItem<Item> ZARUDE_SPAWN_EGG = ITEMS.register("zarude_spawn_egg",
            () -> new SpawnEggItem("zarude"));
    public static final DeferredItem<Item> REGIELEKI_SPAWN_EGG = ITEMS.register("regieleki_spawn_egg",
            () -> new SpawnEggItem("regieleki"));
    public static final DeferredItem<Item> REGIDRAGO_SPAWN_EGG = ITEMS.register("regidrago_spawn_egg",
            () -> new SpawnEggItem("regidrago"));
    public static final DeferredItem<Item> GLASTRIER_SPAWN_EGG = ITEMS.register("glastrier_spawn_egg",
            () -> new SpawnEggItem("glastrier"));
    public static final DeferredItem<Item> SPECTRIER_SPAWN_EGG = ITEMS.register("spectrier_spawn_egg",
            () -> new SpawnEggItem("spectrier"));
    public static final DeferredItem<Item> CALYREX_SPAWN_EGG = ITEMS.register("calyrex_spawn_egg",
            () -> new SpawnEggItem("calyrex"));
    public static final DeferredItem<Item> WYRDEER_SPAWN_EGG = ITEMS.register("wyrdeer_spawn_egg",
            () -> new SpawnEggItem("wyrdeer"));
    public static final DeferredItem<Item> KLEAVOR_SPAWN_EGG = ITEMS.register("kleavor_spawn_egg",
            () -> new SpawnEggItem("kleavor"));
    public static final DeferredItem<Item> URSALUNA_SPAWN_EGG = ITEMS.register("ursaluna_spawn_egg",
            () -> new SpawnEggItem("ursaluna"));
    public static final DeferredItem<Item> BLOODMOON_URSALUNA_SPAWN_EGG = ITEMS.register("bloodmoon_ursaluna_spawn_egg",
            () -> new SpawnEggItem("bloodmoon ursaluna"));
    public static final DeferredItem<Item> BASCULEGION_SPAWN_EGG = ITEMS.register("basculegion_spawn_egg",
            () -> new SpawnEggItem("basculegion"));
    public static final DeferredItem<Item> SNEASLER_SPAWN_EGG = ITEMS.register("sneasler_spawn_egg",
            () -> new SpawnEggItem("sneasler"));
    public static final DeferredItem<Item> OVERQWIL_SPAWN_EGG = ITEMS.register("overqwil_spawn_egg",
            () -> new SpawnEggItem("overqwil"));
    public static final DeferredItem<Item> ENAMORUS_SPAWN_EGG = ITEMS.register("enamorus_spawn_egg",
            () -> new SpawnEggItem("enamorus"));
    public static final DeferredItem<Item> SPRIGATITO_SPAWN_EGG = ITEMS.register("sprigatito_spawn_egg",
            () -> new SpawnEggItem("sprigatito"));
    public static final DeferredItem<Item> FLORAGATO_SPAWN_EGG = ITEMS.register("floragato_spawn_egg",
            () -> new SpawnEggItem("floragato"));
    public static final DeferredItem<Item> MEOWSCARADA_SPAWN_EGG = ITEMS.register("meowscarada_spawn_egg",
            () -> new SpawnEggItem("meowscarada"));
    public static final DeferredItem<Item> FUECOCO_SPAWN_EGG = ITEMS.register("fuecoco_spawn_egg",
            () -> new SpawnEggItem("fuecoco"));
    public static final DeferredItem<Item> CROCALOR_SPAWN_EGG = ITEMS.register("crocalor_spawn_egg",
            () -> new SpawnEggItem("crocalor"));
    public static final DeferredItem<Item> SKELEDIRGE_SPAWN_EGG = ITEMS.register("skeledirge_spawn_egg",
            () -> new SpawnEggItem("skeledirge"));
    public static final DeferredItem<Item> QUAXLY_SPAWN_EGG = ITEMS.register("quaxly_spawn_egg",
            () -> new SpawnEggItem("quaxly"));
    public static final DeferredItem<Item> QUAXWELL_SPAWN_EGG = ITEMS.register("quaxwell_spawn_egg",
            () -> new SpawnEggItem("quaxwell"));
    public static final DeferredItem<Item> QUAQUAVAL_SPAWN_EGG = ITEMS.register("quaquaval_spawn_egg",
            () -> new SpawnEggItem("quaquaval"));
    public static final DeferredItem<Item> LECHONK_SPAWN_EGG = ITEMS.register("lechonk_spawn_egg",
            () -> new SpawnEggItem("lechonk"));
    public static final DeferredItem<Item> OINKOLOGNE_SPAWN_EGG = ITEMS.register("oinkologne_spawn_egg",
            () -> new SpawnEggItem("oinkologne"));
    public static final DeferredItem<Item> TAROUNTULA_SPAWN_EGG = ITEMS.register("tarountula_spawn_egg",
            () -> new SpawnEggItem("tarountula"));
    public static final DeferredItem<Item> SPIDOPS_SPAWN_EGG = ITEMS.register("spidops_spawn_egg",
            () -> new SpawnEggItem("spidops"));
    public static final DeferredItem<Item> NYMBLE_SPAWN_EGG = ITEMS.register("nymble_spawn_egg",
            () -> new SpawnEggItem("nymble"));
    public static final DeferredItem<Item> LOKIX_SPAWN_EGG = ITEMS.register("lokix_spawn_egg",
            () -> new SpawnEggItem("lokix"));
    public static final DeferredItem<Item> PAWMI_SPAWN_EGG = ITEMS.register("pawmi_spawn_egg",
            () -> new SpawnEggItem("pawmi"));
    public static final DeferredItem<Item> PAWMO_SPAWN_EGG = ITEMS.register("pawmo_spawn_egg",
            () -> new SpawnEggItem("pawmo"));
    public static final DeferredItem<Item> PAWMOT_SPAWN_EGG = ITEMS.register("pawmot_spawn_egg",
            () -> new SpawnEggItem("pawmot"));
    public static final DeferredItem<Item> TANDEMAUS_SPAWN_EGG = ITEMS.register("tandemaus_spawn_egg",
            () -> new SpawnEggItem("tandemaus"));
    public static final DeferredItem<Item> MAUSHOLD_SPAWN_EGG = ITEMS.register("maushold_spawn_egg",
            () -> new SpawnEggItem("maushold"));
    public static final DeferredItem<Item> FIDOUGH_SPAWN_EGG = ITEMS.register("fidough_spawn_egg",
            () -> new SpawnEggItem("fidough"));
    public static final DeferredItem<Item> DACHSBUN_SPAWN_EGG = ITEMS.register("dachsbun_spawn_egg",
            () -> new SpawnEggItem("dachsbun"));
    public static final DeferredItem<Item> SMOLIV_SPAWN_EGG = ITEMS.register("smoliv_spawn_egg",
            () -> new SpawnEggItem("smoliv"));
    public static final DeferredItem<Item> DOLLIV_SPAWN_EGG = ITEMS.register("dolliv_spawn_egg",
            () -> new SpawnEggItem("dolliv"));
    public static final DeferredItem<Item> ARBOLIVA_SPAWN_EGG = ITEMS.register("arboliva_spawn_egg",
            () -> new SpawnEggItem("arboliva"));
    public static final DeferredItem<Item> SQUAWKABILLY_SPAWN_EGG = ITEMS.register("squawkabilly_spawn_egg",
            () -> new SpawnEggItem("squawkabilly"));
    public static final DeferredItem<Item> NACLI_SPAWN_EGG = ITEMS.register("nacli_spawn_egg",
            () -> new SpawnEggItem("nacli"));
    public static final DeferredItem<Item> NACLSTACK_SPAWN_EGG = ITEMS.register("naclstack_spawn_egg",
            () -> new SpawnEggItem("naclstack"));
    public static final DeferredItem<Item> GARGANACL_SPAWN_EGG = ITEMS.register("garganacl_spawn_egg",
            () -> new SpawnEggItem("garganacl"));
    public static final DeferredItem<Item> CHARCADET_SPAWN_EGG = ITEMS.register("charcadet_spawn_egg",
            () -> new SpawnEggItem("charcadet"));
    public static final DeferredItem<Item> ARMAROUGE_SPAWN_EGG = ITEMS.register("armarouge_spawn_egg",
            () -> new SpawnEggItem("armarouge"));
    public static final DeferredItem<Item> CERULEDGE_SPAWN_EGG = ITEMS.register("ceruledge_spawn_egg",
            () -> new SpawnEggItem("ceruledge"));
    public static final DeferredItem<Item> TADBULB_SPAWN_EGG = ITEMS.register("tadbulb_spawn_egg",
            () -> new SpawnEggItem("tadbulb"));
    public static final DeferredItem<Item> BELLIBOLT_SPAWN_EGG = ITEMS.register("bellibolt_spawn_egg",
            () -> new SpawnEggItem("bellibolt"));
    public static final DeferredItem<Item> WATTREL_SPAWN_EGG = ITEMS.register("wattrel_spawn_egg",
            () -> new SpawnEggItem("wattrel"));
    public static final DeferredItem<Item> KILOWATTREL_SPAWN_EGG = ITEMS.register("kilowattrel_spawn_egg",
            () -> new SpawnEggItem("kilowattrel"));
    public static final DeferredItem<Item> MASCHIFF_SPAWN_EGG = ITEMS.register("maschiff_spawn_egg",
            () -> new SpawnEggItem("maschiff"));
    public static final DeferredItem<Item> MABOSSTIFF_SPAWN_EGG = ITEMS.register("mabosstiff_spawn_egg",
            () -> new SpawnEggItem("mabosstiff"));
    public static final DeferredItem<Item> SHROODLE_SPAWN_EGG = ITEMS.register("shroodle_spawn_egg",
            () -> new SpawnEggItem("shroodle"));
    public static final DeferredItem<Item> GRAFAIAI_SPAWN_EGG = ITEMS.register("grafaiai_spawn_egg",
            () -> new SpawnEggItem("grafaiai"));
    public static final DeferredItem<Item> BRAMBLIN_SPAWN_EGG = ITEMS.register("bramblin_spawn_egg",
            () -> new SpawnEggItem("bramblin"));
    public static final DeferredItem<Item> BRAMBLEGHAST_SPAWN_EGG = ITEMS.register("brambleghast_spawn_egg",
            () -> new SpawnEggItem("brambleghast"));
    public static final DeferredItem<Item> TOEDSCOOL_SPAWN_EGG = ITEMS.register("toedscool_spawn_egg",
            () -> new SpawnEggItem("toedscool"));
    public static final DeferredItem<Item> TOEDSCRUEL_SPAWN_EGG = ITEMS.register("toedscruel_spawn_egg",
            () -> new SpawnEggItem("toedscruel"));
    public static final DeferredItem<Item> KLAWF_SPAWN_EGG = ITEMS.register("klawf_spawn_egg",
            () -> new SpawnEggItem("klawf"));
    public static final DeferredItem<Item> CAPSAKID_SPAWN_EGG = ITEMS.register("capsakid_spawn_egg",
            () -> new SpawnEggItem("capsakid"));
    public static final DeferredItem<Item> SCOVILLAIN_SPAWN_EGG = ITEMS.register("scovillain_spawn_egg",
            () -> new SpawnEggItem("scovillain"));
    public static final DeferredItem<Item> RELLOR_SPAWN_EGG = ITEMS.register("rellor_spawn_egg",
            () -> new SpawnEggItem("rellor"));
    public static final DeferredItem<Item> RABSCA_SPAWN_EGG = ITEMS.register("rabsca_spawn_egg",
            () -> new SpawnEggItem("rabsca"));
    public static final DeferredItem<Item> FLITTLE_SPAWN_EGG = ITEMS.register("flittle_spawn_egg",
            () -> new SpawnEggItem("flittle"));
    public static final DeferredItem<Item> ESPATHRA_SPAWN_EGG = ITEMS.register("espathra_spawn_egg",
            () -> new SpawnEggItem("espathra"));
    public static final DeferredItem<Item> TINKATINK_SPAWN_EGG = ITEMS.register("tinkatink_spawn_egg",
            () -> new SpawnEggItem("tinkatink"));
    public static final DeferredItem<Item> TINKATUFF_SPAWN_EGG = ITEMS.register("tinkatuff_spawn_egg",
            () -> new SpawnEggItem("tinkatuff"));
    public static final DeferredItem<Item> TINKATON_SPAWN_EGG = ITEMS.register("tinkaton_spawn_egg",
            () -> new SpawnEggItem("tinkaton"));
    public static final DeferredItem<Item> WIGLETT_SPAWN_EGG = ITEMS.register("wiglett_spawn_egg",
            () -> new SpawnEggItem("wiglett"));
    public static final DeferredItem<Item> WUGTRIO_SPAWN_EGG = ITEMS.register("wugtrio_spawn_egg",
            () -> new SpawnEggItem("wugtrio"));
    public static final DeferredItem<Item> BOMBIRDIER_SPAWN_EGG = ITEMS.register("bombirdier_spawn_egg",
            () -> new SpawnEggItem("bombirdier"));
    public static final DeferredItem<Item> FINIZEN_SPAWN_EGG = ITEMS.register("finizen_spawn_egg",
            () -> new SpawnEggItem("finizen"));
    public static final DeferredItem<Item> PALAFIN_SPAWN_EGG = ITEMS.register("palafin_spawn_egg",
            () -> new SpawnEggItem("palafin"));
    public static final DeferredItem<Item> VAROOM_SPAWN_EGG = ITEMS.register("varoom_spawn_egg",
            () -> new SpawnEggItem("varoom"));
    public static final DeferredItem<Item> REVAVROOM_SPAWN_EGG = ITEMS.register("revavroom_spawn_egg",
            () -> new SpawnEggItem("revavroom"));
    public static final DeferredItem<Item> CYCLIZAR_SPAWN_EGG = ITEMS.register("cyclizar_spawn_egg",
            () -> new SpawnEggItem("cyclizar"));
    public static final DeferredItem<Item> ORTHWORM_SPAWN_EGG = ITEMS.register("orthworm_spawn_egg",
            () -> new SpawnEggItem("orthworm"));
    public static final DeferredItem<Item> GLIMMET_SPAWN_EGG = ITEMS.register("glimmet_spawn_egg",
            () -> new SpawnEggItem("glimmet"));
    public static final DeferredItem<Item> GLIMMORA_SPAWN_EGG = ITEMS.register("glimmora_spawn_egg",
            () -> new SpawnEggItem("glimmora"));
    public static final DeferredItem<Item> GREAVARD_SPAWN_EGG = ITEMS.register("greavard_spawn_egg",
            () -> new SpawnEggItem("greavard"));
    public static final DeferredItem<Item> HOUNDSTONE_SPAWN_EGG = ITEMS.register("houndstone_spawn_egg",
            () -> new SpawnEggItem("houndstone"));
    public static final DeferredItem<Item> FLAMIGO_SPAWN_EGG = ITEMS.register("flamigo_spawn_egg",
            () -> new SpawnEggItem("flamigo"));
    public static final DeferredItem<Item> CETODDLE_SPAWN_EGG = ITEMS.register("cetoddle_spawn_egg",
            () -> new SpawnEggItem("cetoddle"));
    public static final DeferredItem<Item> CETITAN_SPAWN_EGG = ITEMS.register("cetitan_spawn_egg",
            () -> new SpawnEggItem("cetitan"));
    public static final DeferredItem<Item> VELUZA_SPAWN_EGG = ITEMS.register("veluza_spawn_egg",
            () -> new SpawnEggItem("veluza"));
    public static final DeferredItem<Item> DONDOZO_SPAWN_EGG = ITEMS.register("dondozo_spawn_egg",
            () -> new SpawnEggItem("dondozo"));
    public static final DeferredItem<Item> TATSUGIRI_SPAWN_EGG = ITEMS.register("tatsugiri_spawn_egg",
            () -> new SpawnEggItem("tatsugiri"));
    public static final DeferredItem<Item> ANNIHILAPE_SPAWN_EGG = ITEMS.register("annihilape_spawn_egg",
            () -> new SpawnEggItem("annihilape"));
    public static final DeferredItem<Item> CLODSIRE_SPAWN_EGG = ITEMS.register("clodsire_spawn_egg",
            () -> new SpawnEggItem("clodsire"));
    public static final DeferredItem<Item> FARIGIRAF_SPAWN_EGG = ITEMS.register("farigiraf_spawn_egg",
            () -> new SpawnEggItem("farigiraf"));
    public static final DeferredItem<Item> DUDUNSPARCE_SPAWN_EGG = ITEMS.register("dudunsparce_spawn_egg",
            () -> new SpawnEggItem("dudunsparce"));
    public static final DeferredItem<Item> KINGAMBIT_SPAWN_EGG = ITEMS.register("kingambit_spawn_egg",
            () -> new SpawnEggItem("kingambit"));
    public static final DeferredItem<Item> GREAT_TUSK_SPAWN_EGG = ITEMS.register("great_tusk_spawn_egg",
            () -> new SpawnEggItem("greattusk"));
    public static final DeferredItem<Item> SCREAM_TAIL_SPAWN_EGG = ITEMS.register("scream_tail_spawn_egg",
            () -> new SpawnEggItem("screamtail"));
    public static final DeferredItem<Item> BRUTE_BONNET_SPAWN_EGG = ITEMS.register("brute_bonnet_spawn_egg",
            () -> new SpawnEggItem("brutebonnet"));
    public static final DeferredItem<Item> FLUTTER_MANE_SPAWN_EGG = ITEMS.register("flutter_mane_spawn_egg",
            () -> new SpawnEggItem("fluttermane"));
    public static final DeferredItem<Item> SLITHER_WING_SPAWN_EGG = ITEMS.register("slither_wing_spawn_egg",
            () -> new SpawnEggItem("slitherwing"));
    public static final DeferredItem<Item> SANDY_SHOCKS_SPAWN_EGG = ITEMS.register("sandy_shocks_spawn_egg",
            () -> new SpawnEggItem("sandyshocks"));
    public static final DeferredItem<Item> IRON_TREADS_SPAWN_EGG = ITEMS.register("iron_treads_spawn_egg",
            () -> new SpawnEggItem("irontreads"));
    public static final DeferredItem<Item> IRON_BUNDLE_SPAWN_EGG = ITEMS.register("iron_bundle_spawn_egg",
            () -> new SpawnEggItem("ironbundle"));
    public static final DeferredItem<Item> IRON_HANDS_SPAWN_EGG = ITEMS.register("iron_hands_spawn_egg",
            () -> new SpawnEggItem("ironhands"));
    public static final DeferredItem<Item> IRON_JUGULIS_SPAWN_EGG = ITEMS.register("iron_jugulis_spawn_egg",
            () -> new SpawnEggItem("ironjugulis"));
    public static final DeferredItem<Item> IRON_MOTH_SPAWN_EGG = ITEMS.register("iron_moth_spawn_egg",
            () -> new SpawnEggItem("ironmoth"));
    public static final DeferredItem<Item> IRON_THORNS_SPAWN_EGG = ITEMS.register("iron_thorns_spawn_egg",
            () -> new SpawnEggItem("ironthorns"));
    public static final DeferredItem<Item> FRIGIBAX_SPAWN_EGG = ITEMS.register("frigibax_spawn_egg",
            () -> new SpawnEggItem("frigibax"));
    public static final DeferredItem<Item> ARCTIBAX_SPAWN_EGG = ITEMS.register("arctibax_spawn_egg",
            () -> new SpawnEggItem("arctibax"));
    public static final DeferredItem<Item> BAXCALIBUR_SPAWN_EGG = ITEMS.register("baxcalibur_spawn_egg",
            () -> new SpawnEggItem("baxcalibur"));
    public static final DeferredItem<Item> ROAMING_GIMMIGHOUL_SPAWN_EGG = ITEMS.register("roaming_gimmighoul_spawn_egg",
            () -> new SpawnEggItem("roaming gimmighoul"));
    public static final DeferredItem<Item> CHEST_GIMMIGHOUL_SPAWN_EGG = ITEMS.register("chest_gimmighoul_spawn_egg",
            () -> new SpawnEggItem("chest gimmighoul"));
    public static final DeferredItem<Item> GHOLDENGO_SPAWN_EGG = ITEMS.register("gholdengo_spawn_egg",
            () -> new SpawnEggItem("gholdengo"));
    public static final DeferredItem<Item> WO_CHIEN_SPAWN_EGG = ITEMS.register("wo_chien_spawn_egg",
            () -> new SpawnEggItem("wo-chien"));
    public static final DeferredItem<Item> CHIEN_PAO_SPAWN_EGG = ITEMS.register("chien_pao_spawn_egg",
            () -> new SpawnEggItem("chien-pao"));
    public static final DeferredItem<Item> TING_LU_SPAWN_EGG = ITEMS.register("ting_lu_spawn_egg",
            () -> new SpawnEggItem("ting-lu"));
    public static final DeferredItem<Item> CHI_YU_SPAWN_EGG = ITEMS.register("chi_yu_spawn_egg",
            () -> new SpawnEggItem("chi-yu"));
    public static final DeferredItem<Item> ROARING_MOON_SPAWN_EGG = ITEMS.register("roaring_moon_spawn_egg",
            () -> new SpawnEggItem("roaringmoon"));
    public static final DeferredItem<Item> IRON_VALIANT_SPAWN_EGG = ITEMS.register("iron_valiant_spawn_egg",
            () -> new SpawnEggItem("ironvaliant"));
    public static final DeferredItem<Item> KORAIDON_SPAWN_EGG = ITEMS.register("koraidon_spawn_egg",
            () -> new SpawnEggItem("koraidon"));
    public static final DeferredItem<Item> MIRAIDON_SPAWN_EGG = ITEMS.register("miraidon_spawn_egg",
            () -> new SpawnEggItem("miraidon"));
    public static final DeferredItem<Item> WALKING_WAKE_SPAWN_EGG = ITEMS.register("walking_wake_spawn_egg",
            () -> new SpawnEggItem("walkingwake"));
    public static final DeferredItem<Item> IRON_LEAVES_SPAWN_EGG = ITEMS.register("iron_leaves_spawn_egg",
            () -> new SpawnEggItem("ironleaves"));
    public static final DeferredItem<Item> DIPPLIN_SPAWN_EGG = ITEMS.register("dipplin_spawn_egg",
            () -> new SpawnEggItem("dipplin"));
    public static final DeferredItem<Item> POLTCHAGEIST_SPAWN_EGG = ITEMS.register("poltchageist_spawn_egg",
            () -> new SpawnEggItem("poltchageist"));
    public static final DeferredItem<Item> SINISTCHA_SPAWN_EGG = ITEMS.register("sinistcha_spawn_egg",
            () -> new SpawnEggItem("sinistcha"));
    public static final DeferredItem<Item> OKIDOGI_SPAWN_EGG = ITEMS.register("okidogi_spawn_egg",
            () -> new SpawnEggItem("okidogi"));
    public static final DeferredItem<Item> MUNKIDORI_SPAWN_EGG = ITEMS.register("munkidori_spawn_egg",
            () -> new SpawnEggItem("munkidori"));
    public static final DeferredItem<Item> FEZANDIPITI_SPAWN_EGG = ITEMS.register("fezandipiti_spawn_egg",
            () -> new SpawnEggItem("fezandipiti"));
    public static final DeferredItem<Item> OGERPON_SPAWN_EGG = ITEMS.register("ogerpon_spawn_egg",
            () -> new SpawnEggItem("ogerpon"));
    public static final DeferredItem<Item> ARCHALUDON_SPAWN_EGG = ITEMS.register("archaludon_spawn_egg",
            () -> new SpawnEggItem("archaludon"));
    public static final DeferredItem<Item> HYDRAPPLE_SPAWN_EGG = ITEMS.register("hydrapple_spawn_egg",
            () -> new SpawnEggItem("hydrapple"));
    public static final DeferredItem<Item> GOUGING_FIRE_SPAWN_EGG = ITEMS.register("gouging_fire_spawn_egg",
            () -> new SpawnEggItem("gougingfire"));
    public static final DeferredItem<Item> RAGING_BOLT_SPAWN_EGG = ITEMS.register("raging_bolt_spawn_egg",
            () -> new SpawnEggItem("ragingbolt"));
    public static final DeferredItem<Item> IRON_BOULDER_SPAWN_EGG = ITEMS.register("iron_boulder_spawn_egg",
            () -> new SpawnEggItem("ironboulder"));
    public static final DeferredItem<Item> IRON_CROWN_SPAWN_EGG = ITEMS.register("iron_crown_spawn_egg",
            () -> new SpawnEggItem("ironcrown"));
    public static final DeferredItem<Item> TERAPAGOS_SPAWN_EGG = ITEMS.register("terapagos_spawn_egg",
            () -> new SpawnEggItem("terapagos"));
    public static final DeferredItem<Item> PECHARUNT_SPAWN_EGG = ITEMS.register("pecharunt_spawn_egg",
            () -> new SpawnEggItem("pecharunt"));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}