package com.batalha.pokemon;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.batalha.pokemon.Enums.Efeito;
import com.batalha.pokemon.Enums.TipoPokemon;
import com.batalha.pokemon.Models.Pokemon;
import com.batalha.pokemon.Models.PokemonAgua;
import com.batalha.pokemon.Models.PokemonEletrico;
import com.batalha.pokemon.Models.PokemonFantasma;
import com.batalha.pokemon.Models.PokemonFogo;
import com.batalha.pokemon.Models.PokemonFolha;
import com.batalha.pokemon.Models.PokemonInseto;
import com.batalha.pokemon.Models.PokemonTerra;

import javax.swing.JRadioButton;
import javax.swing.JOptionPane;

public class Executa extends JFrame{
	
	
	private String Nome1, Nome2;
	private Efeito Especial1, Especial2;
	private TipoPokemon Tipo1, Tipo2;
	
	private Pokemon P1, P2;
	
	public Executa() {
		super("Batalha Pokemon");
		setLayout(new FlowLayout());
		
		JanelaDeCadastro("Primeiro", true);
		JanelaDeCadastro("Segundo", false);
		
		JButton batalhar = new JButton("Batalhar");
		batalhar.setBounds(200, 100, 100, 100);

		add(batalhar);
		batalhar.addMouseListener(new Mouse(false, true));
	}
	
	private void JanelaDeCadastro(String posicao, boolean Primeiro) {
		
		JLabel lb = new JLabel(posicao + " Pokemon:   ");
		add(lb);
		
		JLabel lbName = new JLabel("Nome (pressione enter):");
		add(lbName);
		
		JTextField textFieldName = new JTextField(20);
		add(textFieldName);
		
		TextFieldHandler handler = new TextFieldHandler(Primeiro);
		textFieldName.addActionListener(handler);
		
		JRadioButton Agua = new JRadioButton("Agua", false);
		JRadioButton Fogo = new JRadioButton("Fogo", false);
		JRadioButton Folha = new JRadioButton("Folha", false);
		JRadioButton Inseto = new JRadioButton("Inseto", false);
		JRadioButton Terra = new JRadioButton("Terra", false);
		JRadioButton Fantasma = new JRadioButton("Fantasma", false);
		JRadioButton Eletrico = new JRadioButton("Eletrico", false);
		
		ButtonGroup rbGrupoTipo = new ButtonGroup();
		
		rbGrupoTipo.add(Agua);
		rbGrupoTipo.add(Fogo);
		rbGrupoTipo.add(Folha);
		rbGrupoTipo.add(Inseto);
		rbGrupoTipo.add(Terra);
		rbGrupoTipo.add(Fantasma);
		rbGrupoTipo.add(Eletrico);
		
		JLabel lbTipo = new JLabel("Tipo de Pokemon: ");
		add(lbTipo);
		
		add(Agua);
		add(Fogo);
		add(Folha);
		add(Inseto);
		add(Terra);
		add(Fantasma);
		add(Eletrico);
		
		Agua.addItemListener(new RadioHandlerTipo(TipoPokemon.AGUA, Primeiro));
		Fogo.addItemListener(new RadioHandlerTipo(TipoPokemon.FOGO, Primeiro));
		Folha.addItemListener(new RadioHandlerTipo(TipoPokemon.FOLHA, Primeiro));
		Inseto.addItemListener(new RadioHandlerTipo(TipoPokemon.INSETO, Primeiro));
		Terra.addItemListener(new RadioHandlerTipo(TipoPokemon.TERRA, Primeiro));
		Fantasma.addItemListener(new RadioHandlerTipo(TipoPokemon.FANTASMA, Primeiro));
		Eletrico.addItemListener(new RadioHandlerTipo(TipoPokemon.ELETRICO, Primeiro));
		
		JRadioButton Ataque = new JRadioButton("Ataque", false);
		JRadioButton Especial = new JRadioButton("Efeito", false);
		JRadioButton Vida = new JRadioButton("Vida", false);
		
		ButtonGroup rbGrupoEspecial = new ButtonGroup();
		
		rbGrupoEspecial.add(Ataque);
		rbGrupoEspecial.add(Especial);;
		rbGrupoEspecial.add(Vida);
		
		JLabel lbEspecial = new JLabel("Aonde ocorre o efeito do especial: ");
		add(lbEspecial);
		
		add(Ataque);
		add(Especial);;
		add(Vida);
		
		Ataque.addItemListener(new RadioHandlerEspecial(Efeito.ATAQUE, Primeiro));
		Vida.addItemListener(new RadioHandlerEspecial(Efeito.VIDA, Primeiro));
		Especial.addItemListener(new RadioHandlerEspecial(Efeito.ESPECIAL, Primeiro));
		
		JButton pokemonCadastrado = new JButton("Cadastrar pokemon");
		pokemonCadastrado.setBounds(200, 100, 100, 100);

		add(pokemonCadastrado);
		pokemonCadastrado.addMouseListener(new Mouse(Primeiro, false));
		
		JLabel lbPulaLinha = new JLabel("                                                        ");
		add(lbPulaLinha);
	}
	
	private void CriaPokemon(boolean Primeiro) {
		if(Primeiro) {
			String msg = "Precisa selecionar";
			
			if(Tipo1 == null) {
				msg += " tipo";
			}
			
			if(Especial1 == null) {
				if(msg != "Precisa selecionar")
					msg += ",";
				msg += " especial";
			}
			
			if(Nome1 == null) {
				if(msg != "Precisa selecionar")
					msg += ",";
				msg += " nome";
			}
			
			if(msg != "Precisa selecionar") {
				JOptionPane.showMessageDialog(null, msg);
				return;
			}
			
			if(Tipo1 == TipoPokemon.AGUA)
				P1 = new PokemonAgua(Nome1, Especial1);
			else if(Tipo1 == TipoPokemon.FANTASMA)
				P1 = new PokemonFantasma(Nome1, Especial1);
			else if(Tipo1 == TipoPokemon.FOGO)
				P1 = new PokemonFogo(Nome1, Especial1);
			else if(Tipo1 == TipoPokemon.FOLHA)
				P1 = new PokemonFolha(Nome1, Especial1);
			else if(Tipo1 == TipoPokemon.TERRA)
				P1 = new PokemonTerra(Nome1, Especial1);
			else if(Tipo1 == TipoPokemon.INSETO)
				P1 = new PokemonInseto(Nome1, Especial1);
			else if(Tipo1 == TipoPokemon.ELETRICO)
				P1 = new PokemonEletrico(Nome1, Especial1);
			
			if(P1 != null) {
				JOptionPane.showMessageDialog(null, P1.getNome() + " cadastrado");
			}
		}else {
			String msg = "Precisa selecionar";
			
			if(Tipo2 == null) {
				msg += " tipo";
			}
			
			if(Especial2 == null) {
				if(msg != "Precisa selecionar")
					msg += ",";
				msg += " especial";
			}
			
			if(Nome2 == null) {
				if(msg != "Precisa selecionar")
					msg += ",";
				msg += " nome";
			}
			
			if(msg != "Precisa selecionar") {
				JOptionPane.showMessageDialog(null, msg);
				return;
			}
			
			if(Tipo2 == TipoPokemon.AGUA)
				P2 = new PokemonAgua(Nome2, Especial2);
			else if(Tipo2 == TipoPokemon.FANTASMA)
				P2 = new PokemonFantasma(Nome2, Especial2);
			else if(Tipo2 == TipoPokemon.FOGO)
				P2 = new PokemonFogo(Nome2, Especial2);
			else if(Tipo2 == TipoPokemon.FOLHA)
				P2 = new PokemonFolha(Nome2, Especial2);
			else if(Tipo2 == TipoPokemon.TERRA)
				P2 = new PokemonTerra(Nome2, Especial2);
			else if(Tipo2 == TipoPokemon.INSETO)
				P2 = new PokemonInseto(Nome2, Especial2);
			else if(Tipo2 == TipoPokemon.ELETRICO)
				P2 = new PokemonEletrico(Nome2, Especial2);
			
			if(P2 != null) {
				JOptionPane.showMessageDialog(null, P2.getNome() + " cadastrado");
			}
		}
	}
	
	public class Mouse implements MouseListener{
		
		private boolean Primeiro;
		private boolean Sair;
		
		public Mouse(boolean primeiro, boolean sair) {
			this.Primeiro = primeiro;
			this.Sair = sair;
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			if(this.Sair) {
				if(P1 != null && P2 != null) {
					setVisible(false);
					Batalha batalha = new Batalha(P1, P2);
				}else {
					JOptionPane.showMessageDialog(null, "Precisa cadastrar os pokemons");
				}
			} else {
				CriaPokemon(this.Primeiro);
			}
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	private class TextFieldHandler implements ActionListener {
	    
		private boolean Primeiro;
		
		public TextFieldHandler(boolean primeiro) {
			this.Primeiro = primeiro;
		}
		
		@Override
		public void actionPerformed(ActionEvent event) {
			if(this.Primeiro) {
				Nome1 = event.getActionCommand();
				JOptionPane.showMessageDialog(null, Nome1);
			}else {
				Nome2 = event.getActionCommand();
				JOptionPane.showMessageDialog(null, Nome2);
			}
				

		}
	}
	
	private class RadioHandlerTipo implements ItemListener{
		private TipoPokemon Tipo;
		private boolean Primeiro;
		
		public RadioHandlerTipo(TipoPokemon tipo, boolean primeiro) {
			this.Tipo = tipo;
			this.Primeiro = primeiro;
		}
		
		@Override
		public void itemStateChanged(ItemEvent e) {
			if(this.Primeiro)
				Tipo1 = this.Tipo;
			else
				Tipo2 = this.Tipo;
		}		
	}
	
	private class RadioHandlerEspecial implements ItemListener{
		private Efeito Especial;
		private boolean Primeiro;
		
		public RadioHandlerEspecial(Efeito especial, boolean primeiro) {
			this.Especial = especial;
			this.Primeiro = primeiro;
		}
		
		@Override
		public void itemStateChanged(ItemEvent e) {
			if(this.Primeiro)
				Especial1 = this.Especial;
			else
				Especial2 = this.Especial;
		}		
	}
	
	public static void main(String[] args) {
		Executa textFieldFrame = new Executa(); 
		textFieldFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		textFieldFrame.setBounds(200, 100, 1000, 500);
		textFieldFrame.setVisible(true);
	}
}
