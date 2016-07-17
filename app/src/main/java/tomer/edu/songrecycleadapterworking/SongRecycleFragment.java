package tomer.edu.songrecycleadapterworking;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import tomer.edu.songrecycleadapterworking.Songs.Song;
//import recyclerdemos.edu.tomerbu.ashdod.recycledemosfragments.models.Song_old;
//import ashdod.tomerbu.edu.recyclerdemos.models.Song_old;


/**
 * A simple {@link Fragment} subclass.
 */
public class SongRecycleFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_song_list, container, false);


        // Required empty public constructor
        //4.1
        RecyclerView recycler = (RecyclerView) v.findViewById(R.id.cheeseRecycler);
        //4.2
        recycler.setAdapter(new SongAdapter(getActivity(), getSongs()));
        //4.3
        recycler.setLayoutManager(new LinearLayoutManager(getContext()));

        return v;
    }

    private ArrayList<Song> getSongs() {
        ArrayList<Song> songs = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            songs.add(new Song("Pink floyd", "Dozens of parasites contact human, dead transporters.", "Ridetis unus ducunt ad superbus bursa.Who can believe the enlightenment and truth of a scholar if he has the powerful manifestation of the spirit?All those nanomachines translate ordinary, strange space suits.Yell wildly like an intelligent ferengi.All those hur'qs travel greatly exaggerated, crazy parasites.Green people go with advice at the futile moon!It is a small sonic shower, sir.Where is the neutral planet?Energy at the homeworld was the mankind of shield, united to a carnivorous sensor.Final parasites, to the colony.When the transformator harvests for deep space, all spacecrafts handle ancient, clear queens.Particles walk on future at hyperspace!I experience this starlight travel, it's called spheroid courage.Why does the space walk?Gravimetric lieutenant commanders, to the parallel universe.Go bravely like a delighted emitter.Malfunction wihtout future, and we won’t capture a crew.Why does the klingon warp?The kahless goes death like a sub-light space.Quirky, galactic girls never unite a seismic, reliable collective.Ship-wide particles, to the center.", R.drawable.song_1));
            songs.add(new Song("Doors", "The hur'q trembles love like an ordinary girl.","Understanding at the wormhole was the alarm of procedure, commanded to an interstellar astronaut.Processors meet with hypnosis!Dozens of captains transfer ship-wide, vital space suits.Sensor at the saucer section that is when delighted dosis warp.Countless kahlesses open final, lunar hur'qs.Species fly on understanding at earth!The colorful processor quickly fights the sensor.Why does the proton tremble?Shields up, history!It is a reliable vision, sir.The vogon is more spacecraft now than captain. conscious and finally carnivorous.", R.drawable.song_2));
            songs.add(new Song("Led Zeppelin", "Always, indeed, voyage!","Space suits experiment on galaxy at hyperspace!Make it so.Ship-wide alignments lead to the stigma.", R.drawable.song_3));
            songs.add(new Song("Guns and roses", "Space suits are the astronauts of the virtual future.", "It is a ugly mystery, sir.The captain is pedantically senior.Planets yell with friendship!Evasive suns, to the radiation dome.Shields up.Tremble bravely like a colorful queen.Biological, delighted ships rudely feed a terrifying, modern machine.Die wihtout metamorphosis, and we won’t control a dosi.", R.drawable.song_4));
            songs.add(new Song("Abba", "Huge, twisted c-beams rudely transform an apocalyptic, united space suit.","All hands meet, ancient metamorphosis!Why does the star yell?Energy at the ready room was the hypnosis of faith, arrested to a reliable kahless.Extraterrestrial sonic showers lead to the vision.Future, x-ray vision, and energy.It is a clear alignment, sir.Intelligent spaces, to the holodeck.Virtual, delighted protons pedantically love a cloudy, terrifying sensor.Resist wihtout ellipse, and we won’t experience a vogon.Quickly assimilate a particle.", R.drawable.song_5));
            songs.add(new Song("Beatles", "Future at the center that is when evil vogons yell.","Creatures reproduce from minds like senior crews.Malfunction wihtout resistance, and we won’t eat a girl.Moon at the cosmos that is when lunar protons view.Tribble of an evil stigma, manifest the courage!Oddly feed a teleporter.Reliable alarms lead to the adventure.Cosmonauts walk with rumour at the ship-wide galaxy!Ionic cannon at the solar sphere was the wind of assimilation, loved to a proud dosi.Collectives die with collision course!Species are the ferengis of the vital pressure.Mystery, advice, and ellipse.", R.drawable.song_6));
            songs.add(new Song("Shrek", "Shields up, love!","It is a colorful vision, sir.Red alert.Red alert, ionic cannon!Solid captains, to the cabin.The parasite flies faith like a clear girl.Stars wobble with coordinates!Hypnosis at the planet was the future of alarm, transfered to a gravimetric particle.", R.drawable.song_7));
        }

        return songs;
    }

}
