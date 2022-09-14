package com.example.lab2.Controller;


import com.example.lab2.Entity.Currency;
import com.example.lab2.Entity.User;
import com.example.lab2.Repository.CurrencyRepository;
import com.example.lab2.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/lab2")
public class Login {

    @Autowired
    UserRepository usuarioRepository;

    @Autowired
    CurrencyRepository currencyRepository;

    @GetMapping("/ingreso")
    public String pregunta1(){
        return "inicio2";
    }

    @PostMapping("/inicio")
    public String ingreso(@RequestParam("correo") String correo, @RequestParam("contrasena") String contra, Model model ) {

        List<User> userList = usuarioRepository.buscarporUsername(correo);

        if (userList.isEmpty()){
            return "redirect:/lab2/ingreso";
        }else{
            if(userList.get(0).getEmail().equals(correo) && userList.get(0).getPassword().equals(contra)){
                List<Currency> currency = currencyRepository.findAll();
                model.addAttribute("currency",currency);
                return "principal";
            }else{
                return "redirect:/lab2/ingreso";
            }
        }
    }
}


