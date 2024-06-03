package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

  public static void main(String[] args) {

    List<String> nameList = List.of("小林", "谷", "山田", "長谷川", "林", "東海林", "島村", "阿部",
        "関", "原");
    for (String name : nameList) {
      if (name.length() >= 3) {
        System.out.println(name);
      }
    }

    Map<Integer, String> nameMap = new HashMap<>();
    nameMap.put(1, "小林");
    nameMap.put(2, "谷");
    nameMap.put(3, "山田");
    nameMap.put(4, "長谷川");
    nameMap.put(5, "林");
    nameMap.put(6, "東海林");
    nameMap.put(7, "島村");
    nameMap.put(8, "阿部");
    nameMap.put(9, "関");
    nameMap.put(10, "原");


      nameMap.entrySet().removeIf(entry -> entry.getKey() % 2 == 0);
      System.out.println(nameMap);



  }


}



