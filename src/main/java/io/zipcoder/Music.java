package io.zipcoder;

import java.util.Arrays;

import static java.lang.Math.abs;


public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        int selectionIndex = Arrays.asList().indexOf(selection);
        int forwardCount = selectionIndex - startIndex;
        int reverseCount =startIndex + (playList.length - selectionIndex);
        if ( forwardCount <= reverseCount){
            return abs(forwardCount);
        }


        return abs(reverseCount);
    }
}
