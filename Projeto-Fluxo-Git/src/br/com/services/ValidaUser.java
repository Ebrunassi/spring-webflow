package br.com.services;
import org.springframework.stereotype.Service;
import br.com.model.User;

@Service
public class ValidaUser {
	public String verifica_nome(User user){
		String nome = user.getNome();
		if(nome.length() < 3){
			return "false";
		}else{
			return "true";
		}
	}
	
	public String verifica_cadastro(User user){
		String nome = user.getNome();
		String senha = user.getSenha();
		String re_senha = user.getRe_senha();
		
		if(senha.equals(re_senha)){
			return "true";
		}else{
			return "false";
		}
	}
}
