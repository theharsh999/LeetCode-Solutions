class Solution {
    public String capitalizeTitle(String title) {
        String words[] = title.split(" ");
        StringBuilder newTitle = new StringBuilder();

        for(int i=0; i<words.length; i++){
            if(words[i].length() < 3){
                newTitle.append(words[i].toLowerCase());
            }else{
                newTitle.append(words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase());
            }
            newTitle.append(" ");
        }
        return newTitle.toString().trim();
    }
}