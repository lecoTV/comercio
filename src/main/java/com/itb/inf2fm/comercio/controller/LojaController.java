package com.itb.inf2fm.comercio.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.inf2fm.comercio.model.produto;

@Controller
@RequestMapping("/comercio/produtos")
public class LojaController {
	
	List<produto> listaDeProdutos = new ArrayList<produto>();
	
	@GetMapping("/listar")
	public String listarProdutos() {
		 
		
		produto p1 = new produto();
		p1.setId(20l);
		p1.setNome("Máquina de Lavar Brastemp 15 1");
		p1.setCodigoBarras("145JIFJFUDE212456");
		p1.setDescriçao("Produto Linha Branca com painel digital");
		p1.setPreco(3215.89);
		
		produto p2 = new produto();
		p1.setId(20l);
		p1.setNome("Televisor 70");
		p1.setCodigoBarras("TLERD44487114454");
		p1.setDescriçao("Televisor Tela Plana let Samsung");
		p1.setPreco(6326.12);
		
		produto p3 = new produto();
		p1.setId(20l);
		p1.setNome("PlayStation 5 1TB 4K Full HD");
		p1.setCodigoBarras("736RINSB0753402");
		p1.setDescriçao("Videogame Nova Geração da Sony");
		p1.setPreco(4999.99);
		
		// Adicionado os produtos à lista
		
		listaDeProdutos.add(p1);
		listaDeProdutos.add(p2);
		listaDeProdutos.add(p3);
		
		return "produtos";
	}

}
