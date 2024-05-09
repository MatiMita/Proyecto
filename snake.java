public class Momento extends Thread {
		
		private long last = 0;
		
		public Momento() {
			
		}

		public void run() {
			while(true) {
				if((java.lang.System.currentTimeMillis() - last) > frequency) {
					if(!gameOver) {

                        if(direccion == "RIGHT") {
                            snake.x = snake.x + widthPoint;
                            if(snake.x > width) {
                                snake.x = 0;
                            }
                        } else if(direccion == "LEFT") {
                            snake.x = snake.x - widthPoint;
                            if(snake.x < 0) {
                                snake.x = width - widthPoint;
                            }                        
                        } else if(direccion == "UP") {
                            snake.y = snake.y - heightPoint;
                            if(snake.y < 0) {
                                snake.y = height;
                            }                        
                        } else if(direccion == "DOWN") {
                            snake.y = snake.y + heightPoint;
                            if(snake.y > height) {
                                snake.y = 0;
                            }                        
                        }
                    }
                    actualizar();
					
					last = java.lang.System.currentTimeMillis();
				}

			}
		}
	}

}