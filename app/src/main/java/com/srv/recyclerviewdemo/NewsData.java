package com.srv.recyclerviewdemo;

import java.util.ArrayList;
import java.util.List;

public class NewsData {

    private List<News> list;

    public NewsData() {
        list = new ArrayList<>();

        //Put Data
        //1.
        list.add(new News(
                "Bengal: BJP MPs meet Amit Shah, say please save state from Covid crisis",
                "The Bengal BJP delegation apprised Amit Shah of the current Covid-19 situation and alleged that the Mamata Banerjee govt has been a \"total failure\" in handling the pandemic.",
                R.drawable.image_1
        ));
        //2.
        list.add(new News(
                "New satellite images show additional build up by PLA at Ladakh's Pangong Tso",
                "Fresh high-resolution satellite images reviewed by India Today indicate that there are no signs of immediate normalcy at Ladakh's Pangong Tso, as the Chinese army continues to increase its deployments at finger five and six. New images explicitly show additional build-up by the PLA at finger five and finger six along the Pangong Lake. The additional infrastructure includes prefabricated huts, new tents and storage at finger six.",
                R.drawable.image_2
        ));
        //3.
        list.add(new News(
                "Sushant Singh Rajput case: Bihar deputy CM says Mumbai Police not cooperating with Bihar cops",
                "Bihar deputy CM Sushil Kumar Modi has claimed that Mumbai Police is not cooperating with Bihar Police during the investigation into the Sushant Singh Rajput suicide case.",
                R.drawable.image_3
        ));
        //4.
        list.add(new News(
                "No clarity on implementation of National Education Policy: Manish Sisodia",
                "Delhi Deputy Chief Minister Manish Sisodia said that though the \"progressive document\" recognises the flaws in the current education system, it was unable to break out from the pressure of old traditions. \"There is no roadmap for its implementation,\" he said.",
                R.drawable.image_4
        ));
        //5.
        list.add(new News(
                "Ayodhya: PM Modi to reach at 11.15 am, share stage with CM Yogi, RSS chief Bhagwat",
                "Prime Minister Narendra Modi is likely to reach Ayodhya around 11.15 am on August 5 and stay in the city for nearly three hours. Sources in the government say the prime minister is likely to return to New Delhi by 2 pm.",
                R.drawable.image_5
        ));
        //6.
        list.add(new News(
                "Rajasthan crisis: ACB team reaches Manesar hotel",
                "A team of Anti Corruption Bureau (ACB) on Friday reached the ITC hotel in Manesar to question Bhanwar Lal and Vishwendra Singh. Sachin Pilot-loyalist MLA Bhanwarlal Sharma is accused of attempting to topple the Congress government in Rajasthan. Earlier, the police's Special Operation Group has sought CCTV footage and guest list from a Manesar hotel to trace him.",
                R.drawable.image_6
        ));

    }

    public List<News> getList() {
        return list;
    }
}
