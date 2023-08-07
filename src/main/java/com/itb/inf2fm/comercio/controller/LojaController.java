package com.itb.inf2fm.comercio.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.inf2fm.comercio.model.Produto;

@Controller
@RequestMapping("/comercio/produtos")
public class LojaController {
	
	List<Produto> listaDeProdutos = new ArrayList<Produto>();
	
	@GetMapping("/listar")
	public String listarProdutos(Model model) {
		 
		
		Produto p1 = new Produto();
		p1.setId(20l);
		p1.setNome("Máquina de Lavar Brastemp 15l");
		p1.setCodigoBarras("145JIFJFUDE212456");
		p1.setDescricao("Produto Linha Branca com painel digital");
		p1.setPreco(3215.89);
		p1.setCodStatus(false);
		
		Produto p2 = new Produto();
		p2.setId(21l);
		p2.setNome("Televisor 70");
		p2.setCodigoBarras("TLERD44487114454");
		p2.setDescricao("Televisor Tela Plana let Samsung");
		p2.setPreco(6326.12);
		p2.setCodStatus(true);
		
		Produto p3 = new Produto();
		p3.setId(22l);
		p3.setNome("PlayStation 5 1TB 4K Full HD");
		p3.setCodigoBarras("736RINSB0753402");
		p3.setDescricao("Videogame Nova Geração da Sony");
		p3.setPreco(4999.99);
		p3.setCodStatus(true);
		// Adicionado os produtos à lista
		
		listaDeProdutos.add(p1);
		listaDeProdutos.add(p2);
		listaDeProdutos.add(p3);
		
		model.addAttribute("listaDeProdutos", listaDeProdutos);
		
		return "produtos";
	}
	@GetMapping("/novo-produto")
	public String novoProduto(Produto produto,Model model) {
		
		model.addAttribute("produto", produto);
		
		return "novo-prod";
	}
	
	@PostMapping("/add-prod")
	public String gravarProduto(Produto produto, Model model) {
		
		listaDeProdutos.add(produto);
		
		// Redirecionando para uma rota "existente"
		return "redirect:/comercio/produtos/listar";
	}

}
