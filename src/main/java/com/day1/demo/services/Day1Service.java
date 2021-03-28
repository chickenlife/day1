package com.day1.demo.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.text.CollationElementIterator;
import java.util.*;

@Service
@Slf4j
public class Day1Service {
    HashMap<String, Integer> userinfoMap = new HashMap<>();

    public String returnName(String inputName, int inputAge){

        userinfoMap.put(inputName,inputAge);
        log.debug(String.valueOf(userinfoMap));
        return "[return] name is " + String.valueOf(userinfoMap);
    }

    public String totalAge (){
        Set set = userinfoMap.entrySet();
        Iterator iter = set.iterator();

        while(iter.hasNext()) {
            Map.Entry e = (Map.Entry)iter.next();
            log.debug("name : {}, age : {}",e.getKey(),e.getValue());
        }

        set = userinfoMap.keySet();
        log.debug("total name : {}",set);

        Collection<Integer> values = userinfoMap.values();
        iter = values.iterator();
        int total = 0;
        while (iter.hasNext()){
            Integer i = (Integer) iter.next();
            total += i;
        }
        log.debug("total age : {}, avg age : {}",total, total/set.size());
        return "total age : " + total + ", avg age : " +total/set.size() + ", size : "+set.size();
    }
}
