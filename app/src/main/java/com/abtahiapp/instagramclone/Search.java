package com.abtahiapp.instagramclone;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;
public class Search extends Fragment implements ImageAdapter.OnItemClickListener {
    View root;
    private static final int NUM_COLUMNS = 3;
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> username = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_search, container, false);
        RecyclerView recyclerView = root.findViewById(R.id.recyclerView);
        ImageAdapter adapter = new ImageAdapter(getActivity(), mImageUrls,username,this);
        StaggeredGridLayoutManager staggeredGridLayoutManager= new StaggeredGridLayoutManager(NUM_COLUMNS, LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        recyclerView.setAdapter(adapter);

        //Square 2
        mImageUrls.add("https://media.istockphoto.com/id/157637976/photo/female-soccer-player-in-yellow-jumps-to-touch-bouncing-ball.jpg?s=612x612&w=0&k=20&c=lcsU4h0tORwQSUExo8MpBWgbjwLrfTcFShu2IcGZ7xs=");
        username.add("Ameri");
        mImageUrls.add("https://media.istockphoto.com/id/688945004/photo/soccer-player-in-action.jpg?s=612x612&w=0&k=20&c=NxmvJWUzShBoroblZPi9kXsQkMmHVzx7OwevYP2rWs8=");
        username.add("Aksonov");
        //Vertical 1
        mImageUrls.add("https://media.istockphoto.com/id/1637717361/photo/portrait-of-young-man-on-football-pitch.jpg?s=612x612&w=0&k=20&c=4yPcDGFe42S4ayUXhUUTjqf8JdEeBfmkW3GlqNVZg4o=");
        username.add("Simonkr");
        //Square 2
        mImageUrls.add("https://media.istockphoto.com/id/523312661/photo/female-soccer-player-showing-mega-intensity-with-eyes-up-downfield.jpg?s=612x612&w=0&k=20&c=nLYvUziS5ord6Ndq8kygmHj23Azzm0WMNErWbaJ9pTA=");
        username.add("Bruna");
        mImageUrls.add("https://media.istockphoto.com/id/157720320/photo/attractive-female-soccer-players-compete-for-control-of-ball.jpg?s=612x612&w=0&k=20&c=FdUXUu4JN6Lmr90JhWY8Al5EHGwUY2GeqsI7XUw9UIU=");
        username.add("Strickly");
        //Vertical 1
        mImageUrls.add("https://media.istockphoto.com/id/79338262/photo/portrait-of-a-goalkeeper.jpg?s=612x612&w=0&k=20&c=3fkNvm_eqkxauNHPz0xnDUmfa6qA81bw23Ht9xFTgo4=");
        username.add("Xaka");

        //Square 2
        mImageUrls.add("https://media.istockphoto.com/id/1387812699/photo/3d-illustration-of-mobile-phone-with-plant-growing-data-management-digital-farming-concept.jpg?s=612x612&w=0&k=20&c=alhYMPHrn1KdxRclUMtakfxoy8iujJavPRiMvwFth5Y=");
        username.add("Apple");
        mImageUrls.add("https://media.istockphoto.com/id/940143992/photo/the-night-owls-in-networking-mode.jpg?s=612x612&w=0&k=20&c=Z3bftsmq56cb1mzwRRnZLLywd9TXaXs-8RAYk2WINrk=");
        username.add("Steve");
        //Vertical 1
        mImageUrls.add("https://media.istockphoto.com/id/1481335583/photo/young-female-wearing-vr-glasses-control-ai-robot-arm-system-in-workshop-female-working-and.jpg?s=612x612&w=0&k=20&c=1rxGDGzQzzJX4TZASw328ONCyvrFXlVkwCmnit54IO0=");
        username.add("VRI");
        //Vertical 1
        mImageUrls.add("https://media.istockphoto.com/id/1460840877/photo/young-male-teacher-teaching-a-programing-class.jpg?s=612x612&w=0&k=20&c=RjzL35cS9oMbfI3Od5_ogh8ow0KK2-ZQc_tHChCbs7g=");
        username.add("Coder");
        //Square 2
        mImageUrls.add("https://media.istockphoto.com/id/1279152430/photo/online-shopping-at-smartphone-with-flying-yellow-wallet-clutch-bag-and-shoe-background.jpg?s=612x612&w=0&k=20&c=G-q_kLZt4oVlq0SNnDxMgM5cSfHRt034_GWxFoEmaA0=");
        username.add("realme");
        mImageUrls.add("https://media.istockphoto.com/id/1356503404/photo/space-capsule-astronaut.jpg?s=612x612&w=0&k=20&c=uK52uZrqDkVGV4iyYzno6tkcYJpQY_EWrziUeqbDkd8=");
        username.add("NASA");

        //Square 2
        mImageUrls.add("https://media.istockphoto.com/id/1293654645/photo/young-female-soccer-girl-during-football-training.jpg?s=612x612&w=0&k=20&c=9qTH86Lv_WOAFLr7dYOCM8ExIcyUnKikjyLB330XcSI=");
        username.add("Mery");
        mImageUrls.add("https://media.istockphoto.com/id/155395559/photo/attractive-young-male-soccer-player-sprints-into-ball-kick.jpg?s=612x612&w=0&k=20&c=31TekpCfXmetHqYjJtCw_y23VI9eY9T_fK-zOQmDoM0=");
        username.add("Jakob");
        //Vertical 1
        mImageUrls.add("https://media.istockphoto.com/id/1480046026/photo/vertical-shot-of-major-league-soccer-football-championship-confident-blue-team-african.jpg?s=612x612&w=0&k=20&c=qpUH0K-V0s1oiTOSQj9Z7JlQue21bc1_BXs5uw2grbo=");
        username.add("Pedri");
        //Vertical 1
        mImageUrls.add("https://media.istockphoto.com/id/187205224/photo/waiting-for-his-opponents.jpg?s=612x612&w=0&k=20&c=wVIMYDjYPWfq81AuWaLN7KQD4KtqnFrN2tWlmLBQoWU=");
        username.add("Yamal");
        //Square 2
        mImageUrls.add("https://media.istockphoto.com/id/1293654647/photo/girls-enjoying-soccer-during-a-football-match.jpg?s=612x612&w=0&k=20&c=f658Cq-gCNMdTIR3oEfiVjsQEqlNeeKDi70gxAU2Gk0=");
        username.add("Antonella");
        mImageUrls.add("https://media.istockphoto.com/id/1342185100/photo/teen-juggling-with-a-soccer-ball-at-a-beach-in-miami.jpg?s=612x612&w=0&k=20&c=S-GgRhxOTchF-hZg56UgW0_81KPNxQAXz0AYwSp57r8=");
        username.add("Xavi");

        //Square 2
        mImageUrls.add("https://media.istockphoto.com/id/185117485/photo/multitasking-and-usablity-of-tablet.jpg?s=612x612&w=0&k=20&c=7LqKNK35gvLJgcJAn6TiIBVURWqY4h0JKhdB8Fum3IU=");
        username.add("Magazine");
        mImageUrls.add("https://media.istockphoto.com/id/1456330562/photo/3d-rendering-of-light-bulb-covered-with-grass.jpg?s=612x612&w=0&k=20&c=Q8mHtoiNbrVX8rJhSXX24ONwtihcWkqnj7Wq-LcTQAY=");
        username.add("Mark");
        //Vertical 1
        mImageUrls.add("https://media.istockphoto.com/id/1422090298/photo/real-life-young-female-aircraft-engineer-apprentice-at-work.jpg?s=612x612&w=0&k=20&c=cuZyrFykDubLR3bxJzlcRhBrXNyu2AsjXxzAwywAAuk=");
        username.add("ChatGPT");
        //Vertical 1
        mImageUrls.add("https://media.istockphoto.com/id/1411382784/photo/smart-mobile-phone-with-applications.jpg?s=612x612&w=0&k=20&c=zkYxOPkJP4-TRE13CiYxI-mibNow9nLQ1wkA8pDlrn0=");
        username.add("Iphone");
        //Square 2
        mImageUrls.add("https://media.istockphoto.com/id/509464671/photo/smart-watch.jpg?s=612x612&w=0&k=20&c=RDYfeSMutwJ778pweCYQwIvFKAcNCni5_m5B-iLkDZs=");
        username.add("Smart Watch");
        mImageUrls.add("https://media.istockphoto.com/id/1473220071/photo/tangled-paper-tapes-with-arrows-pointing-different-ways-inside-human-head-shape-choice-and.jpg?s=612x612&w=0&k=20&c=GVAK3TH-4kcHVh5tL6NoGBOZzZbM_-205fzhs8d-Yyw=");
        username.add("Critics");

        //Square 2
        mImageUrls.add("https://media.istockphoto.com/id/1387812699/photo/3d-illustration-of-mobile-phone-with-plant-growing-data-management-digital-farming-concept.jpg?s=612x612&w=0&k=20&c=alhYMPHrn1KdxRclUMtakfxoy8iujJavPRiMvwFth5Y=");
        username.add("Apple");
        mImageUrls.add("https://media.istockphoto.com/id/940143992/photo/the-night-owls-in-networking-mode.jpg?s=612x612&w=0&k=20&c=Z3bftsmq56cb1mzwRRnZLLywd9TXaXs-8RAYk2WINrk=");
        username.add("Steve");
        //Vertical 1
        mImageUrls.add("https://media.istockphoto.com/id/1481335583/photo/young-female-wearing-vr-glasses-control-ai-robot-arm-system-in-workshop-female-working-and.jpg?s=612x612&w=0&k=20&c=1rxGDGzQzzJX4TZASw328ONCyvrFXlVkwCmnit54IO0=");
        username.add("VRI");
        //Vertical 1
        mImageUrls.add("https://media.istockphoto.com/id/1460840877/photo/young-male-teacher-teaching-a-programing-class.jpg?s=612x612&w=0&k=20&c=RjzL35cS9oMbfI3Od5_ogh8ow0KK2-ZQc_tHChCbs7g=");
        username.add("Coder");
        //Square 2
        mImageUrls.add("https://media.istockphoto.com/id/1279152430/photo/online-shopping-at-smartphone-with-flying-yellow-wallet-clutch-bag-and-shoe-background.jpg?s=612x612&w=0&k=20&c=G-q_kLZt4oVlq0SNnDxMgM5cSfHRt034_GWxFoEmaA0=");
        username.add("realme");
        mImageUrls.add("https://media.istockphoto.com/id/1356503404/photo/space-capsule-astronaut.jpg?s=612x612&w=0&k=20&c=uK52uZrqDkVGV4iyYzno6tkcYJpQY_EWrziUeqbDkd8=");
        username.add("NASA");

        //Square 2
        mImageUrls.add("https://media.istockphoto.com/id/1293654645/photo/young-female-soccer-girl-during-football-training.jpg?s=612x612&w=0&k=20&c=9qTH86Lv_WOAFLr7dYOCM8ExIcyUnKikjyLB330XcSI=");
        username.add("Mery");
        mImageUrls.add("https://media.istockphoto.com/id/155395559/photo/attractive-young-male-soccer-player-sprints-into-ball-kick.jpg?s=612x612&w=0&k=20&c=31TekpCfXmetHqYjJtCw_y23VI9eY9T_fK-zOQmDoM0=");
        username.add("Jakob");
        //Vertical 1
        mImageUrls.add("https://media.istockphoto.com/id/1480046026/photo/vertical-shot-of-major-league-soccer-football-championship-confident-blue-team-african.jpg?s=612x612&w=0&k=20&c=qpUH0K-V0s1oiTOSQj9Z7JlQue21bc1_BXs5uw2grbo=");
        username.add("Pedri");
        //Vertical 1
        mImageUrls.add("https://media.istockphoto.com/id/187205224/photo/waiting-for-his-opponents.jpg?s=612x612&w=0&k=20&c=wVIMYDjYPWfq81AuWaLN7KQD4KtqnFrN2tWlmLBQoWU=");
        username.add("Yamal");
        //Square 2
        mImageUrls.add("https://media.istockphoto.com/id/1293654647/photo/girls-enjoying-soccer-during-a-football-match.jpg?s=612x612&w=0&k=20&c=f658Cq-gCNMdTIR3oEfiVjsQEqlNeeKDi70gxAU2Gk0=");
        username.add("Antonella");
        mImageUrls.add("https://media.istockphoto.com/id/1342185100/photo/teen-juggling-with-a-soccer-ball-at-a-beach-in-miami.jpg?s=612x612&w=0&k=20&c=S-GgRhxOTchF-hZg56UgW0_81KPNxQAXz0AYwSp57r8=");
        username.add("Xavi");

        //Square 2
        mImageUrls.add("https://media.istockphoto.com/id/157637976/photo/female-soccer-player-in-yellow-jumps-to-touch-bouncing-ball.jpg?s=612x612&w=0&k=20&c=lcsU4h0tORwQSUExo8MpBWgbjwLrfTcFShu2IcGZ7xs=");
        username.add("Ameri");
        mImageUrls.add("https://media.istockphoto.com/id/688945004/photo/soccer-player-in-action.jpg?s=612x612&w=0&k=20&c=NxmvJWUzShBoroblZPi9kXsQkMmHVzx7OwevYP2rWs8=");
        username.add("Aksonov");
        //Vertical 1
        mImageUrls.add("https://media.istockphoto.com/id/1637717361/photo/portrait-of-young-man-on-football-pitch.jpg?s=612x612&w=0&k=20&c=4yPcDGFe42S4ayUXhUUTjqf8JdEeBfmkW3GlqNVZg4o=");
        username.add("Simonkr");
        //Square 2
        mImageUrls.add("https://media.istockphoto.com/id/523312661/photo/female-soccer-player-showing-mega-intensity-with-eyes-up-downfield.jpg?s=612x612&w=0&k=20&c=nLYvUziS5ord6Ndq8kygmHj23Azzm0WMNErWbaJ9pTA=");
        username.add("Bruna");
        mImageUrls.add("https://media.istockphoto.com/id/157720320/photo/attractive-female-soccer-players-compete-for-control-of-ball.jpg?s=612x612&w=0&k=20&c=FdUXUu4JN6Lmr90JhWY8Al5EHGwUY2GeqsI7XUw9UIU=");
        username.add("Strickly");
        //Vertical 1
        mImageUrls.add("https://media.istockphoto.com/id/79338262/photo/portrait-of-a-goalkeeper.jpg?s=612x612&w=0&k=20&c=3fkNvm_eqkxauNHPz0xnDUmfa6qA81bw23Ht9xFTgo4=");
        username.add("Xaka");

        return root;
    }
    @Override
    public void onItemClick(String imageUrl,String user) {
        Intent intent = new Intent(getActivity(), SearchDetailsActivity.class);
        intent.putExtra("IMAGE_URL", imageUrl);
        intent.putExtra("USERNAME", user);
        startActivity(intent);
    }
}