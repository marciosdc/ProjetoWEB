import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;


@Named
@SessionScoped
public class IndexBean implements Serializable
{
	private static final long serialVersionUID = -8051696428477472817L;
	private String nome;
	private String senha;
	
	public String getNome()
	{
		return nome;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public String getSenha()
	{
		return senha;
	}
	
	public void setSenha(String senha)
	{
		this.senha = senha;
	}
	
	public String login()
	{
		FacesMessage facesMessage = new FacesMessage("Sucesso!");		
		facesMessage.setSeverity(FacesMessage.SEVERITY_INFO);
		FacesContext.getCurrentInstance().addMessage(null, facesMessage);
		
		return "";
	}
	
}
