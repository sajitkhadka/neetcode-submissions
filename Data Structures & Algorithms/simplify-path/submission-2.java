class Solution {
    public String simplifyPath(String path) {
        Stack<String> al = new Stack<>();
        char[] pathArr = path.toCharArray();
        int i=0;
        while(i<pathArr.length){
            while(i<pathArr.length && pathArr[i] == '/'){
                i++;
            }
            if(i >= pathArr.length) break;

            StringBuilder sb = new StringBuilder();
            while(i<pathArr.length && pathArr[i] != '/'){
                sb.append(pathArr[i]);
                i++;
            }
            String  word = sb.toString();
            if(word.equals("..")){
               if(!al.isEmpty()) al.pop();
            }
            else if(!word.isEmpty() && !word.equals(".")) al.push(word);
        }

        StringBuilder output = new StringBuilder();
        output.append("/");
        for(String word: al){
            output.append(word);
            if(!word.equals(al.peek())){
                output.append("/");
            }
        }
        return output.toString();
    }
}