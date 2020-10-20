package Problem1;

public class ValidParentheses
{
    public static boolean isValid(String str)
    {
        //just quickly catch null case
        if(str == null)
            return true;

        LinkedListStack<Character> values = new LinkedListStack<>();
        for(int i = 0; i < str.length(); i++)
        {
            char current = str.charAt(i);
            if(current == '{' || current == '[' || current == '(')
            {
                values.push(current);
                continue;
            }
            //if it gets to here, it is a close bracket

            //if we have a close bracket without anything in stack, it has to be false
            if(values.peek() == null)
                return false;
            char topStack = values.pop();
            switch(topStack)
            {
                case '{':
                    if(current != '}')
                        return false;
                    break;
                case '(':
                    if(current != ')')
                        return false;
                    break;
                case '[':
                    if(current != ']')
                        return false;
                    break;
            }
        }
        //if there is still an open bracket in the stack, it's false
        if(values.peek() != null)
            return false;
        return true;
    }
}
