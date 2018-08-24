package com.example.android.dotainfo;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.dotainfo.com.example.android.dotainfo2.DotaDetailsGSON;
import com.example.android.dotainfo.com.example.android.dotainfo2.Player;
import com.squareup.picasso.Picasso;

import java.util.List;

public class Dotadetails2PlayerAdapter extends ArrayAdapter<Player> {


    public Dotadetails2PlayerAdapter(Context context, List<Player> dotadetails) {
        super(context, 0, dotadetails);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;


        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.dotadetailsplayerlist, parent, false);
        }


        Player currentdetails2 = getItem(position);

        ImageView heroImage = listItemView.findViewById(R.id.champion);
        String heroid = currentdetails2.getHeroId().toString();

        switch (heroid) {
            case "1": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/antimage_lg.png").fit().centerCrop().into(heroImage);break;
            case "2": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/axe_lg.png").fit().centerCrop().into(heroImage);break;
            case "3": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/bane_lg.png").fit().centerCrop().into(heroImage);break;
            case "4": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/bloodseeker_lg.png").fit().centerCrop().into(heroImage);break;
            case "5": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/crystal_maiden_lg.png").fit().centerCrop().into(heroImage);break;
            case "6": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/drow_ranger_lg.png").fit().centerCrop().into(heroImage);break;
            case "7": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/earthshaker_lg.png").fit().centerCrop().into(heroImage);break;
            case "8": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/juggernaut_lg.png").fit().centerCrop().into(heroImage);break;
            case "9": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/mirana_lg.png").fit().centerCrop().into(heroImage);break;

            case "10": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/morphling_lg.png").fit().centerCrop().into(heroImage);break;
            case "11": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/nevermore_lg.png").fit().centerCrop().into(heroImage);break;
            case "12": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/phantom_lancer_lg.png").fit().centerCrop().into(heroImage);break;
            case "13": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/puck_lg.png").fit().centerCrop().into(heroImage);break;
            case "14": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/pudge_lg.png").fit().centerCrop().into(heroImage);break;
            case "15": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/razor_lg.png").fit().centerCrop().into(heroImage);break;
            case "16": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/storm_spirit_lg.png").fit().centerCrop().into(heroImage);break;
            case "17": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/sand_king_lg.png").fit().centerCrop().into(heroImage);break;
            case "18": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/sven_lg.png").fit().centerCrop().into(heroImage);break;
            case "19": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/tiny_lg.png").fit().centerCrop().into(heroImage);break;
            case "20": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/vengefulspirit_lg.png").fit().centerCrop().into(heroImage);break;
            case "21": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/windrunner_lg.png").fit().centerCrop().into(heroImage);break;
            case "22": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/zuus_lg.png").fit().centerCrop().into(heroImage);break;
            case "23": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/kunkka_lg.png").fit().centerCrop().into(heroImage);break;
            case "25": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/lina_lg.png").fit().centerCrop().into(heroImage);break;
            case "26": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/lion _lg.png").fit().centerCrop().into(heroImage);break;
            case "27": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/shadow_shaman_lg.png").fit().centerCrop().into(heroImage);break;
            case "28": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/slarda_lg.png").fit().centerCrop().into(heroImage);break;
            case "29": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/tidehunter_lg.png").fit().centerCrop().into(heroImage);break;
            case "30": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/witch_doctor_lg.png").fit().centerCrop().into(heroImage);break;
            case "31": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/lich_lg.png").fit().centerCrop().into(heroImage);break;
            case "32": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/riki_lg.png").fit().centerCrop().into(heroImage);break;

            case "33": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/enigma_lg.png").fit().centerCrop().into(heroImage);break;
            case "34": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/tinker_lg.png").fit().centerCrop().into(heroImage);break;
            case "35": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/sniper_lg.png").fit().centerCrop().into(heroImage);break;
            case "36": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/necrolyte_lg.png").fit().centerCrop().into(heroImage);break;
            case "37": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/warlock_lg.png").fit().centerCrop().into(heroImage);break;
            case "38": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/beastmaster_lg.png").fit().centerCrop().into(heroImage);break;
            case "39": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/queenofpain_lg.png").fit().centerCrop().into(heroImage);break;
            case "40": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/venomancer_lg.png").fit().centerCrop().into(heroImage);break;
            case "41": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/faceless_void_lg.png").fit().centerCrop().into(heroImage);break;
            case "42": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/skeleton_king_lg.png").fit().centerCrop().into(heroImage);break;
            case "43": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/death_prophet_lg.png").fit().centerCrop().into(heroImage);break;
            case "44": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/phantom_assassin_lg.png").fit().centerCrop().into(heroImage);break;
            case "45": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/pugna_lg.png").fit().centerCrop().into(heroImage);break;
            case "46": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/templar_assassin_lg.png").fit().centerCrop().into(heroImage);break;
            case "47": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/viper_lg.png").fit().centerCrop().into(heroImage);break;
            case "48": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/luna_lg.png").fit().centerCrop().into(heroImage);break;
            case "49": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/dragon_knight_lg.png").fit().centerCrop().into(heroImage);break;
            case "50": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/dazzle_lg.png").fit().centerCrop().into(heroImage);break;
            case "51": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/rattletrap_lg.png").fit().centerCrop().into(heroImage);break;
            case "52": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/leshrac_lg.png").fit().centerCrop().into(heroImage);break;
            case "53": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/furion_lg.png").fit().centerCrop().into(heroImage);break;
            case "54": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/life_stealer_lg.png").fit().centerCrop().into(heroImage);break;
            case "55": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/dark_seer_lg.png").fit().centerCrop().into(heroImage);break;
            case "56": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/clinkz_lg.png").fit().centerCrop().into(heroImage);break;
            case "57": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/omniknight_lg.png").fit().centerCrop().into(heroImage);break;
            case "58": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/enchantress_lg.png").fit().centerCrop().into(heroImage);break;
                /////////////////////////////
            case "59": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/huskar_lg.png").fit().centerCrop().into(heroImage);break;
            case "60": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/night_stalker_lg.png").fit().centerCrop().into(heroImage);break;
            case "61": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/broodmother_lg.png").fit().centerCrop().into(heroImage);break;
            case "62": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/bounty_hunter_lg.png").fit().centerCrop().into(heroImage);break;
            case "63": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/weaver_lg.png").fit().centerCrop().into(heroImage);break;
            case "64": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/jakiro_lg.png").fit().centerCrop().into(heroImage);break;
            case "65": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/batrider_lg.png").fit().centerCrop().into(heroImage);break;
            case "66": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/chen_lg.png").fit().centerCrop().into(heroImage);break;
            case "67": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/spectre_lg.png").fit().centerCrop().into(heroImage);break;
            case "68": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/ancient_apparition_lg.png").fit().centerCrop().into(heroImage);break;
            case "69": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/doom_bringer_lg.png").fit().centerCrop().into(heroImage);break;
            case "70": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/ursa_lg.png").fit().centerCrop().into(heroImage);break;
            case "71": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/spirit_breaker_lg.png").fit().centerCrop().into(heroImage);break;
            case "72": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/gyrocopter_lg.png").fit().centerCrop().into(heroImage);break;
            case "73": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/alchemist_lg.png").fit().centerCrop().into(heroImage);break;
            case "74": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/invoker_lg.png").fit().centerCrop().into(heroImage);break;
            case "75": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/silencer_lg.png").fit().centerCrop().into(heroImage);break;
            case "76": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/obs  ian_destroyer_lg.png").fit().centerCrop().into(heroImage);break;
            case "77": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/lycan_lg.png").fit().centerCrop().into(heroImage);break;
            case "78": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/brewmaster_lg.png").fit().centerCrop().into(heroImage);break;
            case "79": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/shadow_demon_lg.png").fit().centerCrop().into(heroImage);break;
            case "80": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/lone_dru_lg.png").fit().centerCrop().into(heroImage);break;
            case "81": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/chaos_knight_lg.png").fit().centerCrop().into(heroImage);break;
            case "82": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/meepo_lg.png").fit().centerCrop().into(heroImage);break;
            case "83": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/treant_lg.png").fit().centerCrop().into(heroImage);break;
            case "84": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/ogre_magi_lg.png").fit().centerCrop().into(heroImage);break;
            case "85": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/undying_lg.png").fit().centerCrop().into(heroImage);break;
            case "86": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/rubick_lg.png").fit().centerCrop().into(heroImage);break;
            case "87": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/disruptor_lg.png").fit().centerCrop().into(heroImage);break;
            case "88": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/nyx_assassin_lg.png").fit().centerCrop().into(heroImage);break;
            case "89": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/naga_siren_lg.png").fit().centerCrop().into(heroImage);break;
            case "90": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/keeper_of_the_light_lg.png").fit().centerCrop().into(heroImage);break;
            case "91": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/wisp_lg.png").fit().centerCrop().into(heroImage);break;
            case "92": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/visage_lg.png").fit().centerCrop().into(heroImage);break;
            case "93": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/slark_lg.png").fit().centerCrop().into(heroImage);break;
            case "94": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/medusa_lg.png").fit().centerCrop().into(heroImage);break;
            case "95": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/troll_warlord_lg.png").fit().centerCrop().into(heroImage);break;
            case "96": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/centaur_lg.png").fit().centerCrop().into(heroImage);break;
            case "97": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/magnataur_lg.png").fit().centerCrop().into(heroImage);break;
            case "98": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/shredder_lg.png").fit().centerCrop().into(heroImage);break;
            case "99": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/bristleback_lg.png").fit().centerCrop().into(heroImage);break;
            case "100": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/tusk_lg.png").fit().centerCrop().into(heroImage);break;
            case "101": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/skywrath_mage_lg.png").fit().centerCrop().into(heroImage);break;
            case "102": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/abaddon_lg.png").fit().centerCrop().into(heroImage);break;
            case "103": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/elder_titan_lg.png").fit().centerCrop().into(heroImage);break;
            case "104": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/legion_commander_lg.png").fit().centerCrop().into(heroImage);break;
            case "105": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/techies_lg.png").fit().centerCrop().into(heroImage);break;
            case "106": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/ember_spirit_lg.png").fit().centerCrop().into(heroImage);break;
            case "107": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/earth_spirit_lg.png").fit().centerCrop().into(heroImage);break;
            case "108": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/abyssal_underlord_lg.png").fit().centerCrop().into(heroImage);break;
            case "109": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/terrorblade_lg.png").fit().centerCrop().into(heroImage);break;
            case "110": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/phoenix_lg.png").fit().centerCrop().into(heroImage);break;
            case "111": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/oracle_lg.png").fit().centerCrop().into(heroImage);break;
            case "112": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/winter_wyvern_lg.png").fit().centerCrop().into(heroImage);break;
            case "113": Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/arc_warden_lg.png").fit().centerCrop().into(heroImage);break;
            case "114":
                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/monkey_king_lg.png").fit().centerCrop().into(heroImage);
                break;
            case "119":
                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/dark_willow_lg.png").fit().centerCrop().into(heroImage);
                break;
            case "120":
                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/pangolier_lg.png").fit().centerCrop().into(heroImage);
                break;
            case "127":
                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/target_dummy_lg.png").fit().centerCrop().into(heroImage);
                break;

        }
//        TextView matchID = listItemView.findViewById(R.id.matchid2);
//        matchID.setText(currentdetails2.getMatchId1().toString());

        TextView name = listItemView.findViewById(R.id.name);
        name.setText("Name: " + currentdetails2.getPersonaname().toString());

//      TextView leagueid = listItemView.findViewById(R.id.level);
//      leagueid.setText(currentdetails2.getLevel().toString());

        String kills = currentdetails2.getKills().toString();
        String deaths = currentdetails2.getDeaths().toString();
        String assists = currentdetails2.getAssists().toString();


        TextView kda = listItemView.findViewById(R.id.kda);
        kda.setText("KDA: "+ kills + "/" + deaths + "/" + assists);

        TextView gold = listItemView.findViewById(R.id.gold);
        gold.setText("Gold: " + currentdetails2.getGold().toString());

        Boolean isRadiant = currentdetails2.getIsRadiant();
        ImageView isradiant = listItemView.findViewById(R.id.isradiant);
       if(isRadiant){
           Picasso.get().load(R.drawable.radiantlogo).into(isradiant);
       }
       else {
           Picasso.get().load(R.drawable.direlogo).into(isradiant);
       }




        return listItemView;
    }


}
