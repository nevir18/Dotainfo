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

import com.squareup.picasso.Picasso;

import java.util.List;

public class DotaplayersAdapter extends ArrayAdapter<DotaplayersGSON>{



    public DotaplayersAdapter(Context context, List<DotaplayersGSON> dotaplayers){
        super(context, 0, dotaplayers);
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;


        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.dotaplayerlist, parent, false);
        }


        DotaplayersGSON currentPlayers = getItem(position);


        ImageView avatarImage = (ImageView) listItemView.findViewById(R.id.image);

        String Avatar = currentPlayers.getAvatarfull();

        if (null == Avatar){
            Picasso.get().load(R.drawable.dotalogo).fit().centerCrop().into(avatarImage);}
        else{
            Picasso.get().load(Avatar).fit().centerCrop().into(avatarImage);}

        TextView accountId = (TextView) listItemView.findViewById(R.id.accountid);
        accountId.setText(currentPlayers.getAccountId().toString());



        TextView personaname = (TextView) listItemView.findViewById(R.id.personaname);
        personaname.setText(currentPlayers.getPersonaname());

        TextView profileurl = (TextView) listItemView.findViewById(R.id.profileurl);
        profileurl.setText(currentPlayers.getProfileurl());


        TextView loccountrycode = (TextView) listItemView.findViewById(R.id.loccountrycode);
        loccountrycode.setText(currentPlayers.getLoccountrycode());

        TextView name = (TextView) listItemView.findViewById(R.id.name);
        name.setText(currentPlayers.getName());



        TextView teamName = (TextView) listItemView.findViewById(R.id.teamname);
        teamName.setText(currentPlayers.getTeamName());


        TextView isPro = (TextView) listItemView.findViewById(R.id.ispro);
        isPro.setText(currentPlayers.getIsPro().toString());


        boolean ProOrNot = currentPlayers.getIsPro();

        if (ProOrNot){
            isPro.setText("Pro");
        }
        else  {
            isPro.setText("Not Pro");
        }

        return listItemView;
    }



}
