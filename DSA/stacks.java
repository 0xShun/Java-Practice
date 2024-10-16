class stacks {

    public boolean isValid(String s) {
        char[] str = s.toCharArray();
        System.out.println(str);

        return true;
    }
    
    public static void main(String[] args){
        // Creating a new instance of the stacks class
        stacks stack = new stacks();
        System.out.println(stack.isValid("()")); // Expected: true
        System.out.println(stack.isValid("()[]{}")); // Expected: true
        System.out.println(stack.isValid("(]")); // Expected: false
        System.out.println(stack.isValid("([)]")); // Expected: false
        System.out.println(stack.isValid("{[]}")); // Expected: true
    }

    
}