package org.javaL3.association;

import java.time.LocalDateTime;
import java.util.Set;

public class Evenement implements java.io.Serializable {
  
  private String nom;

  private String lieu;

  private LocalDateTime date;

  private int duree;

  private int nbParticipantsMax;

  private Set<InterMembre> participants;

  // A impl�menter : retourne vrai si deux �v�nements ne se chevauchent pas
  // dans le m�me lieu en m�me temps
  public boolean pasDeChevauchementLieu(Evenement evt) {
    throw new UnsupportedOperationException("M�thode non impl�ment�e !");
  }

  // A impl�menter : retourne vrai si deux �v�nements ne se chevauchent pas
  // dans le temps (ind�pendamment du lieu)
  public boolean pasDeChevauchementTemps(Evenement evt) {
    throw new UnsupportedOperationException("M�thode non impl�ment�e !");
  }

  // A compl�ter :
  //
  // - g�n�ration automatique des getters, setters, constructeurs,
  // des m�thodes hashCode, toString et equals.
  // Modifiez manuellement le code g�n�r� au besoin. Rajoutez notamment
  // les m�thodes de gestion des participants � l'�v�nement.
  //
  // - Rajoutez un/des constructeurs permettant de construire plus facilement
  // un �v�nement sans avoir besoin de passer un param�tre de type LocalDateTime
  //
  // - Ecrivez la JavaDoc compl�te de la classe
}
