public enum ThemeColor {
    RED,
    ORANGE,
    BLACK,
    WHITE;

    //method to get hold of the iterator
    public static Iterator<ThemeColor> getIterator(){
       //gets an instance of the inner class
        return new ThemeColorIterator();
    }

    //inner class
    private static class  ThemeColorIterator implements Iterator<ThemeColor>{

        private int position;

        @Override
        public boolean hasNext() {
            //if position is  less than length of the Enum return true
            return position < ThemeColor.values().length ;
        }

        @Override
        public ThemeColor next() {
            //return the value and then increment its value
            return ThemeColor.values()[position++];
        }
    }
}
