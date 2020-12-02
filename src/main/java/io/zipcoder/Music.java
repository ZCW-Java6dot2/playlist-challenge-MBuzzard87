package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        List<String> jukeBox = new ArrayList<String>(Arrays.asList(this.playList));

        Integer down = Math.abs(jukeBox.indexOf(selection) - startIndex);
        Integer up = Math.abs((jukeBox.size() + startIndex) - jukeBox.lastIndexOf(selection));
        return Math.min(down,up);
    }
}