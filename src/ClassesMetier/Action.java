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
    private double prixAchat;
    private int QtéAchetée;
    
    //constructeur 
    public Action (int unId, String unNom, double uneValeur, double unPrix, int uneQuantite)
    {
        idAction = unId;
        nomAction = unNom;
        valeurActuelle = uneValeur;
        prixAchat = unPrix;
        QtéAchetée = uneQuantite;
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
        return prixAchat;
    }
    public void setPrixDachat(int prix)
    {
        prixAchat = prix;
    }
    public int getQuantiteAchetée()
    {
        return QtéAchetée;
    }
    public void setQuantiteAchetée(int quantite)
    {
        QtéAchetée = quantite;
    }

    public double getQuantiteAchete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getPrixAchat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getQtéAchetée() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
