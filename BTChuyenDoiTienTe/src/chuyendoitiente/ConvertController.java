package chuyendoitiente;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.DecimalFormat;
import java.text.Format;
import java.text.NumberFormat;

@Controller
public class ConvertController {
    private static final double TYGIA = 23145.00;
    @GetMapping("/chuyendoitiente")
    public String index(){
        return "index";
    }
    @PostMapping("/chuyendoitiente")
    public String Convert(@RequestParam String ipVND, @RequestParam String ipUSD, ModelMap model){
        double resultVND, resultUSD;
        DecimalFormat df = new DecimalFormat("###,###,###.###");
        if (!ipVND.equals("") && Double.parseDouble(ipVND) > 0) {
            resultUSD = Double.parseDouble(ipVND) / TYGIA;
            model.put("resultUSD", df.format(resultUSD) + " USD");
        }else model.put("resultUSD", "Invalid variable");
        if (!ipUSD.equals("") && Double.parseDouble(ipUSD) > 0) {
            resultVND = Double.parseDouble(ipUSD) * TYGIA;
            model.put("resultVND", df.format(resultVND) + " VND");
        }else model.put("resultVND", "Invalid variable");
        model.put("VND", ipVND);
        model.put("USD", ipUSD);
        return "index";
    }
}
