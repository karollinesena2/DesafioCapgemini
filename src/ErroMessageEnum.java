
public enum ErroMessageEnum {

	SIZE_PASS("Senha n�o pode ser menor que 6 digitos!"),
	UPPERCASE_PASS("Senha deve conter ao menos uma letra MAIUSCULA !"),
	CARACTER_PASS("Sua senha deve conter ao menos 1 caracter especial! Exemplo: $@#&*( \"");

	public final String msg;

	ErroMessageEnum(String msg) {
		this.msg = msg;
	}
}
