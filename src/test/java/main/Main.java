package main;
import costCenter.ShouldCreateACenterCost;
import costCenter.ShouldDeleteCostCenter;
import costCenter.ShouldEditCostService;
import costCenter.ShouldInsertStringInNumberField;
import loginService.ShouldCheckRequiredMatriculaField;
import loginService.ShouldCheckRequiredPasswordField;
import loginService.ShouldLoginClickingLoginButton;
import loginService.ShouldLoginPressingENter;
import loginService.ShouldLoginTwentyTimes;
import loginService.ShouldLogout;
import permissionModule.ShouldCheckBuscaUsuariosField;
import permissionModule.ShouldCheckCaixaInformacoesField;
import permissionModule.ShouldCheckTituloField;
import templateModule.ShouldAcessPaginaDeAdministrador;
import templateModule.ShouldAcessPaginaDeUsuarios;
import templateModule.ShouldAcessTemplateModule;
import templateModule.ShouldClickChipCardPagAdministrador;
import templateModule.ShouldClickChipCardPagInicial;
import templateModule.ShouldClickChipCardPagUsuarios;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		//Login Feature
		ShouldLoginClickingLoginButton shouldLoginClickingLoginButton = new ShouldLoginClickingLoginButton();
		ShouldLoginPressingENter shouldLoginPressingEnter = new ShouldLoginPressingENter();
		ShouldLoginTwentyTimes shouldLoginTwentyTimes = new ShouldLoginTwentyTimes();
		ShouldLogout shouldLogout = new ShouldLogout();
		ShouldCheckRequiredMatriculaField shouldCheckRequiredMatriculaField = new ShouldCheckRequiredMatriculaField();
		ShouldCheckRequiredPasswordField shouldCheckRequiredPasswordField = new ShouldCheckRequiredPasswordField();
		
		shouldLoginPressingEnter.shouldLoginPressingEnter();
		shouldLoginClickingLoginButton.shouldLoginClickingLoginButton();
		shouldLogout.shouldLogout();
		shouldCheckRequiredMatriculaField.shouldCheckRequiredMatriculaField();
		shouldCheckRequiredPasswordField.shouldCheckRequiredPasswordField();
	
		
		//Template Module
		ShouldAcessTemplateModule shouldAcessTemplateModule = new ShouldAcessTemplateModule();
		ShouldAcessPaginaDeUsuarios shouldAcessPaginaDeUsuarios = new ShouldAcessPaginaDeUsuarios();
		ShouldAcessPaginaDeAdministrador shouldAcessPaginaDeAdministrador = new ShouldAcessPaginaDeAdministrador();
		ShouldClickChipCardPagInicial shouldClickChipCardPagInicial = new ShouldClickChipCardPagInicial();
		ShouldClickChipCardPagUsuarios shouldClickChipCardPagUsuarios = new ShouldClickChipCardPagUsuarios();
		ShouldClickChipCardPagAdministrador shouldClickChipCardPagAdministrador = new ShouldClickChipCardPagAdministrador();
		
		shouldAcessTemplateModule.shouldAcessTemplateModule();
		shouldAcessPaginaDeUsuarios.shouldAcessPaginaDeUsuarios();
		shouldAcessPaginaDeAdministrador.shouldAcessPaginaDeAdministrador();
		shouldClickChipCardPagInicial.shouldClickChipCardPagInicial();
		shouldClickChipCardPagUsuarios.shouldClickChipCardPagUsuarios();
		shouldClickChipCardPagAdministrador.shouldClickChipCardPagAdministrador();
		
		//Cost Center
		ShouldCreateACenterCost shouldCreateACenterCost = new ShouldCreateACenterCost();
		ShouldInsertStringInNumberField shouldInsertStringInNumberField = new ShouldInsertStringInNumberField();
		ShouldDeleteCostCenter shouldDeleteCostCenter = new ShouldDeleteCostCenter();
		ShouldEditCostService shouldEditCostService = new ShouldEditCostService();
	
		shouldCreateACenterCost.shouldCreateACenterCost();
		shouldInsertStringInNumberField.shouldInsertStringInNumberField();
		shouldDeleteCostCenter.shouldDeleteCostCenter();
		shouldEditCostService.shouldEditCostService();
	
		//Permission Module
		ShouldCheckBuscaUsuariosField shouldCheckBuscaUsuariosField = new ShouldCheckBuscaUsuariosField();
		ShouldCheckCaixaInformacoesField shouldCheckCaixaInformacoesField = new ShouldCheckCaixaInformacoesField();
		ShouldCheckTituloField shouldCheckTituloField = new ShouldCheckTituloField();
		
		shouldCheckBuscaUsuariosField.shouldCheckBuscaUsuariosField();
		shouldCheckCaixaInformacoesField.shouldCheckCaixaInformacoesField();
		shouldCheckTituloField.shouldCheckTituloField();
	}
	
}

