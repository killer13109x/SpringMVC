package controller;

import dao.Dictionary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TuDienController {
    @Autowired
    private Dictionary dictionary;
    @GetMapping("/tudien")
    public String index() {
        return "index";
    }
    @PostMapping("/tudien")
    public String traCuu(@RequestParam String word, ModelMap modelMap){
        modelMap.put("result",dictionary.search(word));
        modelMap.put("word", word);
        return "index";
    }
}
