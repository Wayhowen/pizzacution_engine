package pizzacution.recipe.jet;

import pizzacution.recipe.*;

public class Recipe2HTMLTemplate
{
  protected static String nl;
  public static synchronized Recipe2HTMLTemplate create(String lineSeparator)
  {
    nl = lineSeparator;
    Recipe2HTMLTemplate result = new Recipe2HTMLTemplate();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "  ";
  protected final String TEXT_2 = NL;
  protected final String TEXT_3 = NL + NL + NL + "<table>";
  protected final String TEXT_4 = NL + "         <tr>" + NL + "                <td>";
  protected final String TEXT_5 = "</td>" + NL + "                <td>";
  protected final String TEXT_6 = "</td>" + NL + "            </tr>";
  protected final String TEXT_7 = NL + "</table>";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
     RecipesBook rb = (RecipesBook) argument; 
    stringBuffer.append(TEXT_2);
     String recipeName = rb.getPhoneOwner().getGivenName(); 
    stringBuffer.append(TEXT_3);
     for (Recipe r : rb.getRecipe()) { 
    stringBuffer.append(TEXT_4);
    stringBuffer.append( r.getRecipeName() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( r.getBasePreparation() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( r.getAddToppings() );
    stringBuffer.append(TEXT_6);
     } 
    stringBuffer.append(TEXT_7);
    return stringBuffer.toString();
  }
}
