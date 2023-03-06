import java.util.ArrayList;
public class UserName
{
    /** The list of possible user names, based on a user�s first and last names
     * and initialized by the constructor.
     */
    private ArrayList<String> possibleNames;

    /** Constructs a UserName object as described in part (a).
     * Precondition: firstName and lastName have length greater than 0
     * and contain only uppercase and lowercase letters.
     */
    public UserName(String firstName, String lastName)
    { /* to be implemented in part (a) */ }


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
    { /* to be implemented in part (b) */ }

    /** gets contents of possibleNames */
    //put the method for that here...
}