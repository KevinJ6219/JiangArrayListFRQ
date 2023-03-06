import java.util.ArrayList;
public class UserNameSolution
{
    /** The list of possible user names, based on a user�s first and last names
     * and initialized by the constructor.
     */
    private ArrayList<String> possibleNames;

    /** Constructs a UserName object as described in part (a).
     * Precondition: firstName and lastName have length greater than 0
     * and contain only uppercase and lowercase letters.
     */
    public UserNameSolution(String firstName, String lastName)
    {
        possibleNames = new ArrayList<String>();
        for (int i = 0; i < firstName.length(); i++) {
            possibleNames.add(lastName  + firstName.substring(0, i +1));
        }
    }


    /** Returns true if arr contains name, and false otherwise. */
    public boolean isUsed(String name, String[] arr)
    {

        for (int i = 0; i < arr.length; i++)
        {
            if (name.equals(arr[i]))
            {
                return true;
            }
        }
        return false;
    }

    /** Removes strings from possibleNames that are found in usedNames as described in part (b).
     */
    public void setAvailableUserNames(String[] usedNames)
    {
        for (int i = 0; i < possibleNames.size(); i++) {
            if (isUsed(possibleNames.get(i), usedNames)) {
                possibleNames.remove(i);
                i--;
            }
        }
    }
    /** gets contents of possibleNames */
    //put the method for that here...
    public ArrayList<String> getPossibleNames() {
        return possibleNames;
    }
}