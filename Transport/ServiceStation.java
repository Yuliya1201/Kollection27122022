package Transport;


import java.util.ArrayDeque;
import java.util.Queue;



    public class ServiceStation {
        private Queue <Serviceable> queue;
        public void addServiceable(Serviceable serviceable) {
            queue.offer(serviceable);
        }
        public void doService() {
            if (!queue.isEmpty()) {
                Serviceable serviceable = queue.poll();
                serviceable.service();
            }

        }
    }


