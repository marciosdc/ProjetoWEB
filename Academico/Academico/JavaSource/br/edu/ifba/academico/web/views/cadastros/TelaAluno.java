package br.edu.ifba.academico.web.views.cadastros;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.edu.ifba.academico.business.cadastros.Aluno;

@ManagedBean
@ViewScoped
public class TelaAluno implements Serializable
{
	private static final long serialVersionUID = 3934248481265743003L;
	
	private String nomePesquisa;
	private List<Aluno> alunosPesquisados;

	public String getNome()
	{
		return nomePesquisa;
	}

	public void setNome(String nome)
	{
		this.nomePesquisa = nome;
	}
	
	public List<Aluno> getAlunosPesquisados()
	{
		if(alunosPesquisados == null)
		{
			alunosPesquisados = new ArrayList<Aluno>();
		}
		
		return alunosPesquisados;
	}

	public void setAlunosPesquisados(List<Aluno> alunosPesquisados)
	{
		this.alunosPesquisados = alunosPesquisados;
	}
	
	public void pesquisarAlunos()
	{
		try
		{
			setAlunosPesquisados(new ArrayList<Aluno>());
			
			Aluno aluno = null;
			aluno.setNome("Alex");
			getAlunosPesquisados().add(aluno);
			
			aluno = new Aluno();
			aluno.setNome("Marcio Carvalho");
			getAlunosPesquisados().add(aluno);
			
			aluno = new Aluno();
			aluno.setNome("João Pedro");
			getAlunosPesquisados().add(aluno);
			
			aluno = new Aluno();
			aluno.setNome("Danyele Oliveira");
			getAlunosPesquisados().add(aluno);
			
			aluno = new Aluno();
			aluno.setNome("Alessa Santo Amaro");
			getAlunosPesquisados().add(aluno);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
			
			FacesMessage facesMessage = new FacesMessage(e.getMessage());		
			facesMessage.setSeverity(FacesMessage.SEVERITY_ERROR);
			FacesContext.getCurrentInstance().addMessage(null, facesMessage);
		}
	}
}
