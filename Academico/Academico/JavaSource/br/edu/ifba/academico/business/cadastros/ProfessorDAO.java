package br.edu.ifba.academico.business.cadastros;

import java.util.ArrayList;
import java.util.List;

public class ProfessorDAO
{
	public static List<Professor> getCollection(String valorPesquisa)
	{
		List<Professor> professores = new ArrayList<Professor>();
		
		// JDBC
		Professor p = new Professor();
		p.setNome("Marcio Carvalho");
		professores.add(p);
		
		p = new Professor();
		p.setNome("João Pedro");
		professores.add(p);
		
		return professores;
	}
}
