package com.abtahiapp.instagramclone;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import java.util.ArrayList;
public class Tag extends Fragment implements GridAdapter.OnItemClickListener{
    private static final int NUM_COLUMNS = 3;
    private ArrayList<String> mImageUrls = new ArrayList<>();
    View root;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_tag, container, false);

        RecyclerView recyclerView = root.findViewById(R.id.recyclerView);
        GridAdapter adapter = new GridAdapter(getActivity(), mImageUrls,this);
        StaggeredGridLayoutManager staggeredGridLayoutManager= new StaggeredGridLayoutManager(NUM_COLUMNS, LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        recyclerView.setAdapter(adapter);

        mImageUrls.add("https://media.istockphoto.com/id/1293654645/photo/young-female-soccer-girl-during-football-training.jpg?s=612x612&w=0&k=20&c=9qTH86Lv_WOAFLr7dYOCM8ExIcyUnKikjyLB330XcSI=");
        mImageUrls.add("https://media.istockphoto.com/id/155395559/photo/attractive-young-male-soccer-player-sprints-into-ball-kick.jpg?s=612x612&w=0&k=20&c=31TekpCfXmetHqYjJtCw_y23VI9eY9T_fK-zOQmDoM0=");
        mImageUrls.add("https://media.istockphoto.com/id/1480046026/photo/vertical-shot-of-major-league-soccer-football-championship-confident-blue-team-african.jpg?s=612x612&w=0&k=20&c=qpUH0K-V0s1oiTOSQj9Z7JlQue21bc1_BXs5uw2grbo=");
        mImageUrls.add("https://media.istockphoto.com/id/187205224/photo/waiting-for-his-opponents.jpg?s=612x612&w=0&k=20&c=wVIMYDjYPWfq81AuWaLN7KQD4KtqnFrN2tWlmLBQoWU=");
        mImageUrls.add("https://media.istockphoto.com/id/1293654647/photo/girls-enjoying-soccer-during-a-football-match.jpg?s=612x612&w=0&k=20&c=f658Cq-gCNMdTIR3oEfiVjsQEqlNeeKDi70gxAU2Gk0=");
        mImageUrls.add("https://media.istockphoto.com/id/1342185100/photo/teen-juggling-with-a-soccer-ball-at-a-beach-in-miami.jpg?s=612x612&w=0&k=20&c=S-GgRhxOTchF-hZg56UgW0_81KPNxQAXz0AYwSp57r8=");

        mImageUrls.add("https://media.istockphoto.com/id/1458782106/photo/scenic-aerial-view-of-the-mountain-landscape-with-a-forest-and-the-crystal-blue-river-in.jpg?s=612x612&w=0&k=20&c=NXQ_OK6JtmyRRBef8Wd67UZ3scQJKySkXl1ORaActH4=");
        mImageUrls.add("https://media.istockphoto.com/id/1419410282/photo/silent-forest-in-spring-with-beautiful-bright-sun-rays.jpg?s=612x612&w=0&k=20&c=UHeb1pGOw6ozr6utsenXHhV19vW6oiPIxDqhKCS2Llk=");
        mImageUrls.add("https://media.istockphoto.com/id/1696167872/photo/aerial-view-of-forest-at-sunset-on-the-background-of-mountains-in-dolomites.jpg?s=612x612&w=0&k=20&c=TOMStt8moZZeljF3phyCioQXwYFrZBhY5-dsx-nMjDg=");
        mImageUrls.add("https://media.istockphoto.com/id/1399340544/photo/arboles-y-cielo.jpg?s=612x612&w=0&k=20&c=__yHXv3SRRZXCTz-deFRuV_-QouFfd5gfi6FimqZx5c=");
        mImageUrls.add("https://media.istockphoto.com/id/1468572803/video/fresh-green-forest-with-the-sun.jpg?s=640x640&k=20&c=DVF9j7e0Sxn5KH_dWF8LguBCvuSE1exGpm0RqKyYkdo=");
        mImageUrls.add("https://media.istockphoto.com/id/1706242627/photo/stunning-landscape-of-amazon-forest-at-amazonas-state-brazil.jpg?s=612x612&w=0&k=20&c=4ILOSYpK0DfpjPr6acse6lY2TMBVZ0y-mJ6aCyu0vAM=");

        mImageUrls.add("https://media.istockphoto.com/id/1435409342/photo/robot-workers-in-factory.jpg?s=612x612&w=0&k=20&c=nMOJKYGYdQWL3cR1tWVntwcwuYn_-VJuoRKkzCZnkzM=");
        mImageUrls.add("https://media.istockphoto.com/id/1457151572/photo/co-workers-working-on-a-circuit-boards-in-office.jpg?s=612x612&w=0&k=20&c=YrmaZZA_ABMlVMe5MM4IG0OKBUwTjr1IVlFQIvmE_0w=");
        mImageUrls.add("https://media.istockphoto.com/id/1448507346/photo/black-female-engineer-using-laptop-for-programming-robotic-arm-at-the-modern-assembling.jpg?s=612x612&w=0&k=20&c=1QpuYnrbmafMzPe3QHYNj0hfXy174m66p5PulaUgMW4=");
        mImageUrls.add("https://media.istockphoto.com/id/1339547170/photo/robotic-arms-technology-background.jpg?s=612x612&w=0&k=20&c=OdAg4xnaTD7YB8gDZraQTxjzwHNdn3O3YCYB4LkuPKU=");
        mImageUrls.add("https://media.istockphoto.com/id/1419913245/photo/robot-and-human-hands-pointing-to-each-other-the-idea-of-creating-futuristic-ai-intelligent.jpg?s=612x612&w=0&k=20&c=vVkOGiSztkmhPBpCMIigjnwnUUrApJdQK-LslZBj_D0=");
        mImageUrls.add("https://media.istockphoto.com/id/1482662733/photo/hand-with-robotic-finger.jpg?s=612x612&w=0&k=20&c=w-M8KD43uRh9I5mq1chmA7L-8SSgNwPZGRlaC2KgqV8=");

        mImageUrls.add("https://media.istockphoto.com/id/1496108471/photo/the-matterhorn-mountain-peaks-are-reflected-in-the-lake.jpg?s=612x612&w=0&k=20&c=0Shn0NNiwRUmO-umQIC4qxY3YrqNjWcZfmlrwbKESzM=");
        mImageUrls.add("https://media.istockphoto.com/id/1567426291/photo/trail-runner-ascends-alpine-path-in-swiss-mountain-landscape.jpg?s=612x612&w=0&k=20&c=TiKtvJ2sRsgm-YdhvvNKxkBr6TZi6XdsJ57jaTZugxs=");
        mImageUrls.add("https://media.istockphoto.com/id/1500059583/photo/telluride-colorado-in-fall-color.jpg?s=612x612&w=0&k=20&c=AqS5UTXvZKQQETtGuCUkNMUvUMZoU4p901J1BxqMN4g=");
        mImageUrls.add("https://media.istockphoto.com/id/1437708201/photo/mountain-lake-on-cold-morning-in-autumn.jpg?s=612x612&w=0&k=20&c=JdJX9JNpC3wse-kAt8p6zRNbEktx2YeaV0fwcUFOkrk=");
        mImageUrls.add("https://media.istockphoto.com/id/1341288649/photo/75mpix-panorama-of-beautiful-mount-ama-dablam-in-himalayas-nepal.jpg?s=612x612&w=0&k=20&c=0xb_bb-NBIxjiJL_kqY-o3dCjv2PmKFZfRjHcVEijDc=");
        mImageUrls.add("https://media.istockphoto.com/id/1427380144/photo/the-exuberant-atlantic-forest-within-the-protected-area-of-the-guapia%C3%A7u-ecological-reserve-in.jpg?s=612x612&w=0&k=20&c=HT6nS6R_g7x3ll-P9IFNsfKk0wDb9g9C2vj617AMjgM=");

        mImageUrls.add("https://media.istockphoto.com/id/1487379803/photo/a-rocket-launch-streaks-into-a-florida-starry-night.jpg?s=612x612&w=0&k=20&c=7NQh-0cpwKj1WDgaorXOINAXjOu1Rk1mI7ljuV8URtQ=");
        mImageUrls.add("https://media.istockphoto.com/id/1442452138/photo/space-stars-nebula-universe-background.jpg?s=612x612&w=0&k=20&c=sxOZjUkrVuOJw14WP27XmkIaxae4KeWF81Nm8L7uxV8=");
        mImageUrls.add("https://media.istockphoto.com/id/1353996563/photo/following-shot-of-brave-astronaut-in-space-suit-confidently-walking-on-mars-to-earth-alien.jpg?s=612x612&w=0&k=20&c=uMcSSDzIB5uooR6CN0Uvytlliyc0dR5iAhKODQpUr2c=");
        mImageUrls.add("https://media.istockphoto.com/id/1403911556/vector/cosmic-illustration-beautiful-colorful-space-background-watercolor-cosmos.jpg?s=612x612&w=0&k=20&c=CtN3tjT2ZXb7QXwRegaZo_qV3hF0uZotAYN20teq0CI=");
        mImageUrls.add("https://media.istockphoto.com/id/1401387054/vector/vector-cosmic-illustration-beautiful-colorful-space-background-watercolor-cosmos.jpg?s=612x612&w=0&k=20&c=SaEzaOn8GJfpsw8Of0pn210gj26yEkbkXFBbGfUkJgE=");
        mImageUrls.add("https://media.istockphoto.com/id/1248873601/photo/international-space-station-orbiting-earth-in-space-spacex-nasa-research-iss-satellite-sunset.jpg?s=612x612&w=0&k=20&c=x21Oy-Zy7HUXo-JoWtsb_zAolyr35UzsxfCYnDBjO9I=");

        return root;
    }

    @Override
    public void onItemClick(String imageUrl) {
        Intent intent = new Intent(getActivity(), DetailsActivity.class);
        intent.putExtra("IMAGE_URL", imageUrl);
        startActivity(intent);
    }
}