public class Area{
    
    public newShape areaShape(String getOption){
        
      
        
        if(getOption.equals("Triangle")){
            
            return new AreaOfTriangle(); 
        } else
            
            if(getOption.equals("Rectangle")){
                
                return new AreaOfRectangle();
            
            } else
                
                if(getOption.equals(Square)){
                    
                    return new AreaOfSquare();
                    
                } else return null;
    }

    private static class newShape {

        public newShape() {
        }
    }
}