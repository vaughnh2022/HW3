/*
 * *** Vaughn Hartzell 001 ***
 *
 * This java file contains several simple tree problems that need to be
 * codified. These routines  must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 *
 */

import java.util.*;

public class TreeProblems {

  /**
   * Method different()
   *
   * Given two TreeSets of integers, return a TreeSet containing all elements 
   * that are NOT in both sets. In other words, return a TreeSet of all the
   * elements that are in one set but not the other.
   */
  
  public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {
    Set<Integer> ans = new TreeSet<>();
    for(Integer a : setA){
      if(!setB.contains(a)){
        ans.add(a);
      }
    }
    for(Integer b : setB){
      if(!setA.contains(b)){
        ans.add(b);
      }
    }
    return ans;
  }


  /**
   * Method removeEven()
   *
   * Given a treeMap with the key as an integer, and the value as a String,
   * remove all <key, value> pairs where the key is even. 
   */

  public static void removeEven(Map<Integer, String> treeMap) {
    List<Integer> removeList = new ArrayList<>();
    for(Integer x : treeMap.keySet()){
      if(x%2==0){
        removeList.add(x);
      }
    }
    for(Integer a : removeList){
      treeMap.remove(a);
    }
    return;
  }


  /**
   * Method treesEqual()
   *
   * Given two treeMaps, each with the key as an integer, and the value as a String,
   * return a boolean value indicating if the two trees are equal or not.
   */

  public boolean treesEqual(Map<Integer, String> tree1,Map<Integer, String> tree2 ) {
    if(tree1.size()!=tree2.size()){
      return false;
    }
    for(Integer a : tree1.keySet()){
      if(!tree2.containsKey(a)||tree1.get(a)!=tree2.get(a)){
        return false;
      }
    }
    return true;
  }

} // end treeProblems class
