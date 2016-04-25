package comp640.computerbuilder.dummy;

import java.util.ArrayList;
import java.util.List;

import comp640.computerbuilder.model.build.BuildStore;
import comp640.computerbuilder.model.parts.Part;
import comp640.computerbuilder.model.parts.PartType;

/**
 * Created by deandubois on 4/24/16.
 */
public class DummyParts {
    List<Part> dummy = new ArrayList<>();
    public DummyParts()
    {
        dummy.add(new Part(456,"GeForce 770R", BuildStore.Amazon, "The Most powerful GPU With 1mb of RAM", "GeForce", PartType.Audio_Video_Card,
                "http://www.mwave.com.au/images/150/ab64052_6.jpg"));
        dummy.add(new Part(345,"GeForce 770R", BuildStore.Amazon, "The Most powerful GPU With 1mb of RAM", "GeForce", PartType.Audio_Video_Card,
                "http://smartcomp-pa.com/catalog/images/EVGA%20210.jpg"));
        dummy.add(new Part(56,"GeForce 770R", BuildStore.Amazon, "The Most powerful GPU With 1mb of RAM", "GeForce", PartType.Audio_Video_Card,
                "http://www.mwave.com.au/images/150/ab64052_6.jpg"));
        dummy.add(new Part(6765,"GeForce 770R", BuildStore.Amazon, "The Most powerful GPU With 1mb of RAM", "GeForce", PartType.Audio_Video_Card,
                "http://smartcomp-pa.com/catalog/images/EVGA%20210.jpg"));
        dummy.add(new Part(567,"GeForce 770R", BuildStore.Amazon, "The Most powerful GPU With 1mb of RAM", "GeForce", PartType.Audio_Video_Card,
            "http://www.mwave.com.au/images/150/ab64052_6.jpg"));
        dummy.add(new Part(170,"GeForce 770R", BuildStore.Amazon, "The Most powerful GPU With 1mb of RAM", "GeForce", PartType.Audio_Video_Card,
                "http://smartcomp-pa.com/catalog/images/EVGA%20210.jpg"));
        dummy.add(new Part(167,"GeForce 770R", BuildStore.Newegg, "The Most powerful GPU With 1mb of RAM", "GeForce", PartType.Audio_Video_Card,
            "http://www.mwave.com.au/images/150/ab64052_6.jpg"));
        dummy.add(new Part(170,"GeForce 770R", BuildStore.Amazon, "The Most powerful GPU With 1mb of RAM", "GeForce", PartType.Audio_Video_Card,
                "http://smartcomp-pa.com/catalog/images/EVGA%20210.jpg"));
        dummy.add(new Part(170,"GeForce 770R", BuildStore.Amazon, "The Most powerful GPU With 1mb of RAM", "GeForce", PartType.Audio_Video_Card,
            "http://www.mwave.com.au/images/150/ab64052_6.jpg"));
        dummy.add(new Part(24,"GeForce 770R", BuildStore.Amazon, "The Most powerful GPU With 1mb of RAM and a great ability to handle all games and programs", "GeForce", PartType.Audio_Video_Card,
                "http://smartcomp-pa.com/catalog/images/EVGA%20210.jpg"));
        dummy.add(new Part(170,"GeForce 770R", BuildStore.Amazon, "The Most powerful GPU With 1mb of RAM", "GeForce", PartType.Audio_Video_Card,
            "http://www.mwave.com.au/images/150/ab64052_6.jpg"));
        dummy.add(new Part(30,"GeForce 770R", BuildStore.Newegg, "The Most powerful GPU With 1mb of RAM", "GeForce", PartType.Audio_Video_Card,
                "http://smartcomp-pa.com/catalog/images/EVGA%20210.jpg"));
    }

    public List<Part> getParts() {return dummy;}
}
