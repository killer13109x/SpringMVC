package dao;

import java.util.HashMap;
import java.util.Map;

public class Dictionaryilmp implements Dictionary {
    private static Map<String,String> map;

    static {
        map= new HashMap<>();
        map.put("table","bàn học");
        map.put("pencil","bút chì");
        map.put("pen","bút mực");
        map.put("eraser","cục tẩy");
        map.put("classroom","lớp học");
        map.put("ruler","thước kẻ");
    }


    @Override
    public String search(String english) {
        for (Map.Entry m: map.entrySet()) {
            if(english.toLowerCase().equals(m.getKey())) {
                return (String)m.getValue();
            }
        }
        return "Không tìm thấy";
    }
}
