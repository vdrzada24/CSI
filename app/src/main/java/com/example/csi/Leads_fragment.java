package com.example.csi;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.concurrent.Phaser;

public class Leads_fragment extends Fragment {

    CardView card_president;
    CardView vp,exec,coexec,tech,techco,app,web,cp1,cp2,creative,creativeco,publicity1,publicity2,mgmt,mgmtco,treasurer,event;
    CardView photo,photoco,social,socialco,content,contentco;
    public Leads_fragment() {
        // Required empty public constructor
    }


    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_leads_fragment, container, false);

        card_president=(CardView)v.findViewById(R.id.card_president);
        vp=(CardView)v.findViewById(R.id.card_vicepresident);
        exec=(CardView)v.findViewById(R.id.card_executive);
        coexec=(CardView)v.findViewById(R.id.card_coexecutive);
        tech=(CardView)v.findViewById(R.id.card_technicallead);
        techco=(CardView)v.findViewById(R.id.card_technicalcolead);
        app=(CardView)v.findViewById(R.id.card_applead);
        web=(CardView)v.findViewById(R.id.card_weblead);
        cp1=(CardView)v.findViewById(R.id.card_cplead1);
        cp2=(CardView)v.findViewById(R.id.card_cplead2);
        creative=(CardView)v.findViewById(R.id.card_creativelead);
        creativeco=(CardView)v.findViewById(R.id.card_creativecoloead);
        publicity1=(CardView)v.findViewById(R.id.card_publicitylead1);
        publicity2=(CardView)v.findViewById(R.id.card_publicitylead2);
        mgmt=(CardView)v.findViewById(R.id.card_managementlead);
        mgmtco=(CardView)v.findViewById(R.id.card_managementcolead);
        treasurer=(CardView)v.findViewById(R.id.card_treasurer);
        event=(CardView)v.findViewById(R.id.card_eventlead);
        photo=(CardView)v.findViewById(R.id.card_photographylead);
        photoco=(CardView)v.findViewById(R.id.card_photographycolead);
        social=(CardView)v.findViewById(R.id.card_sociallead);
        socialco=(CardView)v.findViewById(R.id.card_socialcolead);
        content=(CardView)v.findViewById(R.id.card_contentlead);
        contentco=(CardView)v.findViewById(R.id.card_contentcolead);
        card_president.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                President_Fragment president_fragment=new President_Fragment();
                president_fragment.show(getActivity().getSupportFragmentManager(), president_fragment.getTag());
            }
        });

        vp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vicepresident_fragment vicepresident_fragment=new Vicepresident_fragment();
                vicepresident_fragment.show(getActivity().getSupportFragmentManager(), vicepresident_fragment.getTag());
            }
        });

        exec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Executive_fragment executive_fragment = new Executive_fragment();
                executive_fragment.show(getActivity().getSupportFragmentManager(), executive_fragment.getTag());
            }
        });

        coexec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Coexecutive_fragment coexecutive_fragment=new Coexecutive_fragment();
                coexecutive_fragment.show(getActivity().getSupportFragmentManager(),coexecutive_fragment.getTag());
            }
        });

        tech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Technicallead_fragment technicallead_fragment=new Technicallead_fragment();
                technicallead_fragment.show(getActivity().getSupportFragmentManager(),technicallead_fragment.getTag());
            }
        });

        techco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Technicalcolead_fragment technicalcolead_fragment=new Technicalcolead_fragment();
                technicalcolead_fragment.show(getActivity().getSupportFragmentManager(),technicalcolead_fragment.getTag());
            }
        });

        app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Applead_fragment applead_fragment=new Applead_fragment();
                applead_fragment.show(getActivity().getSupportFragmentManager(),applead_fragment.getTag());
            }
        });

        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Weblead_fragment weblead_fragment=new Weblead_fragment();
                weblead_fragment.show(getActivity().getSupportFragmentManager(),weblead_fragment.getTag());
            }
        });

        cp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cplead1_fragment cplead1_fragment=new Cplead1_fragment();
                cplead1_fragment.show(getActivity().getSupportFragmentManager(),cplead1_fragment.getTag());
            }
        });

        cp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cplead2_fragment cplead2_fragment=new Cplead2_fragment();
                cplead2_fragment.show(getActivity().getSupportFragmentManager(),cplead2_fragment.getTag());
            }
        });

        creative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Creativelead_fragment creativelead_fragment=new Creativelead_fragment();
                creativelead_fragment.show(getActivity().getSupportFragmentManager(),creativelead_fragment.getTag());
            }
        });

        creativeco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Creativecolead_fragment creativecolead_fragment=new Creativecolead_fragment();
                creativecolead_fragment.show(getActivity().getSupportFragmentManager(),creativecolead_fragment.getTag());
            }
        });

        publicity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Publicitylead1_fragment publicitylead1_fragment=new Publicitylead1_fragment();
                publicitylead1_fragment.show(getActivity().getSupportFragmentManager(),publicitylead1_fragment.getTag());
            }
        });

        publicity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Publicitylead2_fragment publicitylead2_fragment=new Publicitylead2_fragment();
                publicitylead2_fragment.show(getActivity().getSupportFragmentManager(),publicitylead2_fragment.getTag());
            }
        });

        mgmt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Managementlead_fragment managementlead_fragment=new Managementlead_fragment();
                managementlead_fragment.show(getActivity().getSupportFragmentManager(),managementlead_fragment.getTag());
            }
        });

        mgmtco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Managementcolead_fragment managementcolead_fragment=new Managementcolead_fragment();
                managementcolead_fragment.show(getActivity().getSupportFragmentManager(),managementcolead_fragment.getTag());
            }
        });

        treasurer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Treasurer_fragment treasurer_fragment=new Treasurer_fragment();
                treasurer_fragment.show(getActivity().getSupportFragmentManager(),treasurer_fragment.getTag());
            }
        });

        event.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Eventlead_fragment eventlead_fragment=new Eventlead_fragment();
                eventlead_fragment.show(getActivity().getSupportFragmentManager(),eventlead_fragment.getTag());
            }
        });

        photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Photolead_fragment photolead_fragment=new Photolead_fragment();
                photolead_fragment.show(getActivity().getSupportFragmentManager(),photolead_fragment.getTag());
            }
        });

        photoco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Photocolead_fragment photocolead_fragment=new Photocolead_fragment();
                photocolead_fragment.show(getActivity().getSupportFragmentManager(),photocolead_fragment.getTag());
            }
        });

        social.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sociallead_fragment sociallead_fragment=new Sociallead_fragment();
                sociallead_fragment.show(getActivity().getSupportFragmentManager(),sociallead_fragment.getTag());
            }
        });

        socialco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Socialcolead_fragment socialcolead_fragment=new Socialcolead_fragment();
                socialcolead_fragment.show(getActivity().getSupportFragmentManager(),socialcolead_fragment.getTag());
            }
        });

        content.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Contentlead_fragment contentlead_fragment=new Contentlead_fragment();
                contentlead_fragment.show(getActivity().getSupportFragmentManager(),contentlead_fragment.getTag());
            }
        });

        contentco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Contentcolead_fragment contentcolead_fragment=new Contentcolead_fragment();
                contentcolead_fragment.show(getActivity().getSupportFragmentManager(),contentcolead_fragment.getTag());
            }
        });


        return  v;
    }
}