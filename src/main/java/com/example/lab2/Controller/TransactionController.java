package com.example.lab2.Controller;

import com.example.lab2.Entity.Transaction;
import com.example.lab2.Entity.WalletHasCurrency;
import com.example.lab2.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/transaction")
public class TransactionController {
    @Autowired
    TransactionRepository transactionRepository;
    @Autowired
    WalletRepository walletRepository;
    @Autowired
    CurrencyRepository currencyRepository;

    @Autowired
    WalletXCurrencyRepository walletXCurrencyRepository;
    @GetMapping(value = {""})
    public String listaTransaction(Model model) {
        model.addAttribute("listaTransaction", transactionRepository.obtenerTransactions());
        return "lista_todas_trans";
    }

    @GetMapping("/new")
    public String nuevoTransaction(Model model) {
        model.addAttribute("listaWallet", walletRepository.findAll());
        model.addAttribute("listaCurrency", currencyRepository.findAll());
        return "nuevo_transaccion";
    }

    @PostMapping("/save")
    public String guardarTransaction(Transaction transaction, RedirectAttributes attr) {
        transactionRepository.save(transaction);
        return "redirect:/transaction";
    }


    @PostMapping("/BuscarTransaccion")
    public String buscarTrans(@RequestParam("tx_id") String tx_id,
                                      Model model){

        System.out.println(tx_id);
        model.addAttribute("transList", transactionRepository.obtenerTransactionsxTxID(tx_id));

        return "lista_transacciones";
    }

    @GetMapping(value = {"/mi_billetera"})
    public String listar_billetera(Model model) {


        model.addAttribute("billeteraList", walletXCurrencyRepository.findAll());

        return "mi_billetera";
    }
}
