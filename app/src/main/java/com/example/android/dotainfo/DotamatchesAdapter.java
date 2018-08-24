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

import com.squareup.picasso.Picasso;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.List;

public class DotamatchesAdapter extends ArrayAdapter<DotamatchesGSON>{



    public DotamatchesAdapter(Context context, List<DotamatchesGSON> dotamatches){
        super(context, 0, dotamatches);
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView1 = convertView;


        if (listItemView1 == null) {
            listItemView1 = LayoutInflater.from(getContext()).inflate(
                    R.layout.dotamatchlist, parent, false);
        }


        DotamatchesGSON current = getItem(position);




        TextView Matchid = (TextView) listItemView1.findViewById(R.id.matchid);
        Matchid.setText(current.getMatchId().toString());



        TextView RadiantTeamId = (TextView) listItemView1.findViewById(R.id.radiantteamid);
        RadiantTeamId.setText("Radiant Team ID: "+current.getRadiantTeamId());


        Integer Secs = (current.getDuration());
        Integer Mins = Secs * 1000;
        Time durationObject = new Time(Mins);
        String newdurationtime = durationtime(durationObject);
        TextView Duration = (TextView) listItemView1.findViewById(R.id.duration);
        Duration.setText(newdurationtime.toString());


        TextView RadiantName = (TextView) listItemView1.findViewById(R.id.radiantname);
        RadiantName.setText("Radiant Name: "+current.getRadiantName());

        TextView DireName = (TextView) listItemView1.findViewById(R.id.direname);
        DireName.setText("Dire Name: "+current.getDireName());



        TextView DireTeamId = (TextView) listItemView1.findViewById(R.id.direteamid);
        DireTeamId.setText("Dire Team ID:"+current.getDireTeamId());


        TextView RadiantScore = (TextView) listItemView1.findViewById(R.id.radiantscore);
        RadiantScore.setText("Radiant Score: "+current.getRadiantScore().toString());

        TextView DireScore = (TextView) listItemView1.findViewById(R.id.direscore);
        DireScore.setText("Dire Score: "+current.getDireScore().toString());


        ImageView winner = (ImageView) listItemView1.findViewById(R.id.winnerlogo);

        boolean logo = current.getRadiantWin();

        if (logo){
            Picasso.get().load(R.drawable.radiantlogo).fit().centerCrop().into(winner);
            RadiantName.setTextColor(Color.parseColor("#000000"));
            RadiantTeamId.setTextColor(Color.parseColor("#000000"));
            RadiantScore.setTextColor(Color.parseColor("#000000"));
            DireName.setTextColor(Color.parseColor("#000000"));
            DireScore.setTextColor(Color.parseColor("#000000"));
            DireTeamId.setTextColor(Color.parseColor("#000000"));

        }
        else {
            Picasso.get().load(R.drawable.direlogo).fit().centerCrop().into(winner);
            RadiantName.setTextColor(Color.parseColor("#ffffff"));
            RadiantTeamId.setTextColor(Color.parseColor("#ffffff"));
            RadiantScore.setTextColor(Color.parseColor("#ffffff"));
            DireName.setTextColor(Color.parseColor("#ffffff"));
            DireScore.setTextColor(Color.parseColor("#ffffff"));
            DireTeamId.setTextColor(Color.parseColor("#ffffff"));

        }

        return listItemView1;
    }
    private String durationtime(Time timeObject) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        return timeFormat.format(timeObject);
    }


}
