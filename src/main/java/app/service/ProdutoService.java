package app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.entity.Produto;
import app.respository.ProdutoRepository;

@Service
public class ProdutoService {
	@Autowired
	private ProdutoRepository produtoRepository;

	// SALVAR
	public String save(Produto produto) {
		this.produtoRepository.save(produto);
		return produto.getNome() + " cadastrado com sucesso!";
	}

	// ALTERAR
	public String update(long id, Produto produto) {
		produto.setId(id);
		this.produtoRepository.save(produto);
		return "Cadastro do produto alterado com sucesso!";
	}

	// DELETAR
	public String delete(long id) {
		this.produtoRepository.deleteById(id);
		return "Cadastro do produto deletado com sucesso!";
	}

	// MOSTRAR TODOS OS PRODUTOS CADASTRADOS
	public List<Produto> listAll() {
		return this.produtoRepository.findAll();
	}

	// MOSTRAR PRODUTO CADASTRADO DE ACORDO COM O ID SELECIONADO
	public Produto findById(long id) {
		Produto produto = this.produtoRepository.findById(id).get();
		return produto;
	}

	// BUSCAR PRODUTOS PELO NOME
	public List<Produto> findByNome(String nome) {
		return this.produtoRepository.findByNome(nome);
	}

	// BUSCAR PRODUTOS POR VALOR
	public List<Produto> findByValor(double valor) {
		return this.produtoRepository.findByValor(valor);
	}

	// VALOR ACIMA DE
	public List<Produto> findByValorAcima(double valor) {
		return this.produtoRepository.findByValorAcima(valor);
	}

	// VALOR ABAIXO DE
	public List<Produto> findByValorAbaixo(double valor) {
		return this.produtoRepository.findByValorAbaixo(valor);
	}

	// TRECHO NOME
	public List<Produto> findByTrechoNome(String nome) {
		return this.produtoRepository.findByTrechoNome(nome);
	}

}
