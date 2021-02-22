package com.example.demo.controller;
import com.example.demo.model.GunEntity;
import com.example.demo.repository.GunRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/gun")
public class GunController {   


    @Autowired
    GunRepository y;



    @GetMapping("/index")
    public String index(Model model) {
    model.addAttribute("z",y.findAll());
        return "index";
    }


    @GetMapping("/create")
    public String create(Model model) {
        return "createpage";
    }


    @PostMapping("/save")
    public String createdb(Model model, String gunname,String gundamage, String gunmagazine, String gunmobility , String guncolor ){
        if (gunname == null) {
            model.addAttribute("z","กรุณากรอกค่า");
        }else{
            GunEntity c = new GunEntity();
            c.setGunname(gunname);
            c.setGundamage(gundamage);
            c.setGunmagazine(gunmagazine);
            c.setGunmobility(gunmobility);
            c.setGuncolor(guncolor);
            y.save(c);
            
        }
        return "redirect:/gun/index";
    }

    @GetMapping("/edit")
    public String edit(Model model, Integer id) {
        model.addAttribute("z",y.findById(id));
        return "edit";
    }

    @PostMapping("/editsave")
    public String editdb(Model model, Integer id, String gunname,String gundamage, String gunmagazine, String gunmobility , String guncolor ){
        if (gunname == null) {
            model.addAttribute("z","กรุณากรอกค่า");
        }else{
            GunEntity c = new GunEntity();
            c.setGunname(gunname);
            c.setGundamage(gundamage);
            c.setGunmagazine(gunmagazine);
            c.setGunmobility(gunmobility);
            c.setGuncolor(guncolor);
            y.save(c);
            
        }
        return "redirect:/gun/index";
    }

    @GetMapping("/delete")
    public String delete(Model model, Integer id) {
        
        y.delete(y.findById(id).get());
        
        return "redirect:/gun/index";
    }
        
}