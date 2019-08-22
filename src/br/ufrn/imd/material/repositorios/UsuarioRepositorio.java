package br.ufrn.imd.material.repositorios;

import java.util.List;
import java.util.ArrayList;

import br.ufrn.imd.material.dominio.Usuario;

public class UsuarioRepositorio 
{
	public static List<Usuario> usuarios;
	
	public static Usuario getUsuario(String login, String senha)
	{		
		if(usuarios==null)
		{
			usuarios = new ArrayList<Usuario>();
			Usuario usr = new Usuario("anderson", "anderson");
			usr.setNome("Anderson");
			usuarios.add(usr);
		}
		for(Usuario u : usuarios)
		{
			if(u.getLogin().contentEquals(login) && u.getSenha().equals(senha))
			{
				return u;
			}
		}
		return null;
			
	}
}
