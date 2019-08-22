package br.ufrn.imd.material.repositorios;

import java.util.ArrayList;
import java.util.List;

import br.ufrn.imd.material.dominio.Material;

public class MaterialRepositorio 
{
	public static List<Material> materials;
	
	public static void adicionar(Material material)
	{
		if(materials == null) 
			materials = new ArrayList<Material>();
		materials.add(material);
	}
	
	public static void remover(Material material)
	{
		materials.remove(material);
	}
	
	public static List<Material> listaMaterials()
	{
		return materials;
	}
}
