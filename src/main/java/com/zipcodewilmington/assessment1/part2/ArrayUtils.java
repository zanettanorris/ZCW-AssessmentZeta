package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int i = 0;
        int counter = 0;
        for (i = 0; i < objectArray.length; ) {
            if (objectArray[i] == objectToCount)
                counter += 1;
            i++;
        }
        return counter;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object removeValue(Object[] objectArray, Object objectToRemove) {

        int counter = 0;
        for (Object to : objectArray) {
            if (to.equals(objectToRemove)) counter++;
        }
        Integer[] result = new Integer[objectArray.length - counter];
        int j = 0;
        for (Integer i = 0; i < objectArray.length; i++)
            if (!objectArray[i].equals(objectToRemove)) {
                result[j] = (Integer) objectArray[i];
                j++;
            }
        return result;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        int max = 0;
        int occ = 0;
        Object result = null;
        for (Object to : objectArray) {
            occ = getNumberOfOccurrences(objectArray, to);
            if (occ > max) {
                max = occ;
                result = to;
            }
        }
        return result;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        int min = Integer.MAX_VALUE;
        int occ = 0;
        Object result = null;
        for (Object to : objectArray) {
            occ = getNumberOfOccurrences(objectArray, to);
            if (occ < min) {
                min = occ;
                result = to;
            }
        }
        return result;
    }


    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        ArrayList<Object> result = new ArrayList<>();
        for (Object to : objectArray) {
            result.add(to);
        }
        for (Object to : objectArrayToAdd) {
            result.add(to);
        }
        Integer[] array = result.toArray(new Integer[objectArray.length + objectArrayToAdd.length]);
        return array;
    }
}
