package com.example.android.dotainfo;


import android.content.Context;
import android.graphics.Color;
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

public class Dotadetails2Adapter extends ArrayAdapter<DotaDetailsGSON>{


    public Dotadetails2Adapter(Context context, List<DotaDetailsGSON> dotadetails){
        super(context, 0, dotadetails);
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;


        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.dotadetailslist, parent, false);
        }




        DotaDetailsGSON currentdetails2 = getItem(position);


//        TextView matchID = listItemView.findViewById(R.id.matchid2);
//        matchID.setText(currentdetails2.getMatchId1().toString());
//
//        TextView name = listItemView.findViewById(R.id.name);
//        name.setText(currentdetails2.getPlayers().getPersonaname().toString());
//

        TextView WinnerColor = listItemView.findViewById(R.id.WinnerColor);
        WinnerColor.setText("lalala");


        Boolean RadiantWin = currentdetails2.getRadiantWin();
        if(RadiantWin) {
            WinnerColor.setText("RADIANTTEAM WINS");
            WinnerColor.setTextColor(Color.parseColor("#000000"));
            WinnerColor.setBackgroundColor(Color.parseColor("#006400"));

        }
        else {
            WinnerColor.setText("DIRETEAM WINS");
            WinnerColor.setTextColor(Color.parseColor("#000000"));
            WinnerColor.setBackgroundColor(Color.parseColor("#ffffff"));
//        TextView kda = listItemView.findViewById(R.id.kda);
//        kda.setText(currentdetails2.getPlayers().toString());
//
//        TextView gold = listItemView.findViewById(R.id.gold);
//        gold.setText(currentdetails2.getgold().toString());
//
//       TextView level = listItemView.findViewById(R.id.level);
//       level.setText(currentdetails2.getlevel().toString());

        }

        return listItemView;
    }



}
