package projeto.model.Fachada;

import java.util.List;

import projeto.model.dao.ClienteDAO;
import projeto.model.dao.FuncionarioDAO;
import projeto.model.dao.OrdemServicoDAO;
import projeto.model.dao.ServicoDAO;
import projeto.model.entity.Cliente;
import projeto.model.entity.Funcionario;
import projeto.model.entity.OrdemServico;
import projeto.model.entity.Servico;

public class Fachada implements IFachada {
	
	private ClienteDAO controladorCliente;
	private FuncionarioDAO controladorFuncionario;
	private ServicoDAO controladorServico;
	private OrdemServicoDAO controladorOrdemServico;
	
	private static IFachada fachadaInstanciada;
	
	private Fachada(){
		
		controladorCliente = new ClienteDAO();
		controladorFuncionario = new FuncionarioDAO();
		controladorServico = new ServicoDAO();
		controladorOrdemServico = new OrdemServicoDAO();
	}
	
	public static IFachada getFachada(){ 
		if(fachadaInstanciada == null){
			fachadaInstanciada = new Fachada(); 
		}
		return fachadaInstanciada;
	}

	public void InserirCliente(Cliente cliente) {
		controladorCliente.inserir(cliente);
	}

	public void alteraCliente(Cliente cliente) {
		controladorCliente.alterar(cliente);
	}

	public void excluirCliente(String cpf) {
		controladorCliente.excluirPorChavePrimaria(Cliente.class, cpf);

	}

	public Cliente ProcurarCliente(String cpf) {
		return controladorCliente.consultarPorChavePrimaria(Cliente.class, cpf);
	}
	
	public List<Cliente> ConsultarClientes(){
		return controladorCliente.consultarGeral(Cliente.class, new Cliente().getClass().getName());
	}

	public void InserirFuncionario(Funcionario funcionario) {
		controladorFuncionario.inserir(funcionario);
	}

	public void alteraFuncionario(Funcionario funcionario) {
		// TODO Auto-generated method stub
		controladorFuncionario.alterar(funcionario);
	}

	public void excluirFuncionario(String cpf) {
		controladorFuncionario.excluirPorChavePrimaria(Funcionario.class, cpf);
	}

	public Funcionario ProcurarFuncionario(String cpf) {
		return controladorFuncionario.consultarPorChavePrimaria(Funcionario.class, cpf);
	}
	
	public List<Funcionario> ConsultarFuncionarios(){
		return controladorFuncionario.consultarGeral(Funcionario.class, new Funcionario().getClass().getName());
	}

	public void InserirServico(Servico servico) {
		controladorServico.inserir(servico);
	}

	public void alteraServico(Servico servico) {
		controladorServico.alterar(servico);
	}

	public void excluirServico(int codigoServico) {	
		controladorServico.excluirPorChavePrimaria(Servico.class, codigoServico);
	}

	public Servico ProcurarServico(int codigoServico) {
		return controladorServico.consultarPorChavePrimaria(Servico.class, codigoServico);
	}
	
	public List<Servico> ConsultarServicos(){
		return controladorServico.consultarGeral(Servico.class, new Servico().getClass().getName());
	}

	public void InserirOrdemServico(OrdemServico ordemServico) {
		controladorOrdemServico.inserir(ordemServico);
		
	}

	public void alteraOrdemServico(OrdemServico ordemServico) {
		controladorOrdemServico.alterar(ordemServico);
	}

	public void excluirOrdemServico(int codigoOrdemServico) {
		controladorOrdemServico.excluirPorChavePrimaria(OrdemServico.class, codigoOrdemServico);
		
	}

	public OrdemServico ProcurarOrdemServico(int codigoOrdemServico) {
		return controladorOrdemServico.consultarPorChavePrimaria(OrdemServico.class, codigoOrdemServico);
	}
	
	public List<OrdemServico> ConsultarOrdemServicos(){
		return controladorOrdemServico.consultarGeral(OrdemServico.class, new OrdemServico().getClass().getName());
	}
	
	public double valorTotalOrdemServico(OrdemServico ordemServico) {
		return controladorOrdemServico.valorTotalOrdemServico(ordemServico);
	}

}
