/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesMetier;

/**
 *
 * @author jacqu
 */
public class Action
{
    // A vous de jouer
   private int idAction;
    private String nomAction;
    private double valeurActuelle;
    private double prixDachat;
    private int quantiteAchetée;
    
    //constructeur 
    public Action (int unId, String unNom, double uneValeur, double unPrix, int uneQuantite)
    {
        idAction = unId;
        nomAction = unNom;
        valeurActuelle = uneValeur;
        prixDachat = unPrix;
        quantiteAchetée = uneQuantite;
    }
    public int getIdAction()
    {
        return idAction;
    }
    public String getNomAction()
    {
        return nomAction;
    }
    public double valeurActuelle ()
    {
        return valeurActuelle;
    }
    public void setValeurActuelle( int Valeur)
    {
        valeurActuelle = Valeur;
    }
    public double getPrixDachat()
    {
        return prixDachat;
    }
    public void setPrixDachat(int prix)
    {
        prixDachat = prix;
    }
    public int getQuantiteAchetée()
    {
        return quantiteAchetée;
    }
    public void setQuantiteAchetée(int quantite)
    {
        quantiteAchetée = quantite;
    }
}
