package controle;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

@ManagedBean

public class ProdutoBean {

private ArrayList<String> tipos;

private ArrayList<String> servicos;

private String tipo;

private String servico;

public ProdutoBean() {

tipos = new ArrayList<String>();

tipos.add("Eletrodoméstico");

tipos.add("Limpeza");

tipos.add("Perfume");

tipos.add("Vestuários");

servicos = new ArrayList<String>();

servicos.add("                Quero minha garantia extendida");



}

public ArrayList<String> getTipos(){

return tipos;

}

public ArrayList<String> getServicos(){

return servicos;

}

// implementar os get e set restantes

public String getTipo() {

return tipo;

}

public void setTipo(String tipo) {

this.tipo = tipo;

}

public String getServico() {

return servico;

}

public void setServico(String servico) {

this.servico = servico;

}

}